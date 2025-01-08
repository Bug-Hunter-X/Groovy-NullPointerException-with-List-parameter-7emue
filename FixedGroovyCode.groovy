```groovy
def myMethod(List<String> strings) {
  strings?.each { string ->
    println string?.toUpperCase() //Added safe navigation here as well
  }
}

myMethod(['a', 'b', 'c']) // Works fine

myMethod(null) // Handles null gracefully; nothing is printed
```