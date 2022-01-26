package com.rahulprojects.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private String startGame="X";
    Button resetButton;
    int b1=5,b2=5,b3=5,b4=5,b5=5,b6=5,b7=5,b8=5,b9=5;
    int countX=0,countO=0,i=0;
    private TextView scoreX,scoreO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.buttonImage1);
        btn2=findViewById(R.id.buttonImage2);
        btn3=findViewById(R.id.buttonImage3);
        btn4=findViewById(R.id.buttonImage4);
        btn5=findViewById(R.id.buttonImage5);
        btn6=findViewById(R.id.buttonImage6);
        btn7=findViewById(R.id.buttonImage7);
        btn8=findViewById(R.id.buttonImage8);
        btn9=findViewById(R.id.buttonImage9);

        resetButton=findViewById(R.id.resetBtn);

        scoreX=findViewById(R.id.scoreX);
        scoreO=findViewById(R.id.scoreY);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setImageDrawable(null);
                btn2.setImageDrawable(null);
                btn3.setImageDrawable(null);
                btn4.setImageDrawable(null);
                btn5.setImageDrawable(null);
                btn6.setImageDrawable(null);
                btn7.setImageDrawable(null);
                btn8.setImageDrawable(null);
                btn9.setImageDrawable(null);

                resetValues();
                countX=0;
                countO=0;

                scoreX.setText("Score X : "+ String.valueOf(countX));
                scoreO.setText("Score O : "+ String.valueOf(countO));

            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn1.setImageResource(R.drawable.cross);
                    b1=1;
                }else{
                    btn1.setImageResource(R.drawable.zero);
                    b1=0;
                }
                i++;
                choosePlayer();
                winningGame();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn2.setImageResource(R.drawable.cross);
                    b2=1;
                }else{
                    btn2.setImageResource(R.drawable.zero);
                    b2=0;
                }
                i++;
                choosePlayer();
                winningGame();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startGame.equals("X")){
                    btn3.setImageResource(R.drawable.cross);
                    b3=1;
                }else{
                    btn3.setImageResource(R.drawable.zero);
                    b3=0;
                }
                i++;
                choosePlayer();
                winningGame();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn4.setImageResource(R.drawable.cross);
                    b4=1;
                }else{
                    btn4.setImageResource(R.drawable.zero);
                    b4=0;
                }
                i++;

                choosePlayer();
                winningGame();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn5.setImageResource(R.drawable.cross);
                    b5=1;
                }else{
                    btn5.setImageResource(R.drawable.zero);
                    b5=0;
                }
                i++;

                choosePlayer();
                winningGame();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn6.setImageResource(R.drawable.cross);
                    b6=1;
                }else{
                    btn6.setImageResource(R.drawable.zero);
                    b6=0;
                }
                i++;

                choosePlayer();
                winningGame();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn7.setImageResource(R.drawable.cross);
                    b7=1;
                }else{
                    btn7.setImageResource(R.drawable.zero);
                    b7=0;
                }
                i++;

                choosePlayer();
                winningGame();
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn8.setImageResource(R.drawable.cross);
                    b8=1;
                }else{
                    btn8.setImageResource(R.drawable.zero);
                    b8=0;
                }
                i++;

                choosePlayer();
                winningGame();
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(startGame.equals("X")){
                    btn9.setImageResource(R.drawable.cross);
                    b9=1;
                }else{
                    btn9.setImageResource(R.drawable.zero);
                    b9=0;
                }
                i++;

                choosePlayer();
                winningGame();
            }
        });

    }

    private void winningGame() {

        if((b1==1) && (b2==1) && (b3==1)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countX++;
            scoreX.setText("Score X : "+ countX);
            i=0;
        }

        else if((b4==1) && (b5==1) && (b6==1)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countX++;
            scoreX.setText("Score X : "+ countX);
            i=0;
        }

        else if((b7==7) && (b8==8) && (b9==9)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countX++;
            scoreX.setText("Score X : "+ countX);
            i=0;
        }

        else if((b1==1) && (b4==1) && (b7==1)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countX++;
            scoreX.setText("Score X : "+ countX);
            i=0;
        }

        else if((b2==1) && (b5==1) && (b8==1)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countX++;
            scoreX.setText("Score X : "+ countX);
            i=0;
        }

        else if((b3==1) && (b6==1) && (b9==1)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countX++;
            scoreX.setText("Score X : "+ countX);
            i=0;
        }

        else if((b1==1) && (b5==1) && (b9==1)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countX++;
            scoreX.setText("Score X : "+ countX);
            i=0;
        }

        else if((b3==1) && (b5==1) && (b7==1)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countX++;
            scoreX.setText("Score X : "+ countX);
            i=0;
        }

        //////////////

        else if((b1==0) && (b2==0) && (b3==0)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player 0 Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countO++;
            scoreO.setText("Score O : "+ countO);
            i=0;
        }


        else if((b4==0) && (b5==0) && (b6==0)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player 0 Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countO++;
            scoreO.setText("Score O : "+ countO);
            i=0;
        }


        else if((b7==0) && (b8==0) && (b9==0)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player 0 Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countO++;
            scoreO.setText("Score O : "+ countO);
            i=0;
        }

        else if((b1==0) && (b4==0) && (b7==0)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player 0 Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countO++;
            scoreO.setText("Score O : "+ countO);
            i=0;
        }

        else if((b2==0) && (b5==0) && (b8==0)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player 0 Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countO++;
            scoreO.setText("Score O : "+ countO);
            i=0;
        }

        else if((b3==0) && (b6==0) && (b9==0)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player 0 Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countO++;
            scoreO.setText("Score O : "+ countO);
            i=0;
        }


        else if((b1==0) && (b5==0) && (b9==0)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player 0 Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countO++;
            scoreO.setText("Score O : "+ countO);
            i=0;
        }

        else if((b3==0) && (b5==0) && (b7==0)) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Player 0 Wins !").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);
                    resetValues();
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            countO++;
            scoreO.setText("Score O : "+ countO);
            i=0;
        }
        else if(i==9){

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Draw !!").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        btn1.setImageDrawable(null);
                        btn2.setImageDrawable(null);
                        btn3.setImageDrawable(null);
                        btn4.setImageDrawable(null);
                        btn5.setImageDrawable(null);
                        btn6.setImageDrawable(null);
                        btn7.setImageDrawable(null);
                        btn8.setImageDrawable(null);
                        btn9.setImageDrawable(null);
                        resetValues();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                i=0;

        }


    }

    private void choosePlayer() {
        if(startGame.equals("X")){
            startGame="O";
        }else{
            startGame="X";
        }
    }

    private void resetValues() {
        b1=5;
        b2=5;
        b3=5;
        b4=5;
        b5=5;
        b6=5;
        b7=5;
        b8=5;
        b9=5;
    }
}