# Android Validation
## Made with love for you

This our library short cuts a lot of long Android checks,
with which you can check :-

- Whether the text elements are empty or not.
- Validation of some basic variables, like :-
  - Name
  - Email
  - Password
  - Passport
  - We are working on more

## Attention
This library is in its first version and does not contain much, so for any suggestions or inquiries, contact me through the following means of communication :-
- E-mail : fm.moath99@gmail.com
- Whatsapp : +972597718418

#### Please rate this library


## Getting Started
```kotlin
allprojects {
    repositories {
  	  //...
  	  maven { url 'https://jitpack.io' }
    }
}
```
  
```kotlin
dependencies {
    implementation 'com.github.Fmoath:AndroidValidationLibrary:1.0.0'
}
```

## To check whether the text elements are empty or not
```kotlin
import fm.ps.libs.validation.validator.Validation

..............................................................................
val validation = Validation()
validation.addEmptyValidator( editText1 , editText2 , editText3 , ... ) // Parameter is an infinite string of EditText
val isValid = if (validation.isValid) true else false

```

## To validate variables
```kotlin
import fm.ps.libs.validation.validator.Validation

..............................................................................
val validation = Validation()
validation.nameValidation( name ) //The parameter is an EditText
validation.emailValidation( email ) //The parameter is an EditText
validation.passwordValidation( password ) //The parameter is an EditText
validation.passportValidation( passport ) //The parameter is an EditText

val isValid = if (validation.isValid) true else false
```
