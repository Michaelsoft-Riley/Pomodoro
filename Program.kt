fun main() {
    // TODO: Load tasks on startup, overwrite tasks file every time a task is edited, created, or removed
    // TODO: Display currently selected task above clock
    // TODO: Option to stop the current focus timer. This should call RecordFocusTime()
    // TODO: Option to pause the current timer. This may require some big changes to the timer.
    // TODO: option to start or skip break
    // TODO: option to create new intervals
    // TODO: Option to create tasks
    // TODO: Option to select a task. Focus time will be saved to file with the task name listed.
    // TODO: Calculate focus time for each task for each day over the past week and month
    val taskManager = TaskManager()

    val timers = mutableListOf<Timer>()
    val timer1 = FocusTimer(25)
    val timer2 = BreakTimer(5)
    timers.add(timer1)
    timers.add(timer2)

    var choice = ""

    while (choice != "0") {
        println("===POMODORO===")
        println("\nPlease select an option:")
        println("0. Quit")
        println("1. Create new task")
        println("2. Display tasks") // TODO: this should eventually be put inside the "select task" option
        println("3. Custom intervals")
        println("4. Reset intervals")
        println("Or press [enter] to continue to timer")
        choice = readLine().toString()

        when (choice) {
            "0" -> break
            "1" -> taskManager.createTask()
            "2" -> taskManager.displayTasks()
            "3" -> {
                // TODO: add logic for incorrect input
                print("Focus minutes(int): ")
                val focusTime: Int = readln().toInt()
                print("Break minutes(int)")
                val breakTime: Int = readln().toInt()

                timers[0].setNewDuration(focusTime)
                timers[1].setNewDuration(breakTime)
            }
            "4" -> {
                timers[0].setNewDuration(25)
                timers[1].setNewDuration(5)
            }
            else -> {
                while (choice != "n") {
                    for (timer in timers) {
                        timer.run()
                    }

                    print("Continue with the current timer? (y/n): ")
                    choice = readLine().toString()
                }
            }
        }
    }
}