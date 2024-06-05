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

public val Icons.Filled.Treatment: ImageVector
    get() {
        if (_treatment != null) {
            return _treatment!!
        }
        _treatment = Builder(name = "Treatment", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.829f, 2.0f)
                arcToRelative(3.006f, 3.006f, 0.0f, false, false, -2.829f, -2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(3.006f, 3.006f, 0.0f, false, false, -2.829f, 2.0f)
                horizontalLineToRelative(-5.171f)
                verticalLineToRelative(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineToRelative(-19.0f)
                close()
                moveTo(8.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 21.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(17.0f, 17.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _treatment!!
    }

private var _treatment: ImageVector? = null
