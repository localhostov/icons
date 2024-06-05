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

public val Icons.Outline.GreaterThanEqual: ImageVector
    get() {
        if (_greaterThanEqual != null) {
            return _greaterThanEqual!!
        }
        _greaterThanEqual = Builder(name = "GreaterThanEqual", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 9.5f)
                lineTo(3.0f, 18.988f)
                verticalLineToRelative(-2.168f)
                lineToRelative(14.028f, -7.32f)
                lineTo(3.0f, 2.27f)
                verticalLineTo(0.026f)
                lineToRelative(18.5f, 9.474f)
                close()
                moveTo(3.0f, 24.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _greaterThanEqual!!
    }

private var _greaterThanEqual: ImageVector? = null
