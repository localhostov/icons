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

public val Icons.Bold.SmartHomeAlt: ImageVector
    get() {
        if (_smartHomeAlt != null) {
            return _smartHomeAlt!!
        }
        _smartHomeAlt = Builder(name = "SmartHomeAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.89f, 6.255f)
                lineTo(15.39f, 1.168f)
                curveToRelative(-1.996f, -1.561f, -4.783f, -1.561f, -6.779f, 0.0f)
                lineTo(2.11f, 6.255f)
                curveToRelative(-1.341f, 1.05f, -2.11f, 2.628f, -2.11f, 4.332f)
                verticalLineToRelative(7.9f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                verticalLineToRelative(-7.9f)
                curveToRelative(0.0f, -1.704f, -0.769f, -3.282f, -2.11f, -4.332f)
                close()
                moveTo(21.0f, 18.487f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 20.987f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-7.9f)
                curveToRelative(0.0f, -0.774f, 0.35f, -1.492f, 0.959f, -1.969f)
                lineToRelative(6.5f, -5.087f)
                curveToRelative(0.454f, -0.355f, 0.998f, -0.532f, 1.541f, -0.532f)
                reflectiveCurveToRelative(1.087f, 0.177f, 1.541f, 0.532f)
                lineToRelative(6.5f, 5.087f)
                curveToRelative(0.609f, 0.477f, 0.959f, 1.194f, 0.959f, 1.969f)
                verticalLineToRelative(7.9f)
                close()
                moveTo(16.796f, 9.404f)
                curveToRelative(0.755f, 1.002f, 1.204f, 2.247f, 1.204f, 3.596f)
                curveToRelative(0.0f, 3.548f, -3.095f, 6.386f, -6.727f, 5.957f)
                curveToRelative(-2.618f, -0.31f, -4.788f, -2.389f, -5.197f, -4.993f)
                curveToRelative(-0.265f, -1.692f, 0.183f, -3.277f, 1.089f, -4.506f)
                curveToRelative(0.581f, -0.789f, 1.836f, -0.382f, 1.836f, 0.599f)
                verticalLineToRelative(2.944f)
                curveToRelative(0.0f, 1.85f, 1.683f, 3.314f, 3.598f, 2.942f)
                curveToRelative(1.424f, -0.277f, 2.402f, -1.609f, 2.402f, -3.06f)
                verticalLineToRelative(-2.834f)
                curveToRelative(0.0f, -0.95f, 1.224f, -1.403f, 1.796f, -0.644f)
                close()
                moveTo(10.5f, 12.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _smartHomeAlt!!
    }

private var _smartHomeAlt: ImageVector? = null
