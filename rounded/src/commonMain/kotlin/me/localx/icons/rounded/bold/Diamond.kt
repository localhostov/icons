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

public val Icons.Bold.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.1479f, 5.7f)
                    lineTo(20.2799f, 1.827f)
                    curveTo(19.8756f, 1.2624f, 19.3426f, 0.8023f, 18.7251f, 0.4846f)
                    curveTo(18.1076f, 0.1669f, 17.4234f, 8.0E-4f, 16.7289f, 0.0f)
                    horizontalLineTo(7.2709f)
                    curveTo(6.5819f, -7.0E-4f, 5.9026f, 0.1621f, 5.2888f, 0.4751f)
                    curveTo(4.675f, 0.788f, 4.1441f, 1.2421f, 3.7399f, 1.8f)
                    lineTo(0.7999f, 5.721f)
                    curveTo(0.2562f, 6.4846f, -0.0261f, 7.4035f, -0.0049f, 8.3406f)
                    curveTo(0.0164f, 9.2778f, 0.3401f, 10.1829f, 0.9179f, 10.921f)
                    lineTo(9.3289f, 22.71f)
                    curveTo(9.6473f, 23.1133f, 10.0532f, 23.4391f, 10.5159f, 23.6625f)
                    curveTo(10.9786f, 23.886f, 11.4861f, 24.0014f, 11.9999f, 24.0f)
                    curveTo(12.5258f, 23.9986f, 13.0442f, 23.8761f, 13.5151f, 23.642f)
                    curveTo(13.9859f, 23.4079f, 14.3965f, 23.0684f, 14.7149f, 22.65f)
                    lineTo(23.0149f, 11.041f)
                    curveTo(23.6256f, 10.2912f, 23.9699f, 9.3599f, 23.994f, 8.3932f)
                    curveTo(24.0181f, 7.4265f, 23.7205f, 6.4792f, 23.1479f, 5.7f)
                    close()
                    moveTo(3.2269f, 7.487f)
                    lineTo(6.1609f, 3.571f)
                    curveTo(6.2873f, 3.3945f, 6.4539f, 3.2507f, 6.6469f, 3.1514f)
                    curveTo(6.84f, 3.0521f, 7.0539f, 3.0002f, 7.2709f, 3.0f)
                    horizontalLineTo(9.6619f)
                    lineTo(8.1819f, 8.182f)
                    lineTo(8.2669f, 8.5f)
                    horizontalLineTo(15.7329f)
                    lineTo(15.8179f, 8.182f)
                    lineTo(14.3379f, 3.0f)
                    horizontalLineTo(16.7289f)
                    curveTo(16.9502f, 3.0013f, 17.1678f, 3.0558f, 17.3636f, 3.1589f)
                    curveTo(17.5594f, 3.2619f, 17.7275f, 3.4104f, 17.8539f, 3.592f)
                    lineTo(20.7329f, 7.482f)
                    curveTo(20.8368f, 7.6278f, 20.9099f, 7.7933f, 20.9477f, 7.9683f)
                    curveTo(20.9856f, 8.1434f, 20.9873f, 8.3243f, 20.9529f, 8.5f)
                    horizontalLineTo(15.7329f)
                    lineTo(12.5129f, 20.575f)
                    lineTo(12.3199f, 20.846f)
                    curveTo(12.282f, 20.8946f, 12.2335f, 20.9338f, 12.178f, 20.9605f)
                    curveTo(12.1224f, 20.9872f, 12.0615f, 21.0007f, 11.9999f, 21.0f)
                    curveTo(11.8999f, 21.005f, 11.8018f, 20.9714f, 11.7259f, 20.906f)
                    lineTo(11.4849f, 20.569f)
                    lineTo(8.2669f, 8.5f)
                    horizontalLineTo(3.0409f)
                    curveTo(3.0017f, 8.3274f, 2.9979f, 8.1485f, 3.0299f, 7.9744f)
                    curveTo(3.0618f, 7.8003f, 3.1289f, 7.6344f, 3.2269f, 7.487f)
                    close()
                }
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
