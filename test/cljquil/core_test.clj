(ns cljquil.core-test
  (:require [clojure.test :refer :all]
            [cjquil.core :refer :all]))

(deftest a-test
  (testing "One hadamard gate"
    (is (= (wavefunction (quil "H 0")) "0.71|0> + 0.71|1>"))))
