package com.elegion.githubclient;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

import com.elegion.githubclient.model.LogInterface;

/**
 * Created by Елена on 13.10.2015.
 */
public class AuthMistakeDialog  extends DialogFragment {

    public Dialog onCreateDialog(Bundle state) {
        AlertDialog.Builder dialogBuilder= new AlertDialog.Builder(getActivity());
        return dialogBuilder.setTitle(R.string.dialog_title).setMessage(R.string.dialog_message)
                .setPositiveButton(R.string.button, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (getActivity() instanceof LogInterface) {
                            ((LogInterface)getActivity()).auth();
                        }
                        dismiss();
                    }
                }).create();
    }
}
