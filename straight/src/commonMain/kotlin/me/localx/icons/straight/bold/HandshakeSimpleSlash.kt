package me.localx.icons.straight.bold

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

public val Icons.Bold.HandshakeSimpleSlash: ImageVector
    get() {
        if (_handshakeSimpleSlash != null) {
            return _handshakeSimpleSlash!!
        }
        _handshakeSimpleSlash = Builder(name = "HandshakeSimpleSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.15f, 3.262f)
                lineToRelative(3.476f, 1.738f)
                horizontalLineToRelative(3.354f)
                lineTo(23.98f, 2.0f)
                horizontalLineToRelative(-2.646f)
                lineToRelative(-2.844f, -1.422f)
                curveTo(16.477f, -0.428f, 13.882f, -0.018f, 12.347f, 1.436f)
                lineToRelative(-0.358f, 0.303f)
                lineToRelative(-0.341f, -0.311f)
                curveToRelative(-1.012f, -0.921f, -2.322f, -1.428f, -3.728f, -1.428f)
                curveToRelative(-0.845f, 0.0f, -1.691f, 0.2f, -2.45f, 0.578f)
                lineToRelative(-1.847f, 0.924f)
                lineTo(2.16f, 0.04f)
                lineTo(0.039f, 2.161f)
                lineTo(21.84f, 23.96f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-4.378f, -4.378f)
                lineToRelative(2.018f, -1.462f)
                horizontalLineToRelative(2.379f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.033f)
                lineTo(13.407f, 4.479f)
                lineToRelative(0.937f, -0.806f)
                curveToRelative(0.737f, -0.696f, 1.896f, -0.865f, 2.807f, -0.412f)
                close()
                moveTo(6.81f, 3.262f)
                curveToRelative(0.849f, -0.423f, 2.048f, -0.315f, 2.816f, 0.384f)
                lineToRelative(0.05f, 0.046f)
                lineToRelative(-2.095f, 1.77f)
                lineToRelative(-1.723f, -1.723f)
                lineToRelative(0.952f, -0.476f)
                close()
                moveTo(18.931f, 14.229f)
                lineToRelative(-1.497f, 1.084f)
                lineToRelative(-5.635f, -5.635f)
                lineToRelative(1.41f, -1.157f)
                lineToRelative(5.721f, 5.708f)
                close()
                moveTo(13.333f, 18.283f)
                lineToRelative(2.148f, 2.148f)
                lineToRelative(-3.508f, 2.541f)
                lineTo(2.488f, 16.0f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.473f, 13.0f)
                lineToRelative(8.515f, 6.258f)
                lineToRelative(1.346f, -0.975f)
                close()
            }
        }
        .build()
        return _handshakeSimpleSlash!!
    }

private var _handshakeSimpleSlash: ImageVector? = null
