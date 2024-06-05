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

public val Icons.Filled.Dropdown: ImageVector
    get() {
        if (_dropdown != null) {
            return _dropdown!!
        }
        _dropdown = Builder(name = "Dropdown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                curveTo(2.243f, 4.0f, 0.0f, 6.243f, 0.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(20.141f, 11.941f)
                lineToRelative(-2.209f, 2.173f)
                curveToRelative(-0.515f, 0.515f, -1.349f, 0.515f, -1.864f, 0.0f)
                lineToRelative(-2.209f, -2.173f)
                curveToRelative(-0.537f, -0.528f, -0.163f, -1.441f, 0.59f, -1.441f)
                horizontalLineToRelative(5.102f)
                curveToRelative(0.753f, 0.0f, 1.127f, 0.913f, 0.59f, 1.441f)
                close()
            }
        }
        .build()
        return _dropdown!!
    }

private var _dropdown: ImageVector? = null
