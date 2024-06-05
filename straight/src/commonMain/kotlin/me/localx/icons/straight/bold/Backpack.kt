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
                moveToRelative(15.0f, 13.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(23.0f, 14.0f)
                verticalLineToRelative(5.5f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, -4.5f, 4.5f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, -4.5f, -4.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 5.0f, -8.05f)
                verticalLineToRelative(-0.95f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(0.95f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 5.0f, 8.05f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.0f, 13.0f)
                verticalLineToRelative(4.726f)
                arcToRelative(7.966f, 7.966f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(-4.726f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.576f, 3.0f)
                horizontalLineToRelative(9.152f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.576f, -3.0f)
                close()
            }
        }
        .build()
        return _backpack!!
    }

private var _backpack: ImageVector? = null
