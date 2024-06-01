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

public val Icons.Outline.RoomService: ImageVector
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
                    moveTo(23.0f, 18.9997f)
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
                    verticalLineTo(18.9997f)
                    curveTo(0.7348f, 18.9997f, 0.4804f, 19.105f, 0.2929f, 19.2925f)
                    curveTo(0.1054f, 19.4801f, 0.0f, 19.7344f, 0.0f, 19.9997f)
                    curveTo(0.0f, 20.2649f, 0.1054f, 20.5192f, 0.2929f, 20.7068f)
                    curveTo(0.4804f, 20.8943f, 0.7348f, 20.9997f, 1.0f, 20.9997f)
                    horizontalLineTo(23.0f)
                    curveTo(23.2652f, 20.9997f, 23.5196f, 20.8943f, 23.7071f, 20.7068f)
                    curveTo(23.8946f, 20.5192f, 24.0f, 20.2649f, 24.0f, 19.9997f)
                    curveTo(24.0f, 19.7344f, 23.8946f, 19.4801f, 23.7071f, 19.2925f)
                    curveTo(23.5196f, 19.105f, 23.2652f, 18.9997f, 23.0f, 18.9997f)
                    close()
                    moveTo(3.0f, 16.9997f)
                    curveTo(3.473f, 5.0656f, 20.531f, 5.0746f, 21.0f, 16.9997f)
                    verticalLineTo(18.9997f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(16.9997f)
                    close()
                }
            }
        }
        .build()
        return _roomService!!
    }

private var _roomService: ImageVector? = null
