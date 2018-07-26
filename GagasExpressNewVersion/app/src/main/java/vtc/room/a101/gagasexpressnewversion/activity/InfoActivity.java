package vtc.room.a101.gagasexpressnewversion.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import vtc.room.a101.gagasexpressnewversion.R;
import vtc.room.a101.gagasexpressnewversion.adapter.InfoAdapter;
import vtc.room.a101.gagasexpressnewversion.constant.Constant;
import vtc.room.a101.gagasexpressnewversion.module.Product;
import vtc.room.a101.gagasexpressnewversion.provider.DataProvider;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final int position = getIntent().getExtras().getInt(Constant.MY_KEY);
        TextView allDescription = (TextView) findViewById(R.id.decr_info);
        ImageView imageInfo = (ImageView) findViewById(R.id.image_info);
        VideoView videoView = (VideoView) findViewById(R.id.video_info);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rec_info);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        final int[] imageArry = DataProvider.getList().get(position).getImageArrayId();
        InfoAdapter infoAdapter = new InfoAdapter(this, imageArry);
        Product product = DataProvider.getList().get(position);
        allDescription.setText(product.getAllDescription());
        imageInfo.setImageResource(imageArry[0]);
        videoView.setVideoURI(Uri.parse(product.getVideoUrl()));
        videoView.start();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(infoAdapter);
    }


}
