package com.yxp.uninstall.listen;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by yanxing on 16/1/10.
 */
public class UninstallReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(Intent.ACTION_PACKAGE_ADDED)) {
            String packageName = intent.getDataString();
            Toast.makeText(context, packageName + "is install !", Toast.LENGTH_SHORT).show();
        } else if (intent.getAction().equals(Intent.ACTION_PACKAGE_REMOVED)) {
            String packageName = intent.getDataString();
            Toast.makeText(context, packageName + "is removed !", Toast.LENGTH_SHORT).show();
        } else if (intent.getAction().equals(Intent.ACTION_MY_PACKAGE_REPLACED)) {
            String packageName = intent.getDataString();
            Toast.makeText(context, packageName + "is replaced !", Toast.LENGTH_SHORT).show();
        } else if (intent.getAction().equals(Intent.ACTION_PACKAGE_REPLACED)) {
            String packageName = intent.getDataString();
            Toast.makeText(context, packageName + "is replaced !", Toast.LENGTH_SHORT).show();
        }
    }
}
