{:user
 {:plugins [[cider/cider-nrepl "0.8.2-SNAPSHOT"]
            [lein-plz "0.2.1"]
            [lein-pprint "1.1.1"]
            [codox "0.8.10"]
            [refactor-nrepl "0.2.2"]]
  :dependencies [[alembic "0.2.1"]
                 [slamhound "1.5.5"]]
  :aliases {"slamhound" ["run" "-m" "slam.hound"]}}}
