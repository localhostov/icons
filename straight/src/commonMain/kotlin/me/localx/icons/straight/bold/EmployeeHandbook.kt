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

public val Icons.Bold.EmployeeHandbook: ImageVector
    get() {
        if (_employeeHandbook != null) {
            return _employeeHandbook!!
        }
        _employeeHandbook = Builder(name = "EmployeeHandbook", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 4.352f)
                verticalLineToRelative(16.524f)
                lineToRelative(-12.0f, 2.182f)
                lineTo(0.0f, 20.876f)
                lineTo(0.0f, 4.352f)
                curveToRelative(0.0f, -1.014f, 0.446f, -1.968f, 1.225f, -2.617f)
                curveToRelative(0.778f, -0.649f, 1.797f, -0.915f, 2.794f, -0.737f)
                lineToRelative(5.898f, 1.073f)
                curveToRelative(0.796f, 0.145f, 1.508f, 0.499f, 2.083f, 1.0f)
                curveToRelative(0.576f, -0.501f, 1.288f, -0.855f, 2.083f, -1.0f)
                lineToRelative(5.898f, -1.072f)
                curveToRelative(0.998f, -0.18f, 2.016f, 0.088f, 2.794f, 0.737f)
                curveToRelative(0.778f, 0.649f, 1.225f, 1.604f, 1.225f, 2.617f)
                close()
                moveTo(10.5f, 6.363f)
                curveToRelative(0.0f, -0.659f, -0.471f, -1.224f, -1.12f, -1.342f)
                lineToRelative(-5.898f, -1.072f)
                curveToRelative(-0.167f, -0.028f, -0.281f, 0.042f, -0.335f, 0.089f)
                curveToRelative(-0.067f, 0.056f, -0.147f, 0.156f, -0.147f, 0.314f)
                verticalLineToRelative(14.02f)
                lineToRelative(7.5f, 1.364f)
                lineTo(10.5f, 6.363f)
                close()
                moveTo(21.0f, 4.352f)
                curveToRelative(0.0f, -0.158f, -0.08f, -0.258f, -0.147f, -0.314f)
                curveToRelative(-0.055f, -0.046f, -0.171f, -0.121f, -0.335f, -0.088f)
                lineToRelative(-5.898f, 1.072f)
                curveToRelative(-0.648f, 0.118f, -1.12f, 0.683f, -1.12f, 1.342f)
                verticalLineToRelative(13.373f)
                lineToRelative(7.5f, -1.364f)
                lineTo(21.0f, 4.352f)
                close()
                moveTo(5.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _employeeHandbook!!
    }

private var _employeeHandbook: ImageVector? = null
