# Development and validation

This repository contains Android source snippets, not a complete Gradle project. Despite the repository name, the supplied activity implements a baseball ball/strike counter. The native activity/layout names and repository identity are preserved.

The activity now uses AndroidX AppCompat, opens the supplied `content_main` layout, and saves/restores counts across activity recreation. The layout uses AndroidX ConstraintLayout. To run it, create an Android Studio host app with AppCompat and ConstraintLayout dependencies, place `MainActivity.java` in package `com.example.umpirebuddy`, copy `content_main.xml` into `res/layout`, and register the activity in the host app's manifest. There is intentionally no guessed Gradle wrapper, SDK version, launcher asset, or generated project structure.

Manual checks on an emulator/device: increment counts, rotate the screen and verify preservation; the fourth ball should reset both counters and show Walk; the third strike should reset both counters and show Out. XML/source inspection is not an Android build or emulator test. A complete host application is needed before claiming build compatibility.
