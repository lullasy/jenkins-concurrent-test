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
                checkout scm
                def rola = load "rie.groovy"
                rola.fujishioro()
            }
        }
    } finally {
        echo "owari"
    }
}

