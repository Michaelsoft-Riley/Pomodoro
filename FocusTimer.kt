class FocusTimer(
    duration: Int,
    override val name: String = "Focus"
) : Timer(duration) {

    var focusTime = 0

    // Runs as normal, but also records focusTime after countDown finishes
    override fun run() {
        displayStartMessage()
        countdown()
        recordFocusTime()
        displayEndMessage()
    }

    // Increments focusTime by 1min for every updateSeconds loop (60seconds)
    public override fun updateSeconds(seconds : Int) {
        super.updateSeconds(seconds)
        focusTime++
    }

    fun recordFocusTime() {
        // TODO
    }
}