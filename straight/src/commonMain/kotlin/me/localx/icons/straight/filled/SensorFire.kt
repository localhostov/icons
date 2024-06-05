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

public val Icons.Filled.SensorFire: ImageVector
    get() {
        if (_sensorFire != null) {
            return _sensorFire!!
        }
        _sensorFire = Builder(name = "SensorFire", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 9.0f)
                curveToRelative(-1.972f, 2.278f, -1.576f, 6.333f, -2.944f, 6.333f)
                curveToRelative(-0.657f, 0.0f, -1.394f, -2.261f, -1.394f, -2.261f)
                curveToRelative(-1.079f, 1.112f, -2.162f, 2.558f, -2.162f, 4.427f)
                curveToRelative(0.0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                curveToRelative(0.0f, -3.763f, -4.447f, -6.447f, -6.5f, -8.5f)
                close()
                moveTo(19.268f, 21.268f)
                curveToRelative(-0.976f, 0.976f, -2.559f, 0.976f, -3.536f, 0.0f)
                reflectiveCurveToRelative(-0.976f, -2.559f, 0.0f, -3.536f)
                lineToRelative(1.768f, -1.768f)
                lineToRelative(1.768f, 1.768f)
                curveToRelative(0.976f, 0.976f, 0.976f, 2.559f, 0.0f, 3.536f)
                close()
                moveTo(9.0f, 17.5f)
                curveToRelative(0.0f, -2.697f, 1.556f, -4.613f, 2.727f, -5.82f)
                curveToRelative(0.0f, 0.0f, 3.518f, -3.13f, 4.262f, -3.989f)
                lineToRelative(1.406f, -1.625f)
                lineToRelative(1.52f, 1.52f)
                curveToRelative(0.401f, 0.401f, 0.955f, 0.87f, 1.541f, 1.367f)
                curveToRelative(1.134f, 0.961f, 2.468f, 2.096f, 3.545f, 3.446f)
                lineTo(24.001f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(12.034f, 24.0f)
                curveToRelative(-1.853f, -1.56f, -3.034f, -3.894f, -3.034f, -6.5f)
                close()
                moveTo(4.0f, 5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(8.0f, 5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _sensorFire!!
    }

private var _sensorFire: ImageVector? = null
