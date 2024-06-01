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

public val Icons.Filled.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.787f, 20.6562f)
                    curveTo(2.783f, 20.6557f, 1.8202f, 20.2567f, 1.1101f, 19.5468f)
                    curveTo(0.4001f, 18.8369f, 8.0E-4f, 17.8742f, 0.0f, 16.8702f)
                    verticalLineTo(7.1302f)
                    curveTo(-2.0E-4f, 6.4309f, 0.1934f, 5.7453f, 0.5594f, 5.1494f)
                    curveTo(0.9254f, 4.5536f, 1.4493f, 4.0708f, 2.0731f, 3.7547f)
                    curveTo(2.6968f, 3.4386f, 3.396f, 3.3016f, 4.0929f, 3.3589f)
                    curveTo(4.7898f, 3.4162f, 5.4572f, 3.6655f, 6.021f, 4.0792f)
                    lineTo(9.8f, 6.8532f)
                    curveTo(9.8494f, 6.1794f, 10.0783f, 5.5312f, 10.463f, 4.9758f)
                    curveTo(10.8477f, 4.4204f, 11.3741f, 3.9782f, 11.9875f, 3.6951f)
                    curveTo(12.6009f, 3.4119f, 13.2789f, 3.2982f, 13.9511f, 3.3658f)
                    curveTo(14.6233f, 3.4334f, 15.2652f, 3.6797f, 15.81f, 4.0792f)
                    lineTo(22.451f, 8.9492f)
                    curveTo(22.9297f, 9.3007f, 23.3189f, 9.76f, 23.5872f, 10.2899f)
                    curveTo(23.8555f, 10.8197f, 23.9953f, 11.4053f, 23.9953f, 11.9992f)
                    curveTo(23.9953f, 12.5931f, 23.8555f, 13.1787f, 23.5872f, 13.7085f)
                    curveTo(23.3189f, 14.2384f, 22.9297f, 14.6977f, 22.451f, 15.0492f)
                    lineTo(15.81f, 19.9192f)
                    curveTo(15.2653f, 20.3187f, 14.6237f, 20.565f, 13.9516f, 20.6327f)
                    curveTo(13.2796f, 20.7003f, 12.6017f, 20.5868f, 11.9883f, 20.3039f)
                    curveTo(11.375f, 20.021f, 10.8485f, 19.579f, 10.4637f, 19.0239f)
                    curveTo(10.0789f, 18.4688f, 9.8497f, 17.8208f, 9.8f, 17.1472f)
                    lineTo(6.021f, 19.9212f)
                    curveTo(5.3736f, 20.3978f, 4.5909f, 20.6553f, 3.787f, 20.6562f)
                    close()
                }
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
