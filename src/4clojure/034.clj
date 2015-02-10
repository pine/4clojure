; https://www.4clojure.com/problem/34

(defn- inc-seq [b]
  (lazy-seq (cons b (-> b inc inc-seq))))
  
(defn- rng [b e]
  (take (- e b) (inc-seq b)))

(=
  (= (rng 1 4) '(1 2 3))
  (= (rng -2 2) '(-2 -1 0 1))
  (= (rng 5 8) '(5 6 7))
  true)