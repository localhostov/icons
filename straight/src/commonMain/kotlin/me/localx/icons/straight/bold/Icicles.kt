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

public val Icons.Bold.Icicles: ImageVector
    get() {
        if (_icicles != null) {
            return _icicles!!
        }
        _icicles = Builder(name = "Icicles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 0.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(2.867f, 16.617f)
                lineToRelative(2.359f, -5.309f)
                lineToRelative(3.164f, 10.546f)
                lineToRelative(3.79f, -10.831f)
                lineToRelative(2.379f, 5.233f)
                lineToRelative(2.284f, -5.482f)
                lineToRelative(3.665f, 10.994f)
                lineToRelative(3.472f, -21.529f)
                lineToRelative(0.02f, -2.239f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(19.491f, 11.231f)
                lineToRelative(-2.335f, -7.006f)
                lineToRelative(-2.716f, 6.518f)
                lineToRelative(-2.621f, -5.767f)
                lineToRelative(-3.21f, 9.169f)
                lineToRelative(-2.836f, -9.454f)
                lineToRelative(-1.641f, 3.691f)
                lineToRelative(-0.937f, -5.383f)
                horizontalLineToRelative(17.623f)
                lineToRelative(-1.328f, 8.231f)
                close()
            }
        }
        .build()
        return _icicles!!
    }

private var _icicles: ImageVector? = null
