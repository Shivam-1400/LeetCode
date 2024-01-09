/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def rangeSumBST(root: TreeNode, low: Int, high: Int): Int = {
        def getSumInRange(rt: TreeNode, l: Int, h: Int): Int={
            if(rt== null){
                0
            }
            else if(rt.value>= l && rt.value<= h){
                val sl= getSumInRange(rt.left, l, h) 
                val sr= getSumInRange(rt.right, l, h)
                rt.value+ sl+ sr
            }
            else{
                val sl= getSumInRange(rt.left, l, h) 
                val sr= getSumInRange(rt.right, l, h)
                sl+ sr
            }
            
        }  
        getSumInRange(root, low, high)
    }
}