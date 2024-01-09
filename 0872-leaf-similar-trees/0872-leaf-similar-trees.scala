/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def leafSimilar(root1: TreeNode, root2: TreeNode): Boolean = {
        def getList(rt: TreeNode, ls: List[Int]):List[Int]={
            if (rt== null)
                ls
            else if(rt.left== null && rt.right== null)
                ls:+(rt.value)
            else{
                getList(rt.left, ls):::getList(rt.right, ls)    
            }
        }
        
        val ls1= getList(root1, List())
        val ls2= getList(root2, List())
        
        // ls1.map(v=> print(s"$v  "))
        // ls2.map(v=> print(s"$v  "))
        
        
        println(ls1)
        println(ls2)
        
        ls1== ls2
    }
}