package doug.androidDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AndroidDemo extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        LinearLayout layout = new LinearLayout(this);
        
        TextView text = new TextView(this);
        text.setText("Hi there");
        layout.addView(text);
        
        setContentView(layout);
    }
}
