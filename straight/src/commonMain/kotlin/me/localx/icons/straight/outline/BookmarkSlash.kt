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

public val Icons.Outline.BookmarkSlash: ImageVector
    get() {
        if (_bookmarkSlash != null) {
            return _bookmarkSlash!!
        }
        _bookmarkSlash = Builder(name = "BookmarkSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 19.586f)
                lineTo(21.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(6.559f, 0.0f)
                curveToRelative(-1.393f, 0.0f, -2.566f, 0.954f, -2.903f, 2.242f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.957f, -2.957f)
                close()
                moveTo(5.559f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(11.441f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(14.586f)
                lineTo(5.559f, 4.145f)
                verticalLineToRelative(-1.145f)
                close()
                moveTo(9.488f, 14.496f)
                lineToRelative(1.429f, 1.429f)
                lineToRelative(-7.917f, 8.075f)
                verticalLineToRelative(-15.991f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(9.094f)
                lineToRelative(4.488f, -4.607f)
                close()
            }
        }
        .build()
        return _bookmarkSlash!!
    }

private var _bookmarkSlash: ImageVector? = null
