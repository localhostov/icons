package me.localx.icons.rounded.outline

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

public val Icons.Outline.AlarmSnooze: ImageVector
    get() {
        if (_alarmSnooze != null) {
            return _alarmSnooze!!
        }
        _alarmSnooze = Builder(name = "AlarmSnooze", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.707f, 10.707f)
                lineToRelative(-4.293f, 4.293f)
                horizontalLineToRelative(3.586f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.404f, 0.0f, -0.769f, -0.244f, -0.924f, -0.617f)
                curveToRelative(-0.155f, -0.374f, -0.069f, -0.804f, 0.217f, -1.09f)
                lineToRelative(4.293f, -4.293f)
                horizontalLineToRelative(-3.586f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.404f, 0.0f, 0.77f, 0.244f, 0.924f, 0.617f)
                curveToRelative(0.155f, 0.374f, 0.069f, 0.804f, -0.217f, 1.09f)
                close()
                moveTo(23.0f, 13.0f)
                curveToRelative(0.0f, 2.738f, -1.006f, 5.246f, -2.668f, 7.173f)
                curveToRelative(0.846f, 0.448f, 1.668f, 1.317f, 1.668f, 2.827f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.0f, -0.858f, -1.194f, -1.122f, -1.229f)
                curveToRelative(-0.065f, -0.009f, -0.128f, -0.024f, -0.189f, -0.045f)
                curveToRelative(-1.855f, 1.425f, -4.175f, 2.274f, -6.689f, 2.274f)
                reflectiveCurveToRelative(-4.833f, -0.848f, -6.687f, -2.272f)
                curveToRelative(-0.065f, 0.021f, -0.132f, 0.036f, -0.203f, 0.044f)
                curveToRelative(-0.252f, 0.035f, -1.11f, 0.229f, -1.11f, 1.229f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.51f, 0.821f, -2.378f, 1.668f, -2.827f)
                curveToRelative(-1.662f, -1.927f, -2.668f, -4.435f, -2.668f, -7.173f)
                curveTo(1.0f, 7.272f, 5.401f, 2.553f, 11.0f, 2.046f)
                lineTo(11.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.046f)
                curveToRelative(5.599f, 0.507f, 10.0f, 5.226f, 10.0f, 10.954f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(4.963f, 0.0f, 9.0f, -4.038f, 9.0f, -9.0f)
                reflectiveCurveTo(16.963f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(3.0f, 8.038f, 3.0f, 13.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                close()
                moveTo(19.215f, 0.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                curveToRelative(1.809f, 0.0f, 2.785f, 1.288f, 2.785f, 2.5f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -2.523f, -2.102f, -4.5f, -4.785f, -4.5f)
                close()
                moveTo(2.0f, 4.5f)
                curveToRelative(0.0f, -1.212f, 0.976f, -2.5f, 2.785f, -2.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                curveTo(2.102f, 0.0f, 0.0f, 1.977f, 0.0f, 4.5f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _alarmSnooze!!
    }

private var _alarmSnooze: ImageVector? = null
