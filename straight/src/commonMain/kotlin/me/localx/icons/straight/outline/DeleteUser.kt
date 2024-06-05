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
                moveTo(18.0f, 19.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                close()
                moveTo(21.414f, 10.0f)
                lineTo(23.957f, 12.543f)
                lineTo(22.543f, 13.957f)
                lineTo(20.0f, 11.414f)
                lineTo(17.457f, 13.957f)
                lineTo(16.043f, 12.543f)
                lineTo(18.586f, 10.0f)
                lineTo(16.043f, 7.457f)
                lineTo(17.457f, 6.043f)
                lineTo(20.0f, 8.586f)
                lineTo(22.543f, 6.043f)
                lineTo(23.957f, 7.457f)
                close()
            }
        }
        .build()
        return _deleteUser!!
    }

private var _deleteUser: ImageVector? = null
