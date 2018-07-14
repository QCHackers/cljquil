(ns cljquil.core
  (:gen-class) (:import jquil.QVM)
  (:import jquil.g) (:import jquil.Program))

(defn program [vector]
      (Program. (into-array vector)))
      
(defn wavefunction [instr]
     (QVM/wavefunction (program instr)))
     
(defn H [qubit]
     (jquil.g/H qubit))
     
(defn X [qubit]
     (jquil.g/X qubit))
     
(defn CNOT [qubit0 qubit1]
     (jquil.g/CNOT qubit0 qubit1))
     
(def epr [(H 0) (CNOT 0 1)])
      
(defn quil [instr & rest]
     (into [] (cons instr rest)))
      
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (wavefunction (quil "H 0")))
  (println (wavefunction epr)))
  
