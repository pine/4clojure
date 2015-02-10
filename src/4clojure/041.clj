(defn- f [s i]
  (->>
    s
    (map-indexed #(list %1 %2))
    (filter #(not= (mod (first %) i) (dec i)))
    (map second)
    ))

(=
  (= (f [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
  (= (f [:a :b :c :d :e :f] 2) [:a :c :e])
  (= (f [1 2 3 4 5 6] 4) [1 2 3 5 6])
  true)