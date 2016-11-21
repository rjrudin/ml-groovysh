ml-groovysh is (currently) a tiny project that serves two purposes:

1. Defines a Main program for invoking groovysh with a workaround for jAnsi as defined in the 
sample at https://github.com/tkruse/gradle-groovysh-plugin/blob/master/doc/InstallAppShellManually.md
1. Pulls in some dependencies to allow for [ml-app-deployer](https://github.com/rjrudin/ml-app-deployer) to be 
used easily within a groovysh environment (specifically, the API class)

ml-groovysh was created to address the fact that the [gradle-groovysh-plugin](https://github.com/tkruse/gradle-groovysh-plugin)
stopped working on Gradle 2.13+, and the author of that plugin kindly included instructions on how to setup
a custom Gradle task to accomplish what that plugin does. 
