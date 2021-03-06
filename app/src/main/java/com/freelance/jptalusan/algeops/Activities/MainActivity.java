package com.freelance.jptalusan.algeops.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.freelance.jptalusan.algeops.R;

//http://stackoverflow.com/questions/22274545/add-drawable-in-relative-layout-programmatically
public class MainActivity extends BaseOpsActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button chooseAdd = (Button) findViewById(R.id.chooseAdd);
        Button chooseSub = (Button) findViewById(R.id.chooseSubtract);

        chooseAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addIntent = new Intent(MainActivity.this, AddActivity.class);
                addIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                MainActivity.this.startActivity(addIntent);
            }
        });

        chooseSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addIntent = new Intent(MainActivity.this, SubtractActivity.class);
                addIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                MainActivity.this.startActivity(addIntent);
            }
        });
    }
}
