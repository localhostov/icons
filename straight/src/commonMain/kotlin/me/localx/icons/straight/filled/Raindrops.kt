package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.Raindrops: ImageVector
    get() {
        if (_raindrops != null) {
            return _raindrops!!
        }
        _raindrops = Builder(name = "Raindrops", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.9998f, 24.0009f)
                    curveTo(13.2116f, 24.0033f, 12.4307f, 23.8492f, 11.7025f, 23.5474f)
                    curveTo(10.9742f, 23.2456f, 10.3132f, 22.8022f, 9.7578f, 22.2429f)
                    curveTo(8.6391f, 21.1145f, 8.0114f, 19.5898f, 8.0114f, 18.0009f)
                    curveTo(8.0114f, 16.4119f, 8.6391f, 14.8873f, 9.7578f, 13.7589f)
                    lineTo(13.9998f, 9.2619f)
                    lineTo(18.2628f, 13.7789f)
                    curveTo(19.3717f, 14.9097f, 19.9912f, 16.4314f, 19.9873f, 18.0152f)
                    curveTo(19.9833f, 19.599f, 19.3563f, 21.1176f, 18.2418f, 22.2429f)
                    curveTo(17.6864f, 22.8022f, 17.0254f, 23.2456f, 16.2972f, 23.5474f)
                    curveTo(15.569f, 23.8492f, 14.7881f, 24.0033f, 13.9998f, 24.0009f)
                    close()
                    moveTo(4.9998f, 12.0009f)
                    curveTo(4.343f, 12.0025f, 3.6924f, 11.8738f, 3.0856f, 11.6224f)
                    curveTo(2.4788f, 11.3709f, 1.9279f, 11.0016f, 1.4648f, 10.5359f)
                    curveTo(0.5328f, 9.5954f, 0.0099f, 8.3249f, 0.0099f, 7.0009f)
                    curveTo(0.0099f, 5.6768f, 0.5328f, 4.4063f, 1.4648f, 3.4659f)
                    lineTo(4.9998f, 0.0079f)
                    lineTo(8.5268f, 3.4579f)
                    curveTo(9.4628f, 4.3974f, 9.989f, 5.6691f, 9.9905f, 6.9952f)
                    curveTo(9.992f, 8.3214f, 9.4687f, 9.5943f, 8.5348f, 10.5359f)
                    curveTo(8.0718f, 11.0018f, 7.5209f, 11.3711f, 6.9141f, 11.6226f)
                    curveTo(6.3073f, 11.8741f, 5.6567f, 12.0027f, 4.9998f, 12.0009f)
                    close()
                    moveTo(19.9998f, 10.0009f)
                    curveTo(19.4743f, 10.0022f, 18.9538f, 9.8994f, 18.4684f, 9.6982f)
                    curveTo(17.983f, 9.497f, 17.5423f, 9.2015f, 17.1718f, 8.8289f)
                    curveTo(16.4261f, 8.0766f, 16.0077f, 7.0602f, 16.0077f, 6.0009f)
                    curveTo(16.0077f, 4.9416f, 16.4261f, 3.9252f, 17.1718f, 3.1729f)
                    lineTo(19.9818f, 0.0499f)
                    lineTo(22.8598f, 3.2059f)
                    curveTo(23.5906f, 3.9613f, 23.9965f, 4.9729f, 23.9905f, 6.0239f)
                    curveTo(23.9846f, 7.0749f, 23.5672f, 8.0818f, 22.8278f, 8.8289f)
                    curveTo(22.4574f, 9.2015f, 22.0167f, 9.497f, 21.5312f, 9.6982f)
                    curveTo(21.0458f, 9.8994f, 20.5253f, 10.0022f, 19.9998f, 10.0009f)
                    close()
                }
            }
        }
        .build()
        return _raindrops!!
    }

private var _raindrops: ImageVector? = null
