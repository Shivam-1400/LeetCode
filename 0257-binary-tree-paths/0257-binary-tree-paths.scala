/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
import scala.collection.mutable.ListBuffer
//check notes
object Solution {
    def binaryTreePaths(root: TreeNode): List[String] = {
        val path= ListBuffer[String]()
        solve(root, path, "")
        // List("sk")
        path.toList
    }
    def solve(rt: TreeNode, ls:ListBuffer[String], st: String):Unit={
        if(rt== null){
            return
        }
        if(rt.left== null && rt.right== null){
            // val s:String= st+ rt.value
            // ls.addString(s)
            // println(st)
            ls += (st + rt.value)

        }
        solve(rt.left, ls, st+rt.value+"->")
        solve(rt.right, ls, st+rt.value+"->")
    }
}

// def backTrack(root: TreeNode):String={
//             if(root == null){
//                 ""
//             }
//             if(root.left ==null && root.right== null)
//                 root.value+""
//             // else if(root.left != null){
//             //     val str1= root.value+ "->"+backTrack(root.left)
//             // }
//             // else if(root.right != null){
//             //     val str2= root.value+ "->"+backTrack(root.right)
//             // }
//             // ""
                
            
//         }