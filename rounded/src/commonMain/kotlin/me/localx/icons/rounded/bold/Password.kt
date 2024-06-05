package me.localx.icons.rounded.bold

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

public val Icons.Bold.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                close()
                moveTo(8.939f, 12.561f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 0.0f)
                lineToRelative(0.939f, -0.94f)
                lineToRelative(0.939f, 0.94f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, -2.122f)
                lineToRelative(-0.94f, -0.939f)
                lineToRelative(0.94f, -0.939f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, -2.122f)
                lineToRelative(-0.939f, 0.94f)
                lineToRelative(-0.939f, -0.94f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, 2.122f)
                lineToRelative(0.94f, 0.939f)
                lineToRelative(-0.94f, 0.939f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 2.122f)
                close()
                moveTo(5.5f, 15.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(6.561f, 6.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, 0.0f)
                lineToRelative(-0.939f, 0.94f)
                lineToRelative(-0.939f, -0.94f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, 2.122f)
                lineToRelative(0.94f, 0.939f)
                lineToRelative(-0.94f, 0.939f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineToRelative(0.939f, -0.94f)
                lineToRelative(0.939f, 0.94f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, -2.122f)
                lineToRelative(-0.94f, -0.939f)
                lineToRelative(0.94f, -0.939f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -2.122f)
                close()
                moveTo(22.5f, 15.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(22.621f, 9.5f)
                lineTo(23.561f, 8.561f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, -2.122f)
                lineToRelative(-0.939f, 0.94f)
                lineToRelative(-0.939f, -0.94f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, 2.122f)
                lineToRelative(0.94f, 0.939f)
                lineToRelative(-0.94f, 0.939f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineToRelative(0.939f, -0.94f)
                lineToRelative(0.939f, 0.94f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, -2.122f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
