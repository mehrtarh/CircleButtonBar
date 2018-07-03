/*
 * CircleBottomBar library for Android
 * Copyright (c) 2018 Mehran Jafari (https://github.com/mehrtarh/CircleButtonBar).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.itparsa.circlenavigation;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.annotation.Dimension;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

class BadgeHelper {

    /**
     * Show badge
     *
     * @param view      target badge
     * @param badgeItem BadgeItem object
     */
    static void showBadge(RelativeLayout view, BadgeItem badgeItem, boolean shouldShowBadgeWithNinePlus) {

        Utils.changeViewVisibilityVisible(view);
        TextView badgeTextView = (TextView) view.findViewById(R.id.badge_text_view);
        RelativeLayout mainBadgeContainer = (RelativeLayout) view.getParent();
        int leftMargin2 = mainBadgeContainer.getLayoutParams().width / 2;
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) view.getLayoutParams();
        params.setMargins(leftMargin2, params.topMargin, params.rightMargin, params.bottomMargin); // left, top, right, bottom
        view.setLayoutParams(params);


        if (shouldShowBadgeWithNinePlus)
            badgeTextView.setText(badgeItem.getBadgeText());
        else
            badgeTextView.setText(badgeItem.getFullBadgeText());

        if (badgeItem.getBadgeFont() != null)
            badgeTextView.setTypeface(badgeItem.getBadgeFont());
        badgeTextView.setTextColor(badgeItem.getBadgeTextColor());
        badgeTextView.setTextSize(Dimension.SP,badgeItem.getBadgeTextSize());

        view.setScaleX(0);
        view.setScaleY(0);

        ViewCompat.animate(view)
                .setDuration(200)
                .scaleX(1)
                .scaleY(1)
                .setListener(new ViewPropertyAnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(View view) {
                        Utils.changeViewVisibilityVisible(view);
                    }
                })
                .start();
    }

    /**
     * Show badge
     *
     * @param view target badge
     */
    static void hideBadge(View view) {
        ViewCompat.animate(view)
                .setDuration(200)
                .scaleX(0)
                .scaleY(0)
                .setListener(new ViewPropertyAnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(final View view) {
                        Utils.changeViewVisibilityGone(view);
                    }
                })
                .start();
    }

    /**
     * Force show badge without animation
     *
     * @param view      target budge
     * @param badgeItem BadgeItem object
     */
    static void forceShowBadge(RelativeLayout view, BadgeItem badgeItem, boolean shouldShowBadgeWithNinePlus) {
        Utils.changeViewVisibilityVisible(view);

        RelativeLayout mainBadgeContainer = (RelativeLayout) view.getParent();
        int leftMargin2 = mainBadgeContainer.getLayoutParams().width / 2;
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) view.getLayoutParams();
        params.setMargins(leftMargin2, params.topMargin, params.rightMargin, params.bottomMargin); // left, top, right, bottom
        view.setLayoutParams(params);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            view.setBackground(makeShapeDrawable(badgeItem.getBadgeColor()));
        }
        TextView badgeTextView = (TextView) view.findViewById(R.id.badge_text_view);
        if (shouldShowBadgeWithNinePlus)
            badgeTextView.setText(badgeItem.getBadgeText());
        else
            badgeTextView.setText(badgeItem.getFullBadgeText());

        if (badgeItem.getBadgeFont() != null)
            badgeTextView.setTypeface(badgeItem.getBadgeFont());
        badgeTextView.setTextColor(badgeItem.getBadgeTextColor());
        badgeTextView.setTextSize(Dimension.SP, badgeItem.getBadgeTextSize());
    }

    /**
     * Make circle drawable for badge background
     *
     * @param color background color
     * @return return colored circle drawable
     */
    static ShapeDrawable makeShapeDrawable(int color) {
        ShapeDrawable badgeBackground = new ShapeDrawable(new OvalShape());
        badgeBackground.setIntrinsicWidth(10);
        badgeBackground.setIntrinsicHeight(10);
        badgeBackground.getPaint().setColor(color);
        return badgeBackground;
    }
}
