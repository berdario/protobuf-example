(ns protobuf-example.core
  (require [flatland.protobuf.core :refer [protodef protobuf protobuf-dump]])
  (:import Example$Person))

(def person (protodef Example$Person))

(defn serialize-person [id name]
  (protobuf-dump (protobuf person :id (Long/parseLong id) :name name)))
