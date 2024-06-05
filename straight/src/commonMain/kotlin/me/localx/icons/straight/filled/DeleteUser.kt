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

public val Icons.Filled.DeleteUser: ImageVector
    get() {
        if (_deleteUser != null) {
            return _deleteUser!!
        }
        _deleteUser = Builder(name = "DeleteUser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.414f, 9.957f)
                lineToRelative(2.543f, 2.543f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.543f, -2.543f)
                lineToRelative(-2.543f, 2.543f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.543f, -2.543f)
                lineToRelative(-2.543f, -2.543f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.543f, 2.543f)
                lineToRelative(2.543f, -2.543f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(9.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.0f, -6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                close()
                moveTo(13.043f, 14.0f)
                horizontalLineToRelative(-8.086f)
                arcToRelative(4.963f, 4.963f, 0.0f, false, false, -4.957f, 4.957f)
                verticalLineToRelative(5.043f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-5.043f)
                arcToRelative(4.963f, 4.963f, 0.0f, false, false, -4.957f, -4.957f)
                close()
            }
        }
        .build()
        return _deleteUser!!
    }

private var _deleteUser: ImageVector? = null
