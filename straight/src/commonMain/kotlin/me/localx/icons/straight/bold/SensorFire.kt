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

public val Icons.Bold.SensorFire: ImageVector
    get() {
        if (_sensorFire != null) {
            return _sensorFire!!
        }
        _sensorFire = Builder(name = "SensorFire", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 5.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(13.0f, 6.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                lineTo(0.0f, 24.0f)
                lineTo(11.356f, 24.0f)
                curveToRelative(-1.004f, -0.811f, -1.825f, -1.835f, -2.406f, -3.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(5.513f)
                curveToRelative(1.012f, 0.822f, 2.098f, 1.765f, 3.0f, 2.872f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.0f, 3.866f, -3.134f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.134f, -7.0f, -7.0f)
                curveToRelative(0.0f, -2.013f, 1.167f, -3.57f, 2.328f, -4.768f)
                curveToRelative(0.0f, 0.0f, 0.794f, 2.435f, 1.501f, 2.435f)
                curveToRelative(1.474f, 0.0f, 1.047f, -3.949f, 3.171f, -6.402f)
                curveToRelative(2.211f, 2.211f, 7.0f, 4.682f, 7.0f, 8.735f)
                close()
                moveTo(18.768f, 17.768f)
                lineToRelative(-1.768f, -1.768f)
                lineToRelative(-1.768f, 1.768f)
                curveToRelative(-0.976f, 0.976f, -0.976f, 2.559f, 0.0f, 3.536f)
                curveToRelative(0.976f, 0.976f, 2.559f, 0.976f, 3.535f, 0.0f)
                curveToRelative(0.976f, -0.976f, 0.976f, -2.559f, 0.0f, -3.536f)
                close()
            }
        }
        .build()
        return _sensorFire!!
    }

private var _sensorFire: ImageVector? = null
