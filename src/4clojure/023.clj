; Reverse a Sequence
; https://www.4clojure.com/problem/23

(defn f [coll]
  (apply conj () coll))

(=
  (= (f [1 2 3 4 5]) [5 4 3 2 1])
  (= (f (sorted-set 5 7 2 7)) '(7 5 2))
  (= (f [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
  true)