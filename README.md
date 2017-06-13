# WindChime

## What is it?

An app that runs in the background and generates a melody every now and then based on your keystrokes. Good for relaxing.

## Why is it?

![](/docs/i-dont-know.gif)

## How does it work?

The project uses JNativeHook that leverages platform-dependent native code to create low-level system-wide hooks. These hooks capture your keystrokes no matter what application is currently running and is in focus.

Different key combinations are assigned a note, that is played via Clip API.

## Using Locally

If you want to run this project locally,

### Requirements

1. Java 7 or above
2. Windows 7,8 or 10

### Build

For the first download/clone of this repo,

1. Import the JPlay1 folder as a Java project using your IDE (Eclipse/Netbeans).
2. If the IDE does not detect the `lib` folder, then [add its contents as external jars](http://www.wikihow.com/Add-JARs-to-Project-Build-Paths-in-Eclipse-(Java)).
3. Add "resources" folder as a Source. In Eclipse: `Project -> Properties -> Java Build Path -> Source -> Add Folder`

### Run

To directly use it.

1. Download the jar from latest release.
1. Double click the jar. This will start the app in background (You can check this under processes in TaskManager).
2. Type anything, anywhere to hear a sound.
3. To stop the app. Press `F9` key.

### Future Work

* Produce fractal sounds.
* Add more delay if the typing is fast.
* Translate mouse positions to a note. _(Yes the application also supports logging mouse position.)_. 

## Licence

Licenced under GNU GENERAL PUBLIC LICENSE v3.0. It is free to copy and distribute.
