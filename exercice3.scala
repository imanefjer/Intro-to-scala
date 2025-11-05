val l = (1 to 100).toList
val f = l.filter(ele => ele % 2 == 0)
val m = f.map(rec => rec * rec)
val r=m.reduce((total, element) => total+element)
println(r)


