GridLayout Example
------------------

Simple example that shows how to use the Compatibility v7 GridLayout Extra
with a Maven project using the [Maven Android SDK Deployer] (https://github.com/mosabua/maven-android-sdk-deployer).


How to Run the example
----------------------

- Install the sdk level you want to target in your local repo, e.g.:

   	  	mvn install -P 2.2

- Install the Extras:

    	cd extras/
    	mvn install

- Now you're ready to package and deploy this sample project. From the
root folder of this project do:

    	mvn package
    	mvn android:deploy

Ensure you have a running AVD and have fun :).

