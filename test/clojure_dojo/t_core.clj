(ns clojure_dojo.t-core
  (:use midje.sweet)
  (:use [clojure_dojo.core]))

(facts "about `edit-distance`"
       (fact "it returns length of other string if one string is empty"
             (edit-distance "foo" "") => 3
             (edit-distance "" "foo") => 3)
       (fact "detects deletions"
             (edit-distance "foo" "oo") => 1)
       (fact "detects substitutions"
             (edit-distance "ab", "cd") => 2)
       (fact "detects additions needed"
             (edit-distance "oo", "foo") => 1
             (edit-distance "kit", "sitting") => 5
             (edit-distance "intention", "execution") => 5
             (edit-distance "sittin", "sitting") => 1))
