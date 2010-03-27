(ns clj_gae_blank.ds
  (:use [clojure.test])
  (:import [com.google.appengine.api.datastore 
            DatastoreServiceFactory DatastoreService 
            Entity Key Query]
           [com.google.appengine.tools.development.testing 
            LocalDatastoreServiceTestConfig 
            LocalServiceTestHelper]))

(defmacro defdstest [test-name & body]
  `(deftest ~test-name
     (let [config# (LocalDatastoreServiceTestConfig.)
           helper# (LocalServiceTestHelper. (into-array [config#]))]
       (.setUp helper#)
       (try 
        ~@body
        (finally 
         (.tearDown helper#))))))


(defdstest foo
    (let [entity (Entity. "test")
          _ (doto entity 
              (.setProperty "prop1" 100)
              (.setProperty "prop2" "str"))
          service (DatastoreServiceFactory/getDatastoreService)
          key (.put service entity)]
      (is (not (nil? key)))
      (is (= entity (.get service key)))))

(run-tests)
