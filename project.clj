(defproject protobuf-example "0.1.0-SNAPSHOT"
  :description "minimal protobuf example: it works with leiningen but fails inside LightTable"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.flatland/protobuf "0.8.1"]]
  :plugins [[lein-protobuf "0.4.1"]])
