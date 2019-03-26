node {
    try {
        lock(mix_env) {
            def workspace = pwd()
            stage("first") {
                echo "${workspace}"
                echo "pwd.replace : ${pwd().replaceFirst(/@\d+/, "")}"
                sleep 5
            }
            stage("load") {
                checkout scm
                sh "ls"
                def rola = load "${workspace}/rie.groovy"
                rola.fujishioro()
            }
        }
    } finally {
        echo "owari"
    }
}

