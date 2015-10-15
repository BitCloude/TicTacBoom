package com.appers.ayvaz.tictacboom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button1, button2, button3, button4,button5,button6,button7,button8,button9;
    int[][] board = new int[3][3];
    boolean player1 = true;
    int moveCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1){
                    button1.setText("X");
                    board[0][0] = 1;
                    winCondition(0,0,player1);
                    player1= false;
                }
                else{
                    button1.setText("O");
                    board[0][0] = 2;
                    winCondition(0,0,player1);
                    player1=true;
                }
                button1.setClickable(false);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1){
                    button2.setText("X");
                    board[0][1] = 1;
                    winCondition(0,1,player1);
                    player1= false;
                }
                else{
                    button2.setText("O");
                    board[0][1] = 2;
                    winCondition(0,1,player1);
                    player1=true;
                }
                button2.setClickable(false);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1){
                    button3.setText("X");
                    board[0][2] = 1;
                    winCondition(0,2,player1);
                    player1= false;
                }
                else{
                    button3.setText("O");
                    board[0][2] = 2;
                    winCondition(0,2,player1);
                    player1=true;
                }
                button3.setClickable(false);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1){
                    button4.setText("X");
                    board[1][0] = 1;
                    winCondition(1,0,player1);
                    player1= false;

                }
                else{
                    button4.setText("O");
                    board[1][0] = 2;
                    winCondition(1,0,player1);
                    player1=true;
                }
                button4.setClickable(false);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1){
                    button5.setText("X");
                    board[1][1] = 1;
                    winCondition(1,1,player1);
                    player1= false;
                }
                else{
                    button5.setText("O");
                    board[1][1] = 2;
                    winCondition(1,1,player1);
                    player1=true;
                }
                button5.setClickable(false);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1){
                    button6.setText("X");
                    board[1][2] = 1;
                    winCondition(1,2,player1);
                    player1= false;
                }
                else{
                    button6.setText("O");
                    board[1][2] = 2;
                    winCondition(1,2,player1);
                    player1=true;
                }
                button6.setClickable(false);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1){
                    button7.setText("X");
                    board[2][0] = 1;
                    winCondition(2,0,player1);
                    player1= false;
                }
                else{
                    button7.setText("O");
                    board[2][0] = 2;
                    winCondition(2,0,player1);
                    player1=true;
                }
                button7.setClickable(false);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1){
                    button8.setText("X");
                    board[2][1] = 1;
                    winCondition(2,1,player1);
                    player1= false;
                }
                else{
                    button8.setText("O");
                    board[2][1] = 2;
                    winCondition(2,1,player1);
                    player1=true;
                }
                button8.setClickable(false);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1){
                    button9.setText("X");
                    board[2][2] = 1;
                    winCondition(2,2,player1);
                    player1= false;
                }
                else{
                    button9.setText("O");
                    board[2][2] = 2;
                    winCondition(2,2,player1);
                    player1=true;
                }
                button9.setClickable(false);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            board = new int[3][3];
            player1 = true;
            moveCount = 0;

            button1.setText("");
            button2.setText("");
            button3.setText("");
            button4.setText("");
            button5.setText("");
            button6.setText("");
            button7.setText("");
            button8.setText("");
            button9.setText("");

            button1.setClickable(true);
            button2.setClickable(true);
            button3.setClickable(true);
            button4.setClickable(true);
            button5.setClickable(true);
            button6.setClickable(true);
            button7.setClickable(true);
            button8.setClickable(true);
            button9.setClickable(true);


            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void winCondition(int x,int y,boolean player1)
    {
        moveCount++;
        int s;
        if(player1)
            s=1;
        else
            s=2;
        for(int i = 0; i < 3; i++){
            if(board[x][i] != s)
                break;
            if(i == 3-1){
                deactivateButtons();
                if(player1)
                    Toast.makeText(getApplicationContext(),"player 1 wins",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"player 2 wins",Toast.LENGTH_LONG).show();
            }
        }


        for(int i = 0; i < 3; i++){
            if(board[i][y] != s)
                break;
            if(i == 3-1){
                deactivateButtons();
                if(player1)
                    Toast.makeText(getApplicationContext(),"player 1 wins",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"player 2 wins",Toast.LENGTH_LONG).show();
            }
        }


        if(x == y){

            for(int i = 0; i < 3; i++){
                if(board[i][i] != s)
                    break;
                if(i == 3-1){
                    deactivateButtons();
                    if(player1)
                        Toast.makeText(getApplicationContext(),"player 1 wins",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(getApplicationContext(),"player 2 wins",Toast.LENGTH_LONG).show();
                }
            }
        }


        for(int i = 0;i<3;i++){
            if(board[i][(3-1)-i] != s)
                break;
            if(i == 3-1){
                deactivateButtons();
                if(player1)
                   Toast.makeText(getApplicationContext(),"player 1 wins",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"player 2 wins",Toast.LENGTH_LONG).show();
            }
        }


        if(moveCount == 9){
            Toast.makeText(getApplicationContext(),"It's a draw",Toast.LENGTH_LONG).show();
        }
    }

    public void deactivateButtons(){
        button1.setClickable(false);
        button2.setClickable(false);
        button3.setClickable(false);
        button4.setClickable(false);
        button5.setClickable(false);
        button6.setClickable(false);
        button7.setClickable(false);
        button8.setClickable(false);
        button9.setClickable(false);

    }

    }


