package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveTo(19.0f, 8.762f)
                verticalLineTo(4.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 14.5f, 0.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 5.0f, 4.5f)
                verticalLineTo(8.762f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 3.0f, 12.5f)
                verticalLineTo(15.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 18.0f, 0.0f)
                verticalLineTo(12.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 19.0f, 8.762f)
                close()
                moveTo(8.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 3.0f)
                horizontalLineToRelative(5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 4.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(18.0f, 15.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 15.0f)
                verticalLineTo(12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 11.0f)
                horizontalLineToRelative(9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 12.5f)
                close()
            }
        }
        .build()
        return _usbPendrive!!
    }

private var _usbPendrive: ImageVector? = null
