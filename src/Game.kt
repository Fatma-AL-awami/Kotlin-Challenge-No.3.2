fun main(){
    var healthPoints:Int =0;
    val playerName="madrigal";
    var isBlessed =true;
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt();

    var playerState=when(karma)
    {
        in 0..5 ->"Red"
        in 6..10 ->"Orange"
        in 11..15 ->"Purple"
        in 16..20 ->"green"
        else -> "no color"

    }
    println(playerState);


    }