(defn- f [x]
  (apply + (map (fn [i] 1) x)))

(=
  (= (f '(1 2 3 3 1)) 5)
  (= (f "Hello World") 11)
  (= (f [[1 2] [3 4] [5 6]]) 3)
  (= (f '(13)) 1)
  (= (f '(:a :b :c)) 3)
  true)