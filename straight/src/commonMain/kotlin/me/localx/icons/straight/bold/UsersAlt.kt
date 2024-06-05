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

public val Icons.Bold.UsersAlt: ImageVector
    get() {
        if (_usersAlt != null) {
            return _usersAlt!!
        }
        _usersAlt = Builder(name = "UsersAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 24.0f)
                lineTo(15.0f, 24.0f)
                lineTo(15.0f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                lineTo(9.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                lineTo(6.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 9.5f, 17.0f)
                horizontalLineToRelative(5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.0f, 20.5f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -3.5f, -3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 16.0f)
                close()
                moveTo(18.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -3.5f, -3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 18.0f, 7.0f)
                close()
                moveTo(6.0f, 7.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 2.5f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.0f, 7.0f)
                close()
                moveTo(8.8f, 8.031f)
                curveTo(8.7f, 8.022f, 8.6f, 8.0f, 8.5f, 8.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 11.5f)
                lineTo(0.0f, 15.0f)
                lineTo(3.0f, 15.0f)
                lineTo(3.0f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                lineTo(6.712f, 11.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 8.8f, 8.031f)
                close()
                moveTo(20.5f, 8.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.1f, 0.0f, -0.2f, 0.022f, -0.3f, 0.031f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 17.288f, 11.0f)
                lineTo(20.5f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(21.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 11.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 8.0f)
                close()
            }
        }
        .build()
        return _usersAlt!!
    }

private var _usersAlt: ImageVector? = null
