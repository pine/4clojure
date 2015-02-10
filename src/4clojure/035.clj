; https://www.4clojure.com/problem/35

(def ^:private n 7)

(=
  (= n (let [x 5] (+ 2 x)))
  (= n (let [x 3, y 10] (- y x)))
  (= n (let [x 21] (let [y 3] (/ x y))))
  true)