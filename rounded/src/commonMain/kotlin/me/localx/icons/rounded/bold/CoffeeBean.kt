package me.localx.icons.rounded.bold

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

public val Icons.Bold.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) {
            return _coffeeBean!!
        }
        _coffeeBean = Builder(name = "CoffeeBean", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.222f, 2.778f)
                curveTo(16.993f, -1.45f, 9.417f, -0.753f, 4.333f, 4.333f)
                curveTo(-0.752f, 9.418f, -1.449f, 16.994f, 2.778f, 21.222f)
                curveToRelative(1.859f, 1.859f, 4.365f, 2.766f, 7.023f, 2.766f)
                curveToRelative(3.386f, 0.0f, 7.017f, -1.472f, 9.865f, -4.32f)
                curveToRelative(5.085f, -5.085f, 5.782f, -12.661f, 1.555f, -16.889f)
                close()
                moveTo(3.05f, 13.256f)
                curveToRelative(0.258f, -2.448f, 1.467f, -4.864f, 3.404f, -6.802f)
                reflectiveCurveToRelative(4.354f, -3.146f, 6.802f, -3.404f)
                curveToRelative(0.32f, -0.034f, 0.635f, -0.051f, 0.944f, -0.051f)
                curveToRelative(1.612f, 0.0f, 3.061f, 0.46f, 4.219f, 1.322f)
                curveToRelative(-0.298f, 1.227f, -1.579f, 4.595f, -6.866f, 6.247f)
                curveToRelative(-4.742f, 1.481f, -7.005f, 4.17f, -8.082f, 6.28f)
                curveToRelative(-0.404f, -1.076f, -0.558f, -2.291f, -0.421f, -3.593f)
                close()
                moveTo(20.95f, 10.744f)
                curveToRelative(-0.258f, 2.448f, -1.467f, 4.864f, -3.404f, 6.802f)
                reflectiveCurveToRelative(-4.354f, 3.146f, -6.802f, 3.404f)
                curveToRelative(-1.989f, 0.211f, -3.784f, -0.243f, -5.163f, -1.27f)
                curveToRelative(0.297f, -1.226f, 1.578f, -4.596f, 6.867f, -6.249f)
                curveToRelative(4.742f, -1.481f, 7.005f, -4.17f, 8.082f, -6.28f)
                curveToRelative(0.404f, 1.076f, 0.558f, 2.291f, 0.421f, 3.593f)
                close()
            }
        }
        .build()
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
