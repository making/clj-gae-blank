(defproject clj-gae-blank "0.1.0-SNAPSHOT" 
  :description "a blank project for clojure on GAE" 
  :dependencies [[org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0"]
                 [org.clojars.making/compojure "0.4.0-SNAPSHOT"]
                 [com.google.appengine/appengine-tools-sdk "1.3.1"]
                 [ring/ring-core "0.2.0-RC2"]
                 [ring/ring-servlet "0.2.0-RC2"]
                 [ring/ring-jetty-adapter "0.2.0-RC2"]
                 [hiccup/hiccup "0.2.1"]]
  ;; :dev-dependencies [[leiningen/lein-swank "1.1.0"]] ; if you use lein-swank, delete jars which depends on lein-swank before deploy GAE.
  ;; you should make symbolic link at project home directory to add classpath in "lein repl" (ln -s war/WEB-INF/classes/)
  :compile-path "war/WEB-INF/classes/" 
  ;; you should make symbolic link at project home directory to add classpath in "lein repl" (ln -s war/WEB-INF/lib/)
  :library-path "war/WEB-INF/lib/"
  :main clj-gae-blank ; for leiningen 1.1.0
  )