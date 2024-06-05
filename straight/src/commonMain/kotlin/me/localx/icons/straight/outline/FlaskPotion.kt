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

public val Icons.Outline.FlaskPotion: ImageVector
    get() {
        if (_flaskPotion != null) {
            return _flaskPotion!!
        }
        _flaskPotion = Builder(name = "FlaskPotion", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 6.333f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.291f)
                curveTo(2.725f, 8.158f, 0.0f, 12.179f, 0.0f, 16.714f)
                curveToRelative(0.0f, 2.506f, 0.841f, 4.894f, 2.431f, 6.906f)
                lineToRelative(0.3f, 0.38f)
                horizontalLineToRelative(18.539f)
                lineToRelative(0.3f, -0.38f)
                curveToRelative(1.59f, -2.012f, 2.431f, -4.399f, 2.431f, -6.906f)
                curveToRelative(0.0f, -4.401f, -2.785f, -8.492f, -7.0f, -10.382f)
                close()
                moveTo(8.349f, 7.903f)
                lineToRelative(0.651f, -0.242f)
                lineTo(9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.688f)
                lineToRelative(0.643f, 0.246f)
                curveToRelative(2.711f, 1.036f, 4.788f, 3.128f, 5.757f, 5.62f)
                curveToRelative(-0.898f, 0.504f, -2.85f, 1.446f, -4.899f, 1.446f)
                curveToRelative(-1.652f, 0.0f, -2.865f, -0.455f, -4.148f, -0.937f)
                curveToRelative(-1.395f, -0.523f, -2.837f, -1.063f, -4.852f, -1.063f)
                curveToRelative(-1.922f, 0.0f, -3.87f, 0.811f, -5.238f, 1.544f)
                curveToRelative(0.734f, -2.987f, 2.962f, -5.478f, 6.087f, -6.642f)
                close()
                moveTo(20.287f, 22.001f)
                lineTo(3.714f, 22.001f)
                curveToRelative(-1.062f, -1.486f, -1.648f, -3.193f, -1.708f, -4.977f)
                curveToRelative(0.936f, -0.614f, 3.32f, -2.023f, 5.494f, -2.023f)
                curveToRelative(1.652f, 0.0f, 2.865f, 0.455f, 4.148f, 0.937f)
                curveToRelative(1.395f, 0.523f, 2.837f, 1.063f, 4.852f, 1.063f)
                curveToRelative(2.195f, 0.0f, 4.22f, -0.835f, 5.419f, -1.453f)
                curveToRelative(0.053f, 0.385f, 0.081f, 0.775f, 0.081f, 1.167f)
                curveToRelative(0.0f, 1.896f, -0.591f, 3.714f, -1.714f, 5.286f)
                close()
            }
        }
        .build()
        return _flaskPotion!!
    }

private var _flaskPotion: ImageVector? = null
