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

public val Icons.Filled.Employees: ImageVector
    get() {
        if (_employees != null) {
            return _employees!!
        }
        _employees = Builder(name = "Employees", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 16.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveTo(9.794f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(5.5f, 16.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(11.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.629f, -1.3f, -2.947f, -2.918f, -2.992f)
                lineToRelative(-2.582f, 2.992f)
                lineToRelative(-2.621f, -2.988f)
                curveToRelative(-1.6f, 0.065f, -2.879f, 1.372f, -2.879f, 2.988f)
                verticalLineToRelative(3.0f)
                moveToRelative(24.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.629f, -1.3f, -2.947f, -2.918f, -2.992f)
                lineToRelative(-2.582f, 2.992f)
                lineToRelative(-2.621f, -2.988f)
                curveToRelative(-1.6f, 0.065f, -2.879f, 1.372f, -2.879f, 2.988f)
                verticalLineToRelative(3.0f)
            }
        }
        .build()
        return _employees!!
    }

private var _employees: ImageVector? = null
