(defn- f [s]
  (->> s
       seq
       (filter #(Character/isUpperCase %))
       clojure.string/join))

(=
  (= (f "HeLlO, WoRlD!") "HLOWRD")
  (empty? (f "nothing"))
  (= (f "$#A(*&987Zf") "AZ")
  true)