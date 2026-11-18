package com.example.ebcallapplication;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // חיבור קובץ ה-XML למסך
        setContentView(R.layout.activity_main);

        // קישור הכפתורים מה-XML לקוד Java
        Button btnCall = findViewById(R.id.btnCall);
        Button btnWebsite = findViewById(R.id.btnWebsite);

        // פעולה בלחיצה על כפתור החיוג
        btnCall.setOnClickListener(v -> {

            // יצירת Intent לפתיחת מסך החיוג
            Intent callIntent = new Intent(Intent.ACTION_DIAL);

            // הגדרת מספר הטלפון
            callIntent.setData(Uri.parse("tel:0501234567"));

            // הפעלת מסך החיוג
            startActivity(callIntent);
        });

        // פעולה בלחיצה על כפתור האתר
        btnWebsite.setOnClickListener(v -> {

            // יצירת Intent לפתיחת אתר
            Intent websiteIntent = new Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.ynet.co.il")
            );

            // פתיחת האתר בדפדפן
            startActivity(websiteIntent);
        });
    }
}
