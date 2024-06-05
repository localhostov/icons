package me.localx.icons.rounded.bold

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

public val Icons.Bold.Tools: ImageVector
    get() {
        if (_tools != null) {
            return _tools!!
        }
        _tools = Builder(name = "Tools", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.54f, 15.49f)
                curveToRelative(0.596f, 0.595f, 0.596f, 1.561f, 0.0f, 2.157f)
                lineToRelative(-5.508f, 5.508f)
                curveToRelative(-1.188f, 1.188f, -3.138f, 1.15f, -4.278f, -0.115f)
                curveToRelative(-1.068f, -1.186f, -0.901f, -3.043f, 0.227f, -4.171f)
                lineToRelative(5.39f, -5.39f)
                curveToRelative(0.595f, -0.595f, 1.561f, -0.596f, 2.156f, 0.0f)
                lineToRelative(2.012f, 2.012f)
                close()
                moveTo(15.952f, 11.003f)
                curveToRelative(1.263f, 0.002f, 2.544f, 0.501f, 3.487f, 1.445f)
                curveToRelative(0.561f, 0.552f, 1.313f, 0.446f, 1.561f, 0.275f)
                curveToRelative(1.819f, -1.259f, 3.018f, -3.343f, 3.018f, -5.723f)
                curveToRelative(0.0f, -0.413f, -0.037f, -0.817f, -0.106f, -1.21f)
                curveToRelative(-0.136f, -0.768f, -1.107f, -1.041f, -1.659f, -0.49f)
                lineToRelative(-1.647f, 1.647f)
                curveToRelative(-1.146f, 1.146f, -2.653f, 1.322f, -3.665f, 0.494f)
                curveToRelative(-1.164f, -0.952f, -1.228f, -2.672f, -0.191f, -3.709f)
                lineToRelative(1.965f, -1.965f)
                curveToRelative(0.551f, -0.552f, 0.281f, -1.526f, -0.487f, -1.662f)
                curveToRelative(-0.393f, -0.07f, -0.797f, -0.106f, -1.21f, -0.106f)
                curveToRelative(-2.943f, 0.0f, -5.455f, 1.818f, -6.489f, 4.391f)
                curveToRelative(-0.207f, 0.514f, -0.086f, 1.105f, 0.306f, 1.496f)
                lineToRelative(5.117f, 5.116f)
                close()
                moveTo(18.025f, 13.862f)
                curveToRelative(-0.761f, -0.761f, -1.831f, -1.007f, -2.804f, -0.761f)
                lineToRelative(-7.222f, -7.221f)
                verticalLineToRelative(-1.881f)
                curveToRelative(0.0f, -0.752f, -0.402f, -1.448f, -1.054f, -1.824f)
                lineTo(3.539f, 0.211f)
                curveTo(2.921f, -0.146f, 2.14f, -0.043f, 1.635f, 0.462f)
                lineTo(0.463f, 1.634f)
                curveTo(-0.043f, 2.139f, -0.146f, 2.921f, 0.211f, 3.539f)
                lineToRelative(1.965f, 3.407f)
                curveToRelative(0.376f, 0.652f, 1.071f, 1.053f, 1.823f, 1.053f)
                horizontalLineToRelative(1.878f)
                lineToRelative(7.224f, 7.223f)
                curveToRelative(-0.245f, 0.972f, 0.0f, 2.042f, 0.761f, 2.803f)
                lineToRelative(5.057f, 5.003f)
                curveToRelative(1.147f, 1.147f, 3.128f, 1.256f, 4.274f, 0.108f)
                curveToRelative(1.148f, -1.15f, 1.003f, -2.867f, -0.001f, -4.162f)
                lineToRelative(-5.166f, -5.112f)
                close()
            }
        }
        .build()
        return _tools!!
    }

private var _tools: ImageVector? = null
