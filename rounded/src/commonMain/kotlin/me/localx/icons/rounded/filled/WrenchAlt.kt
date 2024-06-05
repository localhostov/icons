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

public val Icons.Filled.WrenchAlt: ImageVector
    get() {
        if (_wrenchAlt != null) {
            return _wrenchAlt!!
        }
        _wrenchAlt = Builder(name = "WrenchAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.737f, 5.48f)
                curveToRelative(-0.131f, -0.457f, -1.126f, -1.18f, -1.946f, -0.36f)
                curveToRelative(-0.82f, 0.82f, -3.316f, 3.316f, -3.316f, 3.316f)
                curveToRelative(-0.787f, 0.787f, -2.074f, 0.764f, -2.853f, -0.036f)
                curveToRelative(-0.799f, -0.779f, -0.824f, -2.067f, -0.037f, -2.854f)
                curveToRelative(0.0f, 0.0f, 2.496f, -2.496f, 3.316f, -3.316f)
                curveToRelative(0.82f, -0.82f, 0.097f, -1.815f, -0.36f, -1.946f)
                curveToRelative(-0.748f, -0.214f, -1.523f, -0.308f, -2.317f, -0.279f)
                curveToRelative(-3.773f, 0.134f, -6.953f, 3.199f, -7.207f, 6.965f)
                curveToRelative(-0.045f, 0.665f, -0.005f, 1.317f, 0.117f, 1.95f)
                curveToRelative(0.182f, 0.94f, -0.163f, 1.905f, -0.84f, 2.583f)
                lineTo(0.87f, 18.906f)
                curveToRelative(-1.162f, 1.163f, -1.155f, 3.059f, -0.007f, 4.231f)
                curveToRelative(1.172f, 1.149f, 3.068f, 1.156f, 4.231f, -0.006f)
                lineToRelative(7.424f, -7.404f)
                curveToRelative(0.677f, -0.677f, 1.642f, -1.022f, 2.583f, -0.84f)
                curveToRelative(0.633f, 0.122f, 1.285f, 0.162f, 1.95f, 0.117f)
                curveToRelative(3.767f, -0.254f, 6.831f, -3.434f, 6.965f, -7.207f)
                curveToRelative(0.028f, -0.794f, -0.065f, -1.569f, -0.279f, -2.317f)
                close()
            }
        }
        .build()
        return _wrenchAlt!!
    }

private var _wrenchAlt: ImageVector? = null
