# clj-gae-blank #

a blank project for Clojure on  Google App Engine

## Compile ##

$ lein compile

## Deploy ##

fill your app-id to <application> element in war/WEB-INF/appengine-web.xml

add {GAE_SDK_HOME}/bin to $PATH

$ appcfg.sh war update

when you want to use local server

$ dev_appserver.sh war