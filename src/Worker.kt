class Worker(Name:String, val Company:String):Person(Name=Name) {
    override fun toString(): String = "$Company $Name"
}