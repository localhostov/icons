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

public val Icons.Outline.FireFlameCurved: ImageVector
    get() {
        if (_fireFlameCurved != null) {
            return _fireFlameCurved!!
        }
        _fireFlameCurved = Builder(name = "FireFlameCurved", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -3.358f, 1.505f, -5.459f, 3.765f, -7.58f)
                lineToRelative(2.448f, -2.299f)
                lineToRelative(-0.792f, 3.263f)
                curveToRelative(-0.275f, 1.136f, -0.347f, 4.606f, 1.112f, 6.461f)
                curveToRelative(0.611f, 0.777f, 1.418f, 1.155f, 2.467f, 1.155f)
                curveToRelative(1.107f, 0.0f, 1.986f, -0.884f, 2.0f, -2.013f)
                curveToRelative(0.014f, -1.117f, -0.458f, -2.042f, -0.958f, -3.02f)
                curveToRelative(-0.512f, -1.002f, -1.042f, -2.037f, -1.042f, -3.295f)
                curveToRelative(0.0f, -2.711f, 1.412f, -5.168f, 1.472f, -5.271f)
                lineTo(13.3f, -0.021f)
                lineToRelative(0.881f, 1.391f)
                curveToRelative(0.849f, 1.339f, 1.994f, 2.587f, 3.103f, 3.794f)
                curveToRelative(2.319f, 2.524f, 4.717f, 5.136f, 4.717f, 8.837f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(4.0f, 14.0f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -2.922f, -2.035f, -5.139f, -4.19f, -7.484f)
                curveToRelative(-0.77f, -0.839f, -1.558f, -1.696f, -2.276f, -2.611f)
                curveToRelative(-0.276f, 0.773f, -0.534f, 1.763f, -0.534f, 2.769f)
                curveToRelative(0.0f, 0.776f, 0.381f, 1.521f, 0.822f, 2.385f)
                curveToRelative(0.562f, 1.098f, 1.198f, 2.342f, 1.178f, 3.955f)
                curveToRelative(-0.027f, 2.198f, -1.822f, 3.987f, -4.0f, 3.987f)
                curveToRelative(-1.655f, 0.0f, -3.052f, -0.664f, -4.04f, -1.919f)
                curveToRelative(-1.146f, -1.457f, -1.569f, -3.477f, -1.664f, -5.186f)
                curveToRelative(-0.837f, 1.167f, -1.296f, 2.425f, -1.296f, 4.104f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _fireFlameCurved!!
    }

private var _fireFlameCurved: ImageVector? = null
