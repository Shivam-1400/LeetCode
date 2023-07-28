class Solution
{
    public:
        long long Solve(vector<int> &arr, int n, int l, int r)
        {
            if (l == r)
                return arr[l];
            if (l + 1 == r)
                return max(arr[l], arr[r]);
            return max(arr[l] + min(Solve(arr, n, l + 2, r), Solve(arr, n, l + 1, r - 1)),
                arr[r] + min(Solve(arr, n, l + 1, r - 1), Solve(arr, n, l, r - 2)));
        }
    bool PredictTheWinner(vector<int> &arr)
    {
        int total = accumulate(arr.begin(), arr.end(), 0);
        long long player1 = Solve(arr, arr.size(), 0, arr.size() - 1);
        return (total - player1 <= total / 2);
    }
};