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

        final CircleNavigationView mCircleNavigationView;
        mCircleNavigationView = (CircleNavigationView) findViewById(R.id.navigation);
        mCircleNavigationView.initWithSaveInstanceState(savedInstanceState);
        mCircleNavigationView.setCentreButtonSelectable(true);

        mCircleNavigationView.addCircleItem(
                new CircleItem("setting", R.drawable.ic_settings, getResources().getColor(R.color.colorAccent), R.drawable.near_me));
        mCircleNavigationView.addCircleItem(new CircleItem("profile", R.drawable.ic_person, getResources().getColor(R.color.colorAccent)));
        mCircleNavigationView.addCircleItem(new CircleItem("chat", R.drawable.ic_chat, getResources().getColor(R.color.colorPrimary)));
        mCircleNavigationView.addCircleItem(new CircleItem("share", R.drawable.ic_share, getResources().getColor(R.color.colorPrimaryDark)));
//        mCircleNavigationView.setCenterButtonSelectedIcon(R.drawable.ic_chat);
        mCircleNavigationView.setCenterButtonResourceBackground(R.drawable.back);
        mCircleNavigationView.setCircleOnClickListener(new CircleOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                mCircleNavigationView.showBadgeAtIndex(2, 80, getResources().getColor(R.color.colorAccent)
                        , 16, getResources().getColor(R.color.colorBadgeText));

            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {

                if (itemIndex == 2)
                    mCircleNavigationView.hideBadgeAtIndex(2);

                if (itemIndex == 0)
                    mCircleNavigationView.showBadgeAtIndexWithoutText(3, 8, getResources().getColor(R.color.colorAccent));

                if (itemIndex == 3)
                    mCircleNavigationView.hideBadgeAtIndex(3);

            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {

            }
        });
//        mCircleNavigationView.shouldShowFullBadgeText(false);


//        mCircleNavigationView.setCentreButtonIcon(R.drawable.ic_home);
//        mCircleNavigationView.setActiveCentreButtonIconColor(ContextCompat.getColor(MainActivity.this, android.R.color.white));
//        mCircleNavigationView.setActiveCentreButtonBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccent));
    }


}
