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
                    moveTo(24.0f, 21.9997f)
                    curveTo(24.0f, 22.2649f, 23.8946f, 22.5192f, 23.7071f, 22.7068f)
                    curveTo(23.5196f, 22.8943f, 23.2652f, 22.9997f, 23.0f, 22.9997f)
                    horizontalLineTo(1.0f)
                    curveTo(0.7348f, 22.9997f, 0.4804f, 22.8943f, 0.2929f, 22.7068f)
                    curveTo(0.1054f, 22.5192f, 0.0f, 22.2649f, 0.0f, 21.9997f)
                    curveTo(0.0f, 21.7344f, 0.1054f, 21.4801f, 0.2929f, 21.2925f)
                    curveTo(0.4804f, 21.105f, 0.7348f, 20.9997f, 1.0f, 20.9997f)
                    horizontalLineTo(23.0f)
                    curveTo(23.2652f, 20.9997f, 23.5196f, 21.105f, 23.7071f, 21.2925f)
                    curveTo(23.8946f, 21.4801f, 24.0f, 21.7344f, 24.0f, 21.9997f)
                    close()
                    moveTo(2.0f, 18.9997f)
                    horizontalLineTo(22.0f)
                    curveTo(22.2652f, 18.9997f, 22.5196f, 18.8943f, 22.7071f, 18.7068f)
                    curveTo(22.8946f, 18.5192f, 23.0f, 18.2649f, 23.0f, 17.9997f)
                    verticalLineTo(16.9997f)
                    curveTo(22.9964f, 14.257f, 21.9692f, 11.6144f, 20.1196f, 9.5893f)
                    curveTo(18.27f, 7.5641f, 15.7311f, 6.3022f, 13.0f, 6.0507f)
                    verticalLineTo(4.7227f)
                    curveTo(13.3813f, 4.5025f, 13.6793f, 4.1627f, 13.8478f, 3.756f)
                    curveTo(14.0162f, 3.3492f, 14.0458f, 2.8982f, 13.9319f, 2.473f)
                    curveTo(13.8179f, 2.0477f, 13.5668f, 1.6719f, 13.2175f, 1.4039f)
                    curveTo(12.8682f, 1.1359f, 12.4403f, 0.9906f, 12.0f, 0.9906f)
                    curveTo(11.5597f, 0.9906f, 11.1318f, 1.1359f, 10.7825f, 1.4039f)
                    curveTo(10.4332f, 1.6719f, 10.1821f, 2.0477f, 10.0681f, 2.473f)
                    curveTo(9.9542f, 2.8982f, 9.9838f, 3.3492f, 10.1522f, 3.756f)
                    curveTo(10.3207f, 4.1627f, 10.6187f, 4.5025f, 11.0f, 4.7227f)
                    verticalLineTo(6.0507f)
                    curveTo(8.2689f, 6.3022f, 5.73f, 7.5641f, 3.8804f, 9.5893f)
                    curveTo(2.0308f, 11.6144f, 1.0036f, 14.257f, 1.0f, 16.9997f)
                    verticalLineTo(17.9997f)
                    curveTo(1.0f, 18.2649f, 1.1054f, 18.5192f, 1.2929f, 18.7068f)
                    curveTo(1.4804f, 18.8943f, 1.7348f, 18.9997f, 2.0f, 18.9997f)
                    close()
                }
            }
        }
        .build()
        return _roomService!!
    }

private var _roomService: ImageVector? = null
