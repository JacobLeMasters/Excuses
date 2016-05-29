package com.example.jacob.excuses;

import android.app.Activity;
import android.os.Bundle;
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

public class MainActivity extends Activity {
    String searchString;
    List<String> keywords = new ArrayList<String>();
    String[][] arrays;
    String[] chores;
    String[] garbage;
    String[] late;
    String[] anniversary;
    String[] lass;
    String[] date;
    String[] homework;
    String[] defaultExcuse;
    String[] birthday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getExcuse();
            }
        });
    }

    public void getExcuse()
    {
        EditText editText = (EditText) findViewById(R.id.excuse);
        searchString = editText.getText().toString();
        createKeywords();
        createArrays();
        searchArray(searchString);
    }

    protected void searchArray(String s)
    {
        String patternString = "\\b(" + StringUtils.join(keywords, "|") + ")\\b";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(s);
        Random randomGenerator = new Random();
        int randomIndex = randomGenerator.nextInt(2);
        int matchId = 6;
        TextView textView = (TextView) findViewById(R.id.answer);

        if (matcher.find()) {
            String match = (matcher.group(1));
            switch(match)
            {
                case "chores": matchId = 0;
                    break;
                case "garbage":
                case "trash": matchId = 1;
                    break;
                case "late": matchId = 2;
                    break;
                case "anniversary": matchId = 3;
                    break;
                case "date": matchId = 4;
                    break;
                case "homework": matchId = 5;
                    break;
                default: break;

            }
        }

        textView.setText(arrays[matchId][randomIndex].toString());

    }

    protected void createKeywords()
    {
        keywords.add("chores");
        keywords.add("garbage");
        keywords.add("trash");
        keywords.add("late");
        keywords.add("anniversary");
        keywords.add("date");
        keywords.add("homework");
    }

    protected void createArrays()
    {
        chores = new String[] {
                "My doctor told me cleaning is bad for my Blood Pressure.",
                "I thought it was your turn!"
        };
        garbage = new String[] {
                "Garbage Filler 1",
                "Garbage Filler 2"
        };
        late = new String[] {
                "Late Filler 1",
                "Late Filler 2"
        };
        anniversary = new String[] {
                "I want you to know that I have never been so sorry in my life, my love. I have no excuse for having forgotten this important day for us. I really want you to forgive me and make it up to you for this big mistake. I hope you know that I love you and in no time this neglect was with a bad intention, you are the most important thing in my life. Seriously I apologize, it will not be repeated ever again, my life. "
                , "You are the only one that really makes me smile from the bottom of my soul, as if I were floating. The memories with you are the best I could ask for in my life. Admittedly, I forgot our anniversary and it weighs in the heart to know how much I have hurt you with my carelessness. Now I am going through a very complicated situation in the office and, although it should not be an excuse nor meddle in our private lives, I allowed it to happen and I could not be more sorry. I ask a little understanding and a second chance. I adore you."
        };
        birthday = new String[] {
                "I'm broke",
                "Avoid attending a party by using the excuse of travelling. Pretend that you are going to be away during the time when you have been invited for an event. Switch off your cell phone so you don't have to answer any calls."
        };
        lass = new String[] {
                "Tell your professor you got food poisoning. You puke all over your bathroom for 24 hours and you come in bright-eyed and bushy-tailed the next day, even though you just wrote an Adderall-induced essay in one sitting.",
                "Tell your teacher that you locked your keys in your car and by the time Triple-A comes to the rescue, class will be over.",
                "If you tell your teacher you contracted lice over the weekend, they’ll actually be thankful you didn’t come to class. The email is quick and easy: “That’s the last time I’m buying a beanie from a thrift store…”\n"
        };
        date = new String[] {
                "Date Filler 1",
                "Date Filler 2"
        };
        homework = new String[] {
                "Homework Filler 1",
                "Homework Filler 2"
        };
        defaultExcuse = new String[] {
                "There is no excuse for you!",
                "There is STILL no excuse for you!"
        };
        arrays = new String[][] { chores, garbage, late, anniversary, birthday, date, homework, defaultExcuse };
    }
}
