package rakamaheka.com.animationlogin;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class LoginActivity extends AppCompatActivity {

    private ImageView imageView;
    private EditText editTextUsername, editTextPassword;
    private Button buttonSubmit;
    private TextView clickHere;
    private CheckBox showHidePassword;
    private LinearLayout linearlayout;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        imageView = (ImageView) findViewById(R.id.imageview_logo); //Declare imageview logo
        animation = AnimationUtils.loadAnimation(this, R.anim.flying_logo); //Declare animation
        animation.setFillAfter(true); //If fillBefore is true, this animation will apply its transformation before the start time of the animation
        imageView.setAnimation(animation); //set animation for imageview logo
        Glide.with(this).load(R.drawable.yourlogo).into(imageView); //load image with glide

        PropertyValuesHolder alpha = PropertyValuesHolder.ofFloat("alpha", 0, 1); //for animation fade in
        PropertyValuesHolder trans = PropertyValuesHolder.ofFloat("translationY", 0, -280); //for animation move to up

        //Setup animation edittext username
        editTextUsername = (EditText) findViewById(R.id.editText_username); //Declare edittext username
        ObjectAnimator edUsername = ObjectAnimator.ofPropertyValuesHolder(editTextUsername, alpha, trans); //set ObjectAnimator from animation alpha and trans
        edUsername.setDuration(2000); //set duration for animation
        edUsername.start(); //start animation

        //Setup animation edittext password
        editTextPassword = (EditText) findViewById(R.id.editText_password); //Declare edittext password
        ObjectAnimator c = ObjectAnimator.ofPropertyValuesHolder(editTextPassword, alpha, trans); //set ObjectAnimator from animation alpha and trans
        c.setDuration(2200);
        c.start();

        //Setup animation button submit
        buttonSubmit = (Button) findViewById(R.id.button_submit); //Declare button submit
        ObjectAnimator d = ObjectAnimator.ofPropertyValuesHolder(buttonSubmit, alpha, trans); //set ObjectAnimator from animation alpha and trans
        d.setDuration(2400); //set duration for animation
        d.start(); //start animation

        //Setup animation linearlayout
        linearlayout = (LinearLayout) findViewById(R.id.linearlayout); //Declare linearlayout
        ObjectAnimator e = ObjectAnimator.ofPropertyValuesHolder(linearlayout, alpha, trans); //set ObjectAnimator from animation alpha and trans
        e.setDuration(2600); //set duration for animation
        e.start(); //start animation

        //Setup animation checkbox
        showHidePassword = (CheckBox) findViewById(R.id.checkbox); //Declare checkbox showhide password
        ObjectAnimator f = ObjectAnimator.ofPropertyValuesHolder(showHidePassword, alpha, trans); //set ObjectAnimator from animation alpha and trans
        f.setDuration(2200); //set duration for animation
        f.start(); //start animation

        //set on check the checkbox showhide password
        showHidePassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked) { //is checked false
                    showHidePassword.setButtonDrawable(R.drawable.hide);
                    editTextPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else { //is checked true
                    showHidePassword.setButtonDrawable(R.drawable.show);
                    editTextPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });

        clickHere = (TextView) findViewById(R.id.author);
        clickHere.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
