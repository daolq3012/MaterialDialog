package com.fstyle.dialogmanager;

import android.support.annotation.ArrayRes;
import android.support.annotation.DrawableRes;
import com.fstyle.library.MaterialDialog;

/**
 * Created by le.quang.dao on 14/03/2017.
 */

public interface DialogManager {

    void showIndeterminateProgressDialog();

    void dismissProgressDialog();

    void dialogBasicWithoutTitle(String content,
            MaterialDialog.SingleButtonCallback positiveButtonListener);

    void dialogBasic(String title, String content,
            MaterialDialog.SingleButtonCallback positiveButtonListener);

    void dialogBasicIcon(String title, String content, @DrawableRes int icon,
            MaterialDialog.SingleButtonCallback positiveButtonListener);

    void dialogBasicCheckPrompt(String title, MaterialDialog.SingleButtonCallback callback);

    void dialogNeutral(String title, String content, MaterialDialog.SingleButtonCallback callback);

    void dialogList(String title, @ArrayRes int arrayId, MaterialDialog.ListCallback callback);

    void dialogListNoTitle(@ArrayRes int arrayId, MaterialDialog.ListCallback callback);

    void dialogListSingleChoice(String title, @ArrayRes int arrayId, int selectedIndex,
            MaterialDialog.ListCallbackSingleChoice callback);

    void dialogListMultiChoice(String title, @ArrayRes int arrayId, Integer[] selectedIndices,
            MaterialDialog.ListCallbackMultiChoice callback);
}
