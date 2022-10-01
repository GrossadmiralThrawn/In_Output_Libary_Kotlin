class Input_Class
{
    fun Char_Input(): Char
    {
        val Input_Char: Char


        println("Geben Sie einen Character ein.")
        Input_Char = readLine()!!.first()


        return Input_Char
    }





    fun String_Input(): String
    {
        val Input_String: String



        println("Geben Sie einen String ein.")

        Input_String = readLine()!!



        return Input_String
    }




    fun  Int_Input(): Int
    {
        val Input_Int: Int


        println("Geben Sie eine Zahl ein")

        Input_Int = Integer.valueOf(readLine()!!)


        return Input_Int
    }





    fun Float_Input(): Float
    {
        val  Input_Float:  Float


        println("Geben Sie einen Float ein.")

        Input_Float = readLine()!!.toFloat()


        return Input_Float
    }




    fun Double_Input(): Double
    {
        val  Input_Float:  Double


        println("Geben Sie einen Double ein.")

        Input_Float = readLine()!!.toDouble()


        return Input_Float
    }
}