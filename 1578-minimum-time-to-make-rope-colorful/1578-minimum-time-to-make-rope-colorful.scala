// import scala.math.min
// object Solution {
//     def minCost(colors: String, neededTime: Array[Int]): Int = {
//         val colIdx= colors.zipWithIndex
//         colIdx.sliding(2).map{
//             case Seq((firstColor, firstIndex),(secondColor, secondIndex))=>{
//                 if(firstColor== secondColor) min(neededTime(firstIndex), neededTime(secondIndex))
//                 else 0
//             }
//         }.toSeq.sum
        
//     }
// }

object Solution {
    def solve(sum: Int, prev: Int, i: Int, colors: String, neededTime: Array[Int]): Int = {
        if (i < colors.length) {
            if (colors(prev) != colors(i))
                solve(sum, i,i + 1, colors, neededTime)
            else {
                val newSum = sum + math.min(neededTime(prev), neededTime(i))
                if(math.min(neededTime(prev), neededTime(i))== neededTime(i)){
                    solve(newSum, prev, i + 1, colors, neededTime)
                }
                else    
                    solve(newSum, i, i + 1, colors, neededTime)
            }
        }
        else {
          sum
        }
    }
    def minCost(colors: String, neededTime: Array[Int]): Int = {
        val res:Int=solve(0,0,1,colors,neededTime)
        res
    }
}