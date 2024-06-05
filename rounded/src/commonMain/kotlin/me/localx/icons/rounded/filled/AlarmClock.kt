package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.AlarmClock: ImageVector
    get() {
        if (_alarmClock != null) {
            return _alarmClock!!
        }
        _alarmClock = Builder(name = "AlarmClock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(2.59f, 2.59f, 0.0f, false, false, -2.785f, -2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 4.785f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 4.5f)
                arcToRelative(2.59f, 2.59f, 0.0f, false, true, 2.785f, -2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, -4.785f, 4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.319f, 20.176f)
                arcToRelative(10.98f, 10.98f, 0.0f, false, false, -7.319f, -18.125f)
                verticalLineToRelative(-1.051f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(1.051f)
                arcToRelative(10.98f, 10.98f, 0.0f, false, false, -7.319f, 18.125f)
                arcToRelative(3.024f, 3.024f, 0.0f, false, false, -1.681f, 2.824f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 1.11f, -1.229f)
                arcToRelative(0.932f, 0.932f, 0.0f, false, false, 0.2f, -0.062f)
                arcToRelative(10.924f, 10.924f, 0.0f, false, false, 13.39f, 0.0f)
                arcToRelative(1.033f, 1.033f, 0.0f, false, false, 0.182f, 0.064f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 1.118f, 1.227f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcToRelative(3.024f, 3.024f, 0.0f, false, false, -1.681f, -2.824f)
                close()
                moveTo(15.707f, 15.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.293f, -0.707f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(4.586f)
                lineToRelative(2.707f, 2.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _alarmClock!!
    }

private var _alarmClock: ImageVector? = null
