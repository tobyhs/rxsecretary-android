# rxsecretary-android

rxsecretary-android is a library that contains
[`AndroidSchedulerProvider`](library/src/main/java/com/github/tobyhs/rxsecretary/android/AndroidSchedulerProvider.java),
an [RxSecretary](https://github.com/tobyhs/rxsecretary) `SchedulerProvider` for
Android applications.

To install, make sure jitpack.io is in your root build.gradle:
```gradle
allprojects {
    repositories {
        google()
        maven { url 'https://jitpack.io' }
        mavenCentral()
    }
}
```

Then add the dependency to your module level build.gradle:
```gradle
dependencies {
    implementation "com.github.tobyhs:rxsecretary-android:$version"
}
```
