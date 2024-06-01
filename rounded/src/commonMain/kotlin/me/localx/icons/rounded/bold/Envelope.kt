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

public val Icons.Bold.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5f, 0.9999f)
                    horizontalLineTo(5.5f)
                    curveTo(4.0418f, 1.0015f, 2.6438f, 1.5814f, 1.6127f, 2.6125f)
                    curveTo(0.5816f, 3.6437f, 0.0016f, 5.0417f, 0.0f, 6.4999f)
                    lineTo(0.0f, 17.4999f)
                    curveTo(0.0016f, 18.9581f, 0.5816f, 20.3561f, 1.6127f, 21.3872f)
                    curveTo(2.6438f, 22.4183f, 4.0418f, 22.9983f, 5.5f, 22.9999f)
                    horizontalLineTo(18.5f)
                    curveTo(19.9582f, 22.9983f, 21.3562f, 22.4183f, 22.3873f, 21.3872f)
                    curveTo(23.4184f, 20.3561f, 23.9984f, 18.9581f, 24.0f, 17.4999f)
                    verticalLineTo(6.4999f)
                    curveTo(23.9984f, 5.0417f, 23.4184f, 3.6437f, 22.3873f, 2.6125f)
                    curveTo(21.3562f, 1.5814f, 19.9582f, 1.0015f, 18.5f, 0.9999f)
                    close()
                    moveTo(18.5f, 3.9999f)
                    curveTo(19.1065f, 4.0019f, 19.6911f, 4.2264f, 20.143f, 4.6309f)
                    lineTo(13.643f, 11.1309f)
                    curveTo(13.2015f, 11.5525f, 12.6145f, 11.7878f, 12.004f, 11.7878f)
                    curveTo(11.3935f, 11.7878f, 10.8065f, 11.5525f, 10.365f, 11.1309f)
                    lineTo(3.865f, 4.6309f)
                    curveTo(4.3148f, 4.2283f, 4.8963f, 4.0038f, 5.5f, 3.9999f)
                    horizontalLineTo(18.5f)
                    close()
                    moveTo(18.5f, 19.9999f)
                    horizontalLineTo(5.5f)
                    curveTo(4.837f, 19.9999f, 4.2011f, 19.7365f, 3.7322f, 19.2676f)
                    curveTo(3.2634f, 18.7988f, 3.0f, 18.1629f, 3.0f, 17.4999f)
                    verticalLineTo(8.0169f)
                    lineTo(8.239f, 13.2559f)
                    curveTo(8.7328f, 13.7499f, 9.319f, 14.1417f, 9.9642f, 14.4091f)
                    curveTo(10.6095f, 14.6764f, 11.3011f, 14.814f, 11.9995f, 14.814f)
                    curveTo(12.6979f, 14.814f, 13.3895f, 14.6764f, 14.0348f, 14.4091f)
                    curveTo(14.68f, 14.1417f, 15.2662f, 13.7499f, 15.76f, 13.2559f)
                    lineTo(21.0f, 8.0169f)
                    verticalLineTo(17.4999f)
                    curveTo(21.0f, 18.1629f, 20.7366f, 18.7988f, 20.2678f, 19.2676f)
                    curveTo(19.7989f, 19.7365f, 19.163f, 19.9999f, 18.5f, 19.9999f)
                    close()
                }
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
