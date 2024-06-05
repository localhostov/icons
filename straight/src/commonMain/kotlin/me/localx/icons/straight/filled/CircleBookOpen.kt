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

public val Icons.Filled.CircleBookOpen: ImageVector
    get() {
        if (_circleBookOpen != null) {
            return _circleBookOpen!!
        }
        _circleBookOpen = Builder(name = "CircleBookOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 8.727f)
                verticalLineToRelative(6.086f)
                lineToRelative(-3.0f, 0.86f)
                verticalLineToRelative(-6.256f)
                curveToRelative(0.0f, -0.463f, 0.312f, -0.877f, 0.757f, -1.006f)
                lineToRelative(1.316f, -0.381f)
                curveToRelative(0.221f, -0.064f, 0.453f, -0.021f, 0.637f, 0.117f)
                curveToRelative(0.185f, 0.138f, 0.29f, 0.35f, 0.29f, 0.58f)
                close()
                moveTo(10.243f, 8.411f)
                lineToRelative(-1.316f, -0.381f)
                curveToRelative(-0.223f, -0.064f, -0.453f, -0.021f, -0.637f, 0.117f)
                curveToRelative(-0.185f, 0.138f, -0.29f, 0.35f, -0.29f, 0.58f)
                verticalLineToRelative(6.086f)
                lineToRelative(3.0f, 0.86f)
                verticalLineToRelative(-6.256f)
                curveToRelative(0.0f, -0.463f, -0.312f, -0.877f, -0.757f, -1.006f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(18.0f, 8.727f)
                curveToRelative(0.0f, -0.865f, -0.396f, -1.659f, -1.088f, -2.179f)
                curveToRelative(-0.691f, -0.52f, -1.563f, -0.679f, -2.396f, -0.439f)
                lineToRelative(-1.316f, 0.381f)
                curveToRelative(-0.456f, 0.132f, -0.863f, 0.367f, -1.2f, 0.674f)
                curveToRelative(-0.337f, -0.307f, -0.744f, -0.542f, -1.2f, -0.674f)
                lineToRelative(-1.316f, -0.381f)
                curveToRelative(-0.833f, -0.239f, -1.704f, -0.081f, -2.396f, 0.439f)
                curveToRelative(-0.691f, 0.52f, -1.088f, 1.313f, -1.088f, 2.179f)
                verticalLineToRelative(7.594f)
                lineToRelative(6.0f, 1.72f)
                lineToRelative(6.0f, -1.72f)
                verticalLineToRelative(-7.594f)
                close()
            }
        }
        .build()
        return _circleBookOpen!!
    }

private var _circleBookOpen: ImageVector? = null
