; https://www.4clojure.com/problem/42

(defn- f [x]
  (apply * (range 1 (inc x))))

(=
  (= (f 1) 1)
  (= (f 3) 6)
  (= (f 5) 120)
  (= (f 8) 40320)
  true)