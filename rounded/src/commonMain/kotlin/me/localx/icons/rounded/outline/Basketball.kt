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

public val Icons.Outline.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0034f, -0.0022f)
                    curveTo(5.3658f, -0.0022f, -0.0151f, 5.3787f, -0.0151f, 12.0164f)
                    curveTo(-0.0151f, 18.654f, 5.3658f, 24.0349f, 12.0034f, 24.0349f)
                    curveTo(18.6411f, 24.0349f, 24.0219f, 18.654f, 24.0219f, 12.0164f)
                    curveTo(24.0219f, 5.3787f, 18.6411f, -0.0022f, 12.0034f, -0.0022f)
                    close()
                    moveTo(21.9431f, 10.942f)
                    lineTo(21.9381f, 10.938f)
                    curveTo(20.0023f, 10.7372f, 18.168f, 9.9722f, 16.6631f, 8.738f)
                    lineTo(19.7331f, 5.668f)
                    curveTo(20.97f, 7.1719f, 21.7383f, 9.0056f, 21.9431f, 10.942f)
                    close()
                    moveTo(18.3151f, 4.253f)
                    lineTo(15.2491f, 7.328f)
                    curveTo(14.0146f, 5.8234f, 13.2495f, 3.989f, 13.0492f, 2.053f)
                    curveTo(14.9816f, 2.2565f, 16.8123f, 3.0212f, 18.3151f, 4.253f)
                    close()
                    moveTo(11.0531f, 2.048f)
                    curveTo(11.2626f, 4.5167f, 12.2352f, 6.8591f, 13.8361f, 8.75f)
                    lineTo(12.0001f, 10.586f)
                    lineTo(5.6761f, 4.262f)
                    curveTo(7.2082f, 3.0054f, 9.0804f, 2.2345f, 11.0531f, 2.048f)
                    close()
                    moveTo(4.2617f, 5.6766f)
                    lineTo(4.2571f, 5.672f)
                    lineTo(4.2622f, 5.676f)
                    curveTo(4.262f, 5.6762f, 4.2618f, 5.6764f, 4.2617f, 5.6766f)
                    lineTo(10.5862f, 12.0f)
                    lineTo(8.7492f, 13.837f)
                    curveTo(6.8594f, 12.2354f, 4.5175f, 11.2623f, 2.0492f, 11.053f)
                    curveTo(2.2353f, 9.0806f, 3.0057f, 7.2086f, 4.2617f, 5.6766f)
                    close()
                    moveTo(2.0572f, 13.058f)
                    verticalLineTo(13.054f)
                    curveTo(3.9931f, 13.2544f, 5.8275f, 14.0194f, 7.3321f, 15.254f)
                    lineTo(4.2622f, 18.324f)
                    curveTo(3.0286f, 16.8217f, 2.262f, 14.991f, 2.0572f, 13.058f)
                    close()
                    moveTo(5.6801f, 19.738f)
                    lineTo(8.7461f, 16.668f)
                    curveTo(9.9807f, 18.1726f, 10.7458f, 20.007f, 10.9461f, 21.943f)
                    curveTo(9.0131f, 21.7381f, 7.1824f, 20.9716f, 5.6801f, 19.738f)
                    close()
                    moveTo(12.9472f, 21.952f)
                    curveTo(12.7381f, 19.4833f, 11.7649f, 17.1411f, 10.1632f, 15.251f)
                    lineTo(12.0001f, 13.414f)
                    lineTo(18.3241f, 19.738f)
                    curveTo(16.7923f, 20.9951f, 14.92f, 21.766f, 12.9472f, 21.952f)
                    close()
                    moveTo(19.7362f, 18.324f)
                    lineTo(13.4141f, 12.0f)
                    lineTo(15.2501f, 10.164f)
                    curveTo(17.1405f, 11.7646f, 19.4821f, 12.7372f, 21.9501f, 12.947f)
                    curveTo(21.7637f, 14.9197f, 20.9928f, 16.7919f, 19.7362f, 18.324f)
                    close()
                }
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
