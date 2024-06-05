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
                moveToRelative(22.554f, 0.923f)
                arcToRelative(3.978f, 3.978f, 0.0f, false, false, -3.291f, -0.853f)
                lineToRelative(-9.184f, 1.722f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.079f, 4.914f)
                verticalLineToRelative(9.85f)
                arcToRelative(3.959f, 3.959f, 0.0f, false, false, -2.0f, -0.556f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                verticalLineToRelative(-9.124f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.632f, -1.966f)
                lineToRelative(11.183f, -2.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.185f, 0.99f)
                verticalLineToRelative(5.76f)
                arcToRelative(3.959f, 3.959f, 0.0f, false, false, -2.0f, -0.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                verticalLineToRelative(-13.0f)
                arcToRelative(3.987f, 3.987f, 0.0f, false, false, -1.446f, -3.077f)
                close()
            }
        }
        .build()
        return _musicAlt!!
    }

private var _musicAlt: ImageVector? = null
