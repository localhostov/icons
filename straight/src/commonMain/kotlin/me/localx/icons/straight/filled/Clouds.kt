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

public val Icons.Filled.Clouds: ImageVector
    get() {
        if (_clouds != null) {
            return _clouds!!
        }
        _clouds = Builder(name = "Clouds", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(404.413f, 511.84f)
                horizontalLineTo(212.951f)
                curveToRelative(-47.053f, -0.445f, -84.836f, -38.95f, -84.391f, -86.002f)
                curveToRelative(0.365f, -38.561f, 26.584f, -72.069f, 63.926f, -81.697f)
                curveToRelative(-13.083f, -143.213f, 188.696f, -181.336f, 228.669f, -43.717f)
                curveToRelative(58.017f, 9.222f, 97.572f, 63.731f, 88.35f, 121.747f)
                curveTo(501.292f, 473.838f, 456.728f, 511.862f, 404.413f, 511.84f)
                close()
                moveTo(85.31f, 426.746f)
                curveToRelative(-0.072f, -45.932f, 24.59f, -88.346f, 64.544f, -111.005f)
                curveToRelative(15.274f, -160.658f, 236.732f, -198.227f, 303.552f, -51.056f)
                curveToRelative(21.669f, 7.467f, 41.309f, 19.862f, 57.375f, 36.208f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.68f, -79.907f, -54.245f, -149.559f, -132.109f, -167.529f)
                curveTo(358.225f, 41.621f, 267.279f, -16.175f, 175.538f, 4.272f)
                reflectiveCurveTo(26.0f, 115.665f, 46.447f, 207.406f)
                curveToRelative(3.27f, 14.672f, 8.469f, 28.846f, 15.462f, 42.152f)
                curveTo(5.186f, 280.757f, -15.506f, 352.032f, 15.692f, 408.756f)
                curveToRelative(16.016f, 29.12f, 43.64f, 50.072f, 76.0f, 57.644f)
                curveTo(87.48f, 453.603f, 85.326f, 440.218f, 85.31f, 426.746f)
                close()
            }
        }
        .build()
        return _clouds!!
    }

private var _clouds: ImageVector? = null
