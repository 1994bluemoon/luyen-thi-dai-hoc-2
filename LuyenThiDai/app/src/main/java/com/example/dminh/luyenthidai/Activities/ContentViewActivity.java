package com.example.dminh.luyenthidai.Activities;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dminh.luyenthidai.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ContentViewActivity extends AppCompatActivity {

    @BindView(R.id.content_pdfview)
    PDFView contentPdfview;

    String filede, filedapan, title;
    long t = 10800000;
    CountDownTimer timer;


    private static final String FORMAT = "%02d:%02d:%02d";
    @BindView(R.id.tv_timer)
    TextView tvTimer;
    @BindView(R.id.bt_de)
    Button btDe;
    @BindView(R.id.bt_dapan)
    Button btDapan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_view);
        ButterKnife.bind(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            filede = (String) extras.get("de");
            filedapan = (String) extras.get("dapan");
            title = (String) extras.get("tieude");
            this.setTitle(title);
        }

        showfile(filede);

        if (filedapan.equals("")) {
            btDe.setVisibility(View.GONE);
            btDapan.setVisibility(View.GONE);
            tvTimer.setVisibility(View.GONE);
        } else if (!filedapan.equals("")){
            btDe.setVisibility(View.INVISIBLE);
            btDapan.setVisibility(View.VISIBLE);

            tvTimer.setVisibility(View.VISIBLE);
        }

        startcountdown(t);
    }

    private void startcountdown(long time){
        timer = new CountDownTimer(time, 1000) { // adjust the milli seconds here
            public void onTick(long millisUntilFinished) {
                tvTimer.setText("" + String.format(FORMAT,
                        TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
                t =  millisUntilFinished;
            }
            public void onFinish() {
                tvTimer.setText("Hết giờ");
            }
        }.start();
    }

    private void showfile(String file) {
        contentPdfview.fromAsset(file)
                .defaultPage(0)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(0) // in dp
                .load();
    }

    @OnClick({R.id.bt_dapan, R.id.bt_de})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_dapan:
                btDapan.setVisibility(View.INVISIBLE);
                btDe.setVisibility(View.VISIBLE);
                showfile(filedapan);
                timer.cancel();
                tvTimer.setText("Đáp Án");
                break;
            case R.id.bt_de:
                btDe.setVisibility(View.INVISIBLE);
                btDapan.setVisibility(View.VISIBLE);
                showfile(filede);
                startcountdown(t);
                break;
        }
    }



    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();    //Call the back button's method
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}
