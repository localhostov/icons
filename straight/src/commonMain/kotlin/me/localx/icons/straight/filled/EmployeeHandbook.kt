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

public val Icons.Filled.EmployeeHandbook: ImageVector
    get() {
        if (_employeeHandbook != null) {
            return _employeeHandbook!!
        }
        _employeeHandbook = Builder(name = "EmployeeHandbook", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.922f, 1.7f)
                curveToRelative(-0.7f, -0.58f, -1.624f, -0.814f, -2.516f, -0.636f)
                lineToRelative(-4.122f, 1.0f)
                curveToRelative(-1.902f, 0.346f, -3.284f, 2.003f, -3.284f, 3.936f)
                verticalLineToRelative(14.8f)
                lineToRelative(-1.0f, 0.181f)
                lineToRelative(-1.0f, -0.181f)
                lineTo(11.0f, 6.0f)
                curveToRelative(0.008f, -1.913f, -1.348f, -3.561f, -3.227f, -3.923f)
                lineTo(3.536f, 1.049f)
                curveTo(1.906f, 0.753f, 0.344f, 1.834f, 0.048f, 3.464f)
                curveToRelative(-0.032f, 0.177f, -0.048f, 0.356f, -0.048f, 0.535f)
                verticalLineToRelative(16.834f)
                lineToRelative(12.0f, 2.183f)
                lineToRelative(12.0f, -2.183f)
                lineTo(24.0f, 4.0f)
                curveToRelative(0.0f, -0.889f, -0.395f, -1.731f, -1.078f, -2.3f)
                close()
                moveTo(6.5f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(6.5f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _employeeHandbook!!
    }

private var _employeeHandbook: ImageVector? = null
