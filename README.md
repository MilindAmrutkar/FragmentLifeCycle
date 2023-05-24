# FragmentLifeCycle

# Android Fragment Lifecycle Exploration with Kotlin

This repository houses a straightforward Android application, created in Kotlin, designed to exemplify the various stages of the Fragment lifecycle. It offers developers a practical insight into the behaviour of Fragments during different user interactions and device adjustments, such as screen rotations and back button navigations.

## Operational Overview

### App Launch

On opening the app:

- `onCreate` : `MainActivity`
- `onAttach`, `onCreate`, `onCreateView`, `onViewCreated`, `onStart` : `SampleFragment`
- `onStart`, `onResume` : `MainActivity`
- `onResume` : `SampleFragment`

### Screen Orientation Change (Portrait to Landscape/Landscape to Portrait)

On rotating the screen:

- `onPause` : `SampleFragment`
- `onPause` : `MainActivity`
- `onStop` : `SampleFragment`
- `onStop` : `MainActivity`
- `onDestroyView`, `onDestroy`, `onDetach` : `SampleFragment`
- `onDestroy` : `MainActivity`
- `onAttach`, `onCreate` : `SampleFragment`
- `onCreate` : `MainActivity`
- `onCreateView`, `onViewCreated`, `onStart` : `SampleFragment`
- `onStart`, `onResume` : `MainActivity`
- `onResume` : `SampleFragment`

### Back Button Navigation

On pressing the back button:

- `onPause` : `SampleFragment`
- `onPause` : `MainActivity`
- `onStop` : `SampleFragment`
- `onStop` : `MainActivity`
- `onDestroyView`, `onDestroy`, `onDetach` : `SampleFragment`
- `onDestroy` : `MainActivity`

This repository is an essential asset for both beginners and seasoned Android developers who aim to delve deeper into understanding Fragment lifecycles. By exploring this project, you'll gain a comprehensive perspective of how Android manages Fragments during an application's lifecycle.

We encourage you to clone, fork, or contribute to this project to bolster your knowledge and ours. Your participation and feedback are always welcome!

