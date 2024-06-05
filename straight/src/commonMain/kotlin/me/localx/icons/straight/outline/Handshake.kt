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

public val Icons.Outline.Handshake: ImageVector
    get() {
        if (_handshake != null) {
            return _handshake!!
        }
        _handshake = Builder(name = "Handshake", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.019f, 4.81f)
                curveToRelative(0.891f, -0.837f, 2.284f, -1.042f, 3.374f, -0.495f)
                lineToRelative(3.371f, 1.686f)
                horizontalLineToRelative(3.236f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.764f)
                lineToRelative(-2.948f, -1.475f)
                curveToRelative(-1.824f, -0.913f, -4.153f, -0.574f, -5.641f, 0.828f)
                lineToRelative(-0.618f, 0.582f)
                lineToRelative(-0.7f, -0.638f)
                curveToRelative(-0.919f, -0.837f, -2.109f, -1.298f, -3.39f, -1.298f)
                curveToRelative(-0.771f, 0.0f, -1.54f, 0.182f, -2.227f, 0.525f)
                lineToRelative(-2.949f, 1.475f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.236f)
                lineToRelative(3.372f, -1.686f)
                curveToRelative(1.022f, -0.514f, 2.458f, -0.375f, 3.374f, 0.462f)
                lineToRelative(0.587f, 0.535f)
                lineToRelative(-2.646f, 2.492f)
                curveToRelative(-1.073f, 1.072f, -1.244f, 2.767f, -0.398f, 3.938f)
                curveToRelative(0.52f, 0.723f, 1.399f, 1.259f, 2.444f, 1.259f)
                curveToRelative(0.793f, 0.0f, 1.554f, -0.312f, 2.104f, -0.863f)
                lineToRelative(1.006f, -0.963f)
                lineToRelative(6.343f, 4.757f)
                lineToRelative(-7.422f, 5.55f)
                lineTo(3.333f, 15.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.667f)
                lineToRelative(9.333f, 6.979f)
                lineToRelative(9.333f, -6.979f)
                horizontalLineToRelative(2.667f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.487f)
                lineToRelative(-6.97f, -5.227f)
                lineToRelative(1.688f, -1.616f)
                lineToRelative(-1.383f, -1.445f)
                lineToRelative(-4.173f, 3.995f)
                curveToRelative(-0.208f, 0.208f, -0.491f, 0.315f, -0.788f, 0.29f)
                curveToRelative(-0.298f, -0.024f, -0.56f, -0.175f, -0.739f, -0.425f)
                curveToRelative(-0.274f, -0.38f, -0.19f, -0.975f, 0.168f, -1.334f)
                lineToRelative(4.703f, -4.429f)
                close()
            }
        }
        .build()
        return _handshake!!
    }

private var _handshake: ImageVector? = null
