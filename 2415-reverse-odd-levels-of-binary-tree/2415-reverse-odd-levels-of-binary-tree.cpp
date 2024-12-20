class Solution {
public:
    TreeNode* reverseOddLevels(TreeNode* root) 
    {
         unordered_map<int,vector<int>>mp;   //odd level --> all values
         queue<TreeNode*>q;
         q.push(root);
         int level=0;
         int size;

         while(!q.empty())
         {
            size=q.size();
            for(int i=0;i<size;i++)
            {
               TreeNode* temp=q.front();
               q.pop();

               if((level%2)!=0)
               {
                   mp[level].push_back(temp->val);
               }	

               if(temp->left!=NULL)
               {
                 q.push(temp->left);
               }
               if(temp->right!=NULL)
               {
                 q.push(temp->right);
               }
            }
            reverse(mp[level].begin(),mp[level].end());
            level++;
	 }
     
     while(!q.empty())
     {
     	q.pop();
	 }
	 
	 q.push(root);
	 level=0;
	 int idx=0;
	 while(!q.empty())
	 {
        size=q.size();
        
        for(int i=0;i<size;i++)
        {
        	TreeNode* temp=q.front();
        	q.pop();
        	
        	if((level%2)!=0)
        	{
        	   temp->val=mp[level][idx];
			   idx++;	
			}
			if(temp->left!=NULL)
			{
				q.push(temp->left);
			}
			if(temp->right!=NULL)
			{
				q.push(temp->right);
			}
		}
		level++;
         idx=0;
	 }
	 return root;    
    }
};