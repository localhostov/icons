package me.localx.icons.straight.outline

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

public val Icons.Outline.Backpack: ImageVector
    get() {
        if (_backpack != null) {
            return _backpack!!
        }
        _backpack = Builder(name = "Backpack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 12.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(24.0f, 13.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.0f, -6.918f)
                verticalLineToRelative(-1.082f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(1.082f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.0f, 6.918f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(10.0f, 4.263f)
                arcToRelative(7.736f, 7.736f, 0.0f, false, true, 4.0f, 0.0f)
                verticalLineToRelative(-0.263f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                close()
                moveTo(6.0f, 12.0f)
                verticalLineToRelative(4.726f)
                arcToRelative(7.966f, 7.966f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(-4.726f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                close()
                moveTo(4.0f, 21.816f)
                verticalLineToRelative(-6.816f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, 2.816f)
                close()
                moveTo(6.0f, 22.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                close()
                moveTo(22.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.816f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, -2.816f)
                close()
            }
        }
        .build()
        return _backpack!!
    }

private var _backpack: ImageVector? = null
