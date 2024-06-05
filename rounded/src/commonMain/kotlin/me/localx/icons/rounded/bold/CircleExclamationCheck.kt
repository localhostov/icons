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

public val Icons.Bold.CircleExclamationCheck: ImageVector
    get() {
        if (_circleExclamationCheck != null) {
            return _circleExclamationCheck!!
        }
        _circleExclamationCheck = Builder(name = "CircleExclamationCheck", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.5f, 11.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(8.5f, 15.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(14.116f, 17.662f)
                curveToRelative(-1.201f, 0.875f, -2.625f, 1.338f, -4.116f, 1.338f)
                curveToRelative(-3.859f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                curveToRelative(2.744f, 0.0f, 5.249f, 1.616f, 6.382f, 4.118f)
                curveToRelative(0.341f, 0.755f, 1.23f, 1.089f, 1.984f, 0.748f)
                curveToRelative(0.755f, -0.341f, 1.09f, -1.229f, 0.748f, -1.984f)
                curveToRelative(-1.616f, -3.573f, -5.194f, -5.882f, -9.114f, -5.882f)
                curveTo(4.486f, 2.0f, 0.0f, 6.486f, 0.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.131f, 0.0f, 4.165f, -0.662f, 5.884f, -1.914f)
                curveToRelative(0.669f, -0.487f, 0.816f, -1.426f, 0.328f, -2.096f)
                curveToRelative(-0.487f, -0.669f, -1.427f, -0.817f, -2.096f, -0.328f)
                close()
                moveTo(23.582f, 9.961f)
                curveToRelative(-0.575f, -0.599f, -1.524f, -0.617f, -2.121f, -0.043f)
                lineToRelative(-3.014f, 2.896f)
                curveToRelative(-0.245f, 0.247f, -0.647f, 0.246f, -0.938f, -0.043f)
                lineToRelative(-1.492f, -1.375f)
                curveToRelative(-0.607f, -0.561f, -1.558f, -0.521f, -2.12f, 0.087f)
                curveToRelative(-0.561f, 0.609f, -0.522f, 1.559f, 0.087f, 2.12f)
                lineToRelative(1.448f, 1.332f)
                curveToRelative(0.711f, 0.711f, 1.646f, 1.065f, 2.576f, 1.065f)
                curveToRelative(0.924f, 0.0f, 1.845f, -0.35f, 2.539f, -1.044f)
                lineToRelative(2.992f, -2.875f)
                curveToRelative(0.598f, -0.574f, 0.616f, -1.524f, 0.043f, -2.121f)
                close()
            }
        }
        .build()
        return _circleExclamationCheck!!
    }

private var _circleExclamationCheck: ImageVector? = null
