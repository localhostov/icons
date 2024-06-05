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

public val Icons.Filled.StarChristmas: ImageVector
    get() {
        if (_starChristmas != null) {
            return _starChristmas!!
        }
        _starChristmas = Builder(name = "StarChristmas", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 24.038f)
                lineToRelative(-3.511f, -8.527f)
                lineTo(-0.039f, 12.0f)
                lineToRelative(8.528f, -3.511f)
                lineTo(12.0f, -0.038f)
                lineToRelative(3.511f, 8.527f)
                lineToRelative(8.528f, 3.511f)
                lineToRelative(-8.528f, 3.511f)
                lineToRelative(-3.511f, 8.527f)
                close()
                moveTo(6.957f, 6.957f)
                lineToRelative(0.544f, -1.322f)
                lineTo(2.0f, 2.0f)
                lineToRelative(3.634f, 5.501f)
                lineToRelative(1.323f, -0.545f)
                close()
                moveTo(17.043f, 6.957f)
                lineToRelative(1.279f, 0.527f)
                lineToRelative(3.678f, -5.483f)
                lineToRelative(-5.483f, 3.678f)
                lineToRelative(0.526f, 1.279f)
                close()
                moveTo(17.043f, 17.044f)
                lineToRelative(-0.526f, 1.279f)
                lineToRelative(5.483f, 3.678f)
                lineToRelative(-3.678f, -5.483f)
                lineToRelative(-1.279f, 0.527f)
                close()
                moveTo(6.957f, 17.044f)
                lineToRelative(-1.279f, -0.527f)
                lineToRelative(-3.678f, 5.483f)
                lineToRelative(5.483f, -3.678f)
                lineToRelative(-0.526f, -1.279f)
                close()
            }
        }
        .build()
        return _starChristmas!!
    }

private var _starChristmas: ImageVector? = null
