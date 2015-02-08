;(defn- fib-impl [i]
;   (if (= i 2)
;     '(1 1)
;     (let [prev (fib-impl (dec i))]
;       (let [p1 (first prev)
;             p2 (first (rest prev))]
;         (conj prev (+ p1 p2))))))

;(defn- fib [i]
;  (reverse (fib-impl i)))

;(def fib-seq
;  ((fn rfib [a b]
;     (lazy-seq (cons a (rfib b (+ a b)))))
;     1 1))

(def fib-seq
     (lazy-cat [1 1] (map + (rest fib-seq) fib-seq)))

(defn- fib [n]
  (take n fib-seq))

(=
   (= (fib 3) '(1 1 2))
   (= (fib 6) '(1 1 2 3 5 8))
   (= (fib 8) '(1 1 2 3 5 8 13 21))
   true)