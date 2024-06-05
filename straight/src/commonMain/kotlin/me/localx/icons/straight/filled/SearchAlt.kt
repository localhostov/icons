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

public val Icons.Filled.SearchAlt: ImageVector
    get() {
        if (_searchAlt != null) {
            return _searchAlt!!
        }
        _searchAlt = Builder(name = "SearchAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 17.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 11.0f, -4.684f)
                verticalLineToRelative(-12.816f)
                horizontalLineToRelative(-17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(12.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -6.5f, -6.5f)
                close()
                moveTo(7.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(22.543f, 23.957f)
                lineTo(19.886f, 21.3f)
                arcToRelative(4.457f, 4.457f, 0.0f, false, true, -2.386f, 0.7f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 4.5f, -4.5f)
                arcToRelative(4.457f, 4.457f, 0.0f, false, true, -0.7f, 2.386f)
                lineToRelative(2.657f, 2.657f)
                close()
            }
        }
        .build()
        return _searchAlt!!
    }

private var _searchAlt: ImageVector? = null
