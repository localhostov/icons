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

public val Icons.Filled.ChartNetwork: ImageVector
    get() {
        if (_chartNetwork != null) {
            return _chartNetwork!!
        }
        _chartNetwork = Builder(name = "ChartNetwork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.018f, 13.4269f)
                    curveTo(20.2467f, 13.4271f, 19.5058f, 13.7276f, 18.9524f, 14.2649f)
                    lineTo(17.7755f, 13.6764f)
                    curveTo(18.7362f, 10.5257f, 16.9609f, 7.1929f, 13.8102f, 6.2322f)
                    curveTo(12.6577f, 5.8808f, 11.4258f, 5.8867f, 10.2768f, 6.2491f)
                    lineTo(9.5869f, 5.0036f)
                    curveTo(10.6942f, 3.7912f, 10.6089f, 1.9106f, 9.3965f, 0.8034f)
                    curveTo(8.184f, -0.3039f, 6.3035f, -0.2186f, 5.1962f, 0.9938f)
                    curveTo(4.0889f, 2.2063f, 4.1742f, 4.0868f, 5.3867f, 5.1941f)
                    curveTo(5.9367f, 5.6964f, 6.6553f, 5.9739f, 7.4001f, 5.9718f)
                    curveTo(7.5431f, 5.9677f, 7.6856f, 5.9534f, 7.8265f, 5.929f)
                    lineTo(8.5104f, 7.1646f)
                    curveTo(5.9201f, 9.0868f, 5.3388f, 12.7256f, 7.2013f, 15.3592f)
                    lineTo(4.3047f, 18.1424f)
                    curveTo(2.768f, 17.4542f, 0.9645f, 18.142f, 0.2763f, 19.6786f)
                    curveTo(-0.4119f, 21.2153f, 0.2759f, 23.0189f, 1.8126f, 23.707f)
                    curveTo(3.3493f, 24.3952f, 5.1528f, 23.7074f, 5.841f, 22.1707f)
                    curveTo(6.2244f, 21.3146f, 6.1923f, 20.3295f, 5.754f, 19.5001f)
                    lineTo(8.5929f, 16.7716f)
                    curveTo(11.2456f, 18.6929f, 14.9534f, 18.1017f, 16.877f, 15.4506f)
                    lineTo(18.0698f, 16.0469f)
                    curveTo(18.0509f, 16.1667f, 18.0397f, 16.2876f, 18.036f, 16.4088f)
                    curveTo(18.036f, 18.0557f, 19.3711f, 19.3908f, 21.018f, 19.3908f)
                    curveTo(22.665f, 19.3908f, 24.0f, 18.0559f, 24.0f, 16.409f)
                    curveTo(24.0f, 14.7621f, 22.6649f, 13.4269f, 21.018f, 13.4269f)
                    close()
                }
            }
        }
        .build()
        return _chartNetwork!!
    }

private var _chartNetwork: ImageVector? = null
