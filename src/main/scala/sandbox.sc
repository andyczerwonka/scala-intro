val xs = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

// Scala function syntax
def add(i: Int) = i + 1
def add0 = (i: Int) => i + 1
val add1 = (i: Int) => i + 1
val add2: Int => Int = i => i + 1
val add3: Int => Int = _ + 1

xs.map(add).map(add1).map(add2)


