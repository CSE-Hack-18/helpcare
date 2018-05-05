package com.example.microsoft.helpcare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PostSurgeryActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_postsurgery_main);

        Button dietMoreInfo = (Button)findViewById(R.id.dietInfoButton);
        dietMoreInfo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                showDietDetails();
            }
        });
    }

    private void showDietDetails() {
        Intent intent = new Intent(this, PostSurgeryDietActivity.class);
        startActivity(intent);
    }


}
