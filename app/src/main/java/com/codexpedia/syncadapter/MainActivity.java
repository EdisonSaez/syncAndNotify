package com.codexpedia.syncadapter;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codexpedia.syncadapter.sync.MyServiceSyncAdapter;

public class MainActivity extends AppCompatActivity {

    private static final int MOVIE_NOTIFICATION_ID = 0222;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.bt_)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNot();
            }
        });

    }

    public void showNot(){
//        addNotification();
        MyServiceSyncAdapter.syncImmediately(getApplicationContext());
    }


//    private void notifyDataDownloaded() {
//        Context context = this;
//        NotificationCompat.Builder mBuilder =
//                new NotificationCompat.Builder(context)
//                        .setSmallIcon(android.support.v7.appcompat.R.drawable.notification_template_icon_bg)
//                        .setContentTitle("Sync Adapter")
//                        .setContentText("New Data Available!");
//
//        // Opening the app when the user clicks on the notification.
//        Intent resultIntent = new Intent(context, MainActivity.class);
//
//        // The stack builder object will contain an artificial back stack for the started Activity.
//        // This ensures that navigating backward from the Activity leads out of your application to the Home screen.
//        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
//        stackBuilder.addNextIntent(resultIntent);
//        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
//        mBuilder.setContentIntent(resultPendingIntent);
//
//        NotificationManager mNotificationManager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
//        mNotificationManager.notify(MOVIE_NOTIFICATION_ID, mBuilder.build()); // MOVIE_NOTIFICATION_ID allows you to update the notification later on.
//    }
}
