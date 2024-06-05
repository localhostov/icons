package me.localx.icons.rounded.bold

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

public val Icons.Bold.MusicNoteSlash: ImageVector
    get() {
        if (_musicNoteSlash != null) {
            return _musicNoteSlash!!
        }
        _musicNoteSlash = Builder(name = "MusicNoteSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.561f, 23.561f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineTo(0.439f, 2.561f)
                curveTo(-0.146f, 1.975f, -0.146f, 1.025f, 0.439f, 0.439f)
                reflectiveCurveTo(1.975f, -0.146f, 2.561f, 0.439f)
                lineToRelative(9.439f, 9.439f)
                verticalLineToRelative(-4.879f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(7.879f)
                lineToRelative(8.561f, 8.561f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                close()
                moveTo(13.727f, 19.125f)
                curveToRelative(-0.725f, -0.399f, -1.637f, -0.139f, -2.039f, 0.586f)
                curveToRelative(-0.44f, 0.795f, -1.278f, 1.289f, -2.187f, 1.289f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.909f, 0.494f, -1.747f, 1.289f, -2.188f)
                curveToRelative(0.725f, -0.401f, 0.987f, -1.314f, 0.586f, -2.039f)
                curveToRelative(-0.402f, -0.726f, -1.314f, -0.984f, -2.039f, -0.586f)
                curveToRelative(-1.749f, 0.97f, -2.836f, 2.813f, -2.836f, 4.812f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                curveToRelative(1.999f, 0.0f, 3.843f, -1.087f, 4.812f, -2.836f)
                curveToRelative(0.401f, -0.725f, 0.139f, -1.638f, -0.586f, -2.039f)
                close()
            }
        }
        .build()
        return _musicNoteSlash!!
    }

private var _musicNoteSlash: ImageVector? = null
