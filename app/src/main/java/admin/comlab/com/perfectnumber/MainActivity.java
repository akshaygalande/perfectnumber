package admin.comlab.com.perfectnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView answer=findViewById(R.id.answer);
        final EditText num=findViewById(R.id.num);
        Button btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number=Integer.parseInt(num.getText().toString());
                int temp = 0;
                for(int i=1;i<=number/2;i++){
                    if(number%i == 0){
                        temp += i;
                    }
                }
                if(temp == number){
                    answer.setText("It is a perfect number");
                } else {
                    answer.setText("It is not a perfect number");

                }

            }
        });
    }
}
