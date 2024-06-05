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

public val Icons.Bold.Payroll: ImageVector
    get() {
        if (_payroll != null) {
            return _payroll!!
        }
        _payroll = Builder(name = "Payroll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.607f, 8.976f)
                lineToRelative(-1.607f, -1.52f)
                verticalLineToRelative(-2.456f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(2.458f)
                lineToRelative(-1.61f, 1.524f)
                curveTo(0.508f, 9.826f, 0.002f, 11.01f, 0.002f, 12.231f)
                lineToRelative(-0.002f, 11.769f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-11.769f)
                curveToRelative(0.0f, -1.223f, -0.505f, -2.407f, -1.393f, -3.256f)
                close()
                moveTo(17.5f, 7.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(6.5f, 7.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3.0f, 21.0f)
                lineToRelative(0.002f, -8.721f)
                lineToRelative(5.11f, 5.111f)
                curveToRelative(1.037f, 1.036f, 2.418f, 1.606f, 3.888f, 1.606f)
                reflectiveCurveToRelative(2.853f, -0.571f, 3.89f, -1.608f)
                lineToRelative(5.11f, -5.111f)
                verticalLineToRelative(8.722f)
                lineTo(3.0f, 20.999f)
                close()
                moveTo(20.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                lineTo(4.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _payroll!!
    }

private var _payroll: ImageVector? = null
