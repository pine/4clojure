(ns test_runner.core
  (:use [clojure.stacktrace]))

; ファイル名を取得する
(defn fname [file] (.getName file))

; ソースファイルのみをフィルタする
(defn- src-filter [file]
  (->> file fname (re-matches #"\d+.clj")))

; テスト対象のソースファイル一覧を取得
(defn- src-files []
  (let [dirs (clojure.java.io/file "src/4clojure")
        files (file-seq dirs)]
    (let [matched-files (filter src-filter files)]
      (sort #(compare (fname %1) (fname %2)) matched-files))
  ))

; ソースファイルをテストする
(defn- test-file [file]
  (let [path (.getPath file)]
    (print "Testing " (fname file) " ... ")
    
    (try
      (let [ret (load-file path)]
        (println (if ret " [Accepted]" " [Wrong Answer]"))
        ret
        )
      
      (catch Exception e
        (println " [Compile Error]")
        (println)
        (println (clojure.stacktrace/print-throwable e)))
      )
  ))

; ソースファイルの配列をテストする
(defn- test-files [files]
  (doseq [f files]
    (if-not (test-file f)
      ((println)
       (println "Test failed")
       (System/exit 1))))
  
  (println)
  (println "All file accepted")
  )

(defn -main []
  (test-files (src-files)))