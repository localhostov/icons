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

public val Icons.Outline.SalaryAlt: ImageVector
    get() {
        if (_salaryAlt != null) {
            return _salaryAlt!!
        }
        _salaryAlt = Builder(name = "SalaryAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.778f, 9.852f)
                lineToRelative(-2.778f, -2.734f)
                lineTo(20.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(7.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(4.074f)
                lineToRelative(-2.767f, 2.769f)
                curveTo(0.451f, 10.594f, 0.002f, 11.647f, 0.002f, 12.731f)
                lineToRelative(-0.002f, 11.269f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-11.269f)
                curveToRelative(0.0f, -1.086f, -0.448f, -2.139f, -1.222f, -2.879f)
                close()
                moveTo(6.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(9.273f)
                lineToRelative(-3.849f, 3.848f)
                curveToRelative(-1.131f, 1.131f, -3.112f, 1.129f, -4.243f, 0.0f)
                lineToRelative(-3.908f, -3.909f)
                lineTo(6.0f, 3.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineToRelative(0.002f, -9.269f)
                curveToRelative(0.0f, -0.449f, 0.162f, -0.883f, 0.446f, -1.243f)
                lineToRelative(6.047f, 6.048f)
                curveToRelative(0.943f, 0.942f, 2.199f, 1.46f, 3.536f, 1.46f)
                reflectiveCurveToRelative(2.592f, -0.519f, 3.535f, -1.461f)
                lineToRelative(6.017f, -6.017f)
                curveToRelative(0.264f, 0.346f, 0.418f, 0.771f, 0.418f, 1.213f)
                verticalLineToRelative(9.269f)
                close()
                moveTo(9.5f, 7.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.0f, 5.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _salaryAlt!!
    }

private var _salaryAlt: ImageVector? = null
