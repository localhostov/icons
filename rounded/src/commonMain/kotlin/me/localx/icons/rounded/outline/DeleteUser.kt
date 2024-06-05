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

public val Icons.Outline.DeleteUser: ImageVector
    get() {
        if (_deleteUser != null) {
            return _deleteUser!!
        }
        _deleteUser = Builder(name = "DeleteUser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.0f, -6.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, 6.0f, 6.0f)
                close()
                moveTo(9.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
                moveTo(18.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -14.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 18.0f, 0.0f)
                close()
                moveTo(23.707f, 14.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(-1.793f, 1.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(-1.793f, -1.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.793f, -1.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                lineToRelative(-1.793f, 1.793f)
                close()
            }
        }
        .build()
        return _deleteUser!!
    }

private var _deleteUser: ImageVector? = null
