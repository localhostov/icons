package me.localx.icons.straight.bold

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

public val Icons.Bold.Carrot: ImageVector
    get() {
        if (_carrot != null) {
            return _carrot!!
        }
        _carrot = Builder(name = "Carrot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0609f, 2.061f)
                    lineTo(21.9389f, -0.061f)
                    lineTo(18.9999f, 2.879f)
                    verticalLineTo(-0.0f)
                    horizontalLineTo(15.9999f)
                    verticalLineTo(3.055f)
                    curveTo(14.2099f, 1.829f, 12.0929f, 1.294f, 9.8609f, 3.525f)
                    curveTo(7.4259f, 5.961f, 2.3529f, 18.247f, 1.3609f, 20.685f)
                    lineTo(0.0199f, 23.98f)
                    lineTo(3.3199f, 22.639f)
                    curveTo(5.7589f, 21.647f, 18.0439f, 16.575f, 20.4799f, 14.139f)
                    curveTo(22.7109f, 11.908f, 22.1799f, 9.791f, 20.9489f, 8.0f)
                    horizontalLineTo(23.9999f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(21.1209f)
                    lineTo(24.0609f, 2.061f)
                    close()
                    moveTo(18.3539f, 12.018f)
                    curveTo(17.7638f, 12.5199f, 17.1187f, 12.9533f, 16.4309f, 13.31f)
                    lineTo(14.0609f, 10.939f)
                    lineTo(11.9389f, 13.061f)
                    lineTo(13.6459f, 14.767f)
                    curveTo(11.2149f, 15.967f, 8.2379f, 17.302f, 5.5459f, 18.456f)
                    curveTo(6.0069f, 17.373f, 6.4999f, 16.245f, 6.9999f, 15.124f)
                    lineTo(7.9359f, 16.061f)
                    lineTo(10.0579f, 13.939f)
                    lineTo(8.3369f, 12.216f)
                    curveTo(9.0089f, 10.788f, 9.6629f, 9.466f, 10.2489f, 8.37f)
                    lineTo(11.9389f, 10.061f)
                    lineTo(14.0609f, 7.939f)
                    lineTo(11.8829f, 5.761f)
                    curveTo(13.4359f, 4.168f, 14.1289f, 5.287f, 16.5099f, 7.49f)
                    curveTo(19.3819f, 10.363f, 19.4239f, 10.948f, 18.3539f, 12.018f)
                    close()
                }
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null
