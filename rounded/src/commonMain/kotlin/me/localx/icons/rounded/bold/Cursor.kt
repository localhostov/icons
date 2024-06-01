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

public val Icons.Bold.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.5191f, 10.9002f)
                    lineTo(9.6661f, 0.8482f)
                    curveTo(9.1747f, 0.4129f, 8.5681f, 0.1289f, 7.9191f, 0.0303f)
                    curveTo(7.2701f, -0.0684f, 6.6065f, 0.0226f, 6.008f, 0.2921f)
                    curveTo(5.4094f, 0.5617f, 4.9015f, 0.9985f, 4.5453f, 1.5498f)
                    curveTo(4.1891f, 2.1012f, 3.9998f, 2.7438f, 4.0001f, 3.4002f)
                    verticalLineTo(18.5002f)
                    curveTo(4.0001f, 18.7921f, 4.0852f, 19.0776f, 4.2451f, 19.3218f)
                    curveTo(4.4049f, 19.566f, 4.6325f, 19.7583f, 4.9f, 19.8751f)
                    curveTo(5.1676f, 19.9919f, 5.4633f, 20.028f, 5.7511f, 19.9792f)
                    curveTo(6.0388f, 19.9304f, 6.3061f, 19.7987f, 6.5201f, 19.6002f)
                    lineTo(10.1921f, 16.2002f)
                    lineTo(13.1141f, 22.6102f)
                    curveTo(13.4219f, 23.2134f, 13.9567f, 23.6697f, 14.6009f, 23.8786f)
                    curveTo(14.9199f, 23.982f, 15.2561f, 24.0216f, 15.5904f, 23.9951f)
                    curveTo(15.9246f, 23.9687f, 16.2504f, 23.8766f, 16.5491f, 23.7242f)
                    curveTo(16.8478f, 23.5718f, 17.1136f, 23.362f, 17.3312f, 23.1069f)
                    curveTo(17.5488f, 22.8518f, 17.7141f, 22.5564f, 17.8175f, 22.2374f)
                    curveTo(17.921f, 21.9184f, 17.9606f, 21.5822f, 17.9341f, 21.2479f)
                    curveTo(17.9076f, 20.9137f, 17.8155f, 20.5879f, 17.6631f, 20.2892f)
                    lineTo(14.8531f, 14.1692f)
                    lineTo(19.7081f, 13.4882f)
                    curveTo(19.9892f, 13.4488f, 20.2533f, 13.3305f, 20.4697f, 13.147f)
                    curveTo(20.6862f, 12.9635f, 20.8462f, 12.7223f, 20.9312f, 12.4516f)
                    curveTo(21.0161f, 12.1808f, 21.0224f, 11.8915f, 20.9495f, 11.6172f)
                    curveTo(20.8766f, 11.3429f, 20.7273f, 11.095f, 20.5191f, 10.9022f)
                    verticalLineTo(10.9002f)
                    close()
                    moveTo(11.0611f, 11.6692f)
                    curveTo(10.7576f, 11.7116f, 10.4745f, 11.8464f, 10.2501f, 12.0552f)
                    lineTo(7.0001f, 15.0652f)
                    verticalLineTo(3.4002f)
                    curveTo(6.9969f, 3.3211f, 7.0182f, 3.243f, 7.0612f, 3.1766f)
                    curveTo(7.1042f, 3.1101f, 7.1667f, 3.0587f, 7.2401f, 3.0292f)
                    curveTo(7.298f, 3.0018f, 7.3611f, 2.9872f, 7.4251f, 2.9862f)
                    curveTo(7.509f, 2.9856f, 7.5901f, 3.0167f, 7.6521f, 3.0732f)
                    lineTo(16.1621f, 10.9542f)
                    lineTo(11.0611f, 11.6692f)
                    close()
                }
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
