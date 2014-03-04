(ns spid-docs.pages
  (:require [spid-docs.articles :as articles]
            [spid-docs.concepts :as concepts]
            [spid-docs.endpoints :as endpoints]
            [spid-docs.frontpage :as frontpage]
            [spid-docs.types :as types]
            [stasis.core :as stasis]))

(defn get-pages [content]
  (stasis/merge-page-sources
   {:general-pages {"/" (partial frontpage/create-page (:apis content))}
    :endpoints (endpoints/create-pages (:endpoints content) (:types content) (:params content))
    :articles (articles/create-pages (:articles content))
    :concepts (concepts/create-pages (:concepts content))
    :types (types/create-pages (:types content))}))
