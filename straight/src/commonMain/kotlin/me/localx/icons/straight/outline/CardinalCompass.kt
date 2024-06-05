package me.localx.icons.straight.outline

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

public val Icons.Outline.CardinalCompass: ImageVector
    get() {
        if (_cardinalCompass != null) {
            return _cardinalCompass!!
        }
        _cardinalCompass = Builder(name = "CardinalCompass", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.951f, 14.628f)
                lineToRelative(6.835f, -2.628f)
                lineToRelative(-6.835f, -2.629f)
                lineToRelative(2.549f, -4.871f)
                lineToRelative(-4.872f, 2.549f)
                lineTo(12.0f, 0.214f)
                lineToRelative(-2.629f, 6.834f)
                lineToRelative(-4.871f, -2.549f)
                lineToRelative(2.549f, 4.871f)
                lineTo(0.214f, 12.0f)
                lineToRelative(6.835f, 2.628f)
                lineToRelative(-2.549f, 4.872f)
                lineToRelative(4.871f, -2.549f)
                lineToRelative(2.629f, 6.835f)
                lineToRelative(2.628f, -6.835f)
                lineToRelative(4.872f, 2.549f)
                lineToRelative(-2.549f, -4.872f)
                close()
                moveTo(12.0f, 18.214f)
                lineToRelative(-1.726f, -4.487f)
                lineToRelative(-4.488f, -1.727f)
                lineToRelative(4.488f, -1.726f)
                lineToRelative(1.726f, -4.488f)
                lineToRelative(1.727f, 4.488f)
                lineToRelative(4.487f, 1.726f)
                lineToRelative(-4.487f, 1.727f)
                lineToRelative(-1.727f, 4.487f)
                close()
            }
        }
        .build()
        return _cardinalCompass!!
    }

private var _cardinalCompass: ImageVector? = null
