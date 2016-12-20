ml-groovysh is (currently) a tiny project that serves one purpose:

1. Defines a Main program for invoking groovysh with a workaround for jAnsi as defined in the 
sample at https://github.com/tkruse/gradle-groovysh-plugin/blob/master/doc/InstallAppShellManually.md

The intent is that this Main program can be used by [ml-gradle](https://github.com/rjrudin/ml-gradle) in a custom
Gradle task as a simple way of launching groovysh.

ml-groovysh was created to address the fact that the [gradle-groovysh-plugin](https://github.com/tkruse/gradle-groovysh-plugin)
stopped working on Gradle 2.13+, and the author of that plugin kindly included instructions on how to setup
a custom Gradle task to accomplish what that plugin does. 
