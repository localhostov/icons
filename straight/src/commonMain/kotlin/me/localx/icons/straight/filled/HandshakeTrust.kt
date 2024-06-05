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

public val Icons.Filled.HandshakeTrust: ImageVector
    get() {
        if (_handshakeTrust != null) {
            return _handshakeTrust!!
        }
        _handshakeTrust = Builder(name = "HandshakeTrust", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                lineToRelative(-2.972f, 0.985f)
                curveToRelative(-0.614f, 0.203f, -1.028f, 0.777f, -1.028f, 1.424f)
                verticalLineToRelative(3.033f)
                curveToRelative(0.0f, 2.662f, 2.925f, 4.332f, 3.822f, 4.78f)
                lineToRelative(0.179f, 0.089f)
                lineToRelative(0.186f, -0.075f)
                curveToRelative(0.895f, -0.36f, 3.813f, -1.769f, 3.813f, -4.795f)
                verticalLineToRelative(-3.033f)
                curveToRelative(0.0f, -0.647f, -0.414f, -1.22f, -1.028f, -1.424f)
                lineToRelative(-2.972f, -0.985f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(13.007f, 16.255f)
                lineToRelative(4.778f, 4.279f)
                lineToRelative(-4.441f, 3.466f)
                horizontalLineToRelative(-2.688f)
                lineToRelative(-5.125f, -4.0f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(5.769f)
                curveToRelative(0.487f, -0.232f, 1.523f, -0.695f, 2.433f, -0.898f)
                curveToRelative(0.458f, 0.438f, 0.932f, 0.807f, 1.368f, 1.106f)
                lineToRelative(-1.644f, 1.605f)
                curveToRelative(-1.066f, 1.068f, -1.232f, 2.759f, -0.389f, 3.926f)
                curveToRelative(0.52f, 0.724f, 1.321f, 1.179f, 2.192f, 1.25f)
                curveToRelative(0.086f, 0.008f, 0.173f, 0.012f, 0.259f, 0.012f)
                curveToRelative(0.792f, 0.0f, 1.549f, -0.312f, 2.084f, -0.85f)
                lineToRelative(0.935f, -0.895f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-3.814f)
                lineToRelative(-7.188f, -6.436f)
                lineToRelative(-2.309f, 2.142f)
                curveToRelative(-0.207f, 0.208f, -0.493f, 0.315f, -0.788f, 0.29f)
                curveToRelative(-0.298f, -0.024f, -0.56f, -0.175f, -0.739f, -0.425f)
                curveToRelative(-0.274f, -0.38f, -0.19f, -0.975f, 0.181f, -1.347f)
                lineToRelative(2.27f, -2.225f)
                lineToRelative(1.556f, -0.007f)
                curveToRelative(0.666f, -0.292f, 1.796f, -0.882f, 2.796f, -1.855f)
                curveToRelative(0.9f, 0.212f, 1.904f, 0.62f, 2.315f, 0.862f)
                horizontalLineToRelative(5.72f)
                close()
            }
        }
        .build()
        return _handshakeTrust!!
    }

private var _handshakeTrust: ImageVector? = null
