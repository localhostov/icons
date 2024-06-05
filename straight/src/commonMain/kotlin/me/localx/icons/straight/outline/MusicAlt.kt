package me.localx.icons.straight.outline

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
                moveTo(22.916f, 0.691f)
                arcTo(2.992f, 2.992f, 0.0f, false, false, 20.447f, 0.053f)
                lineTo(8.448f, 2.3f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 5.251f)
                verticalLineTo(16.556f)
                arcTo(3.959f, 3.959f, 0.0f, false, false, 4.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                verticalLineTo(9.42f)
                lineTo(22.0f, 6.8f)
                verticalLineToRelative(6.761f)
                arcTo(3.959f, 3.959f, 0.0f, false, false, 20.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                verticalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 22.916f, 0.691f)
                close()
                moveTo(4.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 22.0f)
                close()
                moveTo(8.0f, 7.386f)
                verticalLineTo(5.251f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.815f, -0.983f)
                lineToRelative(12.0f, -2.25f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 3.0f)
                verticalLineToRelative(1.76f)
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
