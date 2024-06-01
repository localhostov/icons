package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.CircleSmall: ImageVector
    get() {
        if (_circleSmall != null) {
            return _circleSmall!!
        }
        _circleSmall = Builder(name = "CircleSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 5.0001f)
                curveTo(10.6157f, 5.0001f, 9.2623f, 5.4107f, 8.1111f, 6.1798f)
                curveTo(6.96f, 6.949f, 6.0628f, 8.0422f, 5.533f, 9.3213f)
                curveTo(5.0032f, 10.6004f, 4.8645f, 12.0079f, 5.1346f, 13.3658f)
                curveTo(5.4047f, 14.7236f, 6.0714f, 15.9709f, 7.0504f, 16.9499f)
                curveTo(8.0294f, 17.9288f, 9.2766f, 18.5955f, 10.6345f, 18.8656f)
                curveTo(11.9924f, 19.1357f, 13.3998f, 18.9971f, 14.6789f, 18.4673f)
                curveTo(15.958f, 17.9375f, 17.0512f, 17.0403f, 17.8204f, 15.8891f)
                curveTo(18.5896f, 14.738f, 19.0001f, 13.3846f, 19.0001f, 12.0001f)
                curveTo(19.0001f, 10.1436f, 18.2626f, 8.3631f, 16.9499f, 7.0504f)
                curveTo(15.6371f, 5.7376f, 13.8566f, 5.0001f, 12.0001f, 5.0001f)
                close()
                moveTo(12.0001f, 17.0001f)
                curveTo(11.0112f, 17.0001f, 10.0445f, 16.7069f, 9.2223f, 16.1575f)
                curveTo(8.4f, 15.6081f, 7.7592f, 14.8272f, 7.3807f, 13.9135f)
                curveTo(7.0023f, 12.9999f, 6.9033f, 11.9946f, 7.0962f, 11.0247f)
                curveTo(7.2891f, 10.0548f, 7.7653f, 9.1638f, 8.4646f, 8.4646f)
                curveTo(9.1638f, 7.7653f, 10.0548f, 7.2891f, 11.0247f, 7.0962f)
                curveTo(11.9946f, 6.9033f, 12.9999f, 7.0023f, 13.9135f, 7.3807f)
                curveTo(14.8272f, 7.7592f, 15.6081f, 8.4f, 16.1575f, 9.2223f)
                curveTo(16.7069f, 10.0445f, 17.0001f, 11.0112f, 17.0001f, 12.0001f)
                curveTo(17.0001f, 13.3262f, 16.4733f, 14.598f, 15.5357f, 15.5357f)
                curveTo(14.598f, 16.4733f, 13.3262f, 17.0001f, 12.0001f, 17.0001f)
                close()
            }
        }
        .build()
        return _circleSmall!!
    }

private var _circleSmall: ImageVector? = null
