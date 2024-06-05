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

public val Icons.Outline.UsersAlt: ImageVector
    get() {
        if (_usersAlt != null) {
            return _usersAlt!!
        }
        _usersAlt = Builder(name = "UsersAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, -4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                close()
                moveTo(18.0f, 23.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(18.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, -4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 8.0f)
                close()
                moveTo(18.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 2.0f)
                close()
                moveTo(24.0f, 15.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, -6.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(6.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, -4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 8.0f)
                close()
                moveTo(6.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 8.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 2.0f)
                close()
                moveTo(2.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 9.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, -6.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _usersAlt!!
    }

private var _usersAlt: ImageVector? = null
