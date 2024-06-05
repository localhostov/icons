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

public val Icons.Filled.Payroll: ImageVector
    get() {
        if (_payroll != null) {
            return _payroll!!
        }
        _payroll = Builder(name = "Payroll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                lineTo(4.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(2.0f, 9.242f)
                verticalLineToRelative(-5.242f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(5.242f)
                lineToRelative(-7.879f, 7.879f)
                curveToRelative(-1.133f, 1.133f, -3.109f, 1.133f, -4.242f, 0.0f)
                lineToRelative(-7.879f, -7.879f)
                close()
                moveTo(17.0f, 7.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(8.5f, 11.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(4.0f, 7.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(15.535f, 18.535f)
                curveToRelative(-0.943f, 0.944f, -2.199f, 1.465f, -3.535f, 1.465f)
                reflectiveCurveToRelative(-2.592f, -0.521f, -3.535f, -1.465f)
                lineTo(0.418f, 10.488f)
                curveTo(0.156f, 11.028f, 0.002f, 11.619f, 0.002f, 12.231f)
                lineToRelative(-0.002f, 11.769f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-11.772f)
                curveToRelative(0.0f, -0.612f, -0.154f, -1.202f, -0.416f, -1.742f)
                lineToRelative(-8.048f, 8.048f)
                close()
            }
        }
        .build()
        return _payroll!!
    }

private var _payroll: ImageVector? = null
