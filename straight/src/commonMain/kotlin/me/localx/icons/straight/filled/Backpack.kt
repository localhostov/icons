package me.localx.icons.straight.filled

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
                moveToRelative(24.0f, 13.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -3.0f, 4.576f)
                verticalLineToRelative(-10.576f)
                close()
                moveTo(19.0f, 11.0f)
                verticalLineToRelative(6.356f)
                arcToRelative(8.978f, 8.978f, 0.0f, false, false, -14.0f, 0.0f)
                verticalLineToRelative(-6.356f)
                arcToRelative(6.992f, 6.992f, 0.0f, false, true, 3.0f, -5.736f)
                verticalLineToRelative(-1.264f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(1.264f)
                arcToRelative(6.992f, 6.992f, 0.0f, false, true, 3.0f, 5.736f)
                close()
                moveTo(10.0f, 4.3f)
                arcToRelative(6.927f, 6.927f, 0.0f, false, true, 4.0f, 0.0f)
                verticalLineToRelative(-0.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                close()
                moveTo(15.0f, 9.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(0.0f, 19.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 3.0f, 4.576f)
                verticalLineToRelative(-10.576f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, false, -7.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, false, -7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _backpack!!
    }

private var _backpack: ImageVector? = null
