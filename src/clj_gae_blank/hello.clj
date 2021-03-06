(ns clj-gae-blank.hello
  (:use [hiccup.core :only [html]]
        [clj-gae-blank.guestbook]
        [am.ik.clj-gae-ds.core]))

(defn greet-form []
  [:form {:method :get :action :greet}
   "name:" [:input {:name :name :type :text}]
   [:br]   
   "content:" [:input {:name :content :type :text}]
   [:br]
   [:input {:name :submit :type :submit}]])

(defn hello []
  (html [:html
         [:head
          [:title "Hello Clojure"]]
         [:h1 [:a {:href "/"} "Hello!!"]]
         [:p "Let's Clojure!!"]
         (greet-form)
         [:hr]
         (show-greets)]))
