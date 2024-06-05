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

public val Icons.Filled.MusicAlt: ImageVector
    get() {
        if (_musicAlt != null) {
            return _musicAlt!!
        }
        _musicAlt = Builder(name = "MusicAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.916f, 0.691f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, false, -2.469f, -0.638f)
                lineToRelative(-11.999f, 2.247f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.448f, 2.951f)
                verticalLineToRelative(11.305f)
                arcToRelative(3.959f, 3.959f, 0.0f, false, false, -2.0f, -0.556f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                verticalLineToRelative(-10.58f)
                lineToRelative(14.0f, -2.62f)
                verticalLineToRelative(6.761f)
                arcToRelative(3.959f, 3.959f, 0.0f, false, false, -2.0f, -0.561f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.084f, -2.309f)
                close()
            }
        }
        .build()
        return _musicAlt!!
    }

private var _musicAlt: ImageVector? = null
