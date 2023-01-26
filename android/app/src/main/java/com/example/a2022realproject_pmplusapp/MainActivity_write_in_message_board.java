package com.example.a2022realproject_pmplusapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MainActivity_write_in_message_board extends AppCompatActivity implements View.OnClickListener {

    private FirebaseFirestore mStore = FirebaseFirestore.getInstance();

    private EditText mWriteTitleText;
    private EditText mWriteContentsText;
    private String id;


    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_write_in_message_board);
        toolbar = (Toolbar)findViewById(R.id.toolbar_message_write_in_messageboard);
        setSupportActionBar(toolbar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_chevron_left_white_24dp);
        getSupportActionBar().setTitle("게시글 작성");

        findViewById(R.id.write_upload).setOnClickListener(this);


        mWriteTitleText = (EditText)findViewById(R.id.write_title_text);
        mWriteContentsText = (EditText)findViewById(R.id.write_content_text);

    }

    @Override
    public void onClick(View v){
        id=mStore.collection("board").document().getId();
        Map<String, Object> post = new HashMap<>();
        post.put("id",id);
        post.put("title",mWriteTitleText.getText().toString());
        post.put("content",mWriteContentsText.getText().toString());
        post.put("name","관리자");

        String tit = mWriteTitleText.getText().toString();
        String con = mWriteContentsText.getText().toString();

       if(tit.equals("")){
           Toast.makeText(MainActivity_write_in_message_board.this,"제목을 입력해주세요.",Toast.LENGTH_SHORT).show();

       } else if(con.equals("")) {
           Toast.makeText(MainActivity_write_in_message_board.this,"내용을 입력해주세요.",Toast.LENGTH_SHORT).show();

       } else {

           mStore.collection("board").document(id).set(post).addOnSuccessListener(new OnSuccessListener<Void>() {

               @Override
               public void onSuccess(Void unused) {
                   Toast.makeText(MainActivity_write_in_message_board.this,"업로드 되었습니다.",Toast.LENGTH_SHORT).show();
                   finish();
               }
           }).addOnFailureListener(new OnFailureListener() {
               @Override
               public void onFailure(@NonNull Exception e) {
                   Toast.makeText(MainActivity_write_in_message_board.this,"업로드에 실패했습니다.",Toast.LENGTH_SHORT).show();
               }
           });

       }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
            default:
                break;
        }
        return super. onOptionsItemSelected(item);
    }
}