(ns two-fer)

(defn two-fer
  ;; your code goes here
  ([name]
   (str "One for " name ", one for me."))
  ([]
   (two-fer "you"))
)
