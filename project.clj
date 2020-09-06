(defproject clo-utils "0.2.0-SNAPSHOT"
  :description "Some more util functions for clojure"
  :url "https://github.com/cksharma11/clo-utils"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :profiles {:kaocha {:dependencies [[lambdaisland/kaocha "1.0.672"]]}}
  :aliases {"kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner"]}
  :plugins [[lein-cljfmt "0.6.8"]
            [lein-codox "0.10.7"]
            [lein-cloverage "1.0.7-SNAPSHOT"]]
  :repl-options {:init-ns clo-utils.core})
