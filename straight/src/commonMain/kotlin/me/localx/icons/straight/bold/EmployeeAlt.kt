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

public val Icons.Bold.EmployeeAlt: ImageVector
    get() {
        if (_employeeAlt != null) {
            return _employeeAlt!!
        }
        _employeeAlt = Builder(name = "EmployeeAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 14.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-4.0f)
                reflectiveCurveToRelative(2.0f, 0.0f, 2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(10.026f, 14.0f)
                curveToRelative(-0.635f, 0.838f, -1.026f, 1.87f, -1.026f, 3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(5.026f)
                close()
                moveTo(4.626f, 12.0f)
                curveToRelative(-1.231f, 0.181f, -2.38f, 0.661f, -3.358f, 1.381f)
                curveToRelative(0.006f, -0.026f, 0.004f, -0.052f, 0.011f, -0.078f)
                lineToRelative(1.371f, -7.57f)
                curveTo(3.146f, 2.46f, 5.921f, 0.0f, 9.126f, 0.0f)
                reflectiveCurveToRelative(5.979f, 2.46f, 6.477f, 5.732f)
                lineToRelative(0.774f, 4.268f)
                horizontalLineToRelative(-0.376f)
                curveToRelative(-0.975f, 0.0f, -1.858f, 0.365f, -2.553f, 0.947f)
                lineToRelative(-0.805f, -4.734f)
                curveToRelative(-0.159f, -1.103f, -0.802f, -2.055f, -1.666f, -2.631f)
                curveToRelative(-1.228f, 1.135f, -3.704f, 2.418f, -4.849f, 2.418f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.57f, 0.0f, 1.326f, -0.18f, 1.826f, -0.579f)
                lineToRelative(0.525f, 3.085f)
                curveToRelative(-0.724f, 0.311f, -1.515f, 0.495f, -2.351f, 0.495f)
                horizontalLineToRelative(-4.5f)
                close()
            }
        }
        .build()
        return _employeeAlt!!
    }

private var _employeeAlt: ImageVector? = null
