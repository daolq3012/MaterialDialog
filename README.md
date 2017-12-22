## MaterialDialog
[![CircleCI](https://circleci.com/gh/daolq3012/MaterialDialog.svg?style=shield)](https://circleci.com/gh/daolq3012/MaterialDialog)
[![License: CC BY 4.0](https://img.shields.io/badge/License-CC%20BY%204.0-lightgrey.svg)](https://creativecommons.org/licenses/by/4.0/)

Common dialog use in a project in android base on [afollestad/material-dialogs](https://github.com/afollestad/material-dialogs):
 - Support JAVA 7

### How to config:

Step 1. Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

Step 2. Add the dependency
```gradle
dependencies {
	    compile 'com.github.daolq3012:MaterialDialog:1.0.1'
}
```

### How to use:
- Demo code:
```java
    @Override
    public void dialogBasicIcon(String title, String content, @DrawableRes int icon,
            MaterialDialog.SingleButtonCallback positiveButtonListener) {
        new MaterialDialog.Builder(mContext).title(title)
                .content(content)
                .iconRes(icon)
                .limitIconToDefaultSize()
                .positiveText(R.string.agree)
                .negativeText(R.string.disagree)
                .onPositive(positiveButtonListener)
                .show();
    }
```
- See samples in this project to show more

## 👬 Contribution

The Example are built using [Android studio](https://developer.android.com/studio/index.html)

- Open pull request with improvements
- Discuss ideas in issues
- Spread the word
- Reach out to me directly at dao.le.2511@gmail.com

## License

The content of this project itself is licensed under the Creative Commons Attribution 4.0 International (CC BY 4.0)
