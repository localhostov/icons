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

public val Icons.Outline.Highlighter: ImageVector
    get() {
        if (_highlighter != null) {
            return _highlighter!!
        }
        _highlighter = Builder(name = "Highlighter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.121f, 3.539f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-1.124f, -1.125f, -2.933f, -1.176f, -4.119f, -0.116f)
                lineTo(2.0f, 13.552f)
                verticalLineToRelative(7.034f)
                lineToRelative(-1.707f, 1.707f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.707f, -1.707f)
                horizontalLineToRelative(7.034f)
                lineTo(23.238f, 7.658f)
                curveToRelative(1.059f, -1.186f, 1.007f, -2.996f, -0.117f, -4.12f)
                close()
                moveTo(4.0f, 15.352f)
                lineToRelative(4.648f, 4.648f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-4.648f)
                close()
                moveTo(21.746f, 6.327f)
                lineToRelative(-11.287f, 12.656f)
                lineToRelative(-5.442f, -5.442f)
                lineTo(17.674f, 2.255f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.395f, -0.353f, 0.998f, -0.337f, 1.373f, 0.038f)
                lineToRelative(2.66f, 2.66f)
                curveToRelative(0.375f, 0.375f, 0.392f, 0.979f, 0.039f, 1.374f)
                close()
            }
        }
        .build()
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
