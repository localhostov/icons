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

public val Icons.Bold.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.5f, 13.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 4.5f, -4.5f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, -4.5f, 4.5f)
                close()
                moveTo(7.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(15.0f, 20.5f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -5.5f, -5.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -5.5f, 5.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(17.5f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 4.5f, -4.5f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, -4.5f, 4.5f)
                close()
                moveTo(17.5f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 16.5f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -5.5f, -5.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
