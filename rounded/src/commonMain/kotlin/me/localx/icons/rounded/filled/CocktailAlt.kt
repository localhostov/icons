package me.localx.icons.rounded.filled

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
                moveTo(14.869f, 12.888f)
                lineToRelative(8.173f, -7.551f)
                curveToRelative(2.076f, -1.783f, 0.479f, -5.448f, -2.2f, -5.337f)
                horizontalLineTo(3.156f)
                arcTo(3.169f, 3.169f, 0.0f, false, false, 0.13f, 4.0f)
                horizontalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(1.675f)
                lineToRelative(7.462f, 6.894f)
                arcTo(4.232f, 4.232f, 0.0f, false, false, 11.0f, 13.87f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.869f)
                arcTo(4.253f, 4.253f, 0.0f, false, false, 14.869f, 12.888f)
                close()
            }
        }
        .build()
        return _cocktailAlt!!
    }

private var _cocktailAlt: ImageVector? = null
