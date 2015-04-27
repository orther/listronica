(ns webdev.view
  (:require [hiccup.page :refer [html5]]
            [hiccup.core :refer [html h]]))

(defn home-page []
  (let [links [["About" "/about"]
               ["Goodbye" "/goodby"]
               ["Request" "/request"]
               ["Yo! Oliver!" "/yo/oliver"]
               ["Todo Items" "/items"]]
        img {:src "https://en.gravatar.com/userimage/34237964/983b2f4c505c11f4d0854a03a608fbe4.jpg?size=200"
             :alt "Bananas in hand"}]
    (html5 {:lang :en}
           [:head
            [:title "Listronica Home"]
            [:meta {:name :viewport
                    :content "width=device-width, initial-scale=1.0"}]
            [:link {:href "bootstrap/css/bootstrap.min.css"
                    :rel :stylesheet}]]
           [:body
            [:div.container
             [:div.row
              [:div.col-md-4
               [:img.img-rounded img]]
              [:div.col-md-8
               [:h1 "Welcome to Listronica"]
               [:div.row
                [:ul
                 (for [[name url] links]
                   [:li [:a {:href url} name]])]]]]]
            [:script {:src "http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"}]
            [:script {:src "/bootstrap/js/bootstrap.min.js"}]])))
