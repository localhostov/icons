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

public val Icons.Filled.FilmSlash: ImageVector
    get() {
        if (_filmSlash != null) {
            return _filmSlash!!
        }
        _filmSlash = Builder(name = "FilmSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(11.757f)
                lineTo(2.0f, 6.243f)
                verticalLineToRelative(15.758f)
                close()
                moveTo(4.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(6.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(22.0f, 20.586f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                verticalLineToRelative(2.586f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.458f)
                lineTo(22.543f, 23.958f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.957f, -1.957f)
                close()
                moveTo(20.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.586f)
                lineToRelative(-0.414f, -0.414f)
                verticalLineToRelative(-1.586f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.586f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(3.586f)
                close()
            }
        }
        .build()
        return _filmSlash!!
    }

private var _filmSlash: ImageVector? = null
