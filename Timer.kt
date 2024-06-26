abstract class Timer(protected var duration: Int) {
    // TODO: limit input to 480 minutes (8 hours)
    // TODO: ui with buttons (using android api)
    // TODO: add defaults to constructor
    // TODO: change timer display to start on full duration
    protected abstract val name: String

    open fun run() {
        displayStartMessage()
        countdown()
        displayEndMessage()
    }

    // displays start message and waits for the user to press enter
    fun displayStartMessage() {
        println("$name: $duration min\nPress [Enter] to start")
        readln()
    }

    fun displayEndMessage() {
        println("\r$name: Done!")
    }

    // Iterates from duration downTo 0 by one after every 60 seconds
    protected fun countdown() {
        for (minutes in (duration - 1) downTo 0) {
            updateMinutes(minutes)
            for (seconds in 59 downTo 0) {
                updateSeconds(seconds)
            }
        }
    }

    // Updates the minutes display in console
    private fun updateMinutes(minutes: Int) {
        if (minutes < 10) {
            print("\r0$minutes : 00")
        } else {
            print("\r$minutes : 00")
        }
    }

    // Updates the seconds display in console, tracks the passage of time.
    protected open fun updateSeconds(seconds: Int) {
        // TODO: Using Thread.sleep like this is bad. Replace this when the rest of the framework is written.
        Thread.sleep(1000)
        if (seconds < 10) {
            print("\b\b0$seconds")
        } else {
            print("\b\b$seconds")
        }
    }

    fun setNewDuration(newDuration: Int) {
        duration = newDuration
    }
}