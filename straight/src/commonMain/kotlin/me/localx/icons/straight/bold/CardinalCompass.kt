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

public val Icons.Bold.CardinalCompass: ImageVector
    get() {
        if (_cardinalCompass != null) {
            return _cardinalCompass!!
        }
        _cardinalCompass = Builder(name = "CardinalCompass", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.041f, 14.8f)
                lineToRelative(6.998f, -2.8f)
                lineToRelative(-6.999f, -2.799f)
                lineToRelative(2.46f, -4.701f)
                lineToRelative(-4.701f, 2.46f)
                lineTo(12.0f, -0.04f)
                lineToRelative(-2.799f, 6.999f)
                lineToRelative(-4.701f, -2.46f)
                lineToRelative(2.46f, 4.701f)
                lineTo(-0.039f, 12.0f)
                lineToRelative(6.998f, 2.8f)
                lineToRelative(-2.459f, 4.7f)
                lineToRelative(4.701f, -2.46f)
                lineToRelative(2.799f, 6.998f)
                lineToRelative(2.8f, -6.997f)
                lineToRelative(4.7f, 2.459f)
                lineToRelative(-2.459f, -4.7f)
                close()
                moveTo(12.0f, 15.962f)
                lineToRelative(-1.132f, -2.83f)
                lineToRelative(-2.83f, -1.132f)
                lineToRelative(2.83f, -1.132f)
                lineToRelative(1.132f, -2.829f)
                lineToRelative(1.131f, 2.829f)
                lineToRelative(2.83f, 1.132f)
                lineToRelative(-2.829f, 1.131f)
                lineToRelative(-1.132f, 2.83f)
                close()
            }
        }
        .build()
        return _cardinalCompass!!
    }

private var _cardinalCompass: ImageVector? = null
