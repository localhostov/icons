package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.UsbPendrive: ImageVector
    get() {
        if (_usbPendrive != null) {
            return _usbPendrive!!
        }
        _usbPendrive = Builder(name = "UsbPendrive", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.051f)
                verticalLineTo(0.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.051f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 10.5f)
                verticalLineTo(15.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 18.0f, 0.0f)
                verticalLineTo(10.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.0f, 8.051f)
                close()
                moveTo(8.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(18.0f, 15.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _usbPendrive!!
    }

private var _usbPendrive: ImageVector? = null
