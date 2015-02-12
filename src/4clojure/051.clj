; https://www.4clojure.com/problem/51

(def ^:private x [1 2 3 4 5])

(= [1 2 [3 4 5] [1 2 3 4 5]]
   (let [[a b & c :as d] x] [a b c d]))