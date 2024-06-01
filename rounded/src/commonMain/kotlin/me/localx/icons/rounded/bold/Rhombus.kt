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

public val Icons.Bold.Rhombus: ImageVector
    get() {
        if (_rhombus != null) {
            return _rhombus!!
        }
        _rhombus = Builder(name = "Rhombus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 23.9993f)
                    curveTo(11.2987f, 24.0007f, 10.604f, 23.8635f, 9.9558f, 23.5956f)
                    curveTo(9.3077f, 23.3277f, 8.7188f, 22.9344f, 8.2231f, 22.4383f)
                    lineTo(1.5651f, 15.7763f)
                    curveTo(1.0689f, 15.2804f, 0.6753f, 14.6916f, 0.4068f, 14.0435f)
                    curveTo(0.1382f, 13.3954f, 0.0f, 12.7008f, 0.0f, 11.9993f)
                    curveTo(0.0f, 11.2978f, 0.1382f, 10.6031f, 0.4068f, 9.9551f)
                    curveTo(0.6753f, 9.307f, 1.0689f, 8.7182f, 1.5651f, 8.2223f)
                    lineTo(8.2231f, 1.5633f)
                    curveTo(9.2258f, 0.5634f, 10.5841f, 0.0019f, 12.0001f, 0.0019f)
                    curveTo(13.4161f, 0.0019f, 14.7744f, 0.5634f, 15.7771f, 1.5633f)
                    lineTo(22.4351f, 8.2223f)
                    curveTo(22.9313f, 8.7182f, 23.3249f, 9.307f, 23.5934f, 9.9551f)
                    curveTo(23.862f, 10.6031f, 24.0002f, 11.2978f, 24.0002f, 11.9993f)
                    curveTo(24.0002f, 12.7008f, 23.862f, 13.3954f, 23.5934f, 14.0435f)
                    curveTo(23.3249f, 14.6916f, 22.9313f, 15.2804f, 22.4351f, 15.7763f)
                    lineTo(15.7771f, 22.4353f)
                    curveTo(15.2816f, 22.932f, 14.6929f, 23.3258f, 14.0447f, 23.5942f)
                    curveTo(13.3965f, 23.8626f, 12.7017f, 24.0003f, 12.0001f, 23.9993f)
                    close()
                    moveTo(10.3441f, 20.3163f)
                    curveTo(10.7837f, 20.7547f, 11.3792f, 21.0009f, 12.0001f, 21.0009f)
                    curveTo(12.621f, 21.0009f, 13.2165f, 20.7547f, 13.6561f, 20.3163f)
                    lineTo(20.3141f, 13.6583f)
                    curveTo(20.7533f, 13.2191f, 21.0f, 12.6234f, 21.0f, 12.0023f)
                    curveTo(21.0f, 11.3812f, 20.7533f, 10.7855f, 20.3141f, 10.3463f)
                    lineTo(13.6561f, 3.6853f)
                    curveTo(13.2165f, 3.2468f, 12.621f, 3.0006f, 12.0001f, 3.0006f)
                    curveTo(11.3792f, 3.0006f, 10.7837f, 3.2468f, 10.3441f, 3.6853f)
                    lineTo(3.6861f, 10.3433f)
                    curveTo(3.2469f, 10.7825f, 3.0002f, 11.3782f, 3.0002f, 11.9993f)
                    curveTo(3.0002f, 12.6204f, 3.2469f, 13.2161f, 3.6861f, 13.6553f)
                    lineTo(10.3441f, 20.3163f)
                    close()
                }
            }
        }
        .build()
        return _rhombus!!
    }

private var _rhombus: ImageVector? = null
