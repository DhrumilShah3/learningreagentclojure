(ns giggin.fb.init
  (:require ["firebase/app" :as firebase]
            ["firebase/database"]
            ["firebase/auth"]
            [giggin.fb.auth :refer [on-auth-state-changed]]))

(defn firebase-init
  []
  (if (zero? (alength firebase/apps))
    (firebase/initializeApp
      #js {:apiKey "AIzaSyCDyYUrwFfIwnf6mo-8Dr4gKpRd4ctNd3o"
           :authDomain "giggin-24bab.firebaseapp.com"
           :databaseURL "https://giggin-24bab.firebaseio.com"
           :projectId "giggin-24bab"})
    (firebase/app))
  (on-auth-state-changed))
