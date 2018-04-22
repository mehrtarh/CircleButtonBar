package tameshk.itparsa.com.circlenavigationbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.itparsa.circlenavigation.CircleItem;
import com.itparsa.circlenavigation.CircleNavigationView;
import com.itparsa.circlenavigation.CircleOnClickListener;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleNavigationView mCircleNavigationView;
        mCircleNavigationView = (CircleNavigationView)findViewById(R.id.navigation);
        mCircleNavigationView.initWithSaveInstanceState(savedInstanceState);
        mCircleNavigationView.setCentreButtonSelectable(true);
//        mCircleNavigationView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        mCircleNavigationView.addCircleItem(new CircleItem("setting", R.drawable.ic_settings));
        mCircleNavigationView.addCircleItem(new CircleItem("profile", R.drawable.ic_person));
        mCircleNavigationView.addCircleItem(new CircleItem("chat", R.drawable.ic_chat));
        mCircleNavigationView.addCircleItem(new CircleItem("share", R.drawable.ic_share));

        mCircleNavigationView.setCircleOnClickListener(new CircleOnClickListener() {
            @Override
            public void onCentreButtonClick() {

            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {

            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {

            }
        });

//        mCircleNavigationView.setCentreButtonIcon(R.drawable.ic_home);
//        mCircleNavigationView.setActiveCentreButtonIconColor(ContextCompat.getColor(MainActivity.this, android.R.color.white));
//        mCircleNavigationView.setActiveCentreButtonBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccent));
    }
}
