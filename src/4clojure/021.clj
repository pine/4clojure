(defn f [x i]
  (if (= i 0)
    (first x)
    (f (rest x) (dec i))
    ))

(=
  (= (f '(4 5 6 7) 2) 6)
  (= (f [:a :b :c] 0) :a)
  (= (f [1 2 3 4] 1) 2)
  (= (f '([1 2] [3 4] [5 6]) 2) [5 6])
  true)