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

public val Icons.Filled.MusicAltSlash: ImageVector
    get() {
        if (_musicAltSlash != null) {
            return _musicAltSlash!!
        }
        _musicAltSlash = Builder(name = "MusicAltSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.596f, 18.793f)
                curveToRelative(0.243f, 0.243f, 0.344f, 0.594f, 0.269f, 0.929f)
                curveToRelative(-0.572f, 2.519f, -2.778f, 4.278f, -5.364f, 4.278f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                curveToRelative(0.0f, -2.586f, 1.76f, -4.792f, 4.278f, -5.364f)
                curveToRelative(0.336f, -0.077f, 0.687f, 0.026f, 0.929f, 0.269f)
                lineToRelative(5.389f, 5.389f)
                close()
                moveTo(23.707f, 23.707f)
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
                moveTo(14.996f, 13.582f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, -0.002f, 0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _musicAltSlash!!
    }

private var _musicAltSlash: ImageVector? = null
