(ns my-website.server
  (:require [noir.server :as server]))

(server/load-views "src/my_website/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port 8080]
    (server/start port {:mode mode
                        :ns 'my-website})))

