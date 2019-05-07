<<<<<<< HEAD
## Contributing guide
This document serves as a checklist before contributing to this repository. It includes includes links to read up on if topics are unclear to you.

This guide mainly focuses on the proper use of Git. It has some overlap with the more general information found in the [Development Policy File](https://github.com/arduino/Arduino/wiki/Development-Policy).

### 1. Before using the issue tracker
To report a bug or a small enhancement please use the [issue tracker](http://github.com/arduino/Arduino/issues). But check the following boxes before posting an issue:

- [ ] `Your issue is NOT a question about an Arduino sketch.` Sketch questions are handled on the [Arduino Forum](http://forum.arduino.cc/).
- [ ] `Check if your issue has already been resolved in the` [hourly build](http://www.arduino.cc/en/Main/Software#hourly)
- [ ] `Your issue is not a duplicate.` So search for similar open and closed issues and pull-requests.
- [ ] `Make sure you are working on the right repository. See the table below.`

| Repositories | Projects |
|---|---|
|[Arduino](https://github.com/arduino/Arduino) | Arduino IDE, arduino.cc (but not the Arduino Playground), Library Manager |
|[Arduino Playground](http://forum.arduino.cc/index.php?board=24.0) | This is a publicly editable wiki. Please either make the edit yourself or create a post |
|[Arduino Forum](https://github.com/arduino/forum-issues) | Issues about the Arduino Forum |
| [Libraries for Arduino IDE](https://github.com/arduino-libraries) | Changing libraries for the IDE |
| [Arduino-builder](https://github.com/arduino/arduino-builder)| |
|[Arduino Web Editor](https://github.com/arduino/arduino-create-agent) | |
|[Arduino SAMD Boards](https://github.com/arduino/ArduinoCore-samd)|Zero, MKR1000, MKRZero, etc. |
|[Arduino SAM Boards](https://github.com/arduino/ArduinoCore-sam)| Due |
|[Arduino AVR Boards toolchain (avr-gcc)](https://github.com/arduino/toolchain-avr)| |
|[Arduino's build of AVRDUDE](https://github.com/arduino/avrdude-build-script)||
|Third party repository |  for third party libraries, hardware packages or sketches |

### 2. Posting the issue
When you have checked the previous boxes. Please consider the following points before posting the issue.

- [ ] `Describe the issue based on the behaviour you were expecting`
- [ ] `Post complete error messages using markdown code fencing:` [Markdown Code Fencing Example](https://guides.github.com/features/mastering-markdown/#examples)
- [ ] `Provide a full set of steps necessary to reproduce the issue`
- [ ] `Demonstration code should be complete, correct and the minimum amount necessary to reproduce the issue`
- [ ] `Library Manager submissions: make sure your library meets all the requirements listed in the` [Library Manager FAQ](https://github.com/arduino/Arduino/wiki/Library-Manager-FAQ)

### 3. Pull Requests
Before starting to work on bigger topics like modifying the API or changes with backward compatibility trade-offs please discuss them in the [mailing list](https://groups.google.com/a/arduino.cc/forum/#!forum/developers) first.  

### 4. Commit messages
An easy to read pull request will speed up the merging process. Your commit messages need to be logically separate. And containing enough information on their own. When this is done consistently your pull request will have an easy to read log of changes.

Your commits need to be [atomic](https://www.freshconsulting.com/atomic-commits/) which allows the repository to remain flexible after merging.

If you did not read the following 7 points before or just want to fresh up. Please read up on them on this [website](https://chris.beams.io/posts/git-commit) by Chris Beams.

1. Separate subject from body with a blank line
2. Limit the subject line (first line) to 50 characters
3. Capitalize the subject line
4. Do not end the subject line with a period `(.)`
5. Use the imperative mood in the subject line.
This should be in the written as giving an instruction for example "Fixed save-as bug" (it shows what the PR achieves when merging it)
6. Wrap body at 72 characters
7. Use the body to explain what, why and how

If your pull request fixes, closes or resolves an issue please reference it in the body with the following [syntax](https://help.github.com/articles/closing-issues-via-commit-messages/). Also see the last lines of the following example.

A general example with these 7 guidelines in mind is shown below (from the same website of [Chris Beams](https://chris.beams.io/posts/git-commit)):
```
Summarize changes in around 50 characters or less

More detailed explanatory text, if necessary. Wrap it to about 72
characters or so. In some contexts, the first line is treated as the
subject of the commit and the rest of the text as the body. The
blank line separating the summary from the body is critical (unless
you omit the body entirely); various tools like `log`, `shortlog`
and `rebase` can get confused if you run the two together.

Explain the problem that this commit is solving. Focus on why you
are making this change as opposed to how (the code explains that).
Are there side effects or other unintuitive consequences of this
change? Here's the place to explain them.

Further paragraphs come after blank lines.

 - Bullet points are okay, too

 - Typically a hyphen or asterisk is used for the bullet, preceded
   by a single space, with blank lines in between, but conventions
   vary here

If you use an issue tracker, put references to them at the bottom,
like this:

Resolves: #123
See also: #456, #789
```

### 5. Rebasing pull requests
When different people are working on the Arduino project simultaneously, pull requests can go stale quickly. A "stale" pull request is one that is no longer up to date with the latest merges in the project. It needs to be updated before it can be merged.

Most often pull requests become stale when merge conflicts occur. This happens when two pull requests both modify similar lines in the same file and one gets merged, the unmerged request will now have a merge conflict and needs updating.

When your pull request is stale, you will need to rebase your branch on the current master branch before you can merge it without conflicts.

More information about rebasing can be found at the repository of [edX](https://github.com/edx/edx-platform/wiki/How-to-Rebase-a-Pull-Request).

### 6. Merged!
When your pull request is merged please update the documentation if the changes require it:

- [ ] Edit appropiate [Wiki pages](https://github.com/arduino/Arduino/wiki/_pages)
- [ ] Submit an [issue report](https://github.com/arduino/Arduino/issues/new) requesting changes to the [arduino.cc reference pages](https://www.arduino.cc/en/Reference/HomePage)
=======
# Contributing Rules
Thanks for your interest in contributing to this free open source project! Arduino welcomes help from the community. There are several ways you can get involved:

| Type of contribution | Contribution method |
|-|-|
| - Support request<br/>- Question<br/>- Problem with your Arduino<br/>- Discussion | Post on the [Arduino Forum](http://forum.arduino.cc) |
| - Bug report<br/>- [Arduino website](https://www.arduino.cc/) issue or improvement<br/>- Feature request | Issue report (read the [issue guidelines](#issues)) |
| - Bug fix<br/>- Enhancement | Pull Request (read the [pull request guidelines](#pull-requests)) |
| Translations for the Arduino IDE | [transifex](https://www.transifex.com/mbanzi/arduino-ide-15/) |
| Translations for the [Language Reference](https://www.arduino.cc/reference) | [Reference repositories](https://github.com/arduino?q=reference-) |
| Monetary | - [Donate](https://www.arduino.cc/en/Main/Contribute)<br/>- [Buy official products](https://store.arduino.cc) |


## Issues
- Do you need help or have a question about using Arduino? Support requests should be made to the appropriate section of the [Arduino forum](http://forum.arduino.cc) rather than an issue report. **Issue reports are to be used to report bugs or make feature requests only.**
- Check if your issue has already been resolved in the [hourly build](http://www.arduino.cc/en/Main/Software#hourly).
- Submit issue reports to the correct repository:

| Issue topic | Report at |
|-|-|
| Arduino IDE, Arduino AVR Boards, arduino.cc (but not the Arduino Forum), Library Manager additions | [arduino/Arduino](https://github.com/arduino/Arduino/issues) |
| [Language Reference](https://www.arduino.cc/reference) | [Reference repositories](https://github.com/arduino?q=reference-) |
| Arduino Forum | [arduino/forum-issues](https://github.com/arduino/forum-issues/issues) |
| Arduino libraries | [arduino-libraries](https://github.com/arduino-libraries) |
| arduino-builder | [arduino/arduino-builder](https://github.com/arduino/arduino-builder/issues) |
| [Arduino Web Editor](https://create.arduino.cc/editor) | [**Create > Editor** section of the Arduino Forum](http://forum.arduino.cc/index.php?board=101.0) |
| Arduino AVR Boards (Uno, Mega, Leonardo, etc.) | [arduino/ArduinoCore-avr](https://github.com/arduino/ArduinoCore-avr/issues) |
| Arduino SAMD Boards (Zero, MKR1000, MKRZero, etc.) | [arduino/ArduinoCore-samd](https://github.com/arduino/ArduinoCore-samd/issues) |
| Arduino SAM Boards (Due) | [arduino/ArduinoCore-sam](https://github.com/arduino/ArduinoCore-sam/issues) |
| AVR Toolchain for Arduino | [arduino/toolchain-avr](https://github.com/arduino/toolchain-avr/issues) |
| Arduino's build of AVRDUDE | [arduino/avrdude-build-script](https://github.com/arduino/avrdude-build-script/issues) |
| Security vulnerability | See: [Coordinated Vulnerability Disclosure Policy](https://github.com/arduino/arduino-cvd-policy) |
| 3rd party libraries, hardware, or sketches | Report issues to the author of the software, *not* Arduino. |

When you're not sure where your issue belongs, report it at [arduino/Arduino](https://github.com/arduino/Arduino) and we'll move it to where it belongs (but remember: Only bug reports and feature requests, do not ask for help with your own code there).

- Search [existing pull requests and issues](https://github.com/arduino/Arduino/issues?q=) to be sure it hasn't already been reported. If you have additional information to provide about an existing issue then please comment on that issue. If you simply want to express your support then use the [Reactions feature](https://github.com/blog/2119-add-reactions-to-pull-requests-issues-and-comments).
- State the newest version of the Arduino IDE you have verified the issue with and which operating system you are using.
- The issue title should be concise yet descriptive. Vague titles make it difficult to know the purpose of the issue when looking through the list of reports and may cause your issue to not be given proper attention.
- Describe the issue and what behavior you were expecting. Post complete error messages using [Markdown code fencing](https://guides.github.com/features/mastering-markdown/#examples).
- Provide a full set of steps necessary to reproduce the issue. Demonstration code should be complete, correct, and simplified to the minimum amount of code necessary to reproduce the issue. Please use [Markdown code fencing](https://guides.github.com/features/mastering-markdown/#examples) when posting code.
- Be responsive. We may need you to provide more information, please respond as soon as possible.
- If you find a solution to your problem update your issue report with an explanation of how you were able to fix it and close the issue.
- Library Manager submissions: make sure your library meets all the requirements listed in the [Library Manager FAQ](https://github.com/arduino/Arduino/wiki/Library-Manager-FAQ).


## Pull Requests
Pull requests are an easy and effective way to submit a proposal for a change to the content of one of Arduino's repositories. The Arduino team can merge your change with a single click! You can find more information about pull requests [here](https://help.github.com/articles/creating-a-pull-request/).
- Big changes, changes to the API, or changes with backward compatibility trade-offs should be first discussed in the [Arduino Developers Mailing List](https://groups.google.com/a/arduino.cc/forum/#!forum/developers).
- Search [existing pull requests](https://github.com/arduino/Arduino/pulls?q=) to see if one has already been submitted for this change. Search the [issues](https://github.com/arduino/Arduino/issues?q=is%3Aissue) to see if there has been discussion on this topic and whether your pull request can close any issues.
- Code formatting should be consistent with the style used in the existing code.
- Don't leave commented out code. A record of this code is already preserved in the commit history.
- Note that the Arduino core libraries support many boards and processors. When fixing or adding functionality for one of them, it's easy to break something on the others. Please test your changes on as many processors as possible. Even if you don't have a particular board, try compiling your patch for it to make sure that you haven't introduced any errors.
- All commits must be atomic. This means that the commit completely accomplishes a single task. Each commit should result in fully functional code. Multiple tasks should not be combined in a single commit, but a single task should not be split over multiple commits (e.g. one commit per file modified is not good practice). For more information see http://www.freshconsulting.com/atomic-commits.
- Each pull request should address a single bug fix or enhancement. This may consist of multiple commits. If you have multiple, unrelated fixes or enhancements to contribute, submit them as separate pull requests.
- Commit messages:
  - Use the [imperative mood](http://chris.beams.io/posts/git-commit/#imperative) in the title. For example: "Apply editor.indent preference"
  - Capitalize the title.
  - Do not end the title with a period.
  - Separate title from body with a blank line. If you're committing via GitHub or GitHub Desktop this will be done automatically.
  - Wrap body at 72 characters.
  - Completely explain the purpose of the commit. Include rationale for the change, any caveats, side-effects, etc.
  - If your pull request fixes an issue in the issue tracker, use the [closes/fixes/resolves syntax](https://help.github.com/articles/closing-issues-via-commit-messages) in the body to indicate this.
  - See http://chris.beams.io/posts/git-commit for more tips on writing good commit messages.
- Pull request title and description should follow the same guidelines as commit messages.
- Rebasing pull requests is OK and encouraged. After submitting your pull request some changes may be requested. Rather than adding unnecessary extra commits to the pull request you can squash these changes into the existing commit and then do a force push to your fork. When you do a force push to your fork, the PR will be updated with your new changes, so there is no need to open a new PR to make changes. Leave a comment on the pull request thread to explain that the history has been changed. This will help to keep the commit history of the repository clean.
- After your pull request is merged please update the documentation if the changes require it:
  - Edit appropriate [Wiki pages](https://github.com/arduino/Arduino/wiki/_pages).
  - Submit an [issue report](https://github.com/arduino/Arduino/issues/new) requesting changes to the [arduino.cc reference pages](https://www.arduino.cc/en/Reference/HomePage).
- For more contributing guidelines, see the [Arduino Development Policy](https://github.com/arduino/Arduino/wiki/Development-Policy).
>>>>>>> fecc311... Merge pull request #6681 from per1234/issue-template
