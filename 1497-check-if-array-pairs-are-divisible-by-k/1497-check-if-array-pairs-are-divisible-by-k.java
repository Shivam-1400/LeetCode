class Solution {
    public boolean canArrange(int[] arr, int k) {
        var remainderCount = new HashMap<Integer, Integer>();

        for (var num : arr)
            remainderCount.compute(Math.floorMod(num, k), (_, v) -> v == null ? 1 : ++v);

        if ((remainderCount.getOrDefault(0, 0) & 1) == 1)
            return false;

        return IntStream.rangeClosed(1, k >> 1).allMatch(i -> Objects.equals(remainderCount.get(i), remainderCount.get(k - i)));
    }
}