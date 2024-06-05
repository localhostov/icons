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

public val Icons.Outline.VacuumRobot: ImageVector
    get() {
        if (_vacuumRobot != null) {
            return _vacuumRobot!!
        }
        _vacuumRobot = Builder(name = "VacuumRobot", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.155f, 4.26f)
                lineToRelative(2.745f, -2.745f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.745f, 2.745f)
                curveToRelative(-2.092f, -1.771f, -4.792f, -2.845f, -7.741f, -2.845f)
                curveToRelative(-2.998f, 0.0f, -5.736f, 1.113f, -7.841f, 2.937f)
                lineTo(1.515f, 0.293f)
                lineTo(0.101f, 1.707f)
                lineToRelative(2.653f, 2.653f)
                curveTo(1.035f, 6.437f, 0.0f, 9.1f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                curveToRelative(0.0f, -2.949f, -1.074f, -5.649f, -2.845f, -7.74f)
                close()
                moveTo(15.0f, 2.462f)
                verticalLineToRelative(3.564f)
                curveToRelative(-0.838f, -0.635f, -1.87f, -1.026f, -3.0f, -1.026f)
                reflectiveCurveToRelative(-2.162f, 0.391f, -3.0f, 1.026f)
                verticalLineToRelative(-3.564f)
                curveToRelative(0.948f, -0.299f, 1.955f, -0.461f, 3.0f, -0.461f)
                reflectiveCurveToRelative(2.052f, 0.163f, 3.0f, 0.461f)
                close()
                moveTo(15.0f, 10.001f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(12.0f, 22.001f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                curveToRelative(0.0f, -3.692f, 2.016f, -6.915f, 5.0f, -8.647f)
                verticalLineToRelative(6.647f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(17.0f, 3.353f)
                curveToRelative(2.984f, 1.732f, 5.0f, 4.955f, 5.0f, 8.647f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _vacuumRobot!!
    }

private var _vacuumRobot: ImageVector? = null
