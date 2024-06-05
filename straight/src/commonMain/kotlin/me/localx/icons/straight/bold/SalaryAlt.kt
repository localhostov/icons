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

public val Icons.Bold.SalaryAlt: ImageVector
    get() {
        if (_salaryAlt != null) {
            return _salaryAlt!!
        }
        _salaryAlt = Builder(name = "SalaryAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.629f, 8.996f)
                lineToRelative(-2.629f, -2.587f)
                verticalLineToRelative(-2.908f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(7.5f, 0.001f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2.867f)
                lineToRelative(-2.61f, 2.615f)
                curveTo(0.508f, 9.826f, 0.002f, 11.011f, 0.002f, 12.231f)
                lineToRelative(-0.002f, 11.769f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-11.769f)
                curveToRelative(0.0f, -1.222f, -0.505f, -2.407f, -1.371f, -3.236f)
                close()
                moveTo(7.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(8.566f)
                lineToRelative(-2.228f, 2.228f)
                curveToRelative(0.145f, -0.443f, 0.228f, -0.889f, 0.228f, -1.293f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.381f, 0.078f, 0.798f, 0.207f, 1.214f)
                lineToRelative(-2.207f, -2.208f)
                lineTo(7.0f, 3.5f)
                close()
                moveTo(3.0f, 21.0f)
                lineToRelative(0.002f, -8.75f)
                lineToRelative(5.14f, 5.14f)
                curveToRelative(1.037f, 1.036f, 2.418f, 1.606f, 3.889f, 1.606f)
                reflectiveCurveToRelative(2.852f, -0.571f, 3.889f, -1.608f)
                lineToRelative(5.081f, -5.081f)
                verticalLineToRelative(8.692f)
                lineTo(3.0f, 20.999f)
                close()
                moveTo(9.5f, 8.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.0f, 6.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _salaryAlt!!
    }

private var _salaryAlt: ImageVector? = null
