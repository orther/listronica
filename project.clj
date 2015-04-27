(defproject webdev "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring "1.3.2"]
                 [compojure "1.3.3"]
                 [org.clojure/java.jdbc "0.3.6"]
                 [org.postgresql/postgresql "9.4-1201-jdbc4"]
                 [hiccup "1.0.5"]]

  :min-lein-version "2.0.0"

  :uberjar-name "webdev.jar"
  
  :main webdev.core

  :profiles {:dev
             {:main webdev.core/-dev-main}})
