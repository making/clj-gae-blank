(defproject clj-gae-blank "0.1.0-SNAPSHOT" 
  :description "a blank project for clojure on GAE" 
  :repositories {"gaejtools" "http://gaejtools.sourceforge.jp/maven/repository",
                 "maven.seasar.org" "http://maven.seasar.org/maven2"}
  :dependencies [[org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0"]
                 [compojure "0.4.0-SNAPSHOT"]
                 [am.ik/clj-gae-ds "0.2.0-SNAPSHOT"]
                 [com.google.appengine/appengine-api-1.0-sdk "1.3.2"]
                 [ring/ring-core "0.2.0"]
                 [ring/ring-servlet "0.2.0"]
                 [ring/ring-jetty-adapter "0.2.0"]
                 [hiccup/hiccup "0.2.1"]]
  :dev-dependencies [; if you use lein-swank, delete jars which depends on lein-swank before deploy GAE or launch Dev Server.
                     ;; [leiningen/lein-swank "1.1.0"]
                     [com.google.appengine/appengine-testing "1.3.2"]
                     [com.google.appengine/appengine-api-labs "1.3.2"]
                     [com.google.appengine/appengine-api-1.0-stubs "1.3.2"]
                     [com.google.appengine/appengine-api-1.0-runtime-shared "1.3.2"]
                     [com.google.appengine/appengine-tools-sdk "1.3.2"]
                     ;; [com.google.appengine/appengine-api-1.0-runtime "1.3.2"]
                     ]
  ;; you should make symbolic link at project home directory to add classpath in "lein repl" (ln -s war/WEB-INF/classes/)
  :compile-path "war/WEB-INF/classes/" 
  ;; you should make symbolic link at project home directory to add classpath in "lein repl" (ln -s war/WEB-INF/lib/)
  :library-path "war/WEB-INF/lib/"
  :main clj-gae-blank ; for leiningen 1.1.0
  )