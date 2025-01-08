```groovy
def myMethod(List<String> strings) {
  strings.each { string ->
    println string.toUpperCase()
  }
}

myMethod(['a', 'b', 'c']) // Works fine

myMethod(null) // Throws NullPointerException
```