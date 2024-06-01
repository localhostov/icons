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

public val Icons.Filled.BellRing: ImageVector
    get() {
        if (_bellRing != null) {
            return _bellRing!!
        }
        _bellRing = Builder(name = "BellRing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9759f, 17.268f)
                    lineTo(19.8509f, 23.952f)
                    lineTo(18.1509f, 22.901f)
                    lineTo(22.2759f, 16.217f)
                    lineTo(23.9759f, 17.268f)
                    close()
                    moveTo(7.7759f, 1.768f)
                    lineTo(6.7289f, 0.062f)
                    lineTo(-0.0061f, 4.184f)
                    lineTo(1.0369f, 5.889f)
                    lineTo(7.7759f, 1.768f)
                    close()
                    moveTo(20.1799f, 5.234f)
                    lineTo(22.0799f, 3.334f)
                    lineTo(20.6679f, 1.918f)
                    lineTo(18.7769f, 3.809f)
                    curveTo(17.4115f, 2.7263f, 15.742f, 2.0972f, 14.0016f, 2.0097f)
                    curveTo(12.2612f, 1.9222f, 10.537f, 2.3807f, 9.0699f, 3.321f)
                    lineTo(2.3079f, 7.07f)
                    curveTo(1.948f, 7.308f, 1.6456f, 7.6231f, 1.4225f, 7.9924f)
                    curveTo(1.1994f, 8.3617f, 1.0613f, 8.776f, 1.018f, 9.2053f)
                    curveTo(0.9747f, 9.6346f, 1.0275f, 10.0681f, 1.1724f, 10.4745f)
                    curveTo(1.3173f, 10.8809f, 1.5508f, 11.25f, 1.8559f, 11.555f)
                    lineTo(12.4399f, 22.143f)
                    curveTo(12.7084f, 22.4143f, 13.0279f, 22.6298f, 13.3801f, 22.7769f)
                    curveTo(13.7323f, 22.924f, 14.1102f, 22.9998f, 14.4919f, 23.0f)
                    curveTo(14.6172f, 22.9998f, 14.7425f, 22.9921f, 14.8669f, 22.977f)
                    curveTo(15.3059f, 22.9235f, 15.7267f, 22.7695f, 16.0966f, 22.5271f)
                    curveTo(16.4666f, 22.2846f, 16.7756f, 21.9602f, 16.9999f, 21.579f)
                    lineTo(20.9279f, 14.593f)
                    curveTo(21.7435f, 13.1341f, 22.1077f, 11.466f, 21.9746f, 9.8f)
                    curveTo(21.8414f, 8.1339f, 21.2168f, 6.5448f, 20.1799f, 5.234f)
                    close()
                    moveTo(2.9999f, 18.283f)
                    curveTo(2.994f, 19.1023f, 3.2013f, 19.9091f, 3.6014f, 20.6241f)
                    curveTo(4.0015f, 21.3391f, 4.5806f, 21.9378f, 5.282f, 22.3614f)
                    curveTo(5.9833f, 22.785f, 6.7828f, 23.019f, 7.6019f, 23.0403f)
                    curveTo(8.4209f, 23.0616f, 9.2315f, 22.8696f, 9.9539f, 22.483f)
                    lineTo(3.5599f, 16.083f)
                    curveTo(3.1967f, 16.7597f, 3.0045f, 17.515f, 2.9999f, 18.283f)
                    close()
                }
            }
        }
        .build()
        return _bellRing!!
    }

private var _bellRing: ImageVector? = null
