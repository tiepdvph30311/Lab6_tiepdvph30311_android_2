package tiepdvph30311.fpoly.lab6_android2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button notifyButton = findViewById(R.id.button_notify);
        notifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khởi tạo dịch vụ để hiển thị thông báo
                Intent serviceIntent = new Intent(MainActivity.this, MyNotificationService.class);
                startService(serviceIntent);
            }
        });

        Button openWebButton = findViewById(R.id.button_open_web);
        openWebButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khởi tạo dịch vụ để mở trang web
                Intent serviceIntent = new Intent(MainActivity.this, OpenWebService.class);
                startService(serviceIntent);
            }
        });
    }
}
