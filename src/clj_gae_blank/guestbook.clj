(ns clj-gae-blank.guestbook
  (:use [hiccup.core :only [html]]
        [ring.util.response :only [redirect]]
        [am.ik.clj-gae-ds.core]))

(defn greet [req]
  (let [content (get-in req [:params "content"])
        name (get-in req [:params "name"])
        entity (map-entity "Greeting" :content content :name name :date (java.util.Date.))]
    (ds-put entity)
    (redirect "/")))
  