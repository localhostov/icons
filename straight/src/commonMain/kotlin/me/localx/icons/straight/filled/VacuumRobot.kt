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
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                curveToRelative(0.0f, -2.9f, 1.035f, -5.563f, 2.754f, -7.64f)
                lineTo(0.101f, 1.707f)
                lineTo(1.515f, 0.293f)
                lineToRelative(2.644f, 2.644f)
                curveToRelative(0.851f, -0.737f, 1.809f, -1.351f, 2.841f, -1.829f)
                verticalLineToRelative(8.892f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(17.0f, 1.103f)
                curveToRelative(0.993f, 0.459f, 1.916f, 1.044f, 2.741f, 1.743f)
                lineTo(22.485f, 0.101f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.745f, 2.745f)
                curveToRelative(1.771f, 2.092f, 2.845f, 4.791f, 2.845f, 7.74f)
                close()
                moveTo(9.0f, 6.026f)
                curveToRelative(0.838f, -0.635f, 1.87f, -1.026f, 3.0f, -1.026f)
                reflectiveCurveToRelative(2.162f, 0.391f, 3.0f, 1.026f)
                lineTo(15.0f, 0.389f)
                curveToRelative(-0.96f, -0.249f, -1.963f, -0.389f, -3.0f, -0.389f)
                reflectiveCurveToRelative(-2.04f, 0.141f, -3.0f, 0.391f)
                verticalLineToRelative(5.634f)
                close()
                moveTo(9.0f, 10.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _vacuumRobot!!
    }

private var _vacuumRobot: ImageVector? = null
