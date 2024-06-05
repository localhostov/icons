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

public val Icons.Bold.Backpack: ImageVector
    get() {
        if (_backpack != null) {
            return _backpack!!
        }
        _backpack = Builder(name = "Backpack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 14.141f)
                verticalLineToRelative(-2.141f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.0f, -6.916f)
                verticalLineToRelative(-1.084f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(1.084f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.0f, 6.916f)
                verticalLineToRelative(2.141f)
                arcToRelative(3.991f, 3.991f, 0.0f, false, false, -3.0f, 3.859f)
                verticalLineToRelative(2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(3.991f, 3.991f, 0.0f, false, false, -3.0f, -3.859f)
                close()
                moveTo(17.0f, 21.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-0.258f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, true, 10.0f, 0.0f)
                close()
                moveTo(17.0f, 16.537f)
                arcToRelative(8.9f, 8.9f, 0.0f, false, false, -10.0f, 0.0f)
                verticalLineToRelative(-4.537f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 10.0f, 0.0f)
                close()
                moveTo(15.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _backpack!!
    }

private var _backpack: ImageVector? = null
