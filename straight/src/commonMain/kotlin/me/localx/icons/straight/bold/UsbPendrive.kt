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

public val Icons.Bold.UsbPendrive: ImageVector
    get() {
        if (_usbPendrive != null) {
            return _usbPendrive!!
        }
        _usbPendrive = Builder(name = "UsbPendrive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 8.051f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(8.051f)
                    curveTo(4.4355f, 8.1662f, 3.9281f, 8.4729f, 3.5637f, 8.9192f)
                    curveTo(3.1992f, 9.3654f, 3.0001f, 9.9239f, 3.0f, 10.5f)
                    verticalLineTo(15.0f)
                    curveTo(3.0f, 17.3869f, 3.9482f, 19.6761f, 5.636f, 21.364f)
                    curveTo(7.3239f, 23.0518f, 9.6131f, 24.0f, 12.0f, 24.0f)
                    curveTo(14.3869f, 24.0f, 16.6761f, 23.0518f, 18.364f, 21.364f)
                    curveTo(20.0518f, 19.6761f, 21.0f, 17.3869f, 21.0f, 15.0f)
                    verticalLineTo(10.5f)
                    curveTo(20.9999f, 9.9239f, 20.8008f, 9.3654f, 20.4363f, 8.9192f)
                    curveTo(20.0719f, 8.4729f, 19.5645f, 8.1662f, 19.0f, 8.051f)
                    close()
                    moveTo(8.0f, 3.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(18.0f, 15.0f)
                    curveTo(18.0f, 16.5913f, 17.3679f, 18.1174f, 16.2426f, 19.2426f)
                    curveTo(15.1174f, 20.3679f, 13.5913f, 21.0f, 12.0f, 21.0f)
                    curveTo(10.4087f, 21.0f, 8.8826f, 20.3679f, 7.7574f, 19.2426f)
                    curveTo(6.6321f, 18.1174f, 6.0f, 16.5913f, 6.0f, 15.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(15.0f)
                    close()
                }
            }
        }
        .build()
        return _usbPendrive!!
    }

private var _usbPendrive: ImageVector? = null
