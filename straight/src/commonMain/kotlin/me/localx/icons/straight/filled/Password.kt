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

public val Icons.Filled.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 18.0f)
                close()
                moveTo(13.793f, 6.793f)
                lineTo(12.0f, 8.586f)
                lineTo(10.207f, 6.793f)
                lineTo(8.793f, 8.207f)
                lineTo(10.586f, 10.0f)
                lineTo(8.793f, 11.793f)
                lineToRelative(1.414f, 1.414f)
                lineTo(12.0f, 11.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.414f, 10.0f)
                lineToRelative(1.793f, -1.793f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineToRelative(6.0f)
                lineTo(23.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                close()
                moveTo(23.207f, 8.207f)
                lineTo(21.793f, 6.793f)
                lineTo(20.0f, 8.586f)
                lineTo(18.207f, 6.793f)
                lineTo(16.793f, 8.207f)
                lineTo(18.586f, 10.0f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(1.414f, 1.414f)
                lineTo(20.0f, 11.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.414f, -1.414f)
                lineTo(21.414f, 10.0f)
                close()
                moveTo(1.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                lineTo(7.0f, 16.0f)
                lineTo(1.0f, 16.0f)
                close()
                moveTo(5.793f, 6.793f)
                lineTo(4.0f, 8.586f)
                lineTo(2.207f, 6.793f)
                lineTo(0.793f, 8.207f)
                lineTo(2.586f, 10.0f)
                lineTo(0.793f, 11.793f)
                lineToRelative(1.414f, 1.414f)
                lineTo(4.0f, 11.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.414f, -1.414f)
                lineTo(5.414f, 10.0f)
                lineTo(7.207f, 8.207f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
