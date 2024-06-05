package me.localx.icons.straight.bold

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

public val Icons.Bold.TruckCheck: ImageVector
    get() {
        if (_truckCheck != null) {
            return _truckCheck!!
        }
        _truckCheck = Builder(name = "TruckCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.189f, 7.404f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-3.793f, 3.793f)
                curveToRelative(-0.487f, 0.486f, -1.128f, 0.73f, -1.768f, 0.73f)
                reflectiveCurveToRelative(-1.28f, -0.244f, -1.767f, -0.73f)
                lineToRelative(-2.294f, -2.293f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.939f, 1.939f)
                lineToRelative(3.439f, -3.439f)
                close()
                moveTo(24.0f, 20.0f)
                horizontalLineToRelative(-3.061f)
                curveToRelative(0.034f, 0.162f, 0.061f, 0.327f, 0.061f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.173f, 0.027f, -0.338f, 0.061f, -0.5f)
                lineTo(7.939f, 20.0f)
                curveToRelative(0.034f, 0.162f, 0.061f, 0.327f, 0.061f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.173f, 0.027f, -0.338f, 0.061f, -0.5f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 4.5f)
                curveTo(0.0f, 2.57f, 1.57f, 1.0f, 3.5f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(14.0f, 4.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 4.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(11.0f)
                lineTo(14.0f, 4.5f)
                close()
                moveTo(17.0f, 8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _truckCheck!!
    }

private var _truckCheck: ImageVector? = null
