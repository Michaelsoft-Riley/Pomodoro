class Task(
    private val name: String,
    private val description: String,
    private var focusTime: Int = 0) {

    // Used to reset focusTime when the user marks a task as complete
    fun markCompleted() {
        focusTime = 0
        // TODO: add a counter for the number of times a task has been completed
    }

    fun displayTask() {
        println("$name: $description")
    }
}