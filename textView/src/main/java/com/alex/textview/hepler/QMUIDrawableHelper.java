/*
 * Tencent is pleased to support the open source community by making QMUI_Android available.
 *
 * Copyright (C) 2017-2018 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the MIT License (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://opensource.org/licenses/MIT
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alex.textview.hepler;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;

import androidx.annotation.ColorInt;
import androidx.core.graphics.drawable.DrawableCompat;

/**
 * @author cginechen
 * @date 2016-03-17
 */
public class QMUIDrawableHelper {

    /**
     * 设置Drawable的颜色
     * <b>这里不对Drawable进行mutate()，会影响到所有用到这个Drawable的地方，如果要避免，请先自行mutate()</b>
     *
     * please use {@link DrawableCompat#setTint(Drawable, int)} replace this.
     */
    @Deprecated
    public static ColorFilter setDrawableTintColor(Drawable drawable, @ColorInt int tintColor) {
        LightingColorFilter colorFilter = new LightingColorFilter(Color.argb(255, 0, 0, 0), tintColor);
        if(drawable != null){
            drawable.setColorFilter(colorFilter);
        }
        return colorFilter;
    }
}
