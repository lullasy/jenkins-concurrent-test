node {
    try {
        lock(mix_env) {
            def workspace = pwd()
            stage("first") {
                echo "${workspace}"
                echo "pwd.replace : ${pwd().replaceFirst(/@\d+/, "")}"
                sleep 10
            }
            stage("load") {
                def rola = load "${workspace}@script/rie.groovy"
                rola.fujisioro()
            }
        }
    } finally {
        echo "owari"
    }
}

