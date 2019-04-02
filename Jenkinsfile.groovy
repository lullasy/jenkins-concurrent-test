node {
    try {
        lock(mix_env) {
            def workspace = pwd().replaceFirst(/@\d+/, "")
            stage("first") {
                echo "${workspace}"
                echo "pwd.replace : ${pwd().replaceFirst(/@\d+/, "")}"
                sleep 5
            }
            stage("load") {
                sh "ls"
                def rola = load "${workspace}@script/rie.groovy"
                //rola.fujishioro()
                rola.rie()
                rola.ichigo()
            }
        }
    } finally {
        echo "owari"
    }
}

