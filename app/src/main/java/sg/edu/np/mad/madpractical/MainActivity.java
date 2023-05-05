package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.test1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User u = new User("john", "hi", 1, false);
        Button btn  = (Button)findViewById(R.id.btnFollow);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (u.getFollowed() == false) {
                    btn.setText("unfollow");
                    u.setFollowed(true);
                }
                else {
                    btn.setText("follow");
                    u.setFollowed(false);
                }
            }
        });

    }
}