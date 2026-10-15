# Code and artifact reference

[Overview](../README.md) · [Walkthrough](PROJECT_GUIDE.md) · [Development guide](DEVELOPMENT.md)

This reference describes the files on this branch. Function names are navigation aids; the walkthrough explains how their inputs, state, and outputs fit together.

## Source and layout

The repository name is historical. The supplied code is an umpire ball/strike counter, not a to-do list.

| File or object | Responsibility |
| --- | --- |
| [MainActivity.java](../MainActivity.java) | AndroidX activity, click handling, display updates, and saved-instance state. |
| [content_main.xml](../content_main.xml) | ConstraintLayout containing the counter labels and ball/strike buttons. |
| `countBall`, `countStrike` | Current count for the at-bat. |
| `BallView`, `StrikeView` | TextView references displaying the counts. |
| `onCreate` | Inflate the layout, bind labels, restore `balls`/`strikes` from a Bundle, and display state. |
| `onSaveInstanceState` | Save both counts before activity recreation. |
| `ballClicked` | Increment balls; show Walk and reset both counts on the fourth ball. |
| `strikeClicked` | Increment strikes; show Out and reset both counts on the third strike. |
| `alertView` | Display the result in an AlertDialog with an OK action. |

The XML `android:onClick` values connect the buttons to the public activity handlers. `StrikeTotal` is an additional layout element and is not used by the current activity logic.

## State boundary

A Bundle supports activity recreation; it is not durable match storage. There is no inning model, player roster, database, or backend in these files. A complete Gradle project, manifest, and resources are required before building and running the snippets. The manual acceptance procedure in the development guide has not been executed on an emulator here.
