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

public val Icons.Outline.Nose: ImageVector
    get() {
        if (_nose != null) {
            return _nose!!
        }
        _nose = Builder(name = "Nose", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 18.0f)
                curveToRelative(0.0f, 2.78f, 2.779f, 4.03f, 2.897f, 4.082f)
                lineToRelative(-0.792f, 1.837f)
                curveToRelative(-0.167f, -0.071f, -4.106f, -1.807f, -4.106f, -5.919f)
                reflectiveCurveToRelative(5.399f, -6.337f, 5.628f, -6.429f)
                lineToRelative(0.744f, 1.856f)
                curveToRelative(-1.216f, 0.491f, -4.373f, 2.269f, -4.373f, 4.572f)
                close()
                moveTo(23.0f, 19.439f)
                curveToRelative(-0.021f, -1.424f, -0.78f, -2.975f, -2.258f, -4.61f)
                curveToRelative(-1.452f, -1.606f, -2.898f, -4.765f, -3.955f, -7.071f)
                lineToRelative(-0.419f, -0.909f)
                curveToRelative(-1.077f, -2.318f, -1.368f, -3.433f, -1.368f, -6.849f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 3.532f, 0.291f, 4.97f, 1.555f, 7.69f)
                lineToRelative(0.414f, 0.9f)
                curveToRelative(1.11f, 2.425f, 2.631f, 5.744f, 4.289f, 7.579f)
                curveToRelative(1.14f, 1.262f, 1.742f, 2.413f, 1.742f, 3.33f)
                curveToRelative(0.0f, 0.007f, 0.093f, 0.919f, -0.447f, 1.541f)
                curveToRelative(-0.511f, 0.589f, -1.488f, 0.906f, -2.807f, 0.944f)
                curveToRelative(-1.162f, -0.075f, -1.853f, -0.648f, -2.705f, -1.367f)
                curveToRelative(-0.496f, -0.42f, -1.008f, -0.854f, -1.652f, -1.219f)
                curveToRelative(-1.033f, -0.586f, -1.812f, -0.466f, -2.282f, -0.259f)
                curveToRelative(-0.549f, 0.239f, -0.812f, 0.646f, -0.88f, 0.766f)
                reflectiveCurveToRelative(-0.282f, 0.554f, -0.205f, 1.148f)
                curveToRelative(0.065f, 0.509f, 0.36f, 1.238f, 1.394f, 1.824f)
                curveToRelative(1.846f, 1.047f, 3.746f, 1.115f, 6.084f, 1.12f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.006f, 0.001f, 0.01f, 0.0f, 0.016f, 0.0f)
                curveToRelative(0.161f, 0.0f, 0.319f, 0.001f, 0.484f, 0.001f)
                curveToRelative(1.816f, -0.087f, 3.197f, -0.648f, 4.064f, -1.648f)
                curveToRelative(1.024f, -1.182f, 0.972f, -2.542f, 0.936f, -2.912f)
                close()
            }
        }
        .build()
        return _nose!!
    }

private var _nose: ImageVector? = null
