(ns foreclojure-solutions.p35
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Local bindings"
  __ => (let [x 5] (+ 2 x))
  __ => (let [x 3, y 10] (- y x))
  __ => (let [x 21] (let [y 3] (/ x y))))
