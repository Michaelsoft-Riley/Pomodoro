class Task(
    private val name: String,
    private val description: String,
    private var focusTime: Int = 0) {

    fun markCompleted() {
        focusTime = 0
    }

    fun displayTask() {
        println("$name: $description")
    }
}