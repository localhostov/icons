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

public val Icons.Filled.Stopwatch: ImageVector
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
                    moveTo(20.732f, 4.792f)
                    curveTo(21.1392f, 4.9353f, 21.5684f, 5.0057f, 22.0f, 5.0f)
                    curveTo(22.2652f, 5.0f, 22.5196f, 4.8946f, 22.7071f, 4.7071f)
                    curveTo(22.8946f, 4.5196f, 23.0f, 4.2652f, 23.0f, 4.0f)
                    curveTo(23.0f, 3.7348f, 22.8946f, 3.4804f, 22.7071f, 3.2929f)
                    curveTo(22.5196f, 3.1054f, 22.2652f, 3.0f, 22.0f, 3.0f)
                    curveTo(21.215f, 3.0f, 21.0f, 2.785f, 21.0f, 2.0f)
                    curveTo(21.0f, 1.7348f, 20.8946f, 1.4804f, 20.7071f, 1.2929f)
                    curveTo(20.5196f, 1.1054f, 20.2652f, 1.0f, 20.0f, 1.0f)
                    curveTo(19.7348f, 1.0f, 19.4804f, 1.1054f, 19.2929f, 1.2929f)
                    curveTo(19.1054f, 1.4804f, 19.0f, 1.7348f, 19.0f, 2.0f)
                    curveTo(18.9942f, 2.4866f, 19.0895f, 2.9692f, 19.28f, 3.417f)
                    lineTo(18.574f, 4.201f)
                    curveTo(16.9519f, 2.9803f, 15.0217f, 2.2358f, 13.0f, 2.051f)
                    verticalLineTo(1.0f)
                    curveTo(13.0f, 0.7348f, 12.8946f, 0.4804f, 12.7071f, 0.2929f)
                    curveTo(12.5196f, 0.1054f, 12.2652f, 0.0f, 12.0f, 0.0f)
                    curveTo(11.7348f, 0.0f, 11.4804f, 0.1054f, 11.2929f, 0.2929f)
                    curveTo(11.1054f, 0.4804f, 11.0f, 0.7348f, 11.0f, 1.0f)
                    verticalLineTo(2.051f)
                    curveTo(8.9784f, 2.2355f, 7.0482f, 2.9796f, 5.426f, 4.2f)
                    lineTo(4.72f, 3.417f)
                    curveTo(4.9105f, 2.9692f, 5.0058f, 2.4866f, 5.0f, 2.0f)
                    curveTo(5.0f, 1.7348f, 4.8946f, 1.4804f, 4.7071f, 1.2929f)
                    curveTo(4.5196f, 1.1054f, 4.2652f, 1.0f, 4.0f, 1.0f)
                    curveTo(3.7348f, 1.0f, 3.4804f, 1.1054f, 3.2929f, 1.2929f)
                    curveTo(3.1054f, 1.4804f, 3.0f, 1.7348f, 3.0f, 2.0f)
                    curveTo(3.0f, 2.785f, 2.785f, 3.0f, 2.0f, 3.0f)
                    curveTo(1.7348f, 3.0f, 1.4804f, 3.1054f, 1.2929f, 3.2929f)
                    curveTo(1.1054f, 3.4804f, 1.0f, 3.7348f, 1.0f, 4.0f)
                    curveTo(1.0f, 4.2652f, 1.1054f, 4.5196f, 1.2929f, 4.7071f)
                    curveTo(1.4804f, 4.8946f, 1.7348f, 5.0f, 2.0f, 5.0f)
                    curveTo(2.4316f, 5.0057f, 2.8609f, 4.9353f, 3.268f, 4.792f)
                    lineTo(3.94f, 5.539f)
                    curveTo(2.483f, 7.1078f, 1.5155f, 9.0677f, 1.1561f, 11.1783f)
                    curveTo(0.7967f, 13.2889f, 1.0611f, 15.4586f, 1.9168f, 17.4212f)
                    curveTo(2.7725f, 19.3837f, 4.1823f, 21.0539f, 5.9734f, 22.2269f)
                    curveTo(7.7645f, 23.3999f, 9.859f, 24.0247f, 12.0f, 24.0247f)
                    curveTo(14.141f, 24.0247f, 16.2355f, 23.3999f, 18.0266f, 22.2269f)
                    curveTo(19.8177f, 21.0539f, 21.2275f, 19.3837f, 22.0832f, 17.4212f)
                    curveTo(22.9389f, 15.4586f, 23.2033f, 13.2889f, 22.8439f, 11.1783f)
                    curveTo(22.4845f, 9.0677f, 21.517f, 7.1078f, 20.06f, 5.539f)
                    lineTo(20.732f, 4.792f)
                    close()
                    moveTo(12.0f, 15.0f)
                    curveTo(11.5601f, 15.0015f, 11.1321f, 14.8575f, 10.7825f, 14.5904f)
                    curveTo(10.433f, 14.3233f, 10.1816f, 13.9481f, 10.0675f, 13.5233f)
                    curveTo(9.9534f, 13.0984f, 9.983f, 12.6478f, 10.1516f, 12.2415f)
                    curveTo(10.3203f, 11.8352f, 10.6186f, 11.4961f, 11.0f, 11.277f)
                    verticalLineTo(7.0f)
                    curveTo(11.0f, 6.7348f, 11.1054f, 6.4804f, 11.2929f, 6.2929f)
                    curveTo(11.4804f, 6.1054f, 11.7348f, 6.0f, 12.0f, 6.0f)
                    curveTo(12.2652f, 6.0f, 12.5196f, 6.1054f, 12.7071f, 6.2929f)
                    curveTo(12.8946f, 6.4804f, 13.0f, 6.7348f, 13.0f, 7.0f)
                    verticalLineTo(11.277f)
                    curveTo(13.3814f, 11.4961f, 13.6797f, 11.8352f, 13.8484f, 12.2415f)
                    curveTo(14.017f, 12.6478f, 14.0466f, 13.0984f, 13.9325f, 13.5233f)
                    curveTo(13.8184f, 13.9481f, 13.567f, 14.3233f, 13.2175f, 14.5904f)
                    curveTo(12.8679f, 14.8575f, 12.4399f, 15.0015f, 12.0f, 15.0f)
                    close()
                }
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
