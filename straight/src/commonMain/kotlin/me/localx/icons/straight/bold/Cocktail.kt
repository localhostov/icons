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
                moveTo(23.411f, 1.5f)
                arcTo(3.411f, 3.411f, 0.0f, false, false, 20.587f, 0.0f)
                horizontalLineTo(3.413f)
                arcTo(3.409f, 3.409f, 0.0f, false, false, 0.244f, 4.671f)
                arcTo(12.576f, 12.576f, 0.0f, false, false, 10.5f, 12.45f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(12.45f)
                arcTo(12.576f, 12.576f, 0.0f, false, false, 23.756f, 4.671f)
                arcTo(3.405f, 3.405f, 0.0f, false, false, 23.411f, 1.5f)
                close()
                moveTo(12.0f, 9.541f)
                arcTo(9.561f, 9.561f, 0.0f, false, true, 3.224f, 4.0f)
                horizontalLineTo(20.776f)
                arcTo(9.561f, 9.561f, 0.0f, false, true, 12.0f, 9.541f)
                close()
            }
        }
        .build()
        return _cocktail!!
    }

private var _cocktail: ImageVector? = null
