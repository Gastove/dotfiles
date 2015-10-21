{:user
 {:plugins [[cider/cider-nrepl "0.10.0-SNAPSHOT"]
            [lein-plz "0.2.1"]
            [lein-pprint "1.1.1"]
            [codox "0.8.10"]
            [refactor-nrepl "2.0.0-SNAPSHOT"]]
  :dependencies [[alembic "0.2.1"]
                 [slamhound "1.5.5"]
                 [org.clojure/tools.nrepl "0.2.7"]]
  :aliases {"slamhound" ["run" "-m" "slam.hound"]}}}
