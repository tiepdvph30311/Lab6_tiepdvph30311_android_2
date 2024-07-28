package tiepdvph30311.fpoly.lab6_android2;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import androidx.annotation.Nullable;

public class OpenWebService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        webIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(webIntent);

        // Dừng dịch vụ sau khi mở trang web
        stopSelf();

        return START_NOT_STICKY;
    }
}
