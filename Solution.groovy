def myMethod(String name) {
    println "Hello, ${name ?: 'Guest'}!"
}

myMethod(null)
myMethod("Alice")

//Alternative with safe navigation operator

def myMethod2(String name) {
    println "Hello, ${name?.toString() ?: 'Guest'}!"
}

myMethod2(null)
myMethod2("Bob")