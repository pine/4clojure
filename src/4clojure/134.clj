; https://www.4clojure.com/problem/134

(defn- f
  [k coll]
  (nil? (get coll k false)))

(=
  (true?  (f :a {:a nil :b 2}))
  (false? (f :b {:a nil :b 2}))
  (false? (f :c {:a nil :b 2}))
  true)