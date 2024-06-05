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

public val Icons.Filled.MusicNoteSlash: ImageVector
    get() {
        if (_musicNoteSlash != null) {
            return _musicNoteSlash!!
        }
        _musicNoteSlash = Builder(name = "MusicNoteSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.957f, 22.543f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(11.543f, 11.543f)
                lineTo(13.0f, 2.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-0.086f)
                lineToRelative(9.043f, 9.043f)
                close()
                moveTo(8.802f, 13.044f)
                curveToRelative(-2.704f, 0.344f, -4.802f, 2.66f, -4.802f, 5.456f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                curveToRelative(2.796f, 0.0f, 5.112f, -2.098f, 5.456f, -4.802f)
                lineToRelative(-6.154f, -6.154f)
                close()
            }
        }
        .build()
        return _musicNoteSlash!!
    }

private var _musicNoteSlash: ImageVector? = null
