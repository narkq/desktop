(ns app.screens.alerts
  (:require [reagent.core :as r]
            [clojure.string :as s]
            [app.components.header :refer [Header]]
            [app.components.dropdown :refer [dropdown]]
            [app.actions.ui :refer [to-screen]]
            [app.db :refer [db]]
            [app.logic.curr :refer [get-market-names
                                    get-crypto-currs]]
            [goog.functions]
            [app.components.ui :refer [Wrapper
                                       Container
                                       Icon]]))

(defn alerts []
 (let [toggle-items ["Portfolio" "Alerts"]]
  [Container
   [Header
    [Icon
     #(to-screen :bestprice)
     "icons/arrow-left.svg"]
    [Icon
      #(to-screen :settings)
      "icons/settings.svg"]
    toggle-items]
   [Wrapper
     "alerts"]]))
