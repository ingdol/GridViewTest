package com.example.gridviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity { //클래스를 상속받아 MainActivity 클래스를 작성한다.

    @Override
    public void onCreate(Bundle savedInstanceState) { //onCreate 메소드의 매개변수는 앱의 이전 실행상태를 전달한다.
        super.onCreate(savedInstanceState); //부모클래스의 onCreate를 호출한다.
        setContentView(R.layout.activity_main); //main을 띄운다.
        GridView gridview = (GridView) findViewById(R.id.GridView01);
        //GridView01의 레이아웃 정보를 gridview로 받아온다.
        gridview.setAdapter(new ImageAdapter(this));
        //setAdapter() 메소드는 커스텀 어댑터인 ImageAdapter를 그리드 뷰의 데이터 소스로 설정한다.
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //클릭하면 setOnItemClickListener() 메소드를 통해 객체를 이벤트 처리기로 등록한다.
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                //onItemClick() 콜백 메소드를 갖는다.
                Toast.makeText(MainActivity.this, ""+ position,
                        Toast.LENGTH_SHORT).show(); //선택된 항목의 인덱스를 토스트 메시지로 표시한다.
            }
        });
    }
}
