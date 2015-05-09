{:user
 {:plugins [[cider/cider-nrepl "0.9.0-snapshot"]
            [lein-plz "0.2.1"]
            [lein-pprint "1.1.1"]
            [codox "0.8.10"]
            [refactor-nrepl "1.1.0-SNAPSHOT"]]
  :dependencies [[alembic "0.2.1"]
                 [slamhound "1.5.5"]
                 [org.clojure/tools.nrepl "0.2.7"]]
  :aliases {"slamhound" ["run" "-m" "slam.hound"]}}}
