package khoapham.ptp.phamtanphat.alertdialog1903;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAlertDialog;
    static int position = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlertDialog = findViewById(R.id.buttonAlertDialog);

        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Hộp thoại thông báo");
                builder.setCancelable(false);
                builder.setIcon(android.R.drawable.star_on);
                //SingleChoice
                final String[] mangmonhoc = {"Toan" ,"Ly" ,"Hoa","Anh van"};
//                builder.setSingleChoiceItems(mangmonhoc, 0, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int position) {
//                        MainActivity.position = position;
//
//                    }
//                });
                boolean[] mangchecked = {false , false ,false,false };
                builder.setMultiChoiceItems(mangmonhoc, mangchecked, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        Toast.makeText(MainActivity.this, isChecked ? "Da check" : "Bo check", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setPositiveButton("Co", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int position) {
                        Toast.makeText(MainActivity.this, mangmonhoc[MainActivity.position], Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });
    }
}
