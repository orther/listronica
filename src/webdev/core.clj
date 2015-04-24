(ns webdev.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.reload :refer [wrap-reload]]
            [compojure.core :refer [defroutes GET]]
            [compojure.route :refer [not-found]]))

(defn about [req]
  {:status 200
   :body "My name is Brandon Orther. I am following along with LispCast's Intro to Web Development with Clojure."
    :headers {}})

(defn goodbye [req]
  {:status 200
   :body "Goodbye, cruel world!"
    :headers {}})

(defn greet [req]
  {:status 200
   :body "Hello, World!"
   :headers {}})

(defroutes app
  (GET "/" [] greet)
  (GET "/about" [] about)
  (GET "/goodbye" [] goodbye)
  (not-found "Page not found."))

(defn -main [port]
  (jetty/run-jetty app                 {:port (Integer. port)})) 

(defn -dev-main [port]
  (jetty/run-jetty (wrap-reload #'app) {:port (Integer. port)}))
