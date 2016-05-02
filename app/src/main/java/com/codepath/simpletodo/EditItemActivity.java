package com.codepath.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditItemActivity extends AppCompatActivity {
    int todoIndex;
    String todoContent;
    TextView etTodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        todoContent = getIntent().getStringExtra("todoContent");
        todoIndex = getIntent().getIntExtra("todoIndex", 0);
        etTodo = (EditText) findViewById(R.id.etTodoContent);
        etTodo.setText(todoContent);
    }

    public void onSaveItem(View v) {
        todoContent = etTodo.getText().toString();
        Intent data = new Intent();
        data.putExtra("todoContent", todoContent);
        data.putExtra("todoIndex", todoIndex);
        setResult(RESULT_OK, data);
        finish();
    }

}
