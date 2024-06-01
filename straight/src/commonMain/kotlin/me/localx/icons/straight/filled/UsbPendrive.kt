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

public val Icons.Filled.UsbPendrive: ImageVector
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
                    moveTo(17.9998f, 9.0f)
                    horizontalLineTo(5.9998f)
                    curveTo(5.4694f, 9.0f, 4.9607f, 9.2107f, 4.5856f, 9.5858f)
                    curveTo(4.2105f, 9.9609f, 3.9998f, 10.4696f, 3.9998f, 11.0f)
                    verticalLineTo(16.0f)
                    curveTo(3.9998f, 18.1217f, 4.8427f, 20.1566f, 6.343f, 21.6569f)
                    curveTo(7.8432f, 23.1571f, 9.8781f, 24.0f, 11.9998f, 24.0f)
                    curveTo(14.1215f, 24.0f, 16.1564f, 23.1571f, 17.6567f, 21.6569f)
                    curveTo(19.157f, 20.1566f, 19.9998f, 18.1217f, 19.9998f, 16.0f)
                    verticalLineTo(11.0f)
                    curveTo(19.9998f, 10.4696f, 19.7891f, 9.9609f, 19.414f, 9.5858f)
                    curveTo(19.039f, 9.2107f, 18.5302f, 9.0f, 17.9998f, 9.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0f, 0.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(11.0f, 5.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(5.0f)
                    close()
                    moveTo(15.0f, 5.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(5.0f)
                    close()
                }
            }
        }
        .build()
        return _usbPendrive!!
    }

private var _usbPendrive: ImageVector? = null
