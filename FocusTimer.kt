class FocusTimer(
    duration: Int,
    override val name: String = "Focus"
) : Timer(duration) {

    var focusTime = 0

    override fun run() {
        displayStartMessage()
        countdown()
        recordFocusTime()
        displayEndMessage()
    }

    public override fun updateSeconds(seconds : Int) {
        // Increments focusTime by 1min for every updateSeconds loop (60seconds)
        super.updateSeconds(seconds)
        focusTime++
    }

    fun recordFocusTime() {
        // TODO
    }
}