val xs = List(1, 2, 3, 4)

// Scala function syntax
val add1 = (i: Int) => i + 1         // implicit return type
val add2: Int => Int = i => i + 1    // explicit return type

xs.map(add1)

