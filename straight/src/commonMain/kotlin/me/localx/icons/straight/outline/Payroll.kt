package me.localx.icons.straight.outline

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

public val Icons.Outline.Payroll: ImageVector
    get() {
        if (_payroll != null) {
            return _payroll!!
        }
        _payroll = Builder(name = "Payroll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.769f, 9.344f)
                lineToRelative(-0.769f, -0.736f)
                verticalLineToRelative(-4.608f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(4.61f)
                lineToRelative(-0.767f, 0.734f)
                curveTo(0.451f, 10.094f, 0.002f, 11.146f, 0.002f, 12.231f)
                lineToRelative(-0.002f, 11.769f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-11.769f)
                curveToRelative(0.0f, -1.087f, -0.449f, -2.14f, -1.231f, -2.888f)
                close()
                moveTo(20.0f, 6.0f)
                verticalLineToRelative(5.242f)
                lineToRelative(-5.879f, 5.879f)
                curveToRelative(-1.133f, 1.133f, -3.109f, 1.133f, -4.242f, 0.0f)
                lineToRelative(-5.879f, -5.879f)
                verticalLineToRelative(-5.242f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                reflectiveCurveToRelative(0.013f, -9.865f, 0.017f, -9.913f)
                lineToRelative(6.448f, 6.448f)
                curveToRelative(0.943f, 0.944f, 2.199f, 1.465f, 3.535f, 1.465f)
                reflectiveCurveToRelative(2.592f, -0.521f, 3.535f, -1.465f)
                lineToRelative(6.45f, -6.45f)
                curveToRelative(0.004f, 0.049f, 0.015f, 9.915f, 0.015f, 9.915f)
                close()
                moveTo(20.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                lineTo(4.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 8.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(12.0f, 11.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(5.0f, 8.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _payroll!!
    }

private var _payroll: ImageVector? = null
