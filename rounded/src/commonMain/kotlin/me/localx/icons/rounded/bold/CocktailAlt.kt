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

public val Icons.Bold.CocktailAlt: ImageVector
    get() {
        if (_cocktailAlt != null) {
            return _cocktailAlt!!
        }
        _cocktailAlt = Builder(name = "CocktailAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.108f, 13.248f)
                lineToRelative(7.8f, -7.207f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 0.844f, -3.762f)
                arcTo(3.548f, 3.548f, 0.0f, false, false, 20.441f, 0.0f)
                horizontalLineTo(3.559f)
                arcTo(3.548f, 3.548f, 0.0f, false, false, 0.245f, 2.279f)
                arcToRelative(3.414f, 3.414f, 0.0f, false, false, 0.874f, 3.789f)
                lineTo(8.9f, 13.256f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 1.6f, 0.941f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(14.2f)
                arcTo(4.62f, 4.62f, 0.0f, false, false, 15.108f, 13.248f)
                close()
                moveTo(7.632f, 8.0f)
                horizontalLineTo(13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineToRelative(-9.1f, 0.01f)
                lineTo(3.126f, 3.837f)
                arcToRelative(0.378f, 0.378f, 0.0f, false, true, -0.087f, -0.464f)
                arcTo(0.56f, 0.56f, 0.0f, false, true, 3.559f, 3.0f)
                horizontalLineTo(20.441f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, 0.52f, 0.373f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.115f, 0.491f)
                lineToRelative(-7.764f, 7.172f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -2.155f, 0.008f)
                close()
            }
        }
        .build()
        return _cocktailAlt!!
    }

private var _cocktailAlt: ImageVector? = null
