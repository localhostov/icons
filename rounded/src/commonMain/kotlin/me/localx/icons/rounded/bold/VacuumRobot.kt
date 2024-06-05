package me.localx.icons.rounded.bold

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

public val Icons.Bold.VacuumRobot: ImageVector
    get() {
        if (_vacuumRobot != null) {
            return _vacuumRobot!!
        }
        _vacuumRobot = Builder(name = "VacuumRobot", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.561f, 2.561f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-2.093f, 2.093f)
                curveToRelative(-0.868f, -0.675f, -3.449f, -2.533f, -7.347f, -2.533f)
                reflectiveCurveToRelative(-6.479f, 1.858f, -7.346f, 2.532f)
                lineTo(2.561f, 0.439f)
                curveTo(1.975f, -0.146f, 1.025f, -0.146f, 0.439f, 0.439f)
                curveTo(-0.146f, 1.025f, -0.146f, 1.975f, 0.439f, 2.561f)
                lineToRelative(2.093f, 2.093f)
                curveTo(0.952f, 6.686f, 0.0f, 9.232f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                curveToRelative(0.0f, -2.768f, -0.951f, -5.314f, -2.532f, -7.346f)
                lineToRelative(2.093f, -2.093f)
                close()
                moveTo(14.0f, 3.232f)
                verticalLineToRelative(2.192f)
                curveToRelative(-0.614f, -0.269f, -1.288f, -0.424f, -2.0f, -0.424f)
                reflectiveCurveToRelative(-1.386f, 0.154f, -2.0f, 0.424f)
                verticalLineToRelative(-2.192f)
                curveToRelative(0.644f, -0.147f, 1.312f, -0.232f, 2.0f, -0.232f)
                reflectiveCurveToRelative(1.356f, 0.085f, 2.0f, 0.232f)
                close()
                moveTo(14.0f, 10.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                curveToRelative(0.0f, -3.113f, 1.59f, -5.861f, 4.0f, -7.478f)
                verticalLineToRelative(5.478f)
                curveToRelative(0.0f, 2.761f, 2.347f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.026f, 5.0f, -5.0f)
                verticalLineToRelative(-5.478f)
                curveToRelative(2.41f, 1.617f, 4.0f, 4.365f, 4.0f, 7.478f)
                curveToRelative(0.0f, 4.962f, -4.037f, 9.0f, -9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _vacuumRobot!!
    }

private var _vacuumRobot: ImageVector? = null
