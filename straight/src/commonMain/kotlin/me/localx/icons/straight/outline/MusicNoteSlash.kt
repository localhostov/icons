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

public val Icons.Outline.MusicNoteSlash: ImageVector
    get() {
        if (_musicNoteSlash != null) {
            return _musicNoteSlash!!
        }
        _musicNoteSlash = Builder(name = "MusicNoteSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.559f, 16.801f)
                lineToRelative(2.397f, 2.397f)
                curveToRelative(-0.344f, 2.704f, -2.66f, 4.802f, -5.456f, 4.802f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                curveToRelative(0.0f, -2.796f, 2.098f, -5.112f, 4.802f, -5.456f)
                lineToRelative(2.397f, 2.397f)
                curveToRelative(-0.503f, -0.281f, -1.083f, -0.441f, -1.699f, -0.441f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.616f, -0.16f, -1.195f, -0.441f, -1.699f)
                close()
                moveTo(15.0f, 13.586f)
                lineTo(15.0f, 2.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                lineTo(20.0f, 0.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(9.086f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-8.957f, -8.957f)
                close()
            }
        }
        .build()
        return _musicNoteSlash!!
    }

private var _musicNoteSlash: ImageVector? = null
