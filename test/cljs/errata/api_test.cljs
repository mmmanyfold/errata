(ns errata.api-test
  (:require-macros [cljs.test :refer [deftest testing is]])
  (:require [cljs.test :as t]
            [errata.api :as api]))

(deftest get-api-version []
         (testing "ability to retrieve api version"
                  (is (not= nil? (api/version)))))