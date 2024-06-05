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

public val Icons.Filled.NotEqual: ImageVector
    get() {
        if (_notEqual != null) {
            return _notEqual!!
        }
        _notEqual = Builder(name = "NotEqual", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-8.629f, 0.0f)
                lineToRelative(2.789f, -6.136f)
                lineToRelative(-1.82f, -0.828f)
                lineToRelative(-3.166f, 6.964f)
                lineToRelative(-13.174f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(12.265f, 0.0f)
                lineToRelative(-2.727f, 6.0f)
                lineToRelative(-9.538f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(8.629f, 0.0f)
                lineToRelative(-2.789f, 6.136f)
                lineToRelative(1.82f, 0.828f)
                lineToRelative(3.166f, -6.964f)
                lineToRelative(13.174f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-12.265f, 0.0f)
                lineToRelative(2.727f, -6.0f)
                lineToRelative(9.538f, 0.0f)
                close()
            }
        }
        .build()
        return _notEqual!!
    }

private var _notEqual: ImageVector? = null
