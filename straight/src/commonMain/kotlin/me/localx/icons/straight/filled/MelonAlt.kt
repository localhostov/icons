package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.MelonAlt: ImageVector
    get() {
        if (_melonAlt != null) {
            return _melonAlt!!
        }
        _melonAlt = Builder(name = "MelonAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.03f, 2.994f)
                curveToRelative(0.13f, 0.162f, 0.313f, 1.14f, -1.049f, 3.584f)
                curveToRelative(-2.646f, 4.744f, -8.658f, 10.756f, -13.403f, 13.402f)
                curveToRelative(-2.495f, 1.391f, -3.467f, 1.168f, -3.596f, 1.039f)
                curveToRelative(-0.129f, -0.13f, -0.354f, -1.1f, 1.039f, -3.597f)
                curveToRelative(2.646f, -4.745f, 8.658f, -10.757f, 13.403f, -13.402f)
                curveToRelative(1.687f, -0.94f, 2.666f, -1.117f, 3.177f, -1.133f)
                curveToRelative(0.353f, -0.011f, 0.425f, 0.102f, 0.429f, 0.106f)
                close()
                moveTo(2.273f, 16.448f)
                curveToRelative(2.798f, -5.019f, 9.157f, -11.377f, 14.175f, -14.175f)
                curveToRelative(0.808f, -0.45f, 1.541f, -0.782f, 2.213f, -1.017f)
                curveTo(14.256f, -1.089f, 8.255f, -0.08f, 4.087f, 4.087f)
                curveTo(-0.08f, 8.255f, -1.09f, 14.257f, 1.256f, 18.662f)
                curveToRelative(0.236f, -0.672f, 0.567f, -1.406f, 1.017f, -2.214f)
                close()
                moveTo(22.747f, 5.33f)
                curveToRelative(-0.236f, 0.674f, -0.568f, 1.41f, -1.02f, 2.222f)
                curveToRelative(-2.797f, 5.018f, -9.156f, 11.377f, -14.175f, 14.175f)
                curveToRelative(-0.809f, 0.451f, -1.546f, 0.787f, -2.219f, 1.023f)
                curveToRelative(1.552f, 0.827f, 3.3f, 1.242f, 5.101f, 1.242f)
                curveToRelative(3.308f, 0.0f, 6.78f, -1.38f, 9.479f, -4.08f)
                curveToRelative(2.391f, -2.39f, 3.831f, -5.453f, 4.058f, -8.624f)
                curveToRelative(0.154f, -2.168f, -0.281f, -4.204f, -1.223f, -5.959f)
                close()
            }
        }
        .build()
        return _melonAlt!!
    }

private var _melonAlt: ImageVector? = null
