class DestroyShips {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val sizeOfList = Integer.valueOf(readLine())
            val listOfLoot = ArrayList<Int>()

            readLine()?.let { line ->
                line.split(" ").map {
                    it.toInt()
                }.forEach {
                    println(it)
                    listOfLoot.add(it)
                }
            }

            println(getNumberOfDaysAfterDestructionStops(listOfLoot))
        }

        fun getNumberOfDaysAfterDestructionStops(lootArray: ArrayList<Int>): Int {
            var days = 0

            while (true) {
                var elementRemoved = false

                for (i in lootArray.size - 1 downTo 1) {

                    if (lootArray.get(i) > lootArray.get(i - 1)) {
                        lootArray.removeAt(i)
                        elementRemoved = true
                    }
                }

                if (elementRemoved) days++
                else break
            }

            return days
        }
    }
}

/*
 val array = arrayListOf(7, 6, 5, 8, 4, 7, 10, 9)
 val array2 = arrayListOf(3, 6, 2, 7, 5)
 al array3 = arrayListOf(0, -1, 1, 0, -4)
*
* */