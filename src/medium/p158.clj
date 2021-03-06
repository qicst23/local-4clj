(ns medium.p158)

;; DECURRY

;; Difficulty: Medium
;; Topics: partial-functions

;; Write a function that accepts a curried function of unknown arity ;; n;; .  Return an equivalent function of ;; n;;  arguments.
;; You may wish to read ;; http://en.wikipedia.org/wiki/Currying;; .

(def __ ;; Your solution here!
  
  ,,,)



;; Test cases (evaluates to true when your solution is correct):
(= 10 ((__ (fn [a]
             (fn [b]
               (fn [c]
                 (fn [d]
                   (+ a b c d))))))
       1 2 3 4))
(= 24 ((__ (fn [a]
             (fn [b]
               (fn [c]
                 (fn [d]
                   (* a b c d))))))
       1 2 3 4))
(= 25 ((__ (fn [a]
             (fn [b]
               (* a b))))
       5 5))
