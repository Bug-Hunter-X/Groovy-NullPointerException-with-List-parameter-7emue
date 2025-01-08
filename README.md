# Groovy NullPointerException Handling with Lists

This example demonstrates a common issue in Groovy where passing a `null` value to a method expecting a `List` results in a `NullPointerException`.  The solution showcases safe handling of null input using the Groovy `?.` safe navigation operator.

## Bug

The `myMethod` function iterates over a list of strings and prints their uppercase versions.  However, if a `null` list is passed, a `NullPointerException` occurs because the `each` method cannot operate on `null`.

## Solution

The issue is resolved by checking for null before invoking the `each` method. The Groovy safe navigation operator (`?.`) provides a concise way to handle potential null values. If the list is null, the `each` method is not called, preventing the exception.