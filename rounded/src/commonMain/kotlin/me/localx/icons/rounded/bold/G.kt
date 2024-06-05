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

public val Icons.Bold.G: ImageVector
    get() {
        if (_g != null) {
            return _g!!
        }
        _g = Builder(name = "G", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.049f, 24.0f)
                curveToRelative(-2.73f, 0.0f, -5.237f, -1.039f, -7.124f, -2.925f)
                curveToRelative(-1.886f, -1.886f, -2.925f, -4.394f, -2.925f, -7.062f)
                verticalLineToRelative(-3.716f)
                curveToRelative(0.0f, -2.807f, 1.164f, -5.541f, 3.192f, -7.5f)
                curveTo(7.151f, 0.904f, 9.687f, -0.084f, 12.344f, 0.006f)
                curveToRelative(3.705f, 0.129f, 7.032f, 2.274f, 8.685f, 5.599f)
                curveToRelative(0.369f, 0.742f, 0.066f, 1.642f, -0.676f, 2.011f)
                curveToRelative(-0.741f, 0.367f, -1.642f, 0.066f, -2.011f, -0.676f)
                curveToRelative(-1.162f, -2.337f, -3.5f, -3.845f, -6.103f, -3.936f)
                curveToRelative(-1.821f, -0.062f, -3.594f, 0.629f, -4.963f, 1.951f)
                curveToRelative(-1.447f, 1.397f, -2.276f, 3.344f, -2.276f, 5.342f)
                verticalLineToRelative(3.716f)
                curveToRelative(-0.064f, 7.642f, 10.798f, 9.481f, 13.851f, 3.121f)
                curveToRelative(0.318f, -0.655f, 0.048f, -1.211f, -0.083f, -1.42f)
                curveToRelative(-0.135f, -0.215f, -0.529f, -0.715f, -1.285f, -0.715f)
                horizontalLineToRelative(-3.984f)
                curveToRelative(-1.972f, -0.033f, -1.971f, -2.967f, 0.0f, -3.0f)
                horizontalLineToRelative(3.984f)
                curveToRelative(1.564f, 0.0f, 2.995f, 0.793f, 3.827f, 2.123f)
                curveToRelative(0.825f, 1.316f, 0.914f, 2.932f, 0.239f, 4.322f)
                curveToRelative(-1.714f, 3.531f, -5.178f, 5.556f, -9.501f, 5.555f)
                close()
            }
        }
        .build()
        return _g!!
    }

private var _g: ImageVector? = null
