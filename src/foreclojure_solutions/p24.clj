(ns foreclojure-solutions.p24
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Sum It All Up"
  (__ [1 2 3]) => 6
  (__ (list 0 -2 5 5)) => 8
  (__ #{4 2 1}) => 7
  (__ '(0 0 -1)) => -1
  (__ '(1 10 3)) => 14)
