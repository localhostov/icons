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

public val Icons.Filled.CardinalCompass: ImageVector
    get() {
        if (_cardinalCompass != null) {
            return _cardinalCompass!!
        }
        _cardinalCompass = Builder(name = "CardinalCompass", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                lineToRelative(-3.0f, -9.0f)
                lineTo(0.0f, 12.0f)
                lineToRelative(9.0f, -3.0f)
                lineTo(12.0f, 0.0f)
                lineToRelative(3.0f, 9.0f)
                lineToRelative(9.0f, 3.0f)
                lineToRelative(-9.0f, 3.0f)
                lineToRelative(-3.0f, 9.0f)
                close()
                moveTo(7.425f, 7.425f)
                lineToRelative(0.473f, -1.385f)
                lineToRelative(-3.898f, -2.039f)
                lineToRelative(2.039f, 3.898f)
                lineToRelative(1.385f, -0.473f)
                close()
                moveTo(16.575f, 7.425f)
                lineToRelative(1.385f, 0.473f)
                lineToRelative(2.039f, -3.897f)
                lineToRelative(-3.898f, 2.039f)
                lineToRelative(0.473f, 1.385f)
                close()
                moveTo(7.424f, 16.575f)
                lineToRelative(-1.385f, -0.473f)
                lineToRelative(-2.039f, 3.898f)
                lineToRelative(3.897f, -2.039f)
                lineToRelative(-0.473f, -1.385f)
                close()
                moveTo(16.575f, 16.575f)
                lineToRelative(-0.473f, 1.385f)
                lineToRelative(3.898f, 2.039f)
                lineToRelative(-2.039f, -3.898f)
                lineToRelative(-1.385f, 0.473f)
                close()
            }
        }
        .build()
        return _cardinalCompass!!
    }

private var _cardinalCompass: ImageVector? = null
