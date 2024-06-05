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

public val Icons.Filled.BookSpells: ImageVector
    get() {
        if (_bookSpells != null) {
            return _bookSpells!!
        }
        _bookSpells = Builder(name = "BookSpells", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 20.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(22.0f, 2.0f)
                verticalLineToRelative(16.0f)
                lineTo(4.0f, 18.0f)
                curveToRelative(-0.738f, -0.001f, -1.451f, 0.271f, -2.0f, 0.765f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(9.5f, 7.5f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(1.0f, 2.0f)
                lineToRelative(1.0f, -2.0f)
                close()
                moveTo(19.0f, 11.5f)
                lineToRelative(-2.333f, -1.167f)
                lineToRelative(-1.167f, -2.333f)
                lineToRelative(-1.167f, 2.333f)
                lineToRelative(-2.333f, 1.167f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(1.167f, 2.333f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(2.333f, -1.167f)
                close()
            }
        }
        .build()
        return _bookSpells!!
    }

private var _bookSpells: ImageVector? = null
