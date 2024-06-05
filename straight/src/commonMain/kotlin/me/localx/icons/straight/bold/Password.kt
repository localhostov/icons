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
                moveToRelative(9.0f, 15.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(13.439f, 5.939f)
                lineTo(12.0f, 7.379f)
                lineTo(10.561f, 5.939f)
                lineTo(8.439f, 8.061f)
                lineTo(9.879f, 9.5f)
                lineTo(8.439f, 10.939f)
                lineTo(10.561f, 13.061f)
                lineTo(12.0f, 11.621f)
                lineTo(13.439f, 13.061f)
                lineTo(15.561f, 10.939f)
                lineTo(14.121f, 9.5f)
                lineTo(15.561f, 8.061f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(23.561f, 8.061f)
                lineTo(21.439f, 5.939f)
                lineTo(20.0f, 7.379f)
                lineTo(18.561f, 5.939f)
                lineTo(16.439f, 8.061f)
                lineTo(17.879f, 9.5f)
                lineTo(16.439f, 10.939f)
                lineTo(18.561f, 13.061f)
                lineTo(20.0f, 11.621f)
                lineTo(21.439f, 13.061f)
                lineTo(23.561f, 10.939f)
                lineTo(22.121f, 9.5f)
                close()
                moveTo(1.0f, 18.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(5.439f, 5.939f)
                lineTo(4.0f, 7.379f)
                lineTo(2.561f, 5.939f)
                lineTo(0.439f, 8.061f)
                lineTo(1.879f, 9.5f)
                lineTo(0.439f, 10.939f)
                lineTo(2.561f, 13.061f)
                lineTo(4.0f, 11.621f)
                lineTo(5.439f, 13.061f)
                lineTo(7.561f, 10.939f)
                lineTo(6.121f, 9.5f)
                lineTo(7.561f, 8.061f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
