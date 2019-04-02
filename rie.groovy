def rie() {
    echo "rie-san OK!"
    def rworkspace = "${workspace}".replaceFirst(/@\d+/, "")
    sleep 5
    def yume = load "${rworkspace}@script/ruka.groovy"
    yume.akari()
}

def ichigo() {
    echo "sample"
}

return this
