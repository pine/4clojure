(ns test_runner.core-test
  (:require [clojure.test :refer :all]
            [test_runner.core :refer :all])
  (:import [java.io File]))

(deftest test_runner-test
  (testing "should get filename"
    (is (= (fname (new File "filename")) "filename")))
  
  (testing "should filter test \\d+.clj file"
    (is (src-filter (new File "001.clj")))
    (is (not (src-filter (new File "xxx.clj"))))))