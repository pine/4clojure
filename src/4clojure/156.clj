; https://www.4clojure.com/problem/156

(defn- f
  [value coll]
  (apply hash-map (interleave coll (repeat value))))

(=
  (= (f 0 [:a :b :c]) {:a 0 :b 0 :c 0})
  (= (f "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})
  (= (f [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})
  true)