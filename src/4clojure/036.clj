; https://www.4clojure.com/problem/36

(=
  (= 10 (let [x 7 y 3 z 1] (+ x y)))
  (= 4 (let [x 7 y 3 z 1] (+ y z)))
  (= 1 (let [x 7 y 3 z 1] z))
  true)