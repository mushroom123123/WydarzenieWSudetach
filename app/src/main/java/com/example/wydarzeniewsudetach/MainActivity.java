package com.example.wydarzeniewsudetach;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity {

     private Button buttonPOLUB;
     private TextView like;
     private Button buttonUSUN;
     private EditText emailinput;
     private EditText passwordInput;
     private int counter= 0;
     private EditText confirmPasswordInput;
     private TextView textViewTitle;
     private ImageView imageView;



     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         buttonPOLUB = findViewById(R.id.button);
         buttonUSUN = findViewById(R.id.button2);
         emailinput = findViewById(R.id.email);
         passwordInput = findViewById(R.id.password);
         like = findViewById(R.id.like);
         confirmPasswordInput = findViewById(R.id.confirmpassword);
         textViewTitle = findViewById(R.id.baner);
         imageView = findViewById(R.id.image);
         updatelike();


         buttonPOLUB.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 counter++;
                 updatelike();


             }
         });
         buttonUSUN.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(counter > 0) {
                    counter--;
                     updatelike();
                 }

             }
         });


     }

     private void updatelike() {
         String LikeText = counter + " polubien ";
         like.setText(LikeText);


     }


 }

