package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.londonappbrewery.destini.R.string.T1_Ans1;
import static com.londonappbrewery.destini.R.string.T1_Ans2;
import static com.londonappbrewery.destini.R.string.T1_Story;
import static com.londonappbrewery.destini.R.string.T2_Ans1;
import static com.londonappbrewery.destini.R.string.T2_Ans2;
import static com.londonappbrewery.destini.R.string.T2_Story;
import static com.londonappbrewery.destini.R.string.T3_Ans1;
import static com.londonappbrewery.destini.R.string.T3_Ans2;
import static com.londonappbrewery.destini.R.string.T3_Story;
import static com.londonappbrewery.destini.R.string.T4_End;
import static com.londonappbrewery.destini.R.string.T5_End;
import static com.londonappbrewery.destini.R.string.T6_End;


public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView myTexview;
    private Button ButtonTop;
    private Button ButtonButtom;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        myTexview = (TextView) findViewById(R.id.storyTextView);
        ButtonTop = (Button) findViewById(R.id.buttonTop);
        ButtonButtom = (Button) findViewById(R.id.buttonBottom);

        myTexview.setText(T1_Story);
        ButtonTop.setText(T1_Ans1);
        ButtonButtom.setText(T1_Ans2);


            // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            ButtonTop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (myTexview.getText().toString().equals(T1_Story)&& mStoryIndex<=5) {
                        myTexview.setText(T3_Story);
                        ButtonTop.setText(T3_Ans1);
                        ButtonButtom.setText(T3_Ans2);
                        mStoryIndex = +1;

                    } else if (myTexview.getText().toString().equals(T2_Story)&& mStoryIndex<=5) {
                        myTexview.setText(T3_Story);
                        ButtonTop.setText(T3_Ans1);
                        ButtonButtom.setText(T3_Ans2);
                        mStoryIndex = +1;
                    } else if (myTexview.getText().toString().equals(T3_Story)&& mStoryIndex<=5) {
                        myTexview.setText(T6_End);
                        ButtonTop.setVisibility(View.GONE);
                        ButtonButtom.setVisibility(View.GONE);
                        mStoryIndex = +1;
                    }


                }

            });

            // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            ButtonButtom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (myTexview.getText().toString().equals(T1_Story)&& mStoryIndex<=5) {
                        myTexview.setText(T2_Story);
                        ButtonTop.setText(T2_Ans1);
                        ButtonButtom.setText(T2_Ans2);
                        mStoryIndex = +1;

                    } else if (myTexview.getText().toString().equals(T2_Story)&& mStoryIndex<=5) {
                        myTexview.setText(T4_End);
                        mStoryIndex = +1;
                        ButtonTop.setVisibility(View.GONE);
                        ButtonButtom.setVisibility(View.GONE);
                    } else if (myTexview.getText().toString().equals(T3_Story)&& mStoryIndex<=5) {
                        myTexview.setText(T5_End);
                        ButtonTop.setVisibility(View.GONE);
                        ButtonButtom.setVisibility(View.GONE);
                        mStoryIndex = +1;
                    }

                }
            });
    }
}

