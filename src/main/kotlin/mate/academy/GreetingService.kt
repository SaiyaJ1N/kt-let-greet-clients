package mate.academy

class GreetingService {
    fun getGreetings(clientNames: List<String?>): List<String> {
        val greeting: MutableList<String> = mutableListOf()
        clientNames.forEach {
            it?.let {
                greeting.add("Hello, $it!")
            }
        }
        return greeting
    }
}
