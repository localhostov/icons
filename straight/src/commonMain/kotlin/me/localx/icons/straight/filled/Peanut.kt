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

public val Icons.Filled.Peanut: ImageVector
    get() {
        if (_peanut != null) {
            return _peanut!!
        }
        _peanut = Builder(name = "Peanut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.997f, 2.003f)
                curveToRelative(-2.829f, -2.829f, -7.631f, -2.629f, -10.704f, 0.442f)
                curveToRelative(-0.949f, 0.95f, -1.663f, 2.111f, -2.062f, 3.36f)
                curveToRelative(-0.528f, 1.647f, -1.776f, 2.896f, -3.425f, 3.425f)
                curveToRelative(-1.248f, 0.399f, -2.41f, 1.112f, -3.359f, 2.062f)
                curveToRelative(-3.073f, 3.073f, -3.271f, 7.875f, -0.442f, 10.704f)
                curveToRelative(1.338f, 1.338f, 3.117f, 1.998f, 4.945f, 1.998f)
                curveToRelative(2.039f, 0.0f, 4.139f, -0.821f, 5.759f, -2.44f)
                curveToRelative(0.949f, -0.95f, 1.663f, -2.111f, 2.062f, -3.359f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.528f, -1.648f, 1.776f, -2.897f, 3.425f, -3.426f)
                curveToRelative(1.248f, -0.399f, 2.41f, -1.112f, 3.359f, -2.062f)
                curveToRelative(3.073f, -3.073f, 3.271f, -7.875f, 0.442f, -10.704f)
                close()
                moveTo(7.5f, 20.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(10.5f, 16.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 6.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _peanut!!
    }

private var _peanut: ImageVector? = null
