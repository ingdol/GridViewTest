package com.example.gridviewtest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter { //BaseAdapter를 상속받아 ImageAdapter 클래스를 작성한다.
    private Context mContext; //contextsms mContext로 선언한다.

    public ImageAdapter(Context c){ //ImageAapter 생성자는 context c를 객체로 생성한다.
        mContext = c; //mContext를 c로 할당한다.
    }

    public int getCount() { //리스트뷰가 몇 개의 아이템을 가지고 있는지
        return mThumbIds.length; //배열의 길이로 반환한다.
    }

    public Object getItem(int position){ //지정된 인덱스에 있는 실제 객체를 반환한다.
        return null;// 반환할 필요가 없다.
    }

    public long getItemId(int position){ //지정된 인덱스의 id를 반환한다.
        return 0; // 항목의 행 ID를 반환할 필요없다.
    }

    public View getView(int position, View convertView, ViewGroup parent){
        //getView() : imageAdapter에 추가된 각각의 이미지를 표시하는 View 객체를 반환한다.
        ImageView imageView; //imageView로 선언한다.
        if(convertView == null){ //convertView(전환뷰)가 null인지 검사한다.
            imageView = new ImageView(mContext); // mContext 정보를 가지고 객체를 생성한다.
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
            //뷰 객체의 높이와 너비를 200으로 한다.
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //이미지가 중심을 향하어 크롭되도록 설정
            imageView.setPadding(8, 8, 8, 8);
            //패딩을 동서남북으로 8로 설정한다.
        } else { //null이 아니면 전달된 뷰 객체를 ImageView 타입으로 변환한다.
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        //position으로 전달된 값을 이용해 mThumblds 배열에서 이미지를 선택한다.
        return imageView; //imagveView로 반환한다.
    }

    private Integer[] mThumbIds = { //drawable 리소스에 있는 값을 모아 하나의 mThumbIds 배열로 정의한다.
            R.drawable.sample_1, R.drawable.sample_2,
            R.drawable.sample_3, R.drawable.sample_4,
            R.drawable.sample_1, R.drawable.sample_2,
            R.drawable.sample_3, R.drawable.sample_4,
            R.drawable.sample_1, R.drawable.sample_2,
            R.drawable.sample_3, R.drawable.sample_4,
            R.drawable.sample_1, R.drawable.sample_2,
            R.drawable.sample_3, R.drawable.sample_4,
            R.drawable.sample_1, R.drawable.sample_2,
            R.drawable.sample_3, R.drawable.sample_4,
            R.drawable.sample_1, R.drawable.sample_2,
    };
}
