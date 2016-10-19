package rakamaheka.com.animationlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashScreenActivity extends AppCompatActivity {
    private ImageView imageView;
    private Animation animation;
    private Thread loadingsplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen); //This Your Layout For Customize

        //Declare Animation
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.show_logo);
        imageView = (ImageView) findViewById(R.id.imageview_logo); //Declare ImageView
        //set Animation to ImageView
        imageView.setAnimation(animation);
        Glide.with(this).load(R.drawable.yourlogo).into(imageView);

        //Create Thread for timing to LoginActivity
        loadingsplash = new Thread(){
            public void run(){
                try{
                    sleep(2000); //set sleep 2 second
                }catch (Exception e){
                    e.printStackTrace(); //print if this thread is error
                }finally {
                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class); //set Intent
                    startActivity(intent); //to start change activity
                    finish(); //kill this activity when back press
                }
            }
        };
        loadingsplash.start(); //run this Thread
    }
}
