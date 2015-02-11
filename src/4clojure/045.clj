; https://www.4clojure.com/problem/４5

(def ^:private s [1 4 7 10 13])

(= s (take 5 (iterate #(+ 3 %) 1)))