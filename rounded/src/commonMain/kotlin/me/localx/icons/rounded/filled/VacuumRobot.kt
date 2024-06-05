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

public val Icons.Filled.VacuumRobot: ImageVector
    get() {
        if (_vacuumRobot != null) {
            return _vacuumRobot!!
        }
        _vacuumRobot = Builder(name = "VacuumRobot", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 0.389f)
                curveToRelative(0.96f, -0.249f, 1.963f, -0.389f, 3.0f, -0.389f)
                reflectiveCurveToRelative(2.04f, 0.14f, 3.0f, 0.389f)
                verticalLineToRelative(5.637f)
                curveToRelative(-0.838f, -0.635f, -1.87f, -1.026f, -3.0f, -1.026f)
                reflectiveCurveToRelative(-2.162f, 0.391f, -3.0f, 1.026f)
                lineTo(9.0f, 0.389f)
                close()
                moveTo(9.0f, 10.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                close()
                moveTo(23.707f, 1.707f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-2.552f, 2.552f)
                curveToRelative(-0.825f, -0.699f, -1.748f, -1.284f, -2.741f, -1.743f)
                verticalLineToRelative(8.897f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(7.0f, 1.103f)
                curveToRelative(-0.993f, 0.459f, -1.915f, 1.044f, -2.741f, 1.743f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(2.552f, 2.552f)
                curveTo(1.074f, 6.351f, 0.0f, 9.051f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                curveToRelative(0.0f, -2.949f, -1.074f, -5.649f, -2.845f, -7.741f)
                lineToRelative(2.552f, -2.552f)
                close()
            }
        }
        .build()
        return _vacuumRobot!!
    }

private var _vacuumRobot: ImageVector? = null
