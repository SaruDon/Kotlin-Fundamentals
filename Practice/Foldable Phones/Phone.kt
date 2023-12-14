open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }
    
    open fun switchOff() {
        isScreenLightOn = false
    }
    
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var phoneFolded:Boolean)  : Phone(){
    override fun switchOn(){
        if(!phoneFolded){
            isScreenLightOn = true
        }
    }
    fun fold(){
        phoneFolded = true
    }
    fun unfold(){
        phoneFolded = false
    }
}


fun main(args: Array<String>) {
    val newFoldablePhone = FoldablePhone(true)
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unfold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}