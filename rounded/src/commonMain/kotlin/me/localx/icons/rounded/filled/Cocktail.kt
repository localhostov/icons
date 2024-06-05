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

public val Icons.Filled.Cocktail: ImageVector
    get() {
        if (_cocktail != null) {
            return _cocktail!!
        }
        _cocktail = Builder(name = "Cocktail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.009f, 4.0f)
                lineTo(-0.009f, 4.0f)
                arcTo(4.012f, 4.012f, 0.0f, false, true, 4.0f, 0.0f)
                lineTo(20.0f, 0.0f)
                arcToRelative(4.012f, 4.012f, 0.0f, false, true, 4.009f, 4.0f)
                close()
                moveTo(23.454f, 6.0f)
                lineTo(0.534f, 6.0f)
                arcTo(13.814f, 13.814f, 0.0f, false, false, 11.0f, 11.965f)
                lineTo(11.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(17.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(13.0f, 22.0f)
                lineTo(13.0f, 11.965f)
                arcTo(13.8f, 13.8f, 0.0f, false, false, 23.454f, 6.0f)
                close()
            }
        }
        .build()
        return _cocktail!!
    }

private var _cocktail: ImageVector? = null
