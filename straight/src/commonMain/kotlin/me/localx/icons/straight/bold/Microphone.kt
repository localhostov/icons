package me.localx.icons.straight.bold

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

public val Icons.Bold.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(name = "Microphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9999f, 19.0f)
                    curveTo(13.8558f, 18.9979f, 15.6351f, 18.2597f, 16.9473f, 16.9474f)
                    curveTo(18.2596f, 15.6351f, 18.9978f, 13.8559f, 18.9999f, 12.0f)
                    verticalLineTo(7.0f)
                    curveTo(18.9999f, 5.1435f, 18.2624f, 3.363f, 16.9497f, 2.0503f)
                    curveTo(15.6369f, 0.7375f, 13.8565f, 0.0f, 11.9999f, 0.0f)
                    curveTo(10.1434f, 0.0f, 8.363f, 0.7375f, 7.0502f, 2.0503f)
                    curveTo(5.7374f, 3.363f, 4.9999f, 5.1435f, 4.9999f, 7.0f)
                    verticalLineTo(12.0f)
                    curveTo(5.0021f, 13.8559f, 5.7402f, 15.6351f, 7.0525f, 16.9474f)
                    curveTo(8.3648f, 18.2597f, 10.1441f, 18.9979f, 11.9999f, 19.0f)
                    close()
                    moveTo(11.9999f, 3.0f)
                    curveTo(13.0608f, 3.0f, 14.0782f, 3.4214f, 14.8284f, 4.1716f)
                    curveTo(15.5785f, 4.9217f, 15.9999f, 5.9391f, 15.9999f, 7.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(12.9999f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(15.9999f)
                    verticalLineTo(12.0f)
                    curveTo(15.9999f, 13.0609f, 15.5785f, 14.0783f, 14.8284f, 14.8284f)
                    curveTo(14.0782f, 15.5786f, 13.0608f, 16.0f, 11.9999f, 16.0f)
                    curveTo(10.9391f, 16.0f, 9.9217f, 15.5786f, 9.1715f, 14.8284f)
                    curveTo(8.4214f, 14.0783f, 7.9999f, 13.0609f, 7.9999f, 12.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(10.9999f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(7.9999f)
                    verticalLineTo(7.0f)
                    curveTo(7.9999f, 5.9391f, 8.4214f, 4.9217f, 9.1715f, 4.1716f)
                    curveTo(9.9217f, 3.4214f, 10.9391f, 3.0f, 11.9999f, 3.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 13.0003f)
                    verticalLineTo(13.3893f)
                    curveTo(20.9976f, 15.4071f, 20.195f, 17.3416f, 18.7682f, 18.7685f)
                    curveTo(17.3413f, 20.1953f, 15.4068f, 20.9979f, 13.389f, 21.0003f)
                    horizontalLineTo(10.611f)
                    curveTo(8.5933f, 20.9976f, 6.6589f, 20.1949f, 5.2321f, 18.7682f)
                    curveTo(3.8054f, 17.3414f, 3.0027f, 15.4071f, 3.0f, 13.3893f)
                    verticalLineTo(13.0003f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.3893f)
                    curveTo(0.0032f, 16.2025f, 1.1221f, 18.8996f, 3.1114f, 20.8889f)
                    curveTo(5.1007f, 22.8782f, 7.7978f, 23.9971f, 10.611f, 24.0003f)
                    horizontalLineTo(13.389f)
                    curveTo(16.2022f, 23.9971f, 18.8993f, 22.8782f, 20.8886f, 20.8889f)
                    curveTo(22.8779f, 18.8996f, 23.9968f, 16.2025f, 24.0f, 13.3893f)
                    verticalLineTo(13.0003f)
                    horizontalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null
