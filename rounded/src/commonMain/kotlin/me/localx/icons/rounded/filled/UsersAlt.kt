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

public val Icons.Filled.UsersAlt: ImageVector
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
                moveTo(5.683f, 16.0f)
                lineTo(1.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                arcTo(6.022f, 6.022f, 0.0f, false, true, 5.131f, 9.084f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.1f, 1.266f)
                arcTo(6.009f, 6.009f, 0.0f, false, false, 6.0f, 12.0f)
                arcToRelative(5.937f, 5.937f, 0.0f, false, false, 0.586f, 2.57f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.9f, 1.43f)
                close()
                moveTo(17.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 24.0f)
                close()
                moveTo(18.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, -4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 8.0f)
                close()
                moveTo(6.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, -4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 8.0f)
                close()
                moveTo(23.0f, 16.0f)
                lineTo(18.317f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.9f, -1.43f)
                arcTo(5.937f, 5.937f, 0.0f, false, false, 18.0f, 12.0f)
                arcToRelative(6.009f, 6.009f, 0.0f, false, false, -0.236f, -1.65f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.105f, -1.266f)
                arcTo(6.022f, 6.022f, 0.0f, false, true, 24.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 16.0f)
                close()
            }
        }
        .build()
        return _usersAlt!!
    }

private var _usersAlt: ImageVector? = null
