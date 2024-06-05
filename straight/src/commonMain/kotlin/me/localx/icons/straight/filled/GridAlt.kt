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

public val Icons.Filled.GridAlt: ImageVector
    get() {
        if (_gridAlt != null) {
            return _gridAlt!!
        }
        _gridAlt = Builder(name = "GridAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 0.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(0.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(11.0f, 11.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(5.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(17.0f, 11.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(13.0f, 0.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(24.0f, 13.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(11.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(5.0f, 5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(19.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(17.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(13.0f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(19.0f, 19.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _gridAlt!!
    }

private var _gridAlt: ImageVector? = null
