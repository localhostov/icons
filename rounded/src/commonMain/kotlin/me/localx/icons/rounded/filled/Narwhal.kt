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

public val Icons.Filled.Narwhal: ImageVector
    get() {
        if (_narwhal != null) {
            return _narwhal!!
        }
        _narwhal = Builder(name = "Narwhal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.386f, 10.088f)
                lineTo(23.979f, 0.751f)
                curveToRelative(0.071f, -0.259f, -0.041f, -0.534f, -0.273f, -0.669f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.283f, -0.166f, -0.646f, -0.071f, -0.812f, 0.211f)
                lineToRelative(-4.693f, 8.017f)
                curveToRelative(-0.702f, -0.201f, -1.443f, -0.308f, -2.208f, -0.308f)
                curveToRelative(-0.994f, 0.0f, -1.676f, 0.0f, -1.694f, 0.001f)
                curveToRelative(0.0f, 0.0f, -0.001f, 0.0f, -0.002f, 0.0f)
                curveToRelative(-3.221f, 0.083f, -6.516f, 2.031f, -8.655f, 3.769f)
                curveToRelative(-0.663f, 0.538f, -1.653f, 0.067f, -1.653f, -0.787f)
                verticalLineToRelative(-0.026f)
                curveToRelative(0.0f, -0.308f, 0.13f, -0.595f, 0.359f, -0.791f)
                curveToRelative(0.575f, -0.491f, 1.237f, -0.896f, 1.95f, -1.369f)
                curveToRelative(0.033f, -0.228f, 0.068f, -0.455f, 0.106f, -0.682f)
                lineToRelative(0.466f, -2.765f)
                curveToRelative(2.186f, -0.566f, 3.879f, -2.47f, 4.129f, -4.767f)
                curveToRelative(0.035f, -0.324f, -0.226f, -0.606f, -0.552f, -0.585f)
                curveToRelative(-3.714f, 0.243f, -4.948f, 2.775f, -4.948f, 2.775f)
                curveTo(5.499f, 2.775f, 4.219f, 0.231f, 0.523f, 0.0f)
                curveTo(0.223f, -0.019f, -0.029f, 0.234f, 0.001f, 0.533f)
                curveToRelative(0.203f, 2.041f, 1.543f, 3.781f, 3.356f, 4.555f)
                lineToRelative(-0.503f, 0.754f)
                curveTo(0.992f, 8.636f, -0.001f, 11.918f, -0.001f, 15.275f)
                lineTo(-0.001f, 15.275f)
                curveToRelative(0.0f, 4.818f, 3.906f, 8.725f, 8.725f, 8.725f)
                horizontalLineToRelative(7.161f)
                curveToRelative(4.486f, 0.0f, 8.185f, -3.641f, 8.115f, -8.127f)
                curveToRelative(-0.036f, -2.291f, -1.037f, -4.348f, -2.613f, -5.784f)
                close()
                moveTo(17.5f, 17.999f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _narwhal!!
    }

private var _narwhal: ImageVector? = null
