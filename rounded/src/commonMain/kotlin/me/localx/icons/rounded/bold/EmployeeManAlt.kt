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

public val Icons.Bold.EmployeeManAlt: ImageVector
    get() {
        if (_employeeManAlt != null) {
            return _employeeManAlt!!
        }
        _employeeManAlt = Builder(name = "EmployeeManAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(15.309f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(20.972f, 22.401f)
                curveToRelative(0.055f, 0.827f, -0.471f, 1.599f, -1.499f, 1.599f)
                curveToRelative(-0.783f, 0.0f, -1.442f, -0.608f, -1.495f, -1.401f)
                curveToRelative(-0.165f, -2.507f, -1.876f, -4.577f, -4.159f, -5.31f)
                lineToRelative(-0.944f, 1.417f)
                lineToRelative(1.093f, 3.99f)
                curveToRelative(0.183f, 0.666f, -0.405f, 1.305f, -1.201f, 1.305f)
                horizontalLineToRelative(-1.532f)
                curveToRelative(-0.796f, 0.0f, -1.383f, -0.639f, -1.201f, -1.305f)
                lineToRelative(1.093f, -3.99f)
                lineToRelative(-0.944f, -1.417f)
                curveToRelative(-2.284f, 0.733f, -3.994f, 2.803f, -4.16f, 5.311f)
                curveToRelative(-0.055f, 0.826f, -0.767f, 1.456f, -1.596f, 1.397f)
                curveToRelative(-0.827f, -0.055f, -1.452f, -0.769f, -1.397f, -1.596f)
                curveToRelative(0.311f, -4.71f, 4.252f, -8.401f, 8.971f, -8.401f)
                reflectiveCurveToRelative(8.66f, 3.69f, 8.972f, 8.401f)
                close()
            }
        }
        .build()
        return _employeeManAlt!!
    }

private var _employeeManAlt: ImageVector? = null
