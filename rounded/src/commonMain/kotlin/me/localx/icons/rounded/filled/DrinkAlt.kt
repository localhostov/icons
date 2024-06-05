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

public val Icons.Filled.DrinkAlt: ImageVector
    get() {
        if (_drinkAlt != null) {
            return _drinkAlt!!
        }
        _drinkAlt = Builder(name = "DrinkAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.994f, 10.0f)
                lineTo(2.362f, 10.0f)
                lineTo(2.056f, 7.556f)
                arcTo(3.021f, 3.021f, 0.0f, false, true, 5.0f, 4.0f)
                horizontalLineToRelative(7.66f)
                close()
                moveTo(12.994f, 19.11f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.988f, -0.22f)
                lineTo(11.772f, 12.0f)
                lineTo(2.613f, 12.0f)
                lineToRelative(0.955f, 7.622f)
                arcTo(5.008f, 5.008f, 0.0f, false, false, 8.529f, 24.0f)
                lineTo(15.47f, 24.0f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, false, 4.962f, -4.379f)
                lineTo(21.384f, 12.0f)
                horizontalLineToRelative(-7.6f)
                close()
                moveTo(21.634f, 10.0f)
                lineToRelative(0.293f, -2.347f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 4.0f)
                lineTo(14.673f, 4.0f)
                lineToRelative(-0.666f, 6.0f)
                close()
                moveTo(14.8f, 2.89f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.79f, 2.0f)
                lineTo(20.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(15.79f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.981f, 2.669f)
                lineTo(12.661f, 4.0f)
                horizontalLineToRelative(2.012f)
                close()
            }
        }
        .build()
        return _drinkAlt!!
    }

private var _drinkAlt: ImageVector? = null
