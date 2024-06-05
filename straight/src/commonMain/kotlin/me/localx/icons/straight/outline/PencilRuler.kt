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

public val Icons.Outline.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) {
            return _pencilRuler!!
        }
        _pencilRuler = Builder(name = "PencilRuler", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.999f, 18.972f)
                lineToRelative(-4.15f, 4.149f)
                curveToRelative(-0.566f, 0.566f, -1.32f, 0.879f, -2.121f, 0.879f)
                reflectiveCurveToRelative(-1.555f, -0.312f, -2.122f, -0.879f)
                lineToRelative(-3.464f, -3.507f)
                lineToRelative(1.423f, -1.406f)
                lineToRelative(3.459f, 3.503f)
                curveToRelative(0.369f, 0.369f, 1.033f, 0.375f, 1.41f, -0.004f)
                lineToRelative(2.747f, -2.747f)
                lineToRelative(-2.667f, -2.71f)
                lineToRelative(-1.977f, 1.936f)
                lineToRelative(-1.399f, -1.43f)
                lineToRelative(3.403f, -3.33f)
                lineToRelative(5.458f, 5.546f)
                close()
                moveTo(4.388f, 11.86f)
                lineToRelative(1.405f, -1.424f)
                lineToRelative(-3.498f, -3.455f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(2.747f, -2.747f)
                lineToRelative(2.71f, 2.668f)
                lineToRelative(-1.936f, 1.978f)
                lineToRelative(1.43f, 1.398f)
                lineToRelative(3.33f, -3.403f)
                lineTo(5.03f, 0.004f)
                lineTo(0.88f, 4.153f)
                curveToRelative(-1.168f, 1.17f, -1.168f, 3.072f, 0.005f, 4.247f)
                lineToRelative(3.503f, 3.46f)
                close()
                moveTo(22.925f, 6.269f)
                lineTo(5.193f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.193f)
                lineTo(17.731f, 1.075f)
                curveToRelative(1.431f, -1.431f, 3.761f, -1.433f, 5.193f, 0.0f)
                curveToRelative(1.431f, 1.432f, 1.431f, 3.762f, 0.0f, 5.193f)
                close()
                moveTo(17.726f, 8.64f)
                lineToRelative(-2.365f, -2.365f)
                lineTo(2.0f, 19.635f)
                verticalLineToRelative(2.365f)
                horizontalLineToRelative(2.365f)
                lineToRelative(13.361f, -13.361f)
                close()
                moveTo(21.511f, 2.49f)
                curveToRelative(-0.652f, -0.652f, -1.712f, -0.651f, -2.365f, 0.0f)
                lineToRelative(-2.371f, 2.371f)
                lineToRelative(2.365f, 2.365f)
                lineToRelative(2.371f, -2.371f)
                curveToRelative(0.651f, -0.652f, 0.651f, -1.713f, 0.0f, -2.365f)
                close()
            }
        }
        .build()
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
