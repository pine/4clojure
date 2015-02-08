(defn- f [s]
  (->> s (partition-by identity) (map first)))

(=
  (= (apply str (f "Leeeeeerrroyyy")) "Leroy")
  (= (f [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
  (= (f [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
  true)