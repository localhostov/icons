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
                verticalLineToRelative(6.269f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                lineTo(5.001f, 24.001f)
                curveTo(2.239f, 24.0f, 0.0f, 21.761f, 0.0f, 18.999f)
                verticalLineToRelative(-6.268f)
                curveToRelative(0.001f, -0.74f, 0.224f, -1.457f, 0.605f, -2.081f)
                lineToRelative(7.888f, 7.889f)
                curveToRelative(1.094f, 1.093f, 2.609f, 1.616f, 4.183f, 1.42f)
                curveToRelative(1.153f, -0.143f, 2.205f, -0.738f, 3.027f, -1.56f)
                lineToRelative(7.714f, -7.714f)
                close()
                moveTo(20.0f, 11.244f)
                lineToRelative(-5.849f, 5.88f)
                curveToRelative(-1.131f, 1.131f, -3.112f, 1.129f, -4.243f, 0.0f)
                lineToRelative(-5.908f, -5.948f)
                verticalLineToRelative(-6.177f)
                curveTo(4.0f, 2.239f, 6.239f, 0.0f, 9.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                verticalLineToRelative(6.244f)
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
