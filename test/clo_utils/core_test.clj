(ns clo-utils.core-test
  (:require [clojure.test :refer :all]
            [clo-utils.core :refer :all]))

(deftest if-nil-test
  (are [x y] (= x y)
    1 (if-nil nil 1 2)
    2 (if-nil false 1 2)
    nil (if-nil true 1)
    2 (if-nil true 1 2)))

(deftest if-empty-test
  (are [x y] (= x y)
    1 (if-empty [] 1)
    1 (if-empty #{} 1)
    1 (if-empty '() 1)
    2 (if-empty '(1) 1 2)
    nil (if-empty [1] 1)
    nil (if-empty #{1} 1)
    nil (if-empty '(1) 1)))

(deftest if=-test
  (are [x y] (= x y)
    1 (if= 1 1
           1
           2)
    2 (if= 2 1
           1
           2)
    nil (if= 2 1
             1)))

(deftest when-nil-test
  (are [x y] (= x y)
    1 (when-nil nil 1)
    nil (when-nil false 1)
    nil (when-nil true 1)))

(deftest when-not-nil-test
  (are [x y] (= x y)
    nil (when-not-nil nil 1)
    1 (when-not-nil false 1)
    1 (when-not-nil true 1)))

(deftest when-empty-test
  (are [x y] (= x y)
    1 (when-empty [] 1)
    1 (when-empty #{} 1)
    1 (when-empty '() 1)
    nil (when-empty '(1) 1)
    nil (when-empty [1] 1)
    nil (when-empty #{1} 1)
    nil (when-empty '(1) 1)))

(deftest when-not-empty-test
  (are [x y] (= x y)
    nil (when-not-empty [] 1)
    nil (when-not-empty #{} 1)
    nil (when-not-empty '() 1)
    1 (when-not-empty '(1) 1)
    1 (when-not-empty [1] 1)
    1 (when-not-empty #{1} 1)
    1 (when-not-empty '(1) 1)))
