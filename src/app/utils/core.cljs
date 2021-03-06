(ns app.utils.core
  (:require [app.constants.currs :as c]
            [app.db :refer [db]]))

(defn curr-symbol->name [s]
  (:name
   (first
    (filter
     (fn [p] (= (:symbol p) s))
     c/pairs))))

(defn get-markets []
  (reduce
   (fn [acc [key val]]
    (conj acc {:name key
               :pairs-num (count (keys val))}))
   []
   (:markets @db)))

