(ns clj-gae-blank
  (:gen-class 
   :extends javax.servlet.http.HttpServlet)
  (:use [compojure.core :only [defroutes GET]]
        [ring.util.servlet :only [defservice]]
        [clj-gae-blank hello]))

(defroutes app
  (GET "/*" [] (hello)))

(defservice app)

