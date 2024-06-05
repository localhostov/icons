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

public val Icons.Outline.HandshakeSimpleSlash: ImageVector
    get() {
        if (_handshakeSimpleSlash != null) {
            return _handshakeSimpleSlash!!
        }
        _handshakeSimpleSlash = Builder(name = "HandshakeSimpleSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.019f, 3.82f)
                curveToRelative(0.891f, -0.838f, 2.282f, -1.041f, 3.374f, -0.496f)
                lineToRelative(3.371f, 1.686f)
                horizontalLineToRelative(3.236f)
                lineTo(24.0f, 3.01f)
                horizontalLineToRelative(-2.764f)
                lineToRelative(-2.949f, -1.475f)
                curveToRelative(-1.827f, -0.914f, -4.154f, -0.571f, -5.64f, 0.829f)
                lineToRelative(-0.618f, 0.582f)
                lineToRelative(-0.7f, -0.637f)
                curveToRelative(-0.919f, -0.837f, -2.11f, -1.298f, -3.391f, -1.298f)
                curveToRelative(-0.769f, 0.0f, -1.539f, 0.182f, -2.227f, 0.525f)
                lineToRelative(-1.842f, 0.921f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineTo(22.543f, 23.957f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-4.861f, -4.861f)
                lineToRelative(2.237f, -1.672f)
                horizontalLineToRelative(2.667f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.585f)
                lineToRelative(-6.027f, -6.036f)
                lineToRelative(0.843f, -0.807f)
                lineToRelative(-1.383f, -1.444f)
                lineToRelative(-3.94f, 3.771f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(14.019f, 3.82f)
                close()
                moveTo(6.608f, 3.324f)
                curveToRelative(1.026f, -0.514f, 2.457f, -0.374f, 3.375f, 0.462f)
                lineToRelative(0.586f, 0.534f)
                lineToRelative(-2.489f, 2.344f)
                lineToRelative(-2.718f, -2.718f)
                lineToRelative(1.246f, -0.623f)
                close()
                moveTo(13.943f, 9.357f)
                lineToRelative(5.535f, 5.543f)
                lineToRelative(-1.809f, 1.353f)
                lineToRelative(-5.346f, -5.346f)
                lineToRelative(1.62f, -1.551f)
                close()
                moveTo(14.433f, 18.674f)
                lineToRelative(1.429f, 1.429f)
                lineToRelative(-3.86f, 2.887f)
                lineTo(2.667f, 16.01f)
                lineTo(0.0f, 16.01f)
                verticalLineToRelative(-2.0f)
                lineTo(3.333f, 14.01f)
                lineToRelative(8.667f, 6.482f)
                lineToRelative(2.432f, -1.819f)
                close()
            }
        }
        .build()
        return _handshakeSimpleSlash!!
    }

private var _handshakeSimpleSlash: ImageVector? = null
