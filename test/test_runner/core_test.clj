(ns test_runner.core-test
  (:require [clojure.test :refer :all]
            [test_runner.core :refer :all]
            [clojure.java.io :refer [file]])
  (:import [java.io File]))

(def test-src-dir "test/test_runner")

(deftest test_runner-test
  (testing "should get filename"
    (is (= (fname (file "filename")) "filename")))
  
  (testing "should filter test \\d+.clj file"
    (is (src-filter (file "001.clj")))
    (is (not (src-filter (file "xxx.clj")))))
  
  (testing "should be an instance of java.io.File"
    (is (instance? File (first (src-files test-src-dir)))))
  
  (testing "should pass test"
    (is (test-file (file test-src-dir "true.clj"))))
  
  (testing "should fail test"
    (is (not (test-file (file test-src-dir "false.clj")))))
  
  (testing "should fail test with exception"
    (is (not (test-file (file test-src-dir "throw.clj")))))
  
  )