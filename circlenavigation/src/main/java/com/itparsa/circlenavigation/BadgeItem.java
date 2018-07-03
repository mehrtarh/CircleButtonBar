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

import android.graphics.Typeface;

import java.io.Serializable;

@SuppressWarnings("unused")
class BadgeItem implements Serializable {

    private static final int BADGE_TEXT_MAX_NUMBER = 99;

    private int badgeIndex;

    private int badgeText;

    private int badgeColor;

    private int badgeTextSize;

    private int badgeTextColor;

    private Typeface badgeFont;


    BadgeItem(int badgeIndex, int badgeText, int badgeColor, int badgeTextColor, int badgeTextSize, Typeface badgeFont) {
        this.badgeIndex = badgeIndex;
        this.badgeText = badgeText;
        this.badgeColor = badgeColor;
        this.badgeTextColor = badgeTextColor;
        this.badgeTextSize = badgeTextSize;
        this.badgeFont = badgeFont;
    }

    BadgeItem(int badgeIndex, int badgeText, int badgeColor, int badgeTextColor, int badgeTextSize) {
        this(badgeIndex, badgeText, badgeColor, badgeTextColor, badgeTextSize,null);
    }

    int getBadgeTextSize() {
        return badgeTextSize;
    }

    int getBadgeTextColor() {
        return badgeTextColor;
    }

    Typeface getBadgeFont() {
        return badgeFont;
    }

    int getBadgeIndex() {
        return badgeIndex;
    }

    int getBadgeColor() {
        return badgeColor;
    }

    int getIntBadgeText() {
        return badgeText;
    }

    String getFullBadgeText() {
        return String.valueOf(badgeText);
    }

    String getBadgeText() {
        String badgeStringText;
        if (badgeText > BADGE_TEXT_MAX_NUMBER) {
            badgeStringText = "+" + BADGE_TEXT_MAX_NUMBER;
        } else {
            badgeStringText = String.valueOf(badgeText);
        }

        return badgeStringText;
    }
}
