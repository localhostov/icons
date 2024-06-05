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

public val Icons.Filled.Cannabis: ImageVector
    get() {
        if (_cannabis != null) {
            return _cannabis!!
        }
        _cannabis = Builder(name = "Cannabis", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.744f, 7.815f)
                curveToRelative(-0.357f, -0.578f, -1.006f, -0.881f, -1.675f, -0.802f)
                curveToRelative(-1.454f, 0.178f, -4.017f, 0.601f, -6.319f, 1.54f)
                curveToRelative(-0.567f, -2.745f, -1.572f, -5.899f, -2.201f, -7.499f)
                curveToRelative(-0.251f, -0.64f, -0.858f, -1.054f, -1.546f, -1.054f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.69f, 0.0f, -1.299f, 0.417f, -1.55f, 1.059f)
                curveToRelative(-0.616f, 1.571f, -1.624f, 4.8f, -2.197f, 7.51f)
                curveToRelative(-2.211f, -0.892f, -4.716f, -1.393f, -6.369f, -1.56f)
                curveToRelative(-0.668f, -0.069f, -1.289f, 0.245f, -1.635f, 0.814f)
                curveToRelative(-0.346f, 0.57f, -0.334f, 1.27f, 0.032f, 1.828f)
                curveToRelative(0.734f, 1.12f, 2.172f, 2.747f, 3.703f, 4.22f)
                curveToRelative(-0.685f, 0.214f, -1.966f, 0.673f, -1.966f, 0.673f)
                curveToRelative(-0.628f, 0.225f, -1.04f, 0.801f, -1.05f, 1.468f)
                curveToRelative(-0.01f, 0.665f, 0.383f, 1.251f, 1.003f, 1.495f)
                curveToRelative(1.643f, 0.643f, 3.135f, 1.077f, 4.522f, 1.313f)
                curveToRelative(-0.18f, 0.406f, -0.344f, 0.819f, -0.437f, 1.154f)
                curveToRelative(-0.157f, 0.57f, 0.01f, 1.177f, 0.435f, 1.584f)
                curveToRelative(0.421f, 0.404f, 1.026f, 0.543f, 1.585f, 0.364f)
                curveToRelative(0.665f, -0.215f, 1.922f, -0.906f, 2.922f, -1.922f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(1.0f, 1.0f, 2.258f, 1.711f, 2.926f, 1.924f)
                curveToRelative(0.159f, 0.051f, 0.322f, 0.076f, 0.484f, 0.076f)
                curveToRelative(0.403f, 0.0f, 0.799f, -0.155f, 1.1f, -0.444f)
                curveToRelative(0.423f, -0.407f, 0.589f, -1.012f, 0.432f, -1.579f)
                curveToRelative(-0.077f, -0.277f, -0.226f, -0.664f, -0.443f, -1.154f)
                curveToRelative(2.19f, -0.359f, 3.97f, -1.047f, 4.536f, -1.283f)
                curveToRelative(0.618f, -0.256f, 1.0f, -0.854f, 0.974f, -1.522f)
                curveToRelative(-0.027f, -0.67f, -0.456f, -1.237f, -1.095f, -1.443f)
                curveToRelative(0.0f, 0.0f, -1.42f, -0.469f, -1.901f, -0.615f)
                curveToRelative(1.6f, -1.569f, 2.997f, -3.24f, 3.702f, -4.302f)
                curveToRelative(0.373f, -0.563f, 0.384f, -1.269f, 0.03f, -1.842f)
                close()
                moveTo(13.0f, 20.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _cannabis!!
    }

private var _cannabis: ImageVector? = null
