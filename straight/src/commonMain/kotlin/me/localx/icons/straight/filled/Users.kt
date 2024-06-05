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

public val Icons.Filled.Users: ImageVector
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
                moveTo(15.0f, 20.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(17.5f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 4.5f, -4.5f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, -4.5f, 4.5f)
                close()
                moveTo(19.0f, 11.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(4.793f, 4.793f, 0.0f, false, false, -0.524f, 0.053f)
                arcToRelative(6.514f, 6.514f, 0.0f, false, true, -1.576f, 2.216f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, true, 5.1f, 6.731f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
