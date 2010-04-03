(ns clj-gae-blank
  (:gen-class 
   :extends javax.servlet.http.HttpServlet)
  (:use [compojure.core :only [defroutes GET]]
        [ring.util.servlet :only [defservice]]
        [clj-gae-blank hello guestbook]))

(defroutes app
  (GET "/greet" req (greet req))
  (GET "/*" _ (hello)))

(defservice app)

