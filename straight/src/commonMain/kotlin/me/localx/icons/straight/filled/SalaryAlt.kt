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

public val Icons.Filled.SalaryAlt: ImageVector
    get() {
        if (_salaryAlt != null) {
            return _salaryAlt!!
        }
        _salaryAlt = Builder(name = "SalaryAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.418f, 10.686f)
                curveToRelative(0.365f, 0.614f, 0.582f, 1.318f, 0.582f, 2.046f)
                verticalLineToRelative(11.269f)
                lineTo(0.0f, 24.001f)
                lineToRelative(0.002f, -11.269f)
                curveToRelative(0.0f, -0.74f, 0.223f, -1.457f, 0.604f, -2.081f)
                lineToRelative(7.888f, 7.889f)
                curveToRelative(0.943f, 0.942f, 2.199f, 1.46f, 3.536f, 1.46f)
                reflectiveCurveToRelative(2.592f, -0.519f, 3.535f, -1.461f)
                lineToRelative(7.853f, -7.853f)
                close()
                moveTo(20.0f, 11.244f)
                lineToRelative(-5.849f, 5.88f)
                curveToRelative(-1.131f, 1.131f, -3.112f, 1.129f, -4.243f, 0.0f)
                lineToRelative(-5.908f, -5.948f)
                lineTo(4.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(8.244f)
                close()
                moveTo(8.5f, 6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(15.5f, 11.5f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.567f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.567f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
                close()
                moveTo(17.0f, 4.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _salaryAlt!!
    }

private var _salaryAlt: ImageVector? = null
