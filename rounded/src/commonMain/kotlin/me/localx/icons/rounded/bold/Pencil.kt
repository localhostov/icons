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

public val Icons.Bold.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.8242f, 1.176f)
                    curveTo(22.0598f, 0.4457f, 21.0433f, 0.0381f, 19.9862f, 0.0381f)
                    curveTo(18.929f, 0.0381f, 17.9125f, 0.4457f, 17.1482f, 1.176f)
                    lineTo(1.6112f, 16.713f)
                    curveTo(1.0991f, 17.2223f, 0.693f, 17.828f, 0.4165f, 18.4952f)
                    curveTo(0.14f, 19.1624f, -0.0015f, 19.8778f, 2.0E-4f, 20.6f)
                    verticalLineTo(22.5f)
                    curveTo(2.0E-4f, 22.8978f, 0.1582f, 23.2794f, 0.4395f, 23.5607f)
                    curveTo(0.7208f, 23.842f, 1.1023f, 24.0f, 1.5001f, 24.0f)
                    horizontalLineTo(3.4002f)
                    curveTo(4.1227f, 24.0019f, 4.8385f, 23.8606f, 5.506f, 23.584f)
                    curveTo(6.1736f, 23.3075f, 6.7796f, 22.9013f, 7.2892f, 22.389f)
                    lineTo(22.8242f, 6.852f)
                    curveTo(23.5757f, 6.0987f, 23.9978f, 5.0781f, 23.9978f, 4.014f)
                    curveTo(23.9978f, 2.9499f, 23.5757f, 1.9293f, 22.8242f, 1.176f)
                    close()
                    moveTo(5.1662f, 20.268f)
                    curveTo(4.6965f, 20.7346f, 4.0621f, 20.9975f, 3.4002f, 21.0f)
                    horizontalLineTo(3.0001f)
                    verticalLineTo(20.6f)
                    curveTo(3.0022f, 19.9373f, 3.2652f, 19.3022f, 3.7322f, 18.832f)
                    lineTo(15.3002f, 7.267f)
                    lineTo(16.7332f, 8.7f)
                    lineTo(5.1662f, 20.268f)
                    close()
                    moveTo(20.7002f, 4.731f)
                    lineTo(18.8542f, 6.58f)
                    lineTo(17.4202f, 5.146f)
                    lineTo(19.2702f, 3.3f)
                    curveTo(19.4631f, 3.1156f, 19.7197f, 3.0127f, 19.9867f, 3.0127f)
                    curveTo(20.2536f, 3.0127f, 20.5102f, 3.1156f, 20.7032f, 3.3f)
                    curveTo(20.8918f, 3.4906f, 20.9973f, 3.748f, 20.9967f, 4.0161f)
                    curveTo(20.9962f, 4.2842f, 20.8896f, 4.5412f, 20.7002f, 4.731f)
                    close()
                }
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
