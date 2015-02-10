; https://www.4clojure.com/problem/37

(def ^:private s "ABC")

(= s (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))