package in.co.chicmic.animationtask.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import in.co.chicmic.animationtask.R;

public class AnimationLeftToRightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slide_out, R.anim.constant_animation);
        setContentView(R.layout.activity_animation_left_to_right);
        Button clickMeButton = findViewById(R.id.btn_click_me);
        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AnimationLeftToRightActivity.this
                        , AnimationBottomUpActivity.class));
            }
        });
    }


    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.constant_animation, R.anim.slide_in);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.constant_animation, R.anim.slide_in);
    }

}
