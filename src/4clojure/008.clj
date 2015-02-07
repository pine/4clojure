(use 'clojure.set)

; set は順序なし、重複なし
; #{ ... } で生成できる
(=
  (= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d)))
  (= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))
  true)