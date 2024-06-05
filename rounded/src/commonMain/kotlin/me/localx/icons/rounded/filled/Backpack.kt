package me.localx.icons.rounded.filled

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

public val Icons.Filled.Backpack: ImageVector
    get() {
        if (_backpack != null) {
            return _backpack!!
        }
        _backpack = Builder(name = "Backpack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 24.0f)
                lineTo(8.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.886f, -2.225f)
                arcToRelative(6.993f, 6.993f, 0.0f, false, true, 13.772f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.0f, 24.0f)
                close()
                moveTo(3.0f, 21.0f)
                lineTo(3.0f, 13.424f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 0.0f, 18.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 3.924f, 4.876f)
                arcTo(4.953f, 4.953f, 0.0f, false, true, 3.0f, 21.0f)
                close()
                moveTo(21.0f, 13.424f)
                lineTo(21.0f, 21.0f)
                arcToRelative(4.953f, 4.953f, 0.0f, false, true, -0.924f, 2.876f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 24.0f, 19.0f)
                lineTo(24.0f, 18.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 21.0f, 13.424f)
                close()
                moveTo(19.0f, 11.0f)
                verticalLineToRelative(6.356f)
                arcToRelative(8.978f, 8.978f, 0.0f, false, false, -14.0f, 0.0f)
                lineTo(5.0f, 11.0f)
                arcTo(6.992f, 6.992f, 0.0f, false, true, 8.0f, 5.264f)
                lineTo(8.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(16.0f, 5.264f)
                arcTo(6.992f, 6.992f, 0.0f, false, true, 19.0f, 11.0f)
                close()
                moveTo(10.0f, 4.3f)
                arcToRelative(6.927f, 6.927f, 0.0f, false, true, 4.0f, 0.0f)
                lineTo(14.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                close()
                moveTo(15.0f, 10.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(10.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineTo(9.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 10.0f)
                close()
            }
        }
        .build()
        return _backpack!!
    }

private var _backpack: ImageVector? = null
