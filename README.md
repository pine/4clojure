4clojure
--------
[![Build Status](https://travis-ci.org/pine613/4clojure.svg?branch=master)](https://travis-ci.org/pine613/4clojure)
[![Dependencies Status](http://jarkeeper.com/pine613/4clojure/status.png)](http://jarkeeper.com/pine613/4clojure)

プログラミング言語 Clojure を勉強するためのサイト [4clojure](https://www.4clojure.com) の解答を載せているリポジトリです。

解答は [src/4clojure](https://github.com/pine613/4clojure/tree/master/src/4clojure)、解答をテストするためのテストランナーは [src/test_runner](https://github.com/pine613/4clojure/tree/master/src/test_runner) にあります。テストランナー自体も Clojure で記述してあります。

## 実行
実行には JVM 及び Leiningen が必要です。
実行すると、すべての解答に対するテストが走ります。

```
$ lein -v
Leiningen 2.5.1 on Java 1.8.0_25 Java HotSpot(TM) 64-Bit Server VM

$ lein run
Testing  001.clj  ...  [Accepted]
Testing  002.clj  ...  [Accepted]

...

All file accepted
```

## License
Public Domain