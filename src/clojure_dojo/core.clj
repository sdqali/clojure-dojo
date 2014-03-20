(ns clojure_dojo.core)

(defn edit-distance
  "Return the Levenshtein edit distance between two strings"
  [first second]
  (cond
   (empty? first) (count second)
   (empty? second) (count first)
   :else (min (+ 1 (edit-distance (drop 1 first) second))
              (+ 1 (edit-distance first (drop 1 second)))
              (+ (cond
                  (= (take 1 first) (take 1 second)) 0
                  :else 1)
                 (edit-distance (drop 1 first) (drop 1 second))))))
