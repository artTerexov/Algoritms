object StockList {
    fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {
        val res = arrayListOf<String>()
        val buff = hashMapOf<Char, Int>()
        if (lstOfArt.isEmpty() || lstOfCat.isEmpty()) {
            return ""
        }
        for (item in lstOfArt) {
            if (buff.containsKey(item[0])) {
                buff[item[0]] = buff[item[0]]!!.plus(item.split(' ')[1].toInt())
            } else {
                buff[item[0]] = item.split(' ')[1].toInt()
            }
        }
        for (item in lstOfCat) {
            if (buff.contains(item[0])) {
                res.add("(${item} : ${buff[item[0]]})")
            } else {
                res.add("(${item} : ${0})")
            }
        }
        return res.toString().replace("[", "").replace("]","").replace(", ", " - ")
    }
}