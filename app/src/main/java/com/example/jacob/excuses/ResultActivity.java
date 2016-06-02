package com.example.jacob.excuses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResultActivity extends AppCompatActivity {

    List<String> keywords = new ArrayList<String>();
    String[][] arrays;
    String[] chores;
    //String[] garbage;
    String[] late;
    String[] anniversary;
    String[] missClass;
    String[] date;
    String[] homework;
    String[] defaultExcuse;
    String[] birthday;
    String[] classEarly;
    String[] missWork;
    String[] text;
    String[] workingOut;
    String[] offPhone;
    String[] donatingBlood;
    String[] wedding;
    String[] doctor;
    String[] funeral;
    String[] church;
    String[] dinner;
    String[] speeding;
    String[] drunkDriving;
    String[] shower;
    String[] blood;
    String[] murder;
    String[] purchase;
    String[] forgot;
    String[] notGoing;
    int matchId;
    String searchString;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        searchString = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        editText = (EditText) findViewById(R.id.searchString);
        editText.setText(searchString);

        createKeywords();
        createArrays();
        getExcuse();

        Button button = (Button)findViewById(R.id.button_id);
        Button button2 = (Button)findViewById(R.id.button2_id);
        Button button3 = (Button)findViewById(R.id.button3_id);
        Button button4 = (Button)findViewById(R.id.button4_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getExcuse();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAnother();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewAllExcuses();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void getAnother()
    {
        searchArray(searchString);
    }

    public void getExcuse()
    {
        searchString = editText.getText().toString();
        searchArray(searchString);
    }

    public void viewAllExcuses()
    {
        textView.setText(arrays[matchId][0]);
        for (int index = 1; index < arrays[matchId].length; index++)
            textView.append("\n" + arrays[matchId][index]);
    }

    protected void searchArray(String s)
    {
        String patternString = "\\b(" + StringUtils.join(keywords, "|") + ")\\b";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(s);
        Random randomGenerator = new Random();
        int randomIndex;
        matchId = 25;
        textView = (TextView) findViewById(R.id.answer);

        if (matcher.find()) {
            String match = (matcher.group(1));
            switch(match.toLowerCase())
            {
                case "chores": matchId = 0;
                    break;
                case "late": matchId = 1;
                    break;
                case "anniversary": matchId = 2;
                    break;
                case "birthday": matchId = 3;
                    break;
                case "date": matchId = 4;
                    break;
                case "homework": matchId = 5;
                    break;
                case "class early": matchId = 6;
                    break;
                case "miss work": matchId = 7;
                    break;
                case "text": matchId = 8;
                    break;
                case "working out": matchId = 9;
                    break;
                case "phone": matchId = 10;
                    break;
                case "donating blood": matchId = 11;
                    break;
                case "wedding": matchId = 12;
                    break;
                case "doctor": matchId = 13;
                    break;
                case "funeral": matchId = 14;
                    break;
                case "church": matchId = 15;
                    break;
                case "dinner": matchId = 16;
                    break;
                case "speeding": matchId = 17;
                    break;
                case "drunk driving": matchId = 18;
                    break;
                case "shower": matchId = 19;
                    break;
                case "blood": matchId = 20;
                    break;
                case "murder": matchId = 21;
                    break;
                case "purchase": matchId = 22;
                    break;
                case "forgot": matchId = 23;
                    break;
                case "not going": matchId = 24;
                    break;
                default: break;

            }
        }

        while ((randomIndex = randomGenerator.nextInt(100)) > arrays[matchId].length - 1){}
        textView.setText(arrays[matchId][randomIndex]);

    }

    protected void createKeywords()
    {
        keywords.add("chores");
        //keywords.add("garbage");
        //keywords.add("trash");
        keywords.add("late");
        keywords.add("anniversary");
        keywords.add("date");
        keywords.add("homework");
        keywords.add("class early");
        keywords.add("miss class");
        keywords.add("work early");
        keywords.add("miss work");
        keywords.add("text");
        keywords.add("working out");
        keywords.add("phone");
        keywords.add("donating blood");
        keywords.add("wedding");
        keywords.add("doctor");
        keywords.add("funeral");
        keywords.add("church");
        keywords.add("dinner");
        keywords.add("speeding");
        keywords.add("drunk driving");
        keywords.add("shower");
        keywords.add("blood");
        keywords.add("murder");
        keywords.add("purchase");
        keywords.add("forgot");
        keywords.add("not going");
    }

    protected void createArrays()
    {
        chores = new String[] {
                getResources().getString(R.string.chores1),
                getResources().getString(R.string.chores2),
                getResources().getString(R.string.chores3),
                getResources().getString(R.string.chores4),
                getResources().getString(R.string.chores5),
                getResources().getString(R.string.chores6)
        };
        /*garbage = new String[] {
                "Garbage Filler 1",
                "Garbage Filler 2"
        };*/
        late = new String[] {
                getResources().getString(R.string.lateWork1),
                getResources().getString(R.string.lateWork2),
                getResources().getString(R.string.lateWork3),
                getResources().getString(R.string.lateWork4),
                getResources().getString(R.string.lateWork5),
                getResources().getString(R.string.lateWork6)
        };
        anniversary = new String[] {
                getResources().getString(R.string.anniversary1),
                getResources().getString(R.string.anniversary2)
        };
        birthday = new String[] {
                getResources().getString(R.string.birthday1),
                getResources().getString(R.string.birthday2)
        };
        missClass = new String[] {
                getResources().getString(R.string.missClass1),
                getResources().getString(R.string.missClass2),
                getResources().getString(R.string.missClass3)
        };
        date = new String[] {
                getResources().getString(R.string.date1),
                getResources().getString(R.string.date2),
                getResources().getString(R.string.date3),
                getResources().getString(R.string.date4)
        };
        homework = new String[] {
                getResources().getString(R.string.homework1),
                getResources().getString(R.string.homework2),
                getResources().getString(R.string.homework3),
                getResources().getString(R.string.homework4),
                getResources().getString(R.string.homework5),
                getResources().getString(R.string.homework6),
                getResources().getString(R.string.homework7),
                getResources().getString(R.string.homework8)
        };
        defaultExcuse = new String[] {
                getResources().getString(R.string.general1),
                getResources().getString(R.string.general2),
                getResources().getString(R.string.general3),
                getResources().getString(R.string.general4),
                getResources().getString(R.string.general5),
                getResources().getString(R.string.general6),
                getResources().getString(R.string.general7),
                getResources().getString(R.string.general8),
                getResources().getString(R.string.general9),
                getResources().getString(R.string.general10),
                getResources().getString(R.string.general11),
                getResources().getString(R.string.general12),
                getResources().getString(R.string.general13),
                getResources().getString(R.string.general14),
                getResources().getString(R.string.general15)
        };
        classEarly = new String[]{
                getResources().getString(R.string.classEarly1),
                getResources().getString(R.string.classEarly2)
        };
        missWork = new String[]{
                getResources().getString(R.string.missWork1),
                getResources().getString(R.string.missWork2),
                getResources().getString(R.string.missWork3),
                getResources().getString(R.string.missWork4),
                getResources().getString(R.string.missWork5),
                getResources().getString(R.string.missWork6),
                getResources().getString(R.string.missWork7),
                getResources().getString(R.string.missWork8),
                getResources().getString(R.string.missWork9),
                getResources().getString(R.string.missWork10),
                getResources().getString(R.string.missWork11),
                getResources().getString(R.string.missWork12),
                getResources().getString(R.string.missWork13),
                getResources().getString(R.string.missWork14),
                getResources().getString(R.string.missWork15),
                getResources().getString(R.string.missWork16),
                getResources().getString(R.string.missWork17),
                getResources().getString(R.string.missWork18),
                getResources().getString(R.string.missWork19),
                getResources().getString(R.string.missWork20)
        };
        text = new String[]{
                getResources().getString(R.string.text1),
                getResources().getString(R.string.text2),
                getResources().getString(R.string.text3)
        };
        workingOut = new String[]{
                getResources().getString(R.string.workingOut1),
                getResources().getString(R.string.workingOut2),
                getResources().getString(R.string.workingOut3)
        };
        offPhone = new String[]{
                getResources().getString(R.string.offPhone1),
                getResources().getString(R.string.offPhone2),
                getResources().getString(R.string.offPhone3),
                getResources().getString(R.string.offPhone4),
                getResources().getString(R.string.offPhone5),
                getResources().getString(R.string.offPhone6),
                getResources().getString(R.string.offPhone7)
        };
        donatingBlood = new String[]{
                getResources().getString(R.string.donatingBlood1),
                getResources().getString(R.string.donatingBlood2),
                getResources().getString(R.string.donatingBlood3)
        };
        wedding = new String[]{
                getResources().getString(R.string.wedding1),
                getResources().getString(R.string.wedding2),
                getResources().getString(R.string.wedding3)
        };
        doctor = new String[]{
                getResources().getString(R.string.doctor1),
                getResources().getString(R.string.doctor2)
        };
        funeral = new String[]{
                getResources().getString(R.string.funeral1),
                getResources().getString(R.string.funeral2)
        };
        church = new String[]{
                getResources().getString(R.string.church1),
                getResources().getString(R.string.church2),
                getResources().getString(R.string.church3),
                getResources().getString(R.string.church4),
                getResources().getString(R.string.church5),
                getResources().getString(R.string.church6)
        };
        dinner = new String[]{
                getResources().getString(R.string.dinner1),
                getResources().getString(R.string.dinner2),
                getResources().getString(R.string.dinner3)
        };
        speeding = new String[]{
                getResources().getString(R.string.speeding1),
                getResources().getString(R.string.speeding2),
                getResources().getString(R.string.speeding3)
        };
        drunkDriving = new String[]{
                getResources().getString(R.string.drunkDriving1),
                getResources().getString(R.string.drunkDriving2)
        };
        shower = new String[]{
                getResources().getString(R.string.shower1),
                getResources().getString(R.string.shower2),
                getResources().getString(R.string.shower3)
        };
        blood = new String[]{
                getResources().getString(R.string.blood1),
                getResources().getString(R.string.blood2),
                getResources().getString(R.string.blood3)
        };
        murder = new String[]{
                getResources().getString(R.string.murder1),
                getResources().getString(R.string.murder2),
                getResources().getString(R.string.murder3)
        };
        purchase = new String[]{
                getResources().getString(R.string.purchase1),
                getResources().getString(R.string.purchase2),
                getResources().getString(R.string.purchase3)
        };
        forgot = new String[]{
                getResources().getString(R.string.forgot1),
                getResources().getString(R.string.forgot2),
                getResources().getString(R.string.forgot3),
                getResources().getString(R.string.forgot4)
        };
        notGoing = new String[]{
                getResources().getString(R.string.notGoing1),
                getResources().getString(R.string.notGoing2),
                getResources().getString(R.string.notGoing3),
                getResources().getString(R.string.notGoing4)
        };
        arrays = new String[][] { chores, late, anniversary, birthday, date, homework, classEarly, missWork, text, workingOut, offPhone, donatingBlood, wedding, doctor, funeral, church, dinner, speeding, drunkDriving, shower, blood, murder, purchase, forgot,
                notGoing, defaultExcuse };
    }
}
