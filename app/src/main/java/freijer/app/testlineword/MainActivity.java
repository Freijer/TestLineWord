package freijer.app.testlineword;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView char_1, char_2, char_3, char_4, char_5, char_6, char_7, champ;
    Button but_1, but_2, but_3, but_4, but_5, but_6, but_7;
     List<String> lineWord  = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        char_1 = findViewById(R.id.char_1);
        char_2 = findViewById(R.id.char_2);
        char_3 = findViewById(R.id.char_3);
        char_4 = findViewById(R.id.char_4);
        char_5 = findViewById(R.id.char_5);
        char_6 = findViewById(R.id.char_6);
        char_7 = findViewById(R.id.char_7);
            but_1 = findViewById(R.id.but_1);
            but_2 = findViewById(R.id.but_2);
            but_3 = findViewById(R.id.but_3);
            but_4 = findViewById(R.id.but_4);
            but_5 = findViewById(R.id.but_5);
            but_6 = findViewById(R.id.but_6);
            but_7 = findViewById(R.id.but_7);
                champ = findViewById(R.id.champ);

//        lineWord.add("");
//        lineWord.add("");
//        lineWord.add("");
//        lineWord.add("");
//        lineWord.add("");
//        lineWord.add("");
//        lineWord.add("");
    }



    public void Set_1(View v){
      lineWord.add(but_1.getText().toString());
//      char_1.setText(lineWord.get(0));
        SetB();
    }

    public void Set_2(View v){
        lineWord.add(but_2.getText().toString());
           //char_2.setText(lineWord.get(1));
        SetB();
    }
    public void Set_3(View v){
        lineWord.add(but_3.getText().toString());
//        char_3.setText(lineWord.get(2));
        SetB();
    }
    public void Set_4(View v){
        lineWord.add(but_4.getText().toString());
//       char_4.setText(lineWord.get(3));
        SetB();
    }
    public void Set_5(View v){
        lineWord.add(but_5.getText().toString());
//        char_5.setText(lineWord.get(4));
        SetB();
    }
    public void Set_6(View v){
        lineWord.add(but_6.getText().toString());
//        char_6.setText(lineWord.get(5));
        SetB();
    }
    public void Set_7(View v){
        lineWord.add(but_7.getText().toString());
//        char_7.setText(lineWord.get(6));
        SetB();
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public void pass(View v){

        String[] ArrayListWord = lineWord.toArray(new String[0]);
        String KeyWord = (String.join("", ArrayListWord));

        if (KeyWord.equals("АБРИКОС")) {
            champ.setText("РАБОТАЕТ");
        } else if (KeyWord.equals("СОК")) {
            champ.setText("РАБОТАЕТ");
        } else {
            champ.setText("ЗАНОВО!!!");
        }
        Log.d("test", KeyWord);

        switch (KeyWord){
            case "СОК":
            case "КОС":
            case "КОСА":
            case "АБРИКОС":
                champ.setText("РАБОТАЕТ");
                break;
        }

//        SetB();

    }


    public void SetB(){
        if (lineWord.size() == 1){
            char_1.setText(lineWord.get(0));
            char_2.setText("");
            char_3.setText("");
            char_4.setText("");
            char_5.setText("");
            char_6.setText("");
            char_7.setText("");
        } else if (lineWord.size() == 2){
            char_1.setText(lineWord.get(0));
            char_2.setText(lineWord.get(1));
            char_3.setText("");
            char_4.setText("");
            char_5.setText("");
            char_6.setText("");
            char_7.setText("");
        } else if (lineWord.size() == 3){
            char_1.setText(lineWord.get(0));
            char_2.setText(lineWord.get(1));
            char_3.setText(lineWord.get(2));
            char_4.setText("");
            char_5.setText("");
            char_6.setText("");
            char_7.setText("");
        } else if (lineWord.size() == 4){
            char_1.setText(lineWord.get(0));
            char_2.setText(lineWord.get(1));
            char_3.setText(lineWord.get(2));
            char_4.setText(lineWord.get(3));
            char_5.setText("");
            char_6.setText("");
            char_7.setText("");
        } else if (lineWord.size() == 5){
            char_1.setText(lineWord.get(0));
            char_2.setText(lineWord.get(1));
            char_3.setText(lineWord.get(2));
            char_4.setText(lineWord.get(3));
            char_5.setText(lineWord.get(4));
            char_6.setText("");
            char_7.setText("");
        } else if (lineWord.size() == 6){
            char_1.setText(lineWord.get(0));
            char_2.setText(lineWord.get(1));
            char_3.setText(lineWord.get(2));
            char_4.setText(lineWord.get(3));
            char_5.setText(lineWord.get(4));
            char_6.setText(lineWord.get(5));
            char_7.setText("");
        } else if (lineWord.size() == 7){
            char_1.setText(lineWord.get(0));
            char_2.setText(lineWord.get(1));
            char_3.setText(lineWord.get(2));
            char_4.setText(lineWord.get(3));
            char_5.setText(lineWord.get(4));
            char_6.setText(lineWord.get(5));
            char_7.setText(lineWord.get(6));
        }



//        if (lineWord.size() == 3){
//            char_1.setText(lineWord.get(0));
//            char_2.setText(lineWord.get(1));
//            char_3.setText(lineWord.get(2));
//            char_4.setText("");
//            char_5.setText("");
//            char_6.setText("");
//            char_7.setText("");
//        }



//        char_1.setText(lineWord.get(0));
//        char_2.setText(lineWord.get(1));
//        char_3.setText(lineWord.get(2));
//        char_4.setText(lineWord.get(3));
//        char_5.setText(lineWord.get(4));
//        char_6.setText(lineWord.get(5));
//        char_7.setText(lineWord.get(6));
    }

}
