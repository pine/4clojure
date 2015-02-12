; https://www.4clojure.com/problem/046

(defn- f [ff] #(ff %2 %1))

(=
  (= 3 ((f nth) 2 [1 2 3 4 5]))
  (= true ((f >) 7 8))
  (= 4 ((f quot) 2 8))
  (= [1 2 3] ((f take) [1 2 3 4 5] 3))
  true)