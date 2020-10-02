import java.util.*

object PrimeDecomp {

    private lateinit var numMap:SortedMap<Int, Int>

    fun factors(l: Int): String {
        val result = StringBuilder()

        numMap = sortedMapOf()

        findDev(l, 2)

        for (i in numMap.keys) {
            if (numMap[i] == 1) {
                result.append("($i)")
            } else {
                result.append("($i**${numMap[i]})")
            }
        }
        return result.toString()
    }

    private fun findDev(num: Int, dev: Int) {
        if (num == 1) {
            return
        }
        if (dev > num) {
            numMap[num] = 1
            return
        }
        return if (num % dev == 0) {
            if (!numMap.containsKey(dev)) {
                numMap[dev] = 1
                findDev(num / dev, dev)
            } else {
                numMap[dev] = numMap.getValue(dev) + 1
                findDev(num / dev, dev)
            }
        } else {
            findDev(num, dev + 1)
        }
    }

    //Оптимальное решение

//    fun factors(l: Int): String {
//        var n=l
//        var str=""
//        for(i in 2..n)
//        {
//            var c=0
//            while(n%i==0){c++; n/=i }
//            if(c>1) str+="("+i+"**"+c+")";
//            if(c==1) str+="("+i+")";
//        }
//        return str
//    }
}