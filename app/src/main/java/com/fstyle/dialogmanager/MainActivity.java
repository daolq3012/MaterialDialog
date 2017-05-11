package com.fstyle.dialogmanager;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.fstyle.library.DialogAction;
import com.fstyle.library.MaterialDialog;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private DialogManager mDialogManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDialogManager = new DialogManagerImpl(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnProgress:
                showProgress();
                break;
            case R.id.btnBasicNoTitle:
                showDialogBasicWithoutTitle();
                break;
            case R.id.btnBasic:
                showDialogBasic();
                break;
            case R.id.btnBasicWithIcon:
                showDialogBasicWithIcon();
                break;
            case R.id.btnBasicCheckPrompt:
                showDialogBasicCheckPrompt();
                break;
            case R.id.btnNeutral:
                showDialogNeutral();
                break;
            case R.id.btnList:
                showDialogList();
                break;
            case R.id.btnListNoTitle:
                showDialogListWithoutTitle();
                break;
            case R.id.btnListSingleChoice:
                showDialogListSingleChoice();
                break;
            case R.id.btnListMultiChoice:
                showListMultiChoice();
                break;
            default:
                break;
        }
    }

    private void showListMultiChoice() {
        mDialogManager.dialogListMultiChoice("abc", R.array.socialNetworks, new Integer[] { 0, 1 },
                new MaterialDialog.ListCallbackMultiChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog materialDialog, Integer[] integers,
                            CharSequence[] charSequences) {
                        for (CharSequence charSequence : charSequences) {
                            Log.d(TAG, "onSelection: " + charSequence);
                        }
                        return true;
                    }
                });
    }

    private void showDialogListSingleChoice() {
        mDialogManager.dialogListSingleChoice("title", R.array.socialNetworks, 0,
                new MaterialDialog.ListCallbackSingleChoice() {

                    @Override
                    public boolean onSelection(MaterialDialog dialog, View itemView, int which,
                            CharSequence text) {
                        Log.d(TAG, "onSelection: " + text);
                        return true;
                    }
                });
    }

    private void showDialogListWithoutTitle() {
        mDialogManager.dialogListWithoutTitle(R.array.socialNetworks,
                new MaterialDialog.ListCallback() {

                    @Override
                    public void onSelection(MaterialDialog dialog, View itemView, int position,
                            CharSequence text) {
                        Log.d(TAG, "onSelection: " + text);
                    }
                });
    }

    private void showDialogList() {
        mDialogManager.dialogList("Title", R.array.socialNetworks,
                new MaterialDialog.ListCallback() {

                    @Override
                    public void onSelection(MaterialDialog dialog, View itemView, int position,
                            CharSequence text) {
                        Log.d(TAG, "onSelection: " + text);
                    }
                });
    }

    private void showDialogNeutral() {
        mDialogManager.dialogNeutral("title", "content.....",
                new MaterialDialog.SingleButtonCallback() {

                    @Override
                    public void onClick(@NonNull MaterialDialog dialog,
                            @NonNull DialogAction action) {
                        Log.d(TAG, "onClick: "
                                + action
                                + " prompt : "
                                + dialog.isPromptCheckBoxChecked());
                    }
                });
    }

    private void showDialogBasicCheckPrompt() {
        mDialogManager.dialogBasicCheckPrompt("test dialog check prompt",
                new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog materialDialog,
                            @NonNull DialogAction dialogAction) {
                        Log.d(TAG, "onClick: "
                                + materialDialog.isPromptCheckBoxChecked()
                                + " : "
                                + dialogAction.toString());
                    }
                });
    }

    private void showDialogBasicWithIcon() {
        mDialogManager.dialogBasicIcon("title", "content", R.mipmap.ic_launcher,
                new MaterialDialog.SingleButtonCallback() {

                    @Override
                    public void onClick(@NonNull MaterialDialog dialog,
                            @NonNull DialogAction which) {
                        Log.d(TAG, "onClick: " + which);
                    }
                });
    }

    private void showDialogBasic() {
        mDialogManager.dialogBasic("Title", "Content", new MaterialDialog.SingleButtonCallback() {
            @Override
            public void onClick(@NonNull MaterialDialog materialDialog,
                    @NonNull DialogAction dialogAction) {
                Log.d(TAG, "onClick: " + dialogAction);
            }
        });
    }

    private void showDialogBasicWithoutTitle() {
        mDialogManager.dialogBasicWithoutTitle("Content",
                new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog materialDialog,
                            @NonNull DialogAction dialogAction) {
                        Log.d(TAG, "onClick: " + dialogAction);
                    }
                });
    }

    private void showProgress() {
        mDialogManager.showIndeterminateProgressDialog();
    }
}
