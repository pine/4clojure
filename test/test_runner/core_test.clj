(ns test_runner.core-test
  (:require [clojure.test :refer :all]
            [test_runner.core :refer :all])
  (:import [java.io File]))

(deftest test_runner-test
  (testing "should get filename"
    (is (= (fname (new File "filename")) "filename"))))