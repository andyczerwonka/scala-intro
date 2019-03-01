val xs = List(1, 2, 3, 4)


val even1: Int => Boolean = i => i % 2 == 0

def even2(i: Int) = i % 2 == 0

xs.filter(even2)

