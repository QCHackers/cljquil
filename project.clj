(require 'cemerick.pomegranate.aether)
(cemerick.pomegranate.aether/register-wagon-factory!
 "http" #(org.apache.maven.wagon.providers.http.HttpWagon.))

(defproject cljquil "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [["jcenter" {:url "http://jcenter.bintray.com"}]]
  :dependencies [[org.clojure/clojure "1.8.0"]
  		 [org.qchackers.jquil/api "1.0.0"]]
  :main ^:skip-aot cljquil.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
