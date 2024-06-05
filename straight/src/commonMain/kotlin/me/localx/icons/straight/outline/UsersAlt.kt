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
                moveTo(6.349f, 11.0f)
                lineTo(3.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 15.0f)
                lineTo(0.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 9.0f)
                lineTo(7.537f, 9.0f)
                arcTo(5.977f, 5.977f, 0.0f, false, false, 6.349f, 11.0f)
                close()
                moveTo(21.0f, 9.0f)
                lineTo(16.463f, 9.0f)
                arcToRelative(5.977f, 5.977f, 0.0f, false, true, 1.188f, 2.0f)
                lineTo(21.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 9.0f)
                close()
                moveTo(16.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 13.0f)
                close()
                moveTo(14.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                close()
                moveTo(18.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(9.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(22.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 22.0f, 4.0f)
                close()
                moveTo(20.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 4.0f)
                close()
                moveTo(10.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 6.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 4.0f)
                close()
                moveTo(8.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 6.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 4.0f)
                close()
            }
        }
        .build()
        return _usersAlt!!
    }

private var _usersAlt: ImageVector? = null
