fun main(args: Array<String>){

    var wbtn = WorkWithButton()
    println("${wbtn.btnName}")
    wbtn.onTouch()
    wbtn.onClick()

    wbtn.btnName = "Stop Button"
    println("${wbtn.btnName}")
    
}

interface StartButton{
    //interface by default abstract and open not final
    var btnName: String

    fun onTouch()
    fun onClick(){
        println("Start Button Clicked!")
    }
}

interface StopButton{
    var btnName: String

    fun onTouch(){
        println("Stop Button onTouch")
    }
    fun onClick(){
        println("Stop Button Clicked!")
    }
}

class WorkWithButton : StartButton,StopButton{

    override var btnName: String = "Start Button"
    override fun onTouch() {
        super<StopButton>.onTouch()
        println("Start Button onTouch")
    }

    override fun onClick() {
        super<StartButton>.onClick()
        super<StopButton>.onClick()
    }
}