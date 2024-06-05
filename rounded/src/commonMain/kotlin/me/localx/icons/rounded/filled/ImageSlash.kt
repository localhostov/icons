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

public val Icons.Filled.ImageSlash: ImageVector
    get() {
        if (_imageSlash != null) {
            return _imageSlash!!
        }
        _imageSlash = Builder(name = "ImageSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-1.536f, -1.536f)
                curveToRelative(0.538f, -0.813f, 0.829f, -1.771f, 0.829f, -2.757f)
                lineTo(23.0f, 6.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(6.0f, 1.0f)
                curveToRelative(-0.986f, 0.0f, -1.943f, 0.291f, -2.757f, 0.829f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(16.0f, 10.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(1.0f, 17.586f)
                lineTo(1.0f, 7.5f)
                curveToRelative(0.0f, -0.404f, 0.244f, -0.77f, 0.617f, -0.924f)
                curveToRelative(0.375f, -0.156f, 0.803f, -0.07f, 1.09f, 0.217f)
                lineToRelative(4.543f, 4.543f)
                lineToRelative(-6.25f, 6.25f)
                close()
                moveTo(17.424f, 22.383f)
                curveToRelative(-0.155f, 0.374f, -0.52f, 0.617f, -0.924f, 0.617f)
                lineTo(6.0f, 23.0f)
                curveToRelative(-2.047f, 0.0f, -3.811f, -1.237f, -4.583f, -3.003f)
                lineToRelative(7.247f, -7.247f)
                lineToRelative(8.543f, 8.543f)
                curveToRelative(0.286f, 0.286f, 0.372f, 0.716f, 0.217f, 1.09f)
                close()
            }
        }
        .build()
        return _imageSlash!!
    }

private var _imageSlash: ImageVector? = null
