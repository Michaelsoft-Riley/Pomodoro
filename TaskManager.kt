class TaskManager {
    val tasks = mutableListOf<Task>()

    fun createTask() {
        print("Task name: ")
        val name: String = readln()
        print("Description: ")
        val description: String = readln()

        val task = Task(name, description)
        tasks.add(task)
    }

    fun displayTasks() {
        for (task in tasks) {
            task.displayTask()
        }
    }

    fun selectTask() {
        // TODO
    }

    fun editTask() {
        // TODO
    }

    fun removeTask() {
        // TODO
    }

    fun saveTasks() {
        // TODO
    }

    fun overwriteTasks() {
        // TODO
    }
}