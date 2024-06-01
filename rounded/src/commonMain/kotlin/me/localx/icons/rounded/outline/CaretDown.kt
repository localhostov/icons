package me.localx.icons.rounded.outline

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

public val Icons.Outline.CaretDown: ImageVector
    get() {
        if (_caretDown != null) {
            return _caretDown!!
        }
        _caretDown = Builder(name = "CaretDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.4101f, 9.0f)
                horizontalLineTo(17.5901f)
                curveTo(17.7879f, 9.0008f, 17.981f, 9.0603f, 18.145f, 9.1708f)
                curveTo(18.3089f, 9.2814f, 18.4365f, 9.4381f, 18.5114f, 9.6212f)
                curveTo(18.5863f, 9.8042f, 18.6053f, 10.0053f, 18.5659f, 10.1991f)
                curveTo(18.5265f, 10.3929f, 18.4305f, 10.5707f, 18.2901f, 10.71f)
                lineTo(12.7101f, 16.29f)
                curveTo(12.6172f, 16.3837f, 12.5066f, 16.4581f, 12.3847f, 16.5089f)
                curveTo(12.2628f, 16.5596f, 12.1321f, 16.5858f, 12.0001f, 16.5858f)
                curveTo(11.8681f, 16.5858f, 11.7374f, 16.5596f, 11.6155f, 16.5089f)
                curveTo(11.4937f, 16.4581f, 11.3831f, 16.3837f, 11.2901f, 16.29f)
                lineTo(5.7101f, 10.71f)
                curveTo(5.5697f, 10.5707f, 5.4737f, 10.3929f, 5.4343f, 10.1991f)
                curveTo(5.3949f, 10.0053f, 5.4139f, 9.8042f, 5.4889f, 9.6212f)
                curveTo(5.5638f, 9.4381f, 5.6913f, 9.2814f, 5.8553f, 9.1708f)
                curveTo(6.0193f, 9.0603f, 6.2123f, 9.0008f, 6.4101f, 9.0f)
                close()
            }
        }
        .build()
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
