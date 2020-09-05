(ns clo-utils.core-test
  (:require [clojure.test :refer :all]
            [clo-utils.core :refer :all]))

(deftest if-nil-test
  (are [x y] (= x y)
    1 (if-nil nil 1 2)
    2 (if-nil false 1 2)
    nil (if-nil true 1)
    2 (if-nil true 1 2)))

(deftest when-nil-test
  (are [x y] (= x y)
    1 (when-nil nil 1)
    nil (when-nil false 1)
    nil (when-nil true 1)))
