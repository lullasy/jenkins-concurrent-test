def rie() {
    echo "rie-san OK!"
    def workspace = ${workspace}.replaceFirst(/@\d+/, "")
    echo "${workspace}"
    sleep 5
    def yume = load "${workspace}@script/ruka.groovy"
    yume.akari()
}

def ichigo() {
    echo "sample"
}

return this
