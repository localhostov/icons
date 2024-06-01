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

public val Icons.Filled.Fox: ImageVector
    get() {
        if (_fox != null) {
            return _fox!!
        }
        _fox = Builder(name = "Fox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 0.0f)
                    verticalLineTo(8.015f)
                    curveTo(18.811f, 8.29f, 13.137f, 11.286f, 13.0f, 18.993f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(19.0f)
                    verticalLineTo(18.993f)
                    curveTo(11.0f, 12.026f, 6.034f, 9.412f, 3.14f, 8.48f)
                    curveTo(2.1236f, 8.1622f, 1.0649f, 8.0004f, 0.0f, 8.0f)
                    lineTo(0.0f, 0.0f)
                    horizontalLineTo(1.0f)
                    curveTo(2.2084f, -0.019f, 3.3935f, 0.3335f, 4.3951f, 1.0099f)
                    curveTo(5.3966f, 1.6863f, 6.1663f, 2.6539f, 6.6f, 3.782f)
                    curveTo(8.3603f, 3.297f, 10.1744f, 3.0343f, 12.0f, 3.0f)
                    curveTo(13.8256f, 3.0342f, 15.6397f, 3.2969f, 17.4f, 3.782f)
                    curveTo(17.8337f, 2.6539f, 18.6034f, 1.6863f, 19.6049f, 1.0099f)
                    curveTo(20.6065f, 0.3335f, 21.7916f, -0.019f, 23.0f, 0.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(21.491f, 10.352f)
                    curveTo(20.9809f, 10.5091f, 20.4827f, 10.7022f, 20.0f, 10.93f)
                    curveTo(19.8265f, 11.7691f, 19.3757f, 12.5254f, 18.7201f, 13.0772f)
                    curveTo(18.0646f, 13.629f, 17.2424f, 13.9442f, 16.386f, 13.972f)
                    curveTo(15.4331f, 15.4697f, 14.9503f, 17.2185f, 15.0f, 18.993f)
                    verticalLineTo(20.0f)
                    curveTo(15.0f, 20.5304f, 14.7893f, 21.0391f, 14.4142f, 21.4142f)
                    curveTo(14.0391f, 21.7893f, 13.5304f, 22.0f, 13.0f, 22.0f)
                    horizontalLineTo(11.0f)
                    curveTo(10.4696f, 22.0f, 9.9609f, 21.7893f, 9.5858f, 21.4142f)
                    curveTo(9.2107f, 21.0391f, 9.0f, 20.5304f, 9.0f, 20.0f)
                    verticalLineTo(17.993f)
                    curveTo(9.0653f, 16.5253f, 8.5697f, 15.0878f, 7.614f, 13.972f)
                    curveTo(6.7576f, 13.9442f, 5.9354f, 13.629f, 5.2799f, 13.0772f)
                    curveTo(4.6243f, 12.5254f, 4.1735f, 11.7691f, 4.0f, 10.93f)
                    curveTo(2.757f, 10.3129f, 1.3878f, 9.9925f, 0.0f, 9.994f)
                    lineTo(0.0f, 11.929f)
                    curveTo(1.0E-4f, 13.52f, 0.6321f, 15.0459f, 1.757f, 16.171f)
                    lineTo(8.707f, 23.121f)
                    curveTo(8.9856f, 23.3997f, 9.3165f, 23.6208f, 9.6805f, 23.7716f)
                    curveTo(10.0446f, 23.9224f, 10.4349f, 24.0f, 10.829f, 24.0f)
                    horizontalLineTo(13.172f)
                    curveTo(13.9671f, 23.9998f, 14.7296f, 23.684f, 15.292f, 23.122f)
                    lineTo(22.242f, 16.172f)
                    curveTo(22.7994f, 15.6147f, 23.2416f, 14.9531f, 23.5432f, 14.2249f)
                    curveTo(23.8449f, 13.4967f, 24.0001f, 12.7162f, 24.0f, 11.928f)
                    verticalLineTo(9.994f)
                    curveTo(23.1506f, 9.9885f, 22.305f, 10.1091f, 21.491f, 10.352f)
                    close()
                }
            }
        }
        .build()
        return _fox!!
    }

private var _fox: ImageVector? = null
