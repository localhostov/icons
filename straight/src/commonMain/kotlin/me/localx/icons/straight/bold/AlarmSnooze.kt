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

public val Icons.Bold.AlarmSnooze: ImageVector
    get() {
        if (_alarmSnooze != null) {
            return _alarmSnooze!!
        }
        _alarmSnooze = Builder(name = "AlarmSnooze", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.661f)
                lineToRelative(-1.843f, 2.339f)
                horizontalLineToRelative(1.843f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.571f)
                lineToRelative(1.914f, -2.429f)
                horizontalLineToRelative(-1.914f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(19.694f, 19.398f)
                lineToRelative(2.417f, 2.576f)
                lineToRelative(-2.188f, 2.053f)
                lineToRelative(-2.478f, -2.64f)
                curveToRelative(-1.565f, 1.017f, -3.427f, 1.614f, -5.429f, 1.614f)
                reflectiveCurveToRelative(-3.863f, -0.597f, -5.429f, -1.614f)
                lineToRelative(-2.478f, 2.64f)
                lineToRelative(-2.188f, -2.053f)
                lineToRelative(2.417f, -2.576f)
                curveToRelative(-1.449f, -1.735f, -2.323f, -3.966f, -2.323f, -6.398f)
                curveTo(2.017f, 7.997f, 5.714f, 3.852f, 10.517f, 3.125f)
                lineTo(10.517f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.517f, 3.125f)
                curveToRelative(4.803f, 0.728f, 8.5f, 4.872f, 8.5f, 9.875f)
                curveToRelative(0.0f, 2.432f, -0.875f, 4.663f, -2.324f, 6.398f)
                close()
                moveTo(12.017f, 20.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, -3.14f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.141f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                close()
                moveTo(6.071f, 2.586f)
                lineTo(4.474f, 0.056f)
                curveTo(2.743f, 1.068f, 1.236f, 2.419f, 0.034f, 4.011f)
                lineToRelative(2.494f, 1.662f)
                curveToRelative(0.965f, -1.248f, 2.167f, -2.3f, 3.543f, -3.088f)
                close()
                moveTo(21.506f, 5.674f)
                lineToRelative(2.494f, -1.662f)
                curveToRelative(-1.202f, -1.593f, -2.709f, -2.943f, -4.439f, -3.955f)
                lineToRelative(-1.598f, 2.53f)
                curveToRelative(1.377f, 0.788f, 2.578f, 1.84f, 3.543f, 3.088f)
                close()
            }
        }
        .build()
        return _alarmSnooze!!
    }

private var _alarmSnooze: ImageVector? = null
