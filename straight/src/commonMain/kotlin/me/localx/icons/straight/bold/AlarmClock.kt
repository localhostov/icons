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

public val Icons.Bold.AlarmClock: ImageVector
    get() {
        if (_alarmClock != null) {
            return _alarmClock!!
        }
        _alarmClock = Builder(name = "AlarmClock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 13.0f)
                arcToRelative(10.006f, 10.006f, 0.0f, false, false, -8.5f, -9.875f)
                verticalLineToRelative(-3.125f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.125f)
                arcToRelative(9.982f, 9.982f, 0.0f, false, false, -6.177f, 16.275f)
                lineToRelative(-2.417f, 2.574f)
                lineToRelative(2.188f, 2.052f)
                lineToRelative(2.477f, -2.64f)
                arcToRelative(9.938f, 9.938f, 0.0f, false, false, 10.858f, 0.0f)
                lineToRelative(2.477f, 2.64f)
                lineToRelative(2.188f, -2.052f)
                lineToRelative(-2.417f, -2.574f)
                arcToRelative(9.956f, 9.956f, 0.0f, false, false, 2.323f, -6.4f)
                close()
                moveTo(5.0f, 13.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 7.0f, 7.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, true, -7.0f, -7.0f)
                close()
                moveTo(13.5f, 11.055f)
                lineTo(15.908f, 12.516f)
                lineTo(14.316f, 15.059f)
                lineTo(10.5f, 12.715f)
                verticalLineToRelative(-4.715f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(2.511f, 5.674f)
                lineTo(0.017f, 4.011f)
                arcToRelative(15.17f, 15.17f, 0.0f, false, true, 4.439f, -3.955f)
                lineToRelative(1.6f, 2.53f)
                arcToRelative(12.026f, 12.026f, 0.0f, false, false, -3.545f, 3.088f)
                close()
                moveTo(17.946f, 2.586f)
                lineTo(19.546f, 0.056f)
                arcToRelative(15.17f, 15.17f, 0.0f, false, true, 4.439f, 3.955f)
                lineToRelative(-2.496f, 1.663f)
                arcToRelative(12.026f, 12.026f, 0.0f, false, false, -3.543f, -3.088f)
                close()
            }
        }
        .build()
        return _alarmClock!!
    }

private var _alarmClock: ImageVector? = null
