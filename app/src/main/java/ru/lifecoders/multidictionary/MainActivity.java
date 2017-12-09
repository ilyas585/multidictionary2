package ru.lifecoders.multidictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mSearch, mAddWord, mAddToWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        EditText editText = (EditText) findViewById(R.id.edit_add_word);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                TextView textView =findViewById(R.id.edit_add_note);
                textView.setText(s);
            }
        });

*/




        mSearch = findViewById(R.id.btn_search);
        mAddWord = findViewById(R.id.btn_addWord);
        mAddToWord = findViewById(R.id.btn_to_addWord);


      //  mAddToWord.setOnClickListener(stopService(new Intent(getApplicationContext(),Main2Activity.class)));
    }

    public void OpenMain2Activity(View v){
        Intent intObj = new Intent(this, Main2Activity.class);
        startActivity(intObj);

    }







    public Button getmSearch() {
        return mSearch;
    }

    public void setmSearch(Button mSearch) {
        this.mSearch = mSearch;
    }

    public Button getmAddWord() {
        return mAddWord;
    }

    public void setmAddWord(Button mAddWord) {
        this.mAddWord = mAddWord;
    }

    public Button getmAddToWord() {
        return mAddToWord;
    }

    public void setmAddToWord(Button mAddToWord) {
        this.mAddToWord = mAddToWord;
    }
}
