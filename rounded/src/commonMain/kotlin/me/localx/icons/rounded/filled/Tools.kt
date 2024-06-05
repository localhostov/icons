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

public val Icons.Filled.Tools: ImageVector
    get() {
        if (_tools != null) {
            return _tools!!
        }
        _tools = Builder(name = "Tools", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.527f, 1.839f)
                lineTo(1.846f, 0.52f)
                curveTo(2.414f, -0.048f, 3.293f, -0.164f, 3.989f, 0.238f)
                lineToRelative(3.832f, 2.211f)
                curveToRelative(0.733f, 0.423f, 1.185f, 1.205f, 1.185f, 2.051f)
                verticalLineToRelative(3.086f)
                reflectiveCurveToRelative(4.726f, 4.726f, 4.726f, 4.726f)
                curveToRelative(1.115f, -0.525f, 2.482f, -0.339f, 3.404f, 0.58f)
                lineToRelative(5.889f, 5.872f)
                curveToRelative(1.111f, 1.108f, 1.325f, 2.916f, 0.329f, 4.129f)
                curveToRelative(-1.145f, 1.395f, -3.212f, 1.472f, -4.458f, 0.229f)
                lineToRelative(-6.01f, -5.993f)
                curveToRelative(-0.926f, -0.923f, -1.109f, -2.295f, -0.574f, -3.409f)
                lineToRelative(-4.72f, -4.72f)
                horizontalLineToRelative(-3.086f)
                curveToRelative(-0.846f, 0.0f, -1.629f, -0.452f, -2.051f, -1.185f)
                lineTo(0.245f, 3.982f)
                curveTo(-0.156f, 3.286f, -0.041f, 2.407f, 0.527f, 1.839f)
                close()
                moveTo(11.006f, 4.5f)
                verticalLineToRelative(2.258f)
                lineToRelative(3.315f, 3.314f)
                curveToRelative(1.524f, -0.212f, 3.104f, 0.283f, 4.227f, 1.403f)
                lineToRelative(2.208f, 2.202f)
                curveToRelative(1.887f, -1.319f, 3.164f, -3.478f, 3.249f, -5.881f)
                curveToRelative(0.028f, -0.794f, -0.065f, -1.569f, -0.279f, -2.317f)
                curveToRelative(-0.131f, -0.457f, -1.126f, -1.18f, -1.946f, -0.36f)
                curveToRelative(-0.82f, 0.82f, -3.316f, 3.316f, -3.316f, 3.316f)
                curveToRelative(-0.787f, 0.787f, -2.074f, 0.764f, -2.853f, -0.036f)
                curveToRelative(-0.799f, -0.779f, -0.824f, -2.067f, -0.037f, -2.854f)
                curveToRelative(0.0f, 0.0f, 2.496f, -2.496f, 3.316f, -3.316f)
                curveToRelative(0.82f, -0.82f, 0.097f, -1.815f, -0.36f, -1.946f)
                curveToRelative(-0.748f, -0.214f, -1.523f, -0.308f, -2.317f, -0.279f)
                curveToRelative(-2.211f, 0.079f, -4.213f, 1.168f, -5.547f, 2.811f)
                curveToRelative(0.22f, 0.526f, 0.34f, 1.097f, 0.34f, 1.684f)
                close()
                moveTo(10.068f, 14.304f)
                lineToRelative(-2.293f, -2.293f)
                lineTo(0.859f, 18.906f)
                curveToRelative(-1.162f, 1.163f, -1.155f, 3.059f, -0.007f, 4.231f)
                curveToRelative(1.172f, 1.149f, 3.068f, 1.156f, 4.231f, -0.006f)
                lineToRelative(5.615f, -5.599f)
                curveToRelative(-0.568f, -0.974f, -0.792f, -2.113f, -0.63f, -3.228f)
                close()
            }
        }
        .build()
        return _tools!!
    }

private var _tools: ImageVector? = null
