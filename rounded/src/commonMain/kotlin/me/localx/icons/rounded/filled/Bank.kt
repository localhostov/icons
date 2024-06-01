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

public val Icons.Filled.Bank: ImageVector
    get() {
        if (_bank != null) {
            return _bank!!
        }
        _bank = Builder(name = "Bank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.291f, 8.5519f)
                    curveTo(0.0755f, 8.1523f, -0.0243f, 7.7004f, 0.0027f, 7.2472f)
                    curveTo(0.0298f, 6.7939f, 0.1826f, 6.3572f, 0.444f, 5.9859f)
                    curveTo(0.8713f, 5.359f, 1.4435f, 4.8445f, 2.112f, 4.4859f)
                    lineTo(9.613f, 0.5819f)
                    curveTo(10.3503f, 0.1986f, 11.169f, -0.0016f, 12.0f, -0.0016f)
                    curveTo(12.831f, -0.0016f, 13.6498f, 0.1986f, 14.387f, 0.5819f)
                    lineTo(21.887f, 4.4889f)
                    curveTo(22.5556f, 4.8475f, 23.1278f, 5.3621f, 23.555f, 5.9889f)
                    curveTo(23.8165f, 6.3602f, 23.9693f, 6.7969f, 23.9963f, 7.2502f)
                    curveTo(24.0233f, 7.7034f, 23.9235f, 8.1553f, 23.708f, 8.5549f)
                    curveTo(23.476f, 8.9938f, 23.1281f, 9.3605f, 22.7021f, 9.6153f)
                    curveTo(22.2761f, 9.8701f, 21.7884f, 10.0031f, 21.292f, 9.9999f)
                    horizontalLineTo(2.708f)
                    curveTo(2.2112f, 10.003f, 1.723f, 9.8696f, 1.2968f, 9.6143f)
                    curveTo(0.8706f, 9.359f, 0.5227f, 8.9915f, 0.291f, 8.5519f)
                    close()
                    moveTo(23.0f, 21.9999f)
                    curveTo(23.0f, 21.4695f, 22.7893f, 20.9608f, 22.4142f, 20.5857f)
                    curveTo(22.0392f, 20.2106f, 21.5305f, 19.9999f, 21.0f, 19.9999f)
                    verticalLineTo(11.9999f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(19.9999f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(11.9999f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(19.9999f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(11.9999f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(19.9999f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(11.9999f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(19.9999f)
                    curveTo(2.4696f, 19.9999f, 1.9609f, 20.2106f, 1.5858f, 20.5857f)
                    curveTo(1.2107f, 20.9608f, 1.0f, 21.4695f, 1.0f, 21.9999f)
                    curveTo(0.7348f, 21.9999f, 0.4805f, 22.1053f, 0.2929f, 22.2928f)
                    curveTo(0.1054f, 22.4804f, 0.0f, 22.7347f, 0.0f, 22.9999f)
                    curveTo(0.0f, 23.2652f, 0.1054f, 23.5195f, 0.2929f, 23.707f)
                    curveTo(0.4805f, 23.8946f, 0.7348f, 23.9999f, 1.0f, 23.9999f)
                    horizontalLineTo(23.0f)
                    curveTo(23.2652f, 23.9999f, 23.5196f, 23.8946f, 23.7071f, 23.707f)
                    curveTo(23.8947f, 23.5195f, 24.0f, 23.2652f, 24.0f, 22.9999f)
                    curveTo(24.0f, 22.7347f, 23.8947f, 22.4804f, 23.7071f, 22.2928f)
                    curveTo(23.5196f, 22.1053f, 23.2652f, 21.9999f, 23.0f, 21.9999f)
                    close()
                }
            }
        }
        .build()
        return _bank!!
    }

private var _bank: ImageVector? = null
