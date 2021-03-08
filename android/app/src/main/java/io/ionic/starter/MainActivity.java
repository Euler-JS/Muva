package io.ionic.starter;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.getcapacitor.BridgeActivity;
import com.getcapacitor.Plugin;

import java.util.ArrayList;

import static android.app.AlertDialog.*;

public class MainActivity extends BridgeActivity {
  private static final int MY_PERMISSIONS_REQUEST_WRITE_CALENDAR = 777;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
//    Context context = MainActivity.this;
//    if (ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_CALENDAR) != PackageManager.PERMISSION_GRANTED) {
//      if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.WRITE_CALENDAR)) {
//        Builder alertBuilder = new Builder(context);
//        alertBuilder.setCancelable(true);
//        alertBuilder.setMessage("");
//        alertBuilder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
//          @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
//          public void onClick(DialogInterface dialog, int which) {
//            ActivityCompat.requestPermissions((Activity)context, new String[]{Manifest.permission.WRITE_CALENDAR
//            , Manifest.permission_group.PHONE, Manifest.permission_group.SMS},777);
//          }
//        });
//      } else {
//        ActivityCompat.requestPermissions((Activity)context, new String[]{Manifest.permission.WRITE_CALENDAR}, MY_PERMISSIONS_REQUEST_WRITE_CALENDAR);
//      }
//    }


    // Initializes the Bridge
    this.init(savedInstanceState, new ArrayList<Class<? extends Plugin>>() {{
      // Additional plugins you've installed go here
      // Ex: add(TotallyAwesomePlugin.class);
    }});
  }


}
