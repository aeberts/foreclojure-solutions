(ns foreclojure-solutions.p162
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Logical falsity and truth"
  __ => (if-not false 1 0)
  __ => (if-not nil 1 0)
  __ => (if true 1 0)
  __ => (if [] 1 0)
  __ => (if [0] 1 0)
  __ => (if 0 1 0)
  __ => (if 1 1 0))
