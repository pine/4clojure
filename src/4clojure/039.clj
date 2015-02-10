; https://www.4clojure.com/problem/39

(defn- f [a b]
  (when-not (or (empty? a) (empty? b))
    (->> (f (rest a) (rest b))
         (cons (first b))
         (cons (first a)))
    ))

(=
  (= (f [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
  (= (f [1 2] [3 4 5 6]) '(1 3 2 4))
  (= (f [1 2 3 4] [5]) [1 5])
  (= (f [30 20] [25 15]) [30 25 20 15])
  true)