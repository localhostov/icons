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

public val Icons.Outline.Diamond: ImageVector
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
                    moveTo(23.2198f, 5.743f)
                    lineTo(20.2088f, 1.675f)
                    curveTo(19.8385f, 1.1573f, 19.3502f, 0.7354f, 18.7843f, 0.4441f)
                    curveTo(18.2184f, 0.1528f, 17.5913f, 6.0E-4f, 16.9548f, 0.0f)
                    horizontalLineTo(7.0448f)
                    curveTo(6.4114f, -6.0E-4f, 5.787f, 0.1492f, 5.2228f, 0.4371f)
                    curveTo(4.6587f, 0.725f, 4.171f, 1.1428f, 3.7998f, 1.656f)
                    lineTo(0.7348f, 5.753f)
                    curveTo(0.2358f, 6.4567f, -0.022f, 7.3031f, 2.0E-4f, 8.1655f)
                    curveTo(0.0224f, 9.0279f, 0.3233f, 9.8599f, 0.8578f, 10.537f)
                    lineTo(9.6498f, 22.865f)
                    curveTo(9.93f, 23.2198f, 10.2871f, 23.5063f, 10.6942f, 23.7029f)
                    curveTo(11.1013f, 23.8995f, 11.5477f, 24.0011f, 11.9998f, 24.0f)
                    curveTo(12.4596f, 23.9991f, 12.9131f, 23.8927f, 13.3254f, 23.689f)
                    curveTo(13.7377f, 23.4853f, 14.0977f, 23.1897f, 14.3778f, 22.825f)
                    lineTo(23.0998f, 10.634f)
                    curveTo(23.6583f, 9.947f, 23.973f, 9.0941f, 23.9948f, 8.209f)
                    curveTo(24.0165f, 7.3239f, 23.7439f, 6.4566f, 23.2198f, 5.743f)
                    close()
                    moveTo(18.5918f, 2.851f)
                    lineTo(21.6098f, 6.929f)
                    curveTo(21.6258f, 6.951f, 21.6298f, 6.977f, 21.6458f, 7.0f)
                    horizontalLineTo(16.7538f)
                    lineTo(15.3258f, 2.0f)
                    horizontalLineTo(16.9548f)
                    curveTo(17.2758f, 2.001f, 17.5918f, 2.0788f, 17.8766f, 2.2268f)
                    curveTo(18.1614f, 2.3749f, 18.4066f, 2.5889f, 18.5918f, 2.851f)
                    close()
                    moveTo(11.9998f, 19.118f)
                    lineTo(9.2998f, 9.0f)
                    horizontalLineTo(14.6998f)
                    lineTo(11.9998f, 19.118f)
                    close()
                    moveTo(9.3258f, 7.0f)
                    lineTo(10.7538f, 2.0f)
                    horizontalLineTo(13.2458f)
                    lineTo(14.6738f, 7.0f)
                    horizontalLineTo(9.3258f)
                    close()
                    moveTo(5.4168f, 2.837f)
                    curveTo(5.6024f, 2.5784f, 5.8467f, 2.3676f, 6.1298f, 2.2221f)
                    curveTo(6.4129f, 2.0766f, 6.7265f, 2.0004f, 7.0448f, 2.0f)
                    horizontalLineTo(8.6738f)
                    lineTo(7.2458f, 7.0f)
                    horizontalLineTo(2.3178f)
                    curveTo(2.3318f, 6.978f, 2.3358f, 6.951f, 2.3518f, 6.93f)
                    lineTo(5.4168f, 2.837f)
                    close()
                    moveTo(2.4478f, 9.325f)
                    curveTo(2.3756f, 9.223f, 2.3136f, 9.1142f, 2.2628f, 9.0f)
                    horizontalLineTo(7.2318f)
                    lineTo(10.2258f, 20.23f)
                    lineTo(2.4478f, 9.325f)
                    close()
                    moveTo(13.7708f, 20.24f)
                    lineTo(16.7708f, 9.0f)
                    horizontalLineTo(21.7568f)
                    curveTo(21.6924f, 9.1493f, 21.6108f, 9.2906f, 21.5138f, 9.421f)
                    lineTo(13.7708f, 20.24f)
                    close()
                }
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
