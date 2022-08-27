package sandbox.exercise.solved

import java.util.*

class GarageRoof {

    // 창고 다각형
    // https://www.acmicpc.net/problem/2304
    fun solution(size: Int, columns: Map<Int, Int>): Int {
        val sortedColumns: SortedMap<Int, Int> = columns.toSortedMap()

        // 반복문 돌 범위
        val firstColumn = sortedColumns.firstKey()
        val lastColumn = sortedColumns.lastKey()

        // 제일 높은 기둥 찍고 내려가기
        var max = 0
        var highestColumn = 0

        for (column in sortedColumns) {
            if (column.value > max) {
                max = column.value
                highestColumn = column.key
            }
        }

        val start = sortedColumns[firstColumn]

        var now = start!!
        var result = 0

        for (i in firstColumn..highestColumn) {
            // 해당 위치에 기둥이 있다면
            if (sortedColumns.containsKey(i)) {
                // 해당 기둥이 이전 기둥보다 크다면
                if (sortedColumns[i]!! > now) {
                    now = sortedColumns[i]!!
                }
            }
            result += now
        }

        now = sortedColumns[lastColumn]!!

        for (j in lastColumn downTo highestColumn) {
            if (sortedColumns.containsKey(j)) {
                if (sortedColumns[j]!! > now) {
                    now = sortedColumns[j]!!
                }
            }
            result += now
        }

        return result - sortedColumns[highestColumn]!!
    }
}
