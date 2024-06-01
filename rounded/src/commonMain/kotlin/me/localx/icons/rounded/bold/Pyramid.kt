package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Pyramid: ImageVector
    get() {
        if (_pyramid != null) {
            return _pyramid!!
        }
        _pyramid = Builder(name = "Pyramid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.5101f, 23.9999f)
                    horizontalLineTo(4.4881f)
                    curveTo(3.716f, 24.0023f, 2.9566f, 23.8036f, 2.2846f, 23.4232f)
                    curveTo(1.6127f, 23.0429f, 1.0514f, 22.4941f, 0.6561f, 21.8309f)
                    curveTo(0.2535f, 21.1689f, 0.0286f, 20.4143f, 0.0032f, 19.6399f)
                    curveTo(-0.0223f, 18.8656f, 0.1527f, 18.0978f, 0.5111f, 17.4109f)
                    lineTo(8.0221f, 2.4279f)
                    curveTo(8.3971f, 1.696f, 8.967f, 1.0819f, 9.669f, 0.6534f)
                    curveTo(10.371f, 0.2249f, 11.1777f, -0.0012f, 12.0001f, -1.0E-4f)
                    curveTo(12.8223f, -8.0E-4f, 13.6287f, 0.2255f, 14.3304f, 0.654f)
                    curveTo(15.0322f, 1.0824f, 15.602f, 1.6962f, 15.9771f, 2.4279f)
                    lineTo(23.4971f, 17.4279f)
                    curveTo(23.8502f, 18.1135f, 24.0215f, 18.8783f, 23.9946f, 19.649f)
                    curveTo(23.9677f, 20.4198f, 23.7436f, 21.1708f, 23.3436f, 21.8301f)
                    curveTo(22.9435f, 22.4895f, 22.3811f, 23.0352f, 21.7099f, 23.4151f)
                    curveTo(21.0387f, 23.795f, 20.2813f, 23.9963f, 19.5101f, 23.9999f)
                    close()
                    moveTo(10.6771f, 3.8079f)
                    lineTo(3.1711f, 18.7809f)
                    curveTo(3.0473f, 19.0112f, 2.9859f, 19.2698f, 2.9929f, 19.5312f)
                    curveTo(2.9999f, 19.7926f, 3.0751f, 20.0476f, 3.2111f, 20.2709f)
                    curveTo(3.342f, 20.4926f, 3.5289f, 20.6761f, 3.753f, 20.803f)
                    curveTo(3.9771f, 20.9299f, 4.2306f, 20.9957f, 4.4881f, 20.9939f)
                    horizontalLineTo(19.5101f)
                    curveTo(19.7685f, 20.9938f, 20.0225f, 20.9269f, 20.2474f, 20.7998f)
                    curveTo(20.4724f, 20.6726f, 20.6607f, 20.4895f, 20.7941f, 20.2682f)
                    curveTo(20.9275f, 20.0469f, 21.0015f, 19.7949f, 21.0088f, 19.5366f)
                    curveTo(21.0162f, 19.2783f, 20.9567f, 19.0224f, 20.8361f, 18.7939f)
                    lineTo(13.3171f, 3.7939f)
                    curveTo(13.1922f, 3.5534f, 13.0029f, 3.3523f, 12.7703f, 3.2132f)
                    curveTo(12.5377f, 3.074f, 12.2711f, 3.0023f, 12.0001f, 3.0059f)
                    curveTo(11.7268f, 3.0031f, 11.4581f, 3.0768f, 11.2243f, 3.2185f)
                    curveTo(10.9906f, 3.3602f, 10.8011f, 3.5643f, 10.6771f, 3.8079f)
                    close()
                }
            }
        }
        .build()
        return _pyramid!!
    }

private var _pyramid: ImageVector? = null
