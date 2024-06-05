package me.localx.icons.rounded.outline

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

public val Icons.Outline.Cocktail: ImageVector
    get() {
        if (_cocktail != null) {
            return _cocktail!!
        }
        _cocktail = Builder(name = "Cocktail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.517f, 2.087f)
                arcTo(4.01f, 4.01f, 0.0f, false, false, 20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                arcTo(4.01f, 4.01f, 0.0f, false, false, 0.483f, 2.087f)
                arcToRelative(3.912f, 3.912f, 0.0f, false, false, 0.132f, 4.04f)
                arcTo(13.555f, 13.555f, 0.0f, false, false, 11.0f, 11.965f)
                lineTo(11.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(17.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(13.0f, 22.0f)
                lineTo(13.0f, 11.965f)
                arcTo(13.555f, 13.555f, 0.0f, false, false, 23.385f, 6.127f)
                arcTo(3.912f, 3.912f, 0.0f, false, false, 23.517f, 2.087f)
                close()
                moveTo(4.0f, 2.0f)
                lineTo(20.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(2.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 2.0f)
                close()
                moveTo(12.0f, 10.0f)
                arcTo(12.006f, 12.006f, 0.0f, false, true, 3.011f, 6.0f)
                lineTo(20.989f, 6.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _cocktail!!
    }

private var _cocktail: ImageVector? = null
