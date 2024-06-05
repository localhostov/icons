package me.localx.icons.straight.bold

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
                moveTo(0.0f, 0.0f)
                verticalLineTo(1.5f)
                arcTo(6.033f, 6.033f, 0.0f, false, false, 1.954f, 5.94f)
                lineToRelative(8.546f, 8.2f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(14.139f)
                lineToRelative(8.529f, -8.184f)
                arcTo(6.033f, 6.033f, 0.0f, false, false, 24.0f, 1.5f)
                verticalLineTo(0.0f)
                close()
                moveTo(19.982f, 3.763f)
                lineTo(12.0f, 11.421f)
                lineTo(8.434f, 8.0f)
                horizontalLineToRelative(4.243f)
                lineTo(15.8f, 5.0f)
                horizontalLineTo(5.307f)
                lineTo(3.988f, 3.735f)
                arcTo(3.038f, 3.038f, 0.0f, false, true, 3.4f, 3.0f)
                horizontalLineTo(20.6f)
                arcTo(3.212f, 3.212f, 0.0f, false, true, 19.982f, 3.763f)
                close()
            }
        }
        .build()
        return _cocktailAlt!!
    }

private var _cocktailAlt: ImageVector? = null
