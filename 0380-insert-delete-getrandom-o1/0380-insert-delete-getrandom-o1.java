class RandomizedSet {
    List<Integer> ls;
    public RandomizedSet() {
        ls= new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(ls.contains(val)){
            return false;
        }
        ls.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(ls.contains(val)){
            ls.remove((Object)val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        int index = new Random().nextInt(0, ls.size());
        return ls.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */