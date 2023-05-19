(ns itog.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [itog.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[itog started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[itog has shut down successfully]=-"))
   :middleware wrap-dev})
