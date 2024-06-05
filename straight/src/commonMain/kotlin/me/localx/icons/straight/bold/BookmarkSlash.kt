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

public val Icons.Bold.BookmarkSlash: ImageVector
    get() {
        if (_bookmarkSlash != null) {
            return _bookmarkSlash!!
        }
        _bookmarkSlash = Builder(name = "BookmarkSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 18.879f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(5.559f, 1.0f)
                curveToRelative(-0.673f, 0.0f, -1.283f, 0.271f, -1.733f, 0.705f)
                lineTo(2.161f, 0.04f)
                lineTo(0.04f, 2.161f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.961f, -2.961f)
                close()
                moveTo(18.0f, 4.0f)
                verticalLineToRelative(11.879f)
                lineTo(6.121f, 4.0f)
                horizontalLineToRelative(11.879f)
                close()
                moveTo(8.795f, 13.804f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-7.917f, 8.075f)
                verticalLineToRelative(-15.991f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(5.646f)
                lineToRelative(2.795f, -2.851f)
                close()
            }
        }
        .build()
        return _bookmarkSlash!!
    }

private var _bookmarkSlash: ImageVector? = null
