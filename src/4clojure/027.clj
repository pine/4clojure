(defn- f [s]
  (= (seq s) (reverse s)))

(=
  (false? (f '(1 2 3 4 5)))
  (true? (f "racecar"))
  (true? (f [:foo :bar :foo]))
  (true? (f '(1 1 3 3 1 1)))
  (false? (f '(:a :b :c)))
  true)