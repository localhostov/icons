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

public val Icons.Filled.AlarmExclamation: ImageVector
    get() {
        if (_alarmExclamation != null) {
            return _alarmExclamation!!
        }
        _alarmExclamation = Builder(name = "AlarmExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.5f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.212f, -0.977f, -2.5f, -2.785f, -2.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                curveToRelative(2.684f, 0.0f, 4.785f, 1.977f, 4.785f, 4.5f)
                close()
                moveTo(2.0f, 4.5f)
                curveToRelative(0.0f, -1.212f, 0.977f, -2.5f, 2.785f, -2.5f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                curveTo(2.102f, 0.0f, 0.0f, 1.977f, 0.0f, 4.5f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                close()
                moveTo(23.0f, 13.0f)
                curveToRelative(0.0f, 2.738f, -1.006f, 5.246f, -2.667f, 7.173f)
                curveToRelative(0.846f, 0.449f, 1.667f, 1.317f, 1.667f, 2.827f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.0f, -0.858f, -1.194f, -1.122f, -1.23f)
                curveToRelative(-0.065f, -0.009f, -0.128f, -0.024f, -0.188f, -0.044f)
                curveToRelative(-1.855f, 1.426f, -4.175f, 2.275f, -6.69f, 2.275f)
                reflectiveCurveToRelative(-4.833f, -0.848f, -6.687f, -2.273f)
                curveToRelative(-0.065f, 0.021f, -0.132f, 0.036f, -0.202f, 0.044f)
                curveToRelative(-0.252f, 0.034f, -1.11f, 0.229f, -1.11f, 1.229f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.51f, 0.821f, -2.378f, 1.667f, -2.827f)
                curveToRelative(-1.661f, -1.927f, -2.667f, -4.435f, -2.667f, -7.173f)
                curveTo(1.0f, 7.272f, 5.401f, 2.553f, 11.0f, 2.046f)
                lineTo(11.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.046f)
                curveToRelative(5.599f, 0.507f, 10.0f, 5.226f, 10.0f, 10.954f)
                close()
                moveTo(13.5f, 18.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(13.0f, 7.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(13.0f, 7.0f)
                close()
            }
        }
        .build()
        return _alarmExclamation!!
    }

private var _alarmExclamation: ImageVector? = null
