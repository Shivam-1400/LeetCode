object Solution {
    def findSpecialInteger(list: Array[Int]): Int = {
        
        val frequencyMap = list.map(element => (element, 1)).groupBy(_._1).mapValues(_.size)
        val maxFrequency = frequencyMap.values.max
        val maxFrequencyElement = frequencyMap.filter(_._2 == maxFrequency).keys.headOption.getOrElse(null.asInstanceOf[Int])
        (maxFrequencyElement)
    }
}