class Solution {
public:
    pair<bool,int> solve(TreeNode* root){
        if(root==NULL){
            return make_pair(true,0);
        }
        pair<bool,int>left=solve(root->left);
        pair<bool,int>right=solve(root->right);
        bool op1=left.first;
        bool op2=right.first;
        int h1=left.second;
        int h2=right.second;
        bool h=abs(h1-h2)<=1;
        pair<bool,int>ans;
        ans.second=max(h1,h2)+1;
        if(op1 && op2 && h){

            ans.first=true;
            return ans;
        }
        else{
            ans.first=false;
            return ans;
        }
    }
    bool isBalanced(TreeNode* root) {
        pair<bool,int>p=solve(root);
        return p.first;
    }
};
