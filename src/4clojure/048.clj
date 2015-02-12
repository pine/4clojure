; https://www.4clojure.com/problem/48

(def ^:private x 6)

(=
  (= x (some #{2 7 6} [5 6 7 8])) ; set は関数呼び出し可能
  (= x (some #(when (even? %) %) [5 6 7 8]))
  true)