package com.game.niks.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;
    TextView txt6;
    TextView txt7;
    TextView txt8;
    TextView txt9;

    TextView turn;
    String cs="X";
    Integer x=0;
    String Turn1="X";
    String Turn2="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        txt1= (TextView)findViewById(R.id.pos1);
        txt2= (TextView)findViewById(R.id.pos2);
        txt3= (TextView)findViewById(R.id.pos3);
        txt4= (TextView)findViewById(R.id.pos4);
        txt5= (TextView)findViewById(R.id.pos5);
        txt6= (TextView)findViewById(R.id.pos6);
        txt7= (TextView)findViewById(R.id.pos7);
        txt8= (TextView)findViewById(R.id.pos8);
        txt9= (TextView)findViewById(R.id.pos9);

        turn=(TextView)findViewById(R.id.turns);

    }
    public void onPos1(View v){
        if(txt1.getText().toString().isEmpty()){
            txt1.setText(cs);
            if(cs=="0")
                cs="X";
            else
                cs="0";
            if(x==0){
                turn.setText("Turn :: "+Turn2);
                x=1;
            }
            else if(x==1){
                turn.setText("Turn :: "+Turn1);
                x=0;

            }

        }
        whoWon();
    }
    public void onPos2(View v){
        if(txt2.getText().toString().isEmpty()) {
            txt2.setText(cs);
            if (cs == "0")
                cs = "X";
            else
                cs = "0";
            if (x == 0) {
                turn.setText("Turn :: "+Turn2);
                x = 1;
            } else if (x == 1) {
                turn.setText("Turn :: "+Turn1);
                x = 0;
            }
            whoWon();
        }
    }
    public void onPos3(View v){
        if(txt3.getText().toString().isEmpty()){
            txt3.setText(cs);
        if(cs=="0")
            cs="X";
        else
            cs="0";
        if(x==0){
            turn.setText("Turn :: "+Turn2);
            x=1;
        }
        else if(x==1){
            turn.setText("Turn :: "+Turn1);
            x=0;
        }
        whoWon();
        }
    }
    public void onPos4(View v){
        if(txt4.getText().toString().isEmpty()){
            txt4.setText(cs);
        if(cs=="0")
            cs="X";
        else
            cs="0";
        if(x==0){
            turn.setText("Turn :: "+Turn2);
            x=1;
        }
        else if(x==1){
            turn.setText("Turn :: "+Turn1);
            x=0;
        }
        whoWon();
    }}
    public void onPos5(View v){
        if(txt5.getText().toString().isEmpty()){
            txt5.setText(cs);
        if(cs=="0")
            cs="X";
        else
            cs="0";
        if(x==0){
            turn.setText("Turn :: "+Turn2);
            x=1;
        }
        else if(x==1){
            turn.setText("Turn :: "+Turn1);
            x=0;
        }
        whoWon();
    }}
    public void onPos6(View v){
        if(txt6.getText().toString().isEmpty()){
            txt6.setText(cs);
        if(cs=="0")
            cs="X";
        else
            cs="0";
        if(x==0){
            turn.setText("Turn :: "+Turn2);
            x=1;
        }
        else if(x==1){
            turn.setText("Turn :: "+Turn1);
            x=0;
        }
        whoWon();
    }}
    public void onPos7(View v){
        if(txt7.getText().toString().isEmpty()){
            txt7.setText(cs);
        if(cs=="0")
            cs="X";
        else
            cs="0";
        if(x==0){
            turn.setText("Turn :: "+Turn2);
            x=1;
        }
        else if(x==1){
            turn.setText("Turn :: "+Turn1);
            x=0;
        }
        whoWon();
    }}
    public void onPos8(View v){
        if(txt8.getText().toString().isEmpty()){
            txt8.setText(cs);
        if(cs=="0")
            cs="X";
        else
            cs="0";
        if(x==0){
            turn.setText("Turn :: "+Turn2);
            x=1;
        }
        else if(x==1){
            turn.setText("Turn :: "+Turn1);
            x=0;
        }
        whoWon();
    }}
    public void onPos9(View v){
        if(txt9.getText().toString().isEmpty()){
            txt9.setText(cs);
        if(cs=="0")
            cs="X";
        else
            cs="0";
        if(x==0){
            turn.setText("Turn :: "+Turn2);
            x=1;
        }
        else if(x==1){
            turn.setText("Turn :: "+Turn1);
            x=0;
        }
        whoWon();
    }}
    public void whoWon(){
        if(!txt1.getText().toString().isEmpty()&&!txt2.getText().toString().isEmpty()&&!txt3.getText().toString().isEmpty()&&txt1.getText().toString()==txt2.getText().toString()&&txt2.getText().toString()==txt3.getText().toString())
            win1(txt1.getText().toString());
        if(!txt4.getText().toString().isEmpty()&&!txt5.getText().toString().isEmpty()&&!txt6.getText().toString().isEmpty()&&txt4.getText().toString()==txt5.getText().toString()&&txt5.getText().toString()==txt6.getText().toString())
            win1(txt4.getText().toString());
        if(!txt7.getText().toString().isEmpty()&&!txt8.getText().toString().isEmpty()&&!txt9.getText().toString().isEmpty()&&txt7.getText().toString()==txt8.getText().toString()&&txt8.getText().toString()==txt9.getText().toString())
            win1(txt7.getText().toString());
        if(!txt1.getText().toString().isEmpty()&&!txt5.getText().toString().isEmpty()&&!txt9.getText().toString().isEmpty()&&txt1.getText().toString()==txt5.getText().toString()&&txt5.getText().toString()==txt9.getText().toString())
            win1(txt1.getText().toString());
        if(!txt5.getText().toString().isEmpty()&&!txt3.getText().toString().isEmpty()&&!txt7.getText().toString().isEmpty()&&txt5.getText().toString()==txt3.getText().toString()&&txt5.getText().toString()==txt7.getText().toString())
            win1(txt3.getText().toString());
        if(!txt1.getText().toString().isEmpty()&&!txt4.getText().toString().isEmpty()&&!txt7.getText().toString().isEmpty()&&txt1.getText().toString()==txt4.getText().toString()&&txt4.getText().toString()==txt7.getText().toString())
            win1(txt1.getText().toString());
        if(!txt5.getText().toString().isEmpty()&&!txt2.getText().toString().isEmpty()&&!txt8.getText().toString().isEmpty()&&txt5.getText().toString()==txt2.getText().toString()&&txt5.getText().toString()==txt8.getText().toString())
            win1(txt2.getText().toString());
        if(!txt9.getText().toString().isEmpty()&&!txt6.getText().toString().isEmpty()&&!txt3.getText().toString().isEmpty()&&txt9.getText().toString()==txt6.getText().toString()&&txt6.getText().toString()==txt3.getText().toString())
            win1(txt3.getText().toString());

    }

    private void win1(String winner) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        txt7.setText("");
        txt8.setText("");
        txt9.setText("");
        builder.setTitle(winner +" won");
        builder.setPositiveButton("Play Again ?",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }

        });
        builder.setNegativeButton("No ! ",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                noClicked();
            }

        });
        builder.show();
    }

    private void noClicked() {
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void onClickReset(View v)
    {
        reset();
    }
    public void onClickHOME(View v)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    private void reset(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Are you sure ? ");

        builder.setPositiveButton("Yes !",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                txt5.setText("");
                txt6.setText("");
                txt7.setText("");
                txt8.setText("");
                txt9.setText("");
            }

        });
        builder.setNegativeButton("No ! ",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.show();
    }
}
