package yere.tugaskalkulator672013041;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnC, btnTitik, btnPlus, btnMin, btnKali, btnBagi, btnSdgn;
    private EditText txtView;

    float a, b;
    boolean plus, min, dev, mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnTitik = (Button) findViewById(R.id.btnTitik);
        btnC = (Button) findViewById(R.id.btnC);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMin = (Button) findViewById(R.id.btnMin);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnSdgn = (Button) findViewById(R.id.btnSdgn);
        txtView = (EditText) findViewById(R.id.txtView);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnTitik.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMin.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnBagi.setOnClickListener(this);
        btnSdgn.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn0:
                txtView.setText(txtView.getText() + "0");
                break;
            case R.id.btn1:
                txtView.setText(txtView.getText() + "1");
                break;
            case R.id.btn2:
                txtView.setText(txtView.getText() + "2");
                break;
            case R.id.btn3:
                txtView.setText(txtView.getText() + "3");
                break;
            case R.id.btn4:
                txtView.setText(txtView.getText() + "4");
                break;
            case R.id.btn5:
                txtView.setText(txtView.getText() + "5");
                break;
            case R.id.btn6:
                txtView.setText(txtView.getText() + "6");
                break;
            case R.id.btn7:
                txtView.setText(txtView.getText() + "7");
                break;
            case R.id.btn8:
                txtView.setText(txtView.getText() + "8");
                break;
            case R.id.btn9:
                txtView.setText(txtView.getText() + "9");
                break;
            case R.id.btnTitik:
                txtView.setText(txtView.getText() + ".");
                break;
            case R.id.btnC:
                txtView.getText().clear();
                break;
            case R.id.btnPlus:
                if (txtView == null) {
                    txtView.setText("");
                } else {
                    a = Float.parseFloat(txtView.getText() + "");
                    plus = true;
                    txtView.setText("+");
                    txtView.getText().clear();
                }
                break;
            case R.id.btnMin:
                a = Float.parseFloat(txtView.getText() + "");
                min = true;
                txtView.setText("-");
                txtView.getText().clear();
                break;
            case R.id.btnKali:
                a = Float.parseFloat(txtView.getText() + "");
                mul = true;
                txtView.setText("X");
                txtView.getText().clear();
                break;
            case R.id.btnBagi:
                a = Float.parseFloat(txtView.getText() + "");
                dev = true;
                txtView.setText("/");
                txtView.getText().clear();
                break;
            case R.id.btnSdgn:
                b = Float.parseFloat(txtView.getText() + "");
                if (plus == true) {
                    txtView.setText(a + b + "");
                    plus = false;
                }
                if (min == true) {
                    txtView.setText(a - b + "");
                    min = false;
                }
                if (mul == true) {
                    txtView.setText(a * b + "");
                    mul = false;
                }
                if (dev == true) {
                    txtView.setText(a / b + "");
                    dev = false;
                }
                break;
        }
    }
}
