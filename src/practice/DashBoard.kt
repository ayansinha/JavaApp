package practice

fun main() {
    val state = ViewStateImpl()
    println(DashBoard(param = "any", state = state).init())
}

class DashBoard(var param: String, var state: IViewState) {

    fun init() {
        println(state.getOTP(param = param))
    }
}