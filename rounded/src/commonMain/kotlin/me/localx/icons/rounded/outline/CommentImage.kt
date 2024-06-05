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

public val Icons.Outline.CommentImage: ImageVector
    get() {
        if (_commentImage != null) {
            return _commentImage!!
        }
        _commentImage = Builder(name = "CommentImage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 19.0f)
                verticalLineToRelative(-6.66f)
                curveTo(24.0f, 5.862f, 19.096f, 0.454f, 12.836f, 0.029f)
                curveTo(9.363f, -0.208f, 5.961f, 1.064f, 3.509f, 3.521f)
                curveTo(1.057f, 5.976f, -0.211f, 9.378f, 0.03f, 12.854f)
                curveToRelative(0.44f, 6.354f, 6.052f, 11.146f, 13.054f, 11.146f)
                horizontalLineToRelative(5.917f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                close()
                moveTo(12.701f, 2.024f)
                curveToRelative(5.215f, 0.354f, 9.299f, 4.886f, 9.299f, 10.316f)
                verticalLineToRelative(6.66f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-5.917f)
                curveToRelative(-6.035f, 0.0f, -10.686f, -3.905f, -11.059f, -9.285f)
                curveToRelative(-0.201f, -2.899f, 0.855f, -5.735f, 2.899f, -7.782f)
                curveToRelative(1.882f, -1.884f, 4.435f, -2.933f, 7.091f, -2.933f)
                curveToRelative(0.228f, 0.0f, 0.457f, 0.007f, 0.686f, 0.023f)
                close()
                moveTo(6.707f, 16.207f)
                lineToRelative(4.293f, -4.293f)
                lineToRelative(2.586f, 2.586f)
                curveToRelative(0.779f, 0.78f, 2.049f, 0.78f, 2.828f, 0.0f)
                lineToRelative(3.293f, -3.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-3.293f, 3.293f)
                lineToRelative(-2.586f, -2.586f)
                curveToRelative(-0.756f, -0.756f, -2.072f, -0.756f, -2.828f, 0.0f)
                lineToRelative(-4.293f, 4.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                close()
            }
        }
        .build()
        return _commentImage!!
    }

private var _commentImage: ImageVector? = null
