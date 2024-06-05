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

public val Icons.Outline.MusicAlt: ImageVector
    get() {
        if (_musicAlt != null) {
            return _musicAlt!!
        }
        _musicAlt = Builder(name = "MusicAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.554f, 0.923f)
                arcTo(3.978f, 3.978f, 0.0f, false, false, 19.263f, 0.07f)
                lineTo(10.079f, 1.792f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 6.0f, 6.706f)
                verticalLineToRelative(9.85f)
                arcTo(3.959f, 3.959f, 0.0f, false, false, 4.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                verticalLineTo(10.876f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.632f, 8.91f)
                lineToRelative(11.183f, -2.1f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 7.8f)
                verticalLineToRelative(5.76f)
                arcTo(3.959f, 3.959f, 0.0f, false, false, 20.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                verticalLineTo(4.0f)
                arcTo(3.987f, 3.987f, 0.0f, false, false, 22.554f, 0.923f)
                close()
                moveTo(4.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 22.0f)
                close()
                moveTo(20.447f, 4.848f)
                lineTo(9.263f, 6.944f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 7.416f)
                verticalLineToRelative(-0.71f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.447f, -2.949f)
                lineToRelative(9.185f, -1.722f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 4.0f)
                verticalLineToRelative(0.984f)
                arcTo(2.955f, 2.955f, 0.0f, false, false, 20.447f, 4.848f)
                close()
                moveTo(20.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 19.0f)
                close()
            }
        }
        .build()
        return _musicAlt!!
    }

private var _musicAlt: ImageVector? = null
