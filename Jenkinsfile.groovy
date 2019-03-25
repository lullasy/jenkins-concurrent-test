node {
    try {
        lock(mix_env) {
            stage("first") {
                echo "pwd : ${pwd()}"
                echo "pwd.replace : ${pwd().replaceFirst(/@\d+/, "")}"
                sleep 10
            }
        }
    } finally {
        echo "owari"
    }
}

