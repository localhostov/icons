package me.localx.icons.rounded.filled

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

public val Icons.Filled.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.7818f, 12.1729f)
                    curveTo(23.5796f, 12.752f, 23.2494f, 13.278f, 22.8158f, 13.7119f)
                    lineTo(13.7158f, 22.8119f)
                    curveTo(13.2815f, 23.2412f, 12.7552f, 23.566f, 12.1768f, 23.7619f)
                    curveTo(12.0167f, 22.82f, 11.9884f, 21.8605f, 12.0928f, 20.9109f)
                    curveTo(12.3537f, 18.6601f, 13.3676f, 16.5635f, 14.9699f, 14.9613f)
                    curveTo(16.5722f, 13.3592f, 18.669f, 12.3456f, 20.9198f, 12.0849f)
                    curveTo(21.8732f, 11.9802f, 22.8366f, 12.0099f, 23.7818f, 12.1729f)
                    close()
                    moveTo(10.0998f, 20.6999f)
                    curveTo(10.4119f, 17.9964f, 11.629f, 15.4778f, 13.5534f, 13.5535f)
                    curveTo(15.4778f, 11.6291f, 17.9963f, 10.412f, 20.6998f, 10.0999f)
                    curveTo(21.7746f, 9.9846f, 22.8598f, 10.0108f, 23.9278f, 10.1779f)
                    curveTo(23.5854f, 7.983f, 22.6421f, 5.9257f, 21.2025f, 4.234f)
                    curveTo(19.7629f, 2.5422f, 17.8831f, 1.2819f, 15.7713f, 0.5926f)
                    curveTo(13.6595f, -0.0966f, 11.3981f, -0.1878f, 9.2377f, 0.329f)
                    curveTo(7.0772f, 0.8459f, 5.102f, 1.9507f, 3.5308f, 3.521f)
                    curveTo(1.9595f, 5.0913f, 0.8536f, 7.0659f, 0.3355f, 9.226f)
                    curveTo(-0.1826f, 11.3862f, -0.0927f, 13.6476f, 0.5953f, 15.7598f)
                    curveTo(1.2833f, 17.872f, 2.5425f, 19.7525f, 4.2335f, 21.1931f)
                    curveTo(5.9244f, 22.6338f, 7.9811f, 23.5782f, 10.1758f, 23.9219f)
                    curveTo(10.0093f, 22.8559f, 9.9838f, 21.7726f, 10.0998f, 20.6999f)
                    close()
                }
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
