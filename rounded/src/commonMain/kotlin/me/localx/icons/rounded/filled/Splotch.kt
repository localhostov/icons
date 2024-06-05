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

public val Icons.Filled.Splotch: ImageVector
    get() {
        if (_splotch != null) {
            return _splotch!!
        }
        _splotch = Builder(name = "Splotch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.571f, 23.999f)
                curveToRelative(-1.94f, 0.0f, -2.843f, -1.174f, -3.64f, -2.21f)
                curveToRelative(-0.58f, -0.754f, -1.18f, -1.534f, -2.257f, -2.092f)
                curveToRelative(-0.983f, -0.509f, -2.23f, -0.603f, -3.437f, -0.694f)
                curveToRelative(-1.788f, -0.135f, -4.238f, -0.319f, -4.238f, -2.813f)
                curveToRelative(0.0f, -1.4f, 0.836f, -2.387f, 1.574f, -3.257f)
                curveToRelative(0.664f, -0.784f, 1.292f, -1.523f, 1.435f, -2.569f)
                curveToRelative(0.116f, -0.85f, -0.446f, -2.042f, -0.989f, -3.194f)
                curveToRelative(-0.844f, -1.788f, -1.894f, -4.013f, -0.048f, -5.397f)
                curveToRelative(1.474f, -1.107f, 3.309f, -0.359f, 5.082f, 0.364f)
                curveToRelative(1.175f, 0.478f, 2.397f, 0.976f, 3.337f, 0.869f)
                curveToRelative(1.066f, -0.117f, 2.246f, -0.895f, 3.286f, -1.581f)
                curveToRelative(1.356f, -0.895f, 2.64f, -1.735f, 3.897f, -1.319f)
                curveToRelative(1.443f, 0.481f, 1.512f, 2.462f, 1.585f, 4.559f)
                curveToRelative(0.035f, 0.995f, 0.094f, 2.66f, 0.398f, 3.005f)
                curveToRelative(0.3f, 0.337f, 0.811f, 0.72f, 1.352f, 1.125f)
                curveToRelative(1.377f, 1.032f, 3.091f, 2.316f, 3.091f, 4.251f)
                curveToRelative(0.0f, 1.899f, -2.245f, 2.655f, -4.226f, 3.321f)
                curveToRelative(-0.855f, 0.288f, -2.027f, 0.682f, -2.308f, 1.003f)
                curveToRelative(-0.304f, 0.349f, -0.626f, 1.474f, -0.885f, 2.378f)
                curveToRelative(-0.599f, 2.089f, -1.217f, 4.25f, -3.011f, 4.25f)
                close()
            }
        }
        .build()
        return _splotch!!
    }

private var _splotch: ImageVector? = null
