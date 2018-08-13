package in.co.chicmic.animationtask.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import in.co.chicmic.animationtask.R;

public class AnimationBottomUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.overridePendingTransition(R.anim.slide_up, R.anim.constant_animation);
        setContentView(R.layout.activity_animation_bottom_up);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.constant_animation, R.anim.slide_down);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.constant_animation, R.anim.slide_down);
    }
}
