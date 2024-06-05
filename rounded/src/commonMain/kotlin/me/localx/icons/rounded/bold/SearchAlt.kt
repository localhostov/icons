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
                moveToRelative(15.5f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(23.561f, 23.561f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, 0.0f)
                lineToRelative(-2.011f, -2.012f)
                arcToRelative(4.444f, 4.444f, 0.0f, false, true, -1.928f, 0.451f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 4.5f, -4.5f)
                arcToRelative(4.444f, 4.444f, 0.0f, false, true, -0.451f, 1.928f)
                lineToRelative(2.012f, 2.011f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 2.122f)
                close()
                moveTo(17.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                close()
                moveTo(11.5f, 21.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, -3.5f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -5.5f, 5.5f)
                verticalLineToRelative(13.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, 5.5f, 5.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _searchAlt!!
    }

private var _searchAlt: ImageVector? = null
