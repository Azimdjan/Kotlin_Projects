class Two_Dimension_Space: One_Dimension_Space{
    private var y : Float? = null;

    constructor(x:Float, y: Float) : super(x){
        this.y = y
    }

    fun Two_Dim_point(){
        println("Points Location : (${this.Get_X()},$y)")
    }

    operator fun minus(second : Two_Dimension_Space) : Two_Dimension_Space{
        return Two_Dimension_Space(this.Get_X()!! - second.Get_X()!!,this.y!! - second.y!!)
    }
}