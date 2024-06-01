package me.localx.icons.rounded.outline

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

public val Icons.Outline.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(name = "Stopwatch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0f, 13.0f)
                    curveTo(14.0016f, 13.3515f, 13.9105f, 13.6971f, 13.736f, 14.0022f)
                    curveTo(13.5615f, 14.3072f, 13.3097f, 14.5609f, 13.0059f, 14.7377f)
                    curveTo(12.7021f, 14.9144f, 12.3571f, 15.008f, 12.0057f, 15.009f)
                    curveTo(11.6542f, 15.01f, 11.3087f, 14.9184f, 11.004f, 14.7434f)
                    curveTo(10.6992f, 14.5683f, 10.4459f, 14.3161f, 10.2697f, 14.012f)
                    curveTo(10.0934f, 13.7079f, 10.0004f, 13.3628f, 10.0f, 13.0113f)
                    curveTo(9.9996f, 12.6599f, 10.0918f, 12.3145f, 10.2674f, 12.01f)
                    curveTo(10.443f, 11.7056f, 10.6956f, 11.4527f, 11.0f, 11.277f)
                    verticalLineTo(7.0f)
                    curveTo(11.0f, 6.7348f, 11.1054f, 6.4804f, 11.2929f, 6.2929f)
                    curveTo(11.4804f, 6.1054f, 11.7348f, 6.0f, 12.0f, 6.0f)
                    curveTo(12.2652f, 6.0f, 12.5196f, 6.1054f, 12.7071f, 6.2929f)
                    curveTo(12.8946f, 6.4804f, 13.0f, 6.7348f, 13.0f, 7.0f)
                    verticalLineTo(11.277f)
                    curveTo(13.3031f, 11.4513f, 13.5551f, 11.7023f, 13.7306f, 12.0047f)
                    curveTo(13.9061f, 12.3071f, 13.999f, 12.6503f, 14.0f, 13.0f)
                    close()
                    moveTo(20.06f, 5.539f)
                    curveTo(21.517f, 7.1078f, 22.4845f, 9.0677f, 22.8439f, 11.1783f)
                    curveTo(23.2033f, 13.2889f, 22.9389f, 15.4586f, 22.0832f, 17.4212f)
                    curveTo(21.2275f, 19.3837f, 19.8177f, 21.0539f, 18.0266f, 22.2269f)
                    curveTo(16.2355f, 23.3999f, 14.141f, 24.0247f, 12.0f, 24.0247f)
                    curveTo(9.859f, 24.0247f, 7.7645f, 23.3999f, 5.9734f, 22.2269f)
                    curveTo(4.1823f, 21.0539f, 2.7725f, 19.3837f, 1.9168f, 17.4212f)
                    curveTo(1.0611f, 15.4586f, 0.7967f, 13.2889f, 1.1561f, 11.1783f)
                    curveTo(1.5155f, 9.0677f, 2.483f, 7.1078f, 3.94f, 5.539f)
                    lineTo(3.268f, 4.792f)
                    curveTo(2.8609f, 4.9353f, 2.4316f, 5.0057f, 2.0f, 5.0f)
                    curveTo(1.7348f, 5.0f, 1.4804f, 4.8946f, 1.2929f, 4.7071f)
                    curveTo(1.1054f, 4.5196f, 1.0f, 4.2652f, 1.0f, 4.0f)
                    curveTo(1.0f, 3.7348f, 1.1054f, 3.4804f, 1.2929f, 3.2929f)
                    curveTo(1.4804f, 3.1054f, 1.7348f, 3.0f, 2.0f, 3.0f)
                    curveTo(2.785f, 3.0f, 3.0f, 2.785f, 3.0f, 2.0f)
                    curveTo(3.0f, 1.7348f, 3.1054f, 1.4804f, 3.2929f, 1.2929f)
                    curveTo(3.4804f, 1.1054f, 3.7348f, 1.0f, 4.0f, 1.0f)
                    curveTo(4.2652f, 1.0f, 4.5196f, 1.1054f, 4.7071f, 1.2929f)
                    curveTo(4.8946f, 1.4804f, 5.0f, 1.7348f, 5.0f, 2.0f)
                    curveTo(5.0058f, 2.4866f, 4.9105f, 2.9692f, 4.72f, 3.417f)
                    lineTo(5.426f, 4.201f)
                    curveTo(7.0481f, 2.9803f, 8.9783f, 2.2358f, 11.0f, 2.051f)
                    verticalLineTo(1.0f)
                    curveTo(11.0f, 0.7348f, 11.1054f, 0.4804f, 11.2929f, 0.2929f)
                    curveTo(11.4804f, 0.1054f, 11.7348f, 0.0f, 12.0f, 0.0f)
                    curveTo(12.2652f, 0.0f, 12.5196f, 0.1054f, 12.7071f, 0.2929f)
                    curveTo(12.8946f, 0.4804f, 13.0f, 0.7348f, 13.0f, 1.0f)
                    verticalLineTo(2.051f)
                    curveTo(15.0216f, 2.2355f, 16.9518f, 2.9796f, 18.574f, 4.2f)
                    lineTo(19.28f, 3.416f)
                    curveTo(19.0897f, 2.9685f, 18.9943f, 2.4863f, 19.0f, 2.0f)
                    curveTo(19.0f, 1.7348f, 19.1054f, 1.4804f, 19.2929f, 1.2929f)
                    curveTo(19.4804f, 1.1054f, 19.7348f, 1.0f, 20.0f, 1.0f)
                    curveTo(20.2652f, 1.0f, 20.5196f, 1.1054f, 20.7071f, 1.2929f)
                    curveTo(20.8946f, 1.4804f, 21.0f, 1.7348f, 21.0f, 2.0f)
                    curveTo(21.0f, 2.785f, 21.215f, 3.0f, 22.0f, 3.0f)
                    curveTo(22.2652f, 3.0f, 22.5196f, 3.1054f, 22.7071f, 3.2929f)
                    curveTo(22.8946f, 3.4804f, 23.0f, 3.7348f, 23.0f, 4.0f)
                    curveTo(23.0f, 4.2652f, 22.8946f, 4.5196f, 22.7071f, 4.7071f)
                    curveTo(22.5196f, 4.8946f, 22.2652f, 5.0f, 22.0f, 5.0f)
                    curveTo(21.5684f, 5.0057f, 21.1392f, 4.9353f, 20.732f, 4.792f)
                    lineTo(20.06f, 5.539f)
                    close()
                    moveTo(21.0f, 13.0f)
                    curveTo(21.0f, 11.22f, 20.4722f, 9.4799f, 19.4832f, 7.9999f)
                    curveTo(18.4943f, 6.5198f, 17.0887f, 5.3663f, 15.4442f, 4.6851f)
                    curveTo(13.7996f, 4.0039f, 11.99f, 3.8257f, 10.2442f, 4.1729f)
                    curveTo(8.4984f, 4.5202f, 6.8947f, 5.3774f, 5.636f, 6.636f)
                    curveTo(4.3774f, 7.8947f, 3.5202f, 9.4984f, 3.1729f, 11.2442f)
                    curveTo(2.8257f, 12.99f, 3.0039f, 14.7996f, 3.6851f, 16.4442f)
                    curveTo(4.3663f, 18.0887f, 5.5198f, 19.4943f, 6.9999f, 20.4832f)
                    curveTo(8.4799f, 21.4722f, 10.22f, 22.0f, 12.0f, 22.0f)
                    curveTo(14.3861f, 21.9974f, 16.6738f, 21.0483f, 18.361f, 19.361f)
                    curveTo(20.0483f, 17.6738f, 20.9974f, 15.3861f, 21.0f, 13.0f)
                    close()
                }
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
