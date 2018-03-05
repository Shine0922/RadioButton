package com.example.win7.radiobutton01;


        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtResult;
    private RadioButton rad1,rad2,rad3;
    private RadioGroup radGroup1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  取得介面原件  id
        txtResult=(TextView)findViewById(R.id.txtResult);
        rad1=(RadioButton)findViewById(R.id.rad1);
        rad2=(RadioButton)findViewById(R.id.rad2);
        rad3=(RadioButton)findViewById(R.id.rad3);
        radGroup1=(RadioGroup)findViewById(R.id.radGroup1);

        // 設定監聽事件
        radGroup1.setOnCheckedChangeListener(radGroup1Listener);
    }
    //  定義  onCheckedChanged方法
    private RadioGroup.OnCheckedChangeListener radGroup1Listener = new RadioGroup.OnCheckedChangeListener()
    {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId)
        {
            int p = group.indexOfChild((RadioButton)findViewById(checkedId)); //選項的索引值
            int count = group.getChildCount();  //  清單總共有多少項
            if (checkedId == R.id.rad1)
                txtResult.setText( (count) + "種小說中，最喜歡第" + (p+1) + "種" + rad1.getText());
            else if (checkedId == R.id.rad2 )
                txtResult.setText( (count) + "種小說中，最喜歡第" + (p+1) + "種" + rad2.getText());
            else if (checkedId == R.id.rad3)
                txtResult.setText( (count) + "種小說中，最喜歡第" + (p+1) + "種" + rad3.getText());
        }
    };
}

