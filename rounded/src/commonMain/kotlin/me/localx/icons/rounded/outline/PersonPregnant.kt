package me.localx.icons.rounded.outline

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

public val Icons.Outline.PersonPregnant: ImageVector
    get() {
        if (_personPregnant != null) {
            return _personPregnant!!
        }
        _personPregnant = Builder(name = "PersonPregnant", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(18.0f, 14.5f)
                curveToRelative(0.0f, 1.713f, -0.946f, 4.512f, -1.055f, 4.826f)
                curveToRelative(-0.139f, 0.403f, -0.519f, 0.674f, -0.945f, 0.674f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.188f)
                curveToRelative(-0.474f, -0.169f, -0.909f, -0.441f, -1.249f, -0.826f)
                curveToRelative(-0.569f, -0.645f, -0.834f, -1.504f, -0.728f, -2.357f)
                lineToRelative(0.893f, -7.14f)
                curveToRelative(0.248f, -1.989f, 1.947f, -3.488f, 3.951f, -3.488f)
                reflectiveCurveToRelative(3.703f, 1.5f, 3.951f, 3.488f)
                lineToRelative(0.006f, 0.048f)
                curveToRelative(1.924f, 0.896f, 3.176f, 2.817f, 3.176f, 4.964f)
                close()
                moveTo(16.0f, 14.5f)
                curveToRelative(0.0f, -1.5f, -0.968f, -2.828f, -2.408f, -3.305f)
                curveToRelative(-0.365f, -0.121f, -0.629f, -0.441f, -0.678f, -0.824f)
                lineToRelative(-0.08f, -0.634f)
                curveToRelative(-0.124f, -0.991f, -0.97f, -1.738f, -1.967f, -1.738f)
                reflectiveCurveToRelative(-1.843f, 0.747f, -1.967f, 1.736f)
                lineToRelative(-0.192f, 1.534f)
                lineToRelative(2.846f, 1.897f)
                curveToRelative(0.46f, 0.306f, 0.584f, 0.927f, 0.277f, 1.387f)
                curveToRelative(-0.192f, 0.289f, -0.51f, 0.445f, -0.833f, 0.445f)
                curveToRelative(-0.19f, 0.0f, -0.383f, -0.054f, -0.554f, -0.168f)
                lineToRelative(-2.014f, -1.343f)
                lineToRelative(-0.423f, 3.387f)
                curveToRelative(-0.036f, 0.289f, 0.05f, 0.568f, 0.242f, 0.786f)
                curveToRelative(0.192f, 0.218f, 0.459f, 0.338f, 0.75f, 0.338f)
                horizontalLineToRelative(6.271f)
                curveToRelative(0.309f, -1.006f, 0.729f, -2.583f, 0.729f, -3.5f)
                close()
            }
        }
        .build()
        return _personPregnant!!
    }

private var _personPregnant: ImageVector? = null
