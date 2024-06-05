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

public val Icons.Bold.SearchAlt: ImageVector
    get() {
        if (_searchAlt != null) {
            return _searchAlt!!
        }
        _searchAlt = Builder(name = "SearchAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 9.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(21.814f, 23.936f)
                lineTo(19.3f, 21.416f)
                arcToRelative(4.934f, 4.934f, 0.0f, false, true, -2.3f, 0.584f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 5.0f, -5.0f)
                arcToRelative(4.934f, 4.934f, 0.0f, false, true, -0.584f, 2.3f)
                lineToRelative(2.52f, 2.519f)
                close()
                moveTo(19.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
                moveTo(10.079f, 21.0f)
                horizontalLineToRelative(-4.579f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(13.5f)
                verticalLineToRelative(6.262f)
                arcToRelative(7.973f, 7.973f, 0.0f, false, true, 3.0f, 1.5f)
                verticalLineToRelative(-10.762f)
                horizontalLineToRelative(-16.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineToRelative(17.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, 3.5f)
                horizontalLineToRelative(7.63f)
                arcToRelative(8.034f, 8.034f, 0.0f, false, true, -3.051f, -3.0f)
                close()
            }
        }
        .build()
        return _searchAlt!!
    }

private var _searchAlt: ImageVector? = null
