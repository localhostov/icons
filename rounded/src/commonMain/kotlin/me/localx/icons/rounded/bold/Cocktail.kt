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

public val Icons.Bold.Cocktail: ImageVector
    get() {
        if (_cocktail != null) {
            return _cocktail!!
        }
        _cocktail = Builder(name = "Cocktail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.46f, 2.273f)
                arcTo(4.368f, 4.368f, 0.0f, false, false, 19.628f, 0.0f)
                horizontalLineTo(4.372f)
                arcTo(4.368f, 4.368f, 0.0f, false, false, 0.54f, 2.273f)
                arcTo(4.273f, 4.273f, 0.0f, false, false, 0.684f, 6.684f)
                arcTo(14.035f, 14.035f, 0.0f, false, false, 10.5f, 12.9f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(12.9f)
                arcToRelative(14.035f, 14.035f, 0.0f, false, false, 9.816f, -6.217f)
                arcTo(4.273f, 4.273f, 0.0f, false, false, 23.46f, 2.273f)
                close()
                moveTo(12.0f, 10.0f)
                arcTo(11.07f, 11.07f, 0.0f, false, true, 3.183f, 5.0f)
                horizontalLineTo(20.817f)
                arcTo(11.071f, 11.071f, 0.0f, false, true, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _cocktail!!
    }

private var _cocktail: ImageVector? = null
