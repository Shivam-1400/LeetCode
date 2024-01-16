class RandomizedSet() {
    val ls= scala.collection.mutable.Set[Int]()
    def insert(`val`: Int): Boolean = {
        ls.add(`val`)
    }

    def remove(`val`: Int): Boolean = {
        ls.remove(`val`)
    }

    def getRandom(): Int = {
        val n = util.Random.nextInt(ls.size)
        ls.iterator.drop(n).next()
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = new RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */