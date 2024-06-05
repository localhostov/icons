package me.localx.icons.straight.filled

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
                moveTo(14.423f, 7.945f)
                lineToRelative(0.823f, -0.788f)
                lineToRelative(-1.383f, -1.445f)
                lineToRelative(-3.442f, 3.295f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.133f, -1.084f)
                lineToRelative(7.211f, 7.127f)
                lineToRelative(-1.279f, 1.022f)
                lineToRelative(5.057f, 5.057f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineTo(3.703f, 2.289f)
                lineToRelative(1.01f, -0.764f)
                curveToRelative(0.687f, -0.344f, 1.456f, -0.525f, 2.227f, -0.525f)
                curveToRelative(1.28f, 0.0f, 2.471f, 0.461f, 3.39f, 1.298f)
                lineToRelative(0.617f, 0.593f)
                lineToRelative(-3.36f, 3.28f)
                lineToRelative(1.414f, 1.414f)
                lineTo(14.646f, 2.073f)
                curveToRelative(1.51f, -1.173f, 3.618f, -1.393f, 5.308f, -0.548f)
                lineToRelative(3.046f, 1.523f)
                lineToRelative(1.0f, -0.049f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-1.364f)
                lineTo(14.423f, 7.945f)
                close()
                moveTo(0.0f, 16.0f)
                horizontalLineTo(3.077f)
                lineToRelative(8.923f, 7.0f)
                lineToRelative(3.725f, -2.976f)
                lineTo(0.0f, 4.299f)
                verticalLineToRelative(11.701f)
                close()
            }
        }
        .build()
        return _handshakeSimpleSlash!!
    }

private var _handshakeSimpleSlash: ImageVector? = null
