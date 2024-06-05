package me.localx.icons.rounded.outline

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

public val Icons.Outline.EmployeeManAlt: ImageVector
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
                moveTo(12.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(21.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -3.019f, -1.925f, -5.59f, -4.609f, -6.57f)
                lineToRelative(-1.517f, 2.276f)
                lineToRelative(1.093f, 3.99f)
                curveToRelative(0.183f, 0.666f, -0.405f, 1.305f, -1.201f, 1.305f)
                horizontalLineToRelative(-1.532f)
                curveToRelative(-0.796f, 0.0f, -1.383f, -0.639f, -1.201f, -1.305f)
                lineToRelative(1.093f, -3.99f)
                lineToRelative(-1.517f, -2.276f)
                curveToRelative(-2.684f, 0.98f, -4.609f, 3.551f, -4.609f, 6.571f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -4.962f, 4.038f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _employeeManAlt!!
    }

private var _employeeManAlt: ImageVector? = null
