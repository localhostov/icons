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

public val Icons.Filled.HandshakeSimpleSlash: ImageVector
    get() {
        if (_handshakeSimpleSlash != null) {
            return _handshakeSimpleSlash!!
        }
        _handshakeSimpleSlash = Builder(name = "HandshakeSimpleSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.462f, 7.945f)
                lineToRelative(0.231f, -0.246f)
                curveToRelative(0.383f, -0.388f, 0.388f, -1.011f, 0.011f, -1.405f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.388f, -0.406f, -1.033f, -0.416f, -1.434f, -0.023f)
                lineToRelative(-2.81f, 2.736f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.133f, -1.084f)
                lineToRelative(7.211f, 7.127f)
                lineToRelative(-1.279f, 1.022f)
                lineToRelative(4.768f, 4.806f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.024f, 0.0f, 1.415f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.39f, 0.39f, -1.023f, 0.391f, -1.414f, 0.0f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.683f, 0.293f, 0.293f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0.0f)
                lineToRelative(1.916f, 1.878f)
                lineToRelative(1.128f, -0.645f)
                curveToRelative(0.687f, -0.344f, 1.456f, -0.525f, 2.227f, -0.525f)
                curveToRelative(1.28f, 0.0f, 2.471f, 0.461f, 3.39f, 1.298f)
                lineToRelative(0.617f, 0.593f)
                lineToRelative(-3.36f, 3.28f)
                lineToRelative(1.414f, 1.414f)
                lineTo(14.685f, 2.073f)
                curveToRelative(1.51f, -1.173f, 3.618f, -1.393f, 5.308f, -0.548f)
                lineToRelative(3.156f, 1.505f)
                curveToRelative(0.52f, 0.248f, 0.852f, 0.77f, 0.854f, 1.346f)
                curveToRelative(0.009f, 2.607f, 0.035f, 9.786f, 0.035f, 10.624f)
                curveToRelative(0.0f, 1.026f, -1.038f, 1.0f, -1.038f, 1.0f)
                horizontalLineToRelative(-0.326f)
                lineTo(14.462f, 7.945f)
                close()
                moveTo(1.038f, 16.0f)
                horizontalLineToRelative(1.386f)
                curveToRelative(0.448f, 0.0f, 0.882f, 0.15f, 1.234f, 0.426f)
                lineToRelative(6.138f, 4.815f)
                curveToRelative(1.313f, 1.03f, 3.163f, 1.022f, 4.467f, -0.02f)
                lineToRelative(1.499f, -1.198f)
                lineTo(0.038f, 4.299f)
                verticalLineTo(15.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _handshakeSimpleSlash!!
    }

private var _handshakeSimpleSlash: ImageVector? = null
