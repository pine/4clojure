; https://www.4clojure.com/problem/047

(def ^:private x 4)

(=
  (contains? #{4 5 6} x)    ; set は値で判定
  (contains? [1 1 1 1 1] x) ; vector は添字で判定
  (contains? {4 :a 2 :b} x) ; hash はキーで判定
  (try
    (not (contains? '(1 2 4) x))
    (catch IllegalArgumentException e true)) ; Clojure 1.5 以降は例外
  true)