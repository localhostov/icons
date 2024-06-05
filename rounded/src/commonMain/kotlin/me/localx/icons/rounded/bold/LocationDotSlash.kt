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

public val Icons.Bold.LocationDotSlash: ImageVector
    get() {
        if (_locationDotSlash != null) {
            return _locationDotSlash!!
        }
        _locationDotSlash = Builder(name = "LocationDotSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.561f, 21.439f)
                lineToRelative(-3.207f, -3.207f)
                curveToRelative(3.703f, -4.334f, 3.512f, -10.891f, -0.573f, -14.994f)
                curveTo(17.703f, 1.149f, 14.94f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-2.67f, 0.0f, -5.194f, 0.948f, -7.192f, 2.687f)
                lineTo(2.561f, 0.439f)
                curveTo(1.975f, -0.146f, 1.025f, -0.146f, 0.439f, 0.439f)
                reflectiveCurveTo(-0.146f, 1.975f, 0.439f, 2.561f)
                lineTo(21.439f, 23.561f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                close()
                moveTo(18.223f, 16.101f)
                lineToRelative(-2.802f, -2.802f)
                curveToRelative(0.416f, -0.639f, 0.658f, -1.402f, 0.658f, -2.221f)
                curveToRelative(0.0f, -2.253f, -1.826f, -4.079f, -4.079f, -4.079f)
                curveToRelative(-0.819f, 0.0f, -1.582f, 0.242f, -2.221f, 0.658f)
                lineToRelative(-2.842f, -2.842f)
                curveToRelative(1.425f, -1.176f, 3.196f, -1.815f, 5.064f, -1.815f)
                curveToRelative(2.136f, 0.0f, 4.144f, 0.836f, 5.654f, 2.354f)
                curveToRelative(2.92f, 2.934f, 3.11f, 7.589f, 0.568f, 10.747f)
                close()
                moveTo(15.32f, 21.281f)
                curveToRelative(0.394f, 0.729f, 0.123f, 1.639f, -0.605f, 2.033f)
                curveToRelative(-0.829f, 0.448f, -1.768f, 0.686f, -2.714f, 0.686f)
                curveToRelative(-1.506f, 0.0f, -2.928f, -0.583f, -4.004f, -1.641f)
                lineToRelative(-3.734f, -3.465f)
                curveTo(1.85f, 16.473f, 0.7f, 13.187f, 1.065f, 9.837f)
                curveToRelative(0.09f, -0.823f, 0.834f, -1.416f, 1.654f, -1.328f)
                curveToRelative(0.824f, 0.09f, 1.418f, 0.83f, 1.329f, 1.654f)
                curveToRelative(-0.267f, 2.442f, 0.571f, 4.839f, 2.297f, 6.573f)
                lineToRelative(3.723f, 3.454f)
                curveToRelative(0.884f, 0.868f, 2.204f, 1.033f, 3.218f, 0.485f)
                curveToRelative(0.729f, -0.396f, 1.639f, -0.123f, 2.033f, 0.605f)
                close()
            }
        }
        .build()
        return _locationDotSlash!!
    }

private var _locationDotSlash: ImageVector? = null
