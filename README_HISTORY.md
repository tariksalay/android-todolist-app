# Umpire Buddy — Android Baseball Counter

**Java · Android · UI Event Handling · State Management**

A small Android learning project for tracking balls and strikes for a single baseball batter.

> **Repository naming note:** Despite the historical repository name `android-todolist-app`, the included source implements a **baseball umpire counter**, not a to-do list.

## Behavior

- Tap the application's ball/strike controls to update the displayed counts.
- On **four balls**, show a "Walk" alert and reset the counts.
- On **three strikes**, show an "Out" alert and reset the counts.
- The counter tracks one batter at a time.

## Source files

| File | Role |
| --- | --- |
| [MainActivity.java](MainActivity.java) | Android activity, click handlers, alert dialogs, and count logic |
| [content_main.xml](content_main.xml) | Layout resources included with the exercise |

## Learning outcomes

This exercise introduces Android `Activity` lifecycle basics, Java state variables, event handlers, UI text updates, and alert dialogs.

## Build limitations

The repository contains only a small set of source files, **not a complete Gradle / Android Studio project**. To build or run it, the files would need to be integrated into a compatible Android Studio project, with the required layout resources and legacy Android support-library references resolved.

No emulator, device, or build verification is claimed for the current repository.

[GitHub profile](https://github.com/tariksalay)
