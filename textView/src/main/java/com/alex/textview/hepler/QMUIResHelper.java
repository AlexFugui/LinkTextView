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

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/**
 * @author cginechen
 * @date 2016-09-22
 */
public class QMUIResHelper {
    private static TypedValue sTmpValue;

    public static float getAttrFloatValue(Context context, int attr) {
        return getAttrFloatValue(context.getTheme(), attr);
    }

    public static float getAttrFloatValue(Resources.Theme theme, int attr) {
        if (sTmpValue == null) {
            sTmpValue = new TypedValue();
        }
        if (!theme.resolveAttribute(attr, sTmpValue, true)) {
            return 0;
        }
        return sTmpValue.getFloat();
    }

    public static int getAttrDimen(Context context, int attrRes) {
        if (sTmpValue == null) {
            sTmpValue = new TypedValue();
        }
        if (!context.getTheme().resolveAttribute(attrRes, sTmpValue, true)) {
            return 0;
        }
        return TypedValue.complexToDimensionPixelSize(sTmpValue.data, context.getResources().getDisplayMetrics());
    }
}
