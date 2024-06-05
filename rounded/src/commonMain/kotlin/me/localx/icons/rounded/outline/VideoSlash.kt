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

public val Icons.Outline.VideoSlash: ImageVector
    get() {
        if (_videoSlash != null) {
            return _videoSlash!!
        }
        _videoSlash = Builder(name = "VideoSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 19.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 20.0f)
                curveTo(2.244f, 20.0f, 0.0f, 17.757f, 0.0f, 15.0f)
                verticalLineToRelative(-6.0f)
                curveTo(0.0f, 8.152f, 0.217f, 7.314f, 0.625f, 6.577f)
                curveToRelative(0.269f, -0.482f, 0.877f, -0.655f, 1.36f, -0.389f)
                curveToRelative(0.483f, 0.268f, 0.657f, 0.877f, 0.389f, 1.36f)
                curveToRelative(-0.245f, 0.441f, -0.374f, 0.943f, -0.374f, 1.452f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                lineTo(14.0f, 18.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(18.637f, 16.875f)
                curveToRelative(-0.033f, 0.081f, -0.08f, 0.151f, -0.129f, 0.218f)
                lineToRelative(5.2f, 5.2f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(4.294f, 5.707f)
                horizontalLineToRelative(0.0f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.097f, 1.316f, -0.097f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.317f, -0.098f, 1.708f, 0.293f)
                lineToRelative(3.707f, 3.707f)
                lineTo(14.0f, 4.0f)
                curveToRelative(2.618f, 0.0f, 4.748f, 2.03f, 4.959f, 4.594f)
                lineToRelative(1.757f, -1.772f)
                curveToRelative(0.034f, -0.034f, 0.07f, -0.066f, 0.109f, -0.096f)
                curveToRelative(0.604f, -0.454f, 1.399f, -0.526f, 2.078f, -0.188f)
                curveToRelative(0.677f, 0.338f, 1.097f, 1.018f, 1.097f, 1.775f)
                verticalLineToRelative(7.319f)
                curveToRelative(0.0f, 0.757f, -0.42f, 1.437f, -1.097f, 1.775f)
                curveToRelative(-0.283f, 0.141f, -0.587f, 0.211f, -0.889f, 0.211f)
                curveToRelative(-0.421f, 0.0f, -0.837f, -0.135f, -1.189f, -0.399f)
                curveToRelative(-0.037f, -0.028f, -0.073f, -0.059f, -0.106f, -0.092f)
                lineToRelative(-1.754f, -1.752f)
                curveToRelative(-0.038f, 0.516f, -0.134f, 1.022f, -0.328f, 1.501f)
                close()
                moveTo(19.0f, 12.583f)
                lineToRelative(3.026f, 3.022f)
                lineToRelative(-0.026f, -7.238f)
                lineToRelative(-3.0f, 3.027f)
                verticalLineToRelative(1.189f)
                close()
                moveTo(17.0f, 9.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(7.414f, 6.0f)
                lineToRelative(9.535f, 9.535f)
                curveToRelative(0.031f, -0.175f, 0.051f, -0.353f, 0.051f, -0.535f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _videoSlash!!
    }

private var _videoSlash: ImageVector? = null
