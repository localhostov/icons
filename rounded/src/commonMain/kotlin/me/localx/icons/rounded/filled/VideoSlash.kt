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

public val Icons.Filled.VideoSlash: ImageVector
    get() {
        if (_videoSlash != null) {
            return _videoSlash!!
        }
        _videoSlash = Builder(name = "VideoSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.707f, 22.293f)
                lineToRelative(-5.921f, -5.921f)
                curveToRelative(0.128f, -0.445f, 0.214f, -0.901f, 0.214f, -1.372f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(5.414f, 4.0f)
                lineTo(1.708f, 0.293f)
                curveTo(1.317f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.097f, 1.316f, 0.293f, 1.707f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineToRelative(0.0f)
                lineTo(22.293f, 23.707f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(15.218f, 19.46f)
                curveToRelative(-0.671f, 0.335f, -1.417f, 0.54f, -2.218f, 0.54f)
                lineTo(5.0f, 20.0f)
                curveTo(2.239f, 20.0f, 0.0f, 17.761f, 0.0f, 15.0f)
                verticalLineToRelative(-6.0f)
                curveTo(0.0f, 7.678f, 0.52f, 6.486f, 1.351f, 5.593f)
                lineToRelative(13.866f, 13.867f)
                close()
                moveTo(24.0f, 8.313f)
                verticalLineToRelative(7.319f)
                curveToRelative(0.0f, 0.757f, -0.42f, 1.437f, -1.097f, 1.775f)
                curveToRelative(-0.283f, 0.141f, -0.587f, 0.211f, -0.889f, 0.211f)
                curveToRelative(-0.421f, 0.0f, -0.837f, -0.135f, -1.189f, -0.399f)
                curveToRelative(-0.037f, -0.028f, -0.825f, -0.81f, -0.825f, -0.81f)
                lineTo(20.0f, 7.544f)
                reflectiveCurveToRelative(0.786f, -0.789f, 0.825f, -0.818f)
                curveToRelative(0.604f, -0.454f, 1.399f, -0.527f, 2.078f, -0.188f)
                reflectiveCurveToRelative(1.097f, 1.018f, 1.097f, 1.775f)
                close()
            }
        }
        .build()
        return _videoSlash!!
    }

private var _videoSlash: ImageVector? = null
