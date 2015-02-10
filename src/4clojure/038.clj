; https://www.4clojure.com/problem/38

(defn- f
  [& args]
  (-> args sort last))

(=
  (= (f 1 8 3 4) 8)
  (= (f 30 20) 30)
  (= (f 45 67 11) 67)
  true)