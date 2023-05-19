(ns itog.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[itog started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[itog has shut down successfully]=-"))
   :middleware identity})
