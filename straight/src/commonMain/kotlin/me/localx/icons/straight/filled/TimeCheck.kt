package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.TimeCheck: ImageVector
    get() {
        if (_timeCheck != null) {
            return _timeCheck!!
        }
        _timeCheck = Builder(name = "TimeCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5001f, 23.0001f)
                    horizontalLineTo(18.4671f)
                    curveTo(17.9561f, 22.9921f, 17.4701f, 22.7751f, 17.1221f, 22.4001f)
                    lineTo(14.9541f, 20.1381f)
                    lineTo(16.4001f, 18.7561f)
                    lineTo(18.5061f, 20.9561f)
                    lineTo(22.5871f, 16.8741f)
                    lineTo(24.0001f, 18.2851f)
                    lineTo(19.8391f, 22.4471f)
                    curveTo(19.4851f, 22.8031f, 19.0021f, 23.0031f, 18.5001f, 23.0001f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0168f, 7.0E-4f)
                    curveTo(5.3998f, -0.0193f, 0.0198f, 5.3367f, -2.0E-4f, 11.9637f)
                    curveTo(-0.0202f, 18.5907f, 5.3268f, 23.9807f, 11.9428f, 24.0007f)
                    curveTo(13.0398f, 24.0037f, 14.1328f, 23.8567f, 15.1898f, 23.5617f)
                    curveTo(13.2218f, 20.9037f, 13.7788f, 17.1507f, 16.4328f, 15.1797f)
                    curveTo(18.5488f, 13.6087f, 21.4418f, 13.6087f, 23.5578f, 15.1797f)
                    curveTo(25.3288f, 8.8127f, 21.6118f, 2.2137f, 15.2558f, 0.4397f)
                    curveTo(14.2018f, 0.1457f, 13.1118f, -0.0023f, 12.0168f, 7.0E-4f)
                    close()
                    moveTo(13.0168f, 11.4147f)
                    lineTo(9.7238f, 14.7077f)
                    lineTo(8.3098f, 13.2937f)
                    lineTo(11.0168f, 10.5867f)
                    verticalLineTo(6.0007f)
                    horizontalLineTo(13.0168f)
                    verticalLineTo(11.4147f)
                    close()
                }
            }
        }
        .build()
        return _timeCheck!!
    }

private var _timeCheck: ImageVector? = null
