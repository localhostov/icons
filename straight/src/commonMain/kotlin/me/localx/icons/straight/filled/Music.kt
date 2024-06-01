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

public val Icons.Filled.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.9999f, 1.0003f)
                    horizontalLineTo(10.9999f)
                    curveTo(10.2042f, 1.0003f, 9.4412f, 1.3164f, 8.8786f, 1.879f)
                    curveTo(8.316f, 2.4416f, 7.9999f, 3.2047f, 7.9999f, 4.0003f)
                    verticalLineTo(14.0003f)
                    curveTo(7.0988f, 13.3245f, 5.9959f, 12.9727f, 4.87f, 13.002f)
                    curveTo(3.744f, 13.0313f, 2.6609f, 13.4398f, 1.7961f, 14.1615f)
                    curveTo(0.9314f, 14.8833f, 0.3356f, 15.8758f, 0.1054f, 16.9784f)
                    curveTo(-0.1248f, 18.0809f, 0.024f, 19.2289f, 0.5277f, 20.2364f)
                    curveTo(1.0315f, 21.2438f, 1.8606f, 22.0517f, 2.8808f, 22.529f)
                    curveTo(3.9009f, 23.0064f, 5.0524f, 23.1253f, 6.1487f, 22.8666f)
                    curveTo(7.2449f, 22.6078f, 8.2216f, 21.9864f, 8.9206f, 21.1032f)
                    curveTo(9.6196f, 20.22f, 9.9999f, 19.1267f, 9.9999f, 18.0003f)
                    verticalLineTo(4.0003f)
                    curveTo(9.9999f, 3.7351f, 10.1052f, 3.4807f, 10.2928f, 3.2932f)
                    curveTo(10.4803f, 3.1057f, 10.7347f, 3.0003f, 10.9999f, 3.0003f)
                    horizontalLineTo(20.9999f)
                    curveTo(21.2651f, 3.0003f, 21.5195f, 3.1057f, 21.707f, 3.2932f)
                    curveTo(21.8945f, 3.4807f, 21.9999f, 3.7351f, 21.9999f, 4.0003f)
                    verticalLineTo(14.0003f)
                    curveTo(21.0988f, 13.3245f, 19.9959f, 12.9727f, 18.87f, 13.002f)
                    curveTo(17.744f, 13.0313f, 16.6609f, 13.4398f, 15.7961f, 14.1615f)
                    curveTo(14.9314f, 14.8833f, 14.3356f, 15.8758f, 14.1054f, 16.9784f)
                    curveTo(13.8752f, 18.0809f, 14.024f, 19.2289f, 14.5277f, 20.2364f)
                    curveTo(15.0315f, 21.2438f, 15.8606f, 22.0517f, 16.8808f, 22.529f)
                    curveTo(17.9009f, 23.0064f, 19.0524f, 23.1253f, 20.1486f, 22.8666f)
                    curveTo(21.2449f, 22.6078f, 22.2216f, 21.9864f, 22.9206f, 21.1032f)
                    curveTo(23.6196f, 20.22f, 23.9999f, 19.1267f, 23.9999f, 18.0003f)
                    verticalLineTo(4.0003f)
                    curveTo(23.9999f, 3.2047f, 23.6838f, 2.4416f, 23.1212f, 1.879f)
                    curveTo(22.5586f, 1.3164f, 21.7955f, 1.0003f, 20.9999f, 1.0003f)
                    close()
                }
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
