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

public val Icons.Bold.RoomService: ImageVector
    get() {
        if (_roomService != null) {
            return _roomService!!
        }
        _roomService = Builder(name = "RoomService", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 19.0006f)
                    verticalLineTo(16.0006f)
                    curveTo(22.9956f, 13.3456f, 22.0316f, 10.7816f, 20.2858f, 8.7813f)
                    curveTo(18.54f, 6.781f, 16.13f, 5.4791f, 13.5f, 5.1156f)
                    verticalLineTo(4.3106f)
                    curveTo(13.7528f, 4.0223f, 13.9172f, 3.6672f, 13.9734f, 3.2879f)
                    curveTo(14.0297f, 2.9086f, 13.9754f, 2.5212f, 13.8171f, 2.1719f)
                    curveTo(13.6589f, 1.8226f, 13.4033f, 1.5264f, 13.081f, 1.3186f)
                    curveTo(12.7588f, 1.1108f, 12.3834f, 1.0003f, 12.0f, 1.0003f)
                    curveTo(11.6166f, 1.0003f, 11.2412f, 1.1108f, 10.919f, 1.3186f)
                    curveTo(10.5967f, 1.5264f, 10.3411f, 1.8226f, 10.1829f, 2.1719f)
                    curveTo(10.0246f, 2.5212f, 9.9703f, 2.9086f, 10.0266f, 3.2879f)
                    curveTo(10.0828f, 3.6672f, 10.2472f, 4.0223f, 10.5f, 4.3106f)
                    verticalLineTo(5.1156f)
                    curveTo(7.87f, 5.4791f, 5.46f, 6.781f, 3.7142f, 8.7813f)
                    curveTo(1.9684f, 10.7816f, 1.0044f, 13.3456f, 1.0f, 16.0006f)
                    verticalLineTo(19.0006f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(22.0006f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(19.0006f)
                    horizontalLineTo(23.0f)
                    close()
                    moveTo(4.0f, 16.0006f)
                    curveTo(4.4f, 5.4006f, 19.6f, 5.4076f, 20.0f, 16.0006f)
                    verticalLineTo(19.0006f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(16.0006f)
                    close()
                }
            }
        }
        .build()
        return _roomService!!
    }

private var _roomService: ImageVector? = null
