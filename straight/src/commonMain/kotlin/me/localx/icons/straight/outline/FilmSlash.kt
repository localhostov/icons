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

public val Icons.Outline.FilmSlash: ImageVector
    get() {
        if (_filmSlash != null) {
            return _filmSlash!!
        }
        _filmSlash = Builder(name = "FilmSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 20.0f)
                verticalLineToRelative(-7.758f)
                lineTo(2.0f, 6.243f)
                verticalLineToRelative(15.758f)
                lineTo(4.0f, 22.001f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(11.757f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(8.0f, 20.001f)
                close()
                moveTo(6.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 17.0f)
                close()
                moveTo(22.0f, 20.587f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                verticalLineToRelative(2.587f)
                lineTo(1.456f, 0.043f)
                lineTo(0.042f, 1.458f)
                lineTo(22.542f, 23.958f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.956f, -1.956f)
                close()
                moveTo(20.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 14.587f)
                lineToRelative(-1.587f, -1.587f)
                horizontalLineToRelative(1.587f)
                verticalLineToRelative(1.587f)
                close()
                moveTo(18.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.587f)
                lineToRelative(-0.413f, -0.413f)
                verticalLineToRelative(-1.587f)
                close()
                moveTo(20.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3.587f)
                lineToRelative(-4.413f, -4.413f)
                verticalLineToRelative(-2.587f)
                close()
            }
        }
        .build()
        return _filmSlash!!
    }

private var _filmSlash: ImageVector? = null
