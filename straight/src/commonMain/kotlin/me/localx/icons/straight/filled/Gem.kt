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

public val Icons.Filled.Gem: ImageVector
    get() {
        if (_gem != null) {
            return _gem!!
        }
        _gem = Builder(name = "Gem", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.5688f, 6.0f)
                    lineTo(15.5328f, 11.0f)
                    horizontalLineTo(8.4768f)
                    lineTo(10.4768f, 6.0f)
                    horizontalLineTo(13.5688f)
                    close()
                    moveTo(17.6808f, 11.0f)
                    horizontalLineTo(23.9288f)
                    curveTo(23.8309f, 10.6475f, 23.6696f, 10.3157f, 23.4528f, 10.021f)
                    lineTo(21.4058f, 7.228f)
                    curveTo(21.1268f, 6.8481f, 20.7625f, 6.539f, 20.3421f, 6.3257f)
                    curveTo(19.9218f, 6.1124f, 19.4572f, 6.0008f, 18.9858f, 6.0f)
                    horizontalLineTo(15.7168f)
                    lineTo(17.6808f, 11.0f)
                    close()
                    moveTo(15.6138f, 13.0f)
                    horizontalLineTo(8.3858f)
                    lineTo(11.9998f, 23.879f)
                    lineTo(15.6138f, 13.0f)
                    close()
                    moveTo(17.7218f, 13.0f)
                    lineTo(14.9788f, 21.255f)
                    lineTo(23.1458f, 13.923f)
                    curveTo(23.4124f, 13.6572f, 23.6274f, 13.3442f, 23.7798f, 13.0f)
                    horizontalLineTo(17.7218f)
                    close()
                    moveTo(6.2778f, 13.0f)
                    horizontalLineTo(0.2298f)
                    curveTo(0.3887f, 13.3573f, 0.6129f, 13.6819f, 0.8908f, 13.957f)
                    lineTo(9.0208f, 21.257f)
                    lineTo(6.2778f, 13.0f)
                    close()
                    moveTo(6.3228f, 11.0f)
                    lineTo(8.3228f, 6.0f)
                    horizontalLineTo(5.0138f)
                    curveTo(4.5425f, 6.0008f, 4.0779f, 6.1124f, 3.6575f, 6.3257f)
                    curveTo(3.2372f, 6.539f, 2.8728f, 6.8481f, 2.5938f, 7.228f)
                    lineTo(0.5468f, 10.021f)
                    curveTo(0.3303f, 10.3158f, 0.1694f, 10.6475f, 0.0718f, 11.0f)
                    horizontalLineTo(6.3228f)
                    close()
                    moveTo(12.9998f, 0.0f)
                    horizontalLineTo(10.9998f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(12.9998f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(19.8438f, 1.652f)
                    lineTo(18.1558f, 0.578f)
                    lineTo(16.1558f, 3.72f)
                    lineTo(17.8438f, 4.794f)
                    lineTo(19.8438f, 1.652f)
                    close()
                    moveTo(7.8438f, 3.72f)
                    lineTo(5.8438f, 0.578f)
                    lineTo(4.1558f, 1.652f)
                    lineTo(6.1558f, 4.794f)
                    lineTo(7.8438f, 3.72f)
                    close()
                }
            }
        }
        .build()
        return _gem!!
    }

private var _gem: ImageVector? = null
