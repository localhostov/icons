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
                moveToRelative(23.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(11.293f, 11.293f)
                verticalLineToRelative(-7.086f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(9.086f)
                lineToRelative(8.707f, 8.707f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(14.11f, 18.524f)
                curveToRelative(-0.544f, -0.122f, -1.075f, 0.216f, -1.197f, 0.754f)
                curveToRelative(-0.357f, 1.577f, -1.793f, 2.722f, -3.413f, 2.722f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.62f, 1.145f, -3.056f, 2.722f, -3.413f)
                curveToRelative(0.538f, -0.123f, 0.876f, -0.658f, 0.754f, -1.197f)
                curveToRelative(-0.123f, -0.538f, -0.655f, -0.876f, -1.197f, -0.754f)
                curveToRelative(-2.519f, 0.572f, -4.278f, 2.778f, -4.278f, 5.364f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                curveToRelative(2.586f, 0.0f, 4.792f, -1.76f, 5.364f, -4.278f)
                curveToRelative(0.122f, -0.539f, -0.216f, -1.074f, -0.754f, -1.197f)
                close()
            }
        }
        .build()
        return _musicNoteSlash!!
    }

private var _musicNoteSlash: ImageVector? = null
