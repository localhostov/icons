package me.localx.icons.rounded.filled

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

public val Icons.Filled.EmployeeManAlt: ImageVector
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
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(8.691f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(14.714f, 14.42f)
                lineToRelative(-1.843f, 2.77f)
                lineToRelative(1.86f, 6.81f)
                horizontalLineToRelative(5.269f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -4.017f, -2.646f, -7.426f, -6.286f, -8.58f)
                close()
                moveTo(11.128f, 17.19f)
                lineToRelative(-1.843f, -2.77f)
                curveToRelative(-3.64f, 1.154f, -6.286f, 4.563f, -6.286f, 8.58f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(5.269f)
                lineToRelative(1.86f, -6.81f)
                close()
            }
        }
        .build()
        return _employeeManAlt!!
    }

private var _employeeManAlt: ImageVector? = null
