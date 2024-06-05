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

public val Icons.Outline.VideoArrowUpRight: ImageVector
    get() {
        if (_videoArrowUpRight != null) {
            return _videoArrowUpRight!!
        }
        _videoArrowUpRight = Builder(name = "VideoArrowUpRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.586f)
                lineToRelative(-4.293f, 4.293f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(4.293f, -4.293f)
                horizontalLineToRelative(-2.586f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(24.0f, 8.313f)
                verticalLineToRelative(7.319f)
                curveToRelative(0.0f, 0.756f, -0.42f, 1.437f, -1.097f, 1.775f)
                curveToRelative(-0.283f, 0.141f, -0.587f, 0.211f, -0.889f, 0.211f)
                curveToRelative(-0.42f, 0.0f, -0.837f, -0.135f, -1.189f, -0.399f)
                curveToRelative(-0.038f, -0.028f, -0.073f, -0.059f, -0.106f, -0.092f)
                lineToRelative(-1.756f, -1.754f)
                curveToRelative(-0.194f, 2.581f, -2.333f, 4.628f, -4.962f, 4.628f)
                lineTo(5.0f, 20.001f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                lineTo(14.0f, 4.001f)
                curveToRelative(2.618f, 0.0f, 4.748f, 2.029f, 4.959f, 4.594f)
                lineToRelative(1.756f, -1.772f)
                curveToRelative(0.035f, -0.035f, 0.071f, -0.066f, 0.11f, -0.096f)
                curveToRelative(0.605f, -0.454f, 1.401f, -0.525f, 2.078f, -0.188f)
                curveToRelative(0.676f, 0.338f, 1.097f, 1.019f, 1.097f, 1.775f)
                close()
                moveTo(17.0f, 9.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(5.0f, 6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                lineTo(14.0f, 18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(22.025f, 15.605f)
                lineToRelative(-0.025f, -7.239f)
                lineToRelative(-3.0f, 3.028f)
                verticalLineToRelative(1.189f)
                lineToRelative(3.025f, 3.022f)
                close()
            }
        }
        .build()
        return _videoArrowUpRight!!
    }

private var _videoArrowUpRight: ImageVector? = null
