libgdx-gradle-template
======================

To create a new game with this template : 

    git clone <url of this repository>
    
et voilà !
 
#### Running the desktop project
To run the desktop project issue this gradle command:

    ./gradlew desktop:run
    
#### Packaging the desktop project
To create a ZIP distribution including shell scripts to start your app, issue this gradle command:

    ./gradlew desktop:distZip
    
This will create a ZIP file in the folder desktop/build/distributions, ready to be send to testers.
    
#### Running the Android project
To run the Android project, issues this gradle command:

    ./gradlew android:installDebug
   
This will compile the APK for Android, and install it on a connected device. You will have to
start the app manually on the device.

#### Packaging the Android project
The android:installDebug task will create an unsigned debug APK of your app, which you can find
in the android/build/apk/ folder. If you want to build a signed APK for release on the Google 
Play Store, please consult the [Android Gradle plugin documentation](http://tools.android.com/tech-docs/new-build-system/user-guide)

### Dependency Management
One of the benefits of Gradle and similar systems like Maven or Ivy, is that integrating
third party dependencies in your project is really simple. It also has the benfit that
your project file tree doesn't contain any JAR files or other 3rd party resources, keeping
things clean and tidy. Every time your or a team mate invoke a Gradle task, the 
dependencies of your project will get checked and updated if necessary.

How and where do you specify dependencies?

TBD see build.gradle in root for now
