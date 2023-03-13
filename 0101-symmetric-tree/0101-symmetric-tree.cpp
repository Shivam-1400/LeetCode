/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    // void inOrderL(TreeNode* root, vector<int> &A){
    //     if(root==NULL){
    //         A.push_back(NULL);
    //         return;
    //     }
    //     inOrderL(root->left, A);
    //     A.push_back(root->val);
    //     inOrderL(root->right, A);
    // }
    // void inOrderR(TreeNode* root, vector<int> &A){
    //     if(root==NULL){
    //         A.push_back(NULL);
    //         return;
    //     }
    //     inOrderR(root->right, A);
    //     A.push_back(root->val);
    //     inOrderR(root->left, A);
    // }
    // vector<int> getLeftInorder(TreeNode* root){
    //     vector<int> ans;
    //     inOrderL(root, ans);
    //     return ans;
    // }
    // vector<int> getRightInorder(TreeNode* root){
    //     vector<int> ans;
    //     inOrderR(root, ans);
    //     return ans;
    // }
    // bool isSymmetric(TreeNode* root) {
    //     // getLeft(root);
    //     // getRight(root);
    //     return getLeftInorder(root)== getRightInorder(root);
    // }
    bool isMirror(TreeNode * rootL, TreeNode* rootR){
        if(rootL== NULL && rootR== NULL){
            return true;
        }
        if(rootL && rootR){
            if( rootL->val== rootR->val){
                return isMirror(rootL->left, rootR->right) && isMirror(rootL->right, rootR-> left);
            }
        } 
        return false;
    }
    bool isSymmetric(TreeNode* root) {
        // getLeft(root);
        // getRight(root);
        return isMirror(root, root);
    }
};