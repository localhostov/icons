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

public val Icons.Filled.RoomService: ImageVector
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
                    moveTo(1.0f, 18.9997f)
                    verticalLineTo(16.9997f)
                    curveTo(1.0036f, 14.257f, 2.0308f, 11.6144f, 3.8804f, 9.5893f)
                    curveTo(5.73f, 7.5641f, 8.2689f, 6.3022f, 11.0f, 6.0507f)
                    verticalLineTo(4.7227f)
                    curveTo(10.6187f, 4.5025f, 10.3207f, 4.1627f, 10.1522f, 3.756f)
                    curveTo(9.9838f, 3.3492f, 9.9542f, 2.8982f, 10.0681f, 2.473f)
                    curveTo(10.1821f, 2.0477f, 10.4332f, 1.6719f, 10.7825f, 1.4039f)
                    curveTo(11.1318f, 1.1359f, 11.5597f, 0.9906f, 12.0f, 0.9906f)
                    curveTo(12.4403f, 0.9906f, 12.8682f, 1.1359f, 13.2175f, 1.4039f)
                    curveTo(13.5668f, 1.6719f, 13.8179f, 2.0477f, 13.9319f, 2.473f)
                    curveTo(14.0458f, 2.8982f, 14.0162f, 3.3492f, 13.8478f, 3.756f)
                    curveTo(13.6793f, 4.1627f, 13.3813f, 4.5025f, 13.0f, 4.7227f)
                    verticalLineTo(6.0507f)
                    curveTo(15.7311f, 6.3022f, 18.27f, 7.5641f, 20.1196f, 9.5893f)
                    curveTo(21.9692f, 11.6144f, 22.9964f, 14.257f, 23.0f, 16.9997f)
                    verticalLineTo(18.9997f)
                    horizontalLineTo(1.0f)
                    close()
                    moveTo(0.0f, 20.9997f)
                    verticalLineTo(22.9997f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(20.9997f)
                    horizontalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _roomService!!
    }

private var _roomService: ImageVector? = null
