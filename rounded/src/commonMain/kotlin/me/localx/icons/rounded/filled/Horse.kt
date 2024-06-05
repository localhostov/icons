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

public val Icons.Filled.Horse: ImageVector
    get() {
        if (_horse != null) {
            return _horse!!
        }
        _horse = Builder(name = "Horse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.217f)
                curveToRelative(0.0f, 0.732f, -0.555f, 1.345f, -1.283f, 1.418f)
                lineToRelative(-2.816f, 0.282f)
                curveToRelative(-0.511f, 0.051f, -0.901f, 0.481f, -0.901f, 0.995f)
                verticalLineToRelative(1.994f)
                curveToRelative(0.0f, 1.48f, -0.198f, 2.436f, -0.615f, 3.896f)
                lineToRelative(-0.385f, 1.811f)
                verticalLineToRelative(3.395f)
                curveToRelative(0.0f, 1.215f, -1.083f, 2.176f, -2.336f, 1.973f)
                curveToRelative(-0.983f, -0.16f, -1.664f, -1.083f, -1.664f, -2.08f)
                verticalLineToRelative(-2.893f)
                horizontalLineToRelative(-4.383f)
                lineToRelative(-0.401f, 3.245f)
                curveToRelative(-0.124f, 1.002f, -0.884f, 1.748f, -2.255f, 1.748f)
                curveToRelative(-1.214f, 0.0f, -1.962f, -1.065f, -1.795f, -2.267f)
                lineToRelative(0.366f, -2.646f)
                curveToRelative(-0.112f, -0.36f, -0.251f, -0.755f, -0.396f, -1.172f)
                curveToRelative(-0.489f, -1.4f, -1.087f, -3.127f, -1.133f, -4.72f)
                curveToRelative(-1.323f, 1.083f, -2.003f, 3.02f, -2.003f, 5.812f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -5.683f, 2.546f, -7.73f, 4.682f, -8.448f)
                curveToRelative(0.734f, -0.907f, 2.059f, -1.552f, 3.312f, -1.552f)
                horizontalLineToRelative(3.006f)
                curveToRelative(1.0f, 0.0f, 1.007f, -0.829f, 1.021f, -1.007f)
                curveToRelative(0.152f, -1.903f, 1.165f, -4.703f, 4.058f, -5.655f)
                curveToRelative(0.237f, -1.048f, 1.019f, -2.003f, 2.033f, -2.315f)
                curveToRelative(0.441f, -0.136f, 0.888f, 0.208f, 0.888f, 0.669f)
                verticalLineToRelative(1.878f)
                curveToRelative(0.477f, 1.907f, 2.04f, 3.493f, 4.138f, 4.335f)
                curveToRelative(0.527f, 0.212f, 0.862f, 0.737f, 0.862f, 1.305f)
                close()
            }
        }
        .build()
        return _horse!!
    }

private var _horse: ImageVector? = null
