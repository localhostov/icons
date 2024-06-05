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

public val Icons.Filled.CocktailAlt: ImageVector
    get() {
        if (_cocktailAlt != null) {
            return _cocktailAlt!!
        }
        _cocktailAlt = Builder(name = "CocktailAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineTo(1.0f)
                arcTo(5.519f, 5.519f, 0.0f, false, false, 0.9f, 4.0f)
                horizontalLineTo(16.758f)
                lineToRelative(-2.0f, 2.0f)
                horizontalLineTo(2.813f)
                lineTo(11.0f, 13.443f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.443f)
                lineToRelative(9.193f, -8.358f)
                arcTo(5.53f, 5.53f, 0.0f, false, false, 24.0f, 1.0f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _cocktailAlt!!
    }

private var _cocktailAlt: ImageVector? = null
