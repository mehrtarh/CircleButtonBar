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

import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;

import java.io.Serializable;

@SuppressWarnings("unused")
public class CircleItem implements Serializable {

    private String itemName;
    private int itemIcon;
    private int itemSelectedColor;
    private int itemSelectedIcon;

    public CircleItem(String itemName, int itemIcon) {
        this(itemName, itemIcon, 0);
    }

    public CircleItem(String itemName, int itemIcon, @ColorInt int itemSelectedColor) {
        this(itemName, itemIcon, itemSelectedColor, 0);
    }

    public CircleItem(String itemName, int itemIcon, @ColorInt int itemSelectedColor, @DrawableRes int itemSelectedIcon) {
        this.itemName = itemName;
        this.itemIcon = itemIcon;
        this.itemSelectedColor = itemSelectedColor;
        this.itemSelectedIcon = itemSelectedIcon;
    }

    String getItemName() {
        return itemName;
    }

    void setItemName(String itemName) {
        this.itemName = itemName;
    }

    int getItemIcon() {
        return itemIcon;
    }

    void setItemIcon(int itemIcon) {
        this.itemIcon = itemIcon;
    }

    int getItemSelectedColor() {
        return itemSelectedColor;
    }

    void setItemSelectedColor(int itemIcon) {
        this.itemSelectedColor = itemIcon;
    }

    public int getItemSelectedIcon() {
        return itemSelectedIcon;
    }
}
