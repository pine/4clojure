(defn- f [x]
  (-> x reverse first))

(=
  (= (f [1 2 3 4 5]) 5)
  (= (f '(5 4 3)) 3)
  (= (f ["b" "c" "d"]) "d")
  true
  )