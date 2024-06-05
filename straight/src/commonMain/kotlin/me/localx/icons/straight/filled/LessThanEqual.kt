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

public val Icons.Filled.LessThanEqual: ImageVector
    get() {
        if (_lessThanEqual != null) {
            return _lessThanEqual!!
        }
        _lessThanEqual = Builder(name = "LessThanEqual", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 18.988f)
                lineTo(2.5f, 9.5f)
                lineTo(21.0f, 0.026f)
                verticalLineToRelative(2.245f)
                lineToRelative(-14.028f, 7.23f)
                lineToRelative(14.028f, 7.32f)
                verticalLineToRelative(2.168f)
                close()
                moveTo(21.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _lessThanEqual!!
    }

private var _lessThanEqual: ImageVector? = null
