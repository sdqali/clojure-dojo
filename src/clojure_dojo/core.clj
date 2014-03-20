(ns clojure_dojo.core)

(defn edit-distance
  "Return the Levenshtein edit distance between two strings"
  [first second]
  (if (empty? second)
    (count first)
    (if (empty? first)
      (count second)
      (min (+ 1 (edit-distance (drop 1 first) second))
           (+ 1 (edit-distance first (drop 1 second)))
           (+ (if (= (take 1 first) (take 1 second))
                0
                1)
              (edit-distance (drop 1 first) (drop 1 second)))))))
