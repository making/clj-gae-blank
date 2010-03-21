(ns clj-gae-blank.hello
  (:use [hiccup.core :only [html]]))

(defn hello []
  (html [:html
         [:head
          [:title "Hello Clojure"]]
         [:h1 [:a {:href "/"} "Hello!!"]]
         [:p "Let's Clojure!"]]))
