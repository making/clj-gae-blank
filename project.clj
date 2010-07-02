(defproject clj-gae-blank "0.1.1" 
  :description "a blank project for clojure on GAE" 
  :repositories {"maven.seasar.org" "http://maven.seasar.org/maven2"}
  :dependencies [[org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0"]
                 [compojure "0.4.0"]
                 [am.ik/clj-gae-ds "0.2.1"]
                 [am.ik/clj-gae-users "0.1.1"]
                 [com.google.appengine/appengine-api-1.0-sdk "1.3.5"]
                 [ring/ring-core "0.2.3"]
                 [ring/ring-servlet "0.2.3"]
                 [ring/ring-jetty-adapter "0.2.3"]
                 [hiccup/hiccup "0.2.6"]]
  :dev-dependencies [; if you use lein-swank, delete jars which depends on lein-swank before deploy GAE or launch Dev Server.
                     ;; [leiningen/lein-swank "1.1.0"]
                     [am.ik/clj-gae-testing "0.2.0-SNAPSHOT"]]
  ;; you should make symbolic link at project home directory to add classpath in "lein repl" (ln -s war/WEB-INF/classes/)
  :compile-path "war/WEB-INF/classes/" 
  ;; you should make symbolic link at project home directory to add classpath in "lein repl" (ln -s war/WEB-INF/lib/)
  :library-path "war/WEB-INF/lib/"
  :namespaces [clj-gae-blank])
