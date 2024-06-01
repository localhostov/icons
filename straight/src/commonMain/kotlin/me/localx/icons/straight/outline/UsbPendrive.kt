package me.localx.icons.straight.outline

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

public val Icons.Outline.UsbPendrive: ImageVector
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
                    moveTo(19.0f, 8.184f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(8.184f)
                    curveTo(4.4171f, 8.3901f, 3.9121f, 8.7712f, 3.5541f, 9.2753f)
                    curveTo(3.1961f, 9.7794f, 3.0026f, 10.3817f, 3.0f, 11.0f)
                    verticalLineTo(15.0f)
                    curveTo(3.0f, 17.3869f, 3.9482f, 19.6761f, 5.636f, 21.364f)
                    curveTo(7.3239f, 23.0518f, 9.6131f, 24.0f, 12.0f, 24.0f)
                    curveTo(14.3869f, 24.0f, 16.6761f, 23.0518f, 18.364f, 21.364f)
                    curveTo(20.0518f, 19.6761f, 21.0f, 17.3869f, 21.0f, 15.0f)
                    verticalLineTo(11.0f)
                    curveTo(20.9974f, 10.3817f, 20.8039f, 9.7794f, 20.4459f, 9.2753f)
                    curveTo(20.0879f, 8.7712f, 19.5829f, 8.3901f, 19.0f, 8.184f)
                    close()
                    moveTo(7.0f, 2.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(2.0f)
                    close()
                    moveTo(19.0f, 15.0f)
                    curveTo(19.0f, 16.8565f, 18.2625f, 18.637f, 16.9497f, 19.9497f)
                    curveTo(15.637f, 21.2625f, 13.8565f, 22.0f, 12.0f, 22.0f)
                    curveTo(10.1435f, 22.0f, 8.363f, 21.2625f, 7.0503f, 19.9497f)
                    curveTo(5.7375f, 18.637f, 5.0f, 16.8565f, 5.0f, 15.0f)
                    verticalLineTo(11.0f)
                    curveTo(5.0f, 10.7348f, 5.1054f, 10.4804f, 5.2929f, 10.2929f)
                    curveTo(5.4804f, 10.1054f, 5.7348f, 10.0f, 6.0f, 10.0f)
                    horizontalLineTo(18.0f)
                    curveTo(18.2652f, 10.0f, 18.5196f, 10.1054f, 18.7071f, 10.2929f)
                    curveTo(18.8946f, 10.4804f, 19.0f, 10.7348f, 19.0f, 11.0f)
                    verticalLineTo(15.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.9999f, 3.9994f)
                    horizontalLineTo(12.9999f)
                    verticalLineTo(5.9994f)
                    horizontalLineTo(14.9999f)
                    verticalLineTo(3.9994f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.0f, 3.9994f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(5.9994f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(3.9994f)
                    close()
                }
            }
        }
        .build()
        return _usbPendrive!!
    }

private var _usbPendrive: ImageVector? = null
