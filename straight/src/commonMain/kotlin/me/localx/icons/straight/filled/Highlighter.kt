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

public val Icons.Filled.Highlighter: ImageVector
    get() {
        if (_highlighter != null) {
            return _highlighter!!
        }
        _highlighter = Builder(name = "Highlighter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.648f, 22.0f)
                horizontalLineTo(3.414f)
                lineToRelative(-1.707f, 1.707f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.707f, -1.707f)
                verticalLineToRelative(-7.234f)
                lineToRelative(8.648f, 8.648f)
                close()
                moveTo(23.121f, 3.539f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-1.123f, -1.123f, -2.929f, -1.175f, -4.115f, -0.12f)
                lineTo(3.494f, 12.017f)
                lineToRelative(8.508f, 8.508f)
                lineTo(23.238f, 7.658f)
                curveToRelative(1.059f, -1.186f, 1.007f, -2.996f, -0.117f, -4.12f)
                close()
            }
        }
        .build()
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
