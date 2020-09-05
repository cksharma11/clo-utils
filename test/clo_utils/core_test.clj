(ns clo-utils.core-test
  (:require [clojure.test :refer :all]
            [clo-utils.core :refer :all]))

(deftest if-not-nil-test
  (are [x y] (= x y)
    2 (if-not-nil nil 1 2)
    1 (if-not-nil false 1 2)
    1 (if-not-nil true 1)
    nil (if-not-nil nil 1)))

(deftest if-nil-test
  (are [x y] (= x y)
    1 (if-nil nil 1 2)
    2 (if-nil false 1 2)
    nil (if-nil true 1)
    2 (if-nil true 1 2)))
