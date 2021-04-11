open class One_Dimension_Space() {
    private var x : Float? = null

    constructor(x: Float) : this(){
        this.x = x
    }

    fun One_Dim_point(){
        println("Point's location in ($x)")
    }

    fun Get_X() : Float? = this.x;

    operator fun minus(second : One_Dimension_Space) : One_Dimension_Space{
        return One_Dimension_Space(this.x!! - second.x!!)
    }
}