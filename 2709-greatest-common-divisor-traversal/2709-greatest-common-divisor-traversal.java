class Solution {

    public boolean canTraverseAllPairs(int[] nums) {
        if (nums.length == 1) return true;
        int max = 0;
        for (int data : nums) {
            if (data == 1) return false;
            max = Math.max(data, max);
        }

        DJS ds = new DJS(max + 1);
        int[] lcf = sieve(nums, max);

        for (int data : nums) {
            int d = data;
            while (data > 1) {
                if (data % lcf[data] == 0) {
                    ds.union(lcf[data], d);
                    data /= lcf[data];
                }
            }
        }

        int parent = ds.find(nums[0]);
        for (int i : nums) {
            int k = ds.find(i);
            if (k != parent) {
                return false;
            }
        }
        return true;
    }

    private int[] sieve(int[] nums, int max) {
        boolean[] prime = new boolean[max + 1];
        int[] lcf = new int[max + 1];

        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 1; i < lcf.length; i++) {
            lcf[i] = i;
        }

        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i]) {
                for (int j = i * i; j < prime.length; j += i) {
                    if (prime[j]) {
                        lcf[j] = i;
                    }

                    prime[j] = false;
                }
            }
        }

        return lcf;
    }
}

class DJS {
    int[] parent;

    public DJS(int size) {
        this.parent = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    public int find(int u) {
        if (parent[u] != u) {
            parent[u] = find(parent[u]);
        }
        return parent[u];
    }

    public void union(int u, int v) {
        int up = find(u);
        int vp = find(v);

        if (up == vp) return;

        parent[vp] = up;
    }

    public void resetUnion(int u, int v) {
        parent[u] = u;
        parent[v] = v;
    }

    public boolean isConnected(int u, int v) {
        return find(u) == find(v);
    }
}
