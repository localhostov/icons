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

public val Icons.Filled.NetworkCloud: ImageVector
    get() {
        if (_networkCloud != null) {
            return _networkCloud!!
        }
        _networkCloud = Builder(name = "NetworkCloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 20.0002f)
                    horizontalLineTo(14.816f)
                    curveTo(14.6666f, 19.582f, 14.4262f, 19.2021f, 14.1122f, 18.8881f)
                    curveTo(13.7981f, 18.574f, 13.4182f, 18.3336f, 13.0f, 18.1842f)
                    verticalLineTo(14.0002f)
                    horizontalLineTo(16.0f)
                    curveTo(17.2581f, 14.0007f, 18.4702f, 13.5269f, 19.3944f, 12.6733f)
                    curveTo(20.3186f, 11.8198f, 20.8871f, 10.6491f, 20.9864f, 9.3949f)
                    curveTo(21.0858f, 8.1408f, 20.7086f, 6.8952f, 19.9303f, 5.9068f)
                    curveTo(19.1519f, 4.9184f, 18.0295f, 4.2597f, 16.787f, 4.0622f)
                    curveTo(16.4405f, 2.7764f, 15.6384f, 1.6605f, 14.5301f, 0.9223f)
                    curveTo(13.4217f, 0.1842f, 12.0828f, -0.1258f, 10.7628f, 0.0502f)
                    curveTo(9.4428f, 0.2261f, 8.2319f, 0.876f, 7.3556f, 1.8787f)
                    curveTo(6.4793f, 2.8814f, 5.9975f, 4.1686f, 6.0f, 5.5002f)
                    curveTo(6.0003f, 5.7065f, 6.013f, 5.9125f, 6.038f, 6.1172f)
                    curveTo(5.0894f, 6.3518f, 4.2594f, 6.9256f, 3.7048f, 7.7303f)
                    curveTo(3.1503f, 8.5349f, 2.9095f, 9.5147f, 3.0278f, 10.4848f)
                    curveTo(3.1462f, 11.4548f, 3.6156f, 12.3479f, 4.3474f, 12.9956f)
                    curveTo(5.0792f, 13.6433f, 6.0228f, 14.0006f, 7.0f, 14.0002f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(18.1842f)
                    curveTo(10.5818f, 18.3336f, 10.2019f, 18.574f, 9.8878f, 18.8881f)
                    curveTo(9.5738f, 19.2021f, 9.3334f, 19.582f, 9.184f, 20.0002f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(22.0002f)
                    horizontalLineTo(9.184f)
                    curveTo(9.3876f, 22.5848f, 9.7682f, 23.0914f, 10.2727f, 23.45f)
                    curveTo(10.7773f, 23.8085f, 11.381f, 24.0012f, 12.0f, 24.0012f)
                    curveTo(12.619f, 24.0012f, 13.2227f, 23.8085f, 13.7273f, 23.45f)
                    curveTo(14.2318f, 23.0914f, 14.6124f, 22.5848f, 14.816f, 22.0002f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(20.0002f)
                    close()
                }
            }
        }
        .build()
        return _networkCloud!!
    }

private var _networkCloud: ImageVector? = null
