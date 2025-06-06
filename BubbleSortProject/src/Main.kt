fun main() {
    val nums = intArrayOf(2, 0, 2, 1, 1, 0)


    println(bubbleSort(nums).contentToString())
}

fun bubbleSort (nums: IntArray): IntArray {

    var stopPoint = nums.size

    while (stopPoint > 1) {
        for (n in 0 until stopPoint - 1) {
            if (nums[n] > nums[n + 1]) {

                val current = nums[n + 1]

                nums[n + 1] = nums[n]
                nums[n] = current
            }
        }

        --stopPoint
    }

    return nums
}