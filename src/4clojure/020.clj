(defn- f [x]
  (-> x reverse second))

(=
  (= (f (list 1 2 3 4 5)) 4)
  (= (f ["a" "b" "c"]) "b")
  (= (f [[1 2] [3 4]]) [1 2])
  true)