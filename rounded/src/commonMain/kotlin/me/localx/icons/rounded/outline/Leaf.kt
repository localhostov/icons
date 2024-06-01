package me.localx.icons.rounded.outline

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

public val Icons.Outline.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.119f, 0.8715f)
                    curveTo(22.8064f, 0.5597f, 22.4286f, 0.3211f, 22.0127f, 0.1729f)
                    curveTo(21.5969f, 0.0247f, 21.1533f, -0.0293f, 20.714f, 0.0145f)
                    curveTo(17.921f, 0.2845f, 8.528f, 1.4476f, 4.9f, 5.0715f)
                    curveTo(3.1658f, 6.8105f, 2.1374f, 9.1304f, 2.0135f, 11.5832f)
                    curveTo(1.8896f, 14.0359f, 2.6789f, 16.4477f, 4.229f, 18.3525f)
                    lineTo(0.289f, 22.2925f)
                    curveTo(0.1069f, 22.4811f, 0.0061f, 22.7337f, 0.0083f, 22.9959f)
                    curveTo(0.0106f, 23.2581f, 0.1158f, 23.509f, 0.3012f, 23.6944f)
                    curveTo(0.4866f, 23.8798f, 0.7374f, 23.9849f, 0.9996f, 23.9872f)
                    curveTo(1.2618f, 23.9895f, 1.5144f, 23.8887f, 1.703f, 23.7065f)
                    lineTo(5.643f, 19.7665f)
                    curveTo(7.5475f, 21.3188f, 9.9599f, 22.1097f, 12.4137f, 21.9865f)
                    curveTo(14.8675f, 21.8633f, 17.1885f, 20.8347f, 18.928f, 19.0995f)
                    curveTo(22.604f, 15.4225f, 23.728f, 6.0585f, 23.987f, 3.2766f)
                    curveTo(24.0293f, 2.8364f, 23.9734f, 2.3924f, 23.8233f, 1.9765f)
                    curveTo(23.6732f, 1.5606f, 23.4327f, 1.1832f, 23.119f, 0.8715f)
                    close()
                    moveTo(17.519f, 17.6815f)
                    curveTo(16.1555f, 19.04f, 14.3442f, 19.8559f, 12.4233f, 19.9768f)
                    curveTo(10.5023f, 20.0977f, 8.6031f, 19.5154f, 7.08f, 18.3385f)
                    lineTo(16.712f, 8.7065f)
                    curveTo(16.8942f, 8.5179f, 16.9949f, 8.2653f, 16.9927f, 8.0031f)
                    curveTo(16.9904f, 7.741f, 16.8852f, 7.4901f, 16.6998f, 7.3047f)
                    curveTo(16.5144f, 7.1193f, 16.2636f, 7.0142f, 16.0014f, 7.0119f)
                    curveTo(15.7392f, 7.0096f, 15.4866f, 7.1104f, 15.298f, 7.2926f)
                    lineTo(5.661f, 16.9245f)
                    curveTo(4.484f, 15.4016f, 3.9015f, 13.5022f, 4.0224f, 11.5812f)
                    curveTo(4.1433f, 9.6602f, 4.9593f, 7.8489f, 6.318f, 6.4855f)
                    curveTo(8.827f, 3.9776f, 15.745f, 2.4996f, 20.907f, 2.0045f)
                    curveTo(21.0532f, 1.9903f, 21.2007f, 2.0085f, 21.3391f, 2.0577f)
                    curveTo(21.4775f, 2.107f, 21.6033f, 2.1861f, 21.7077f, 2.2895f)
                    curveTo(21.812f, 2.3929f, 21.8923f, 2.518f, 21.9428f, 2.6559f)
                    curveTo(21.9934f, 2.7938f, 22.0129f, 2.9412f, 22.0f, 3.0875f)
                    curveTo(21.5f, 8.4746f, 20.059f, 15.1365f, 17.514f, 17.6815f)
                    horizontalLineTo(17.519f)
                    close()
                }
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
