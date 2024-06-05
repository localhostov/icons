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

public val Icons.Outline.Hryvnia: ImageVector
    get() {
        if (_hryvnia != null) {
            return _hryvnia!!
        }
        _hryvnia = Builder(name = "Hryvnia", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.885f, 15.0f)
                horizontalLineToRelative(14.115f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(12.181f)
                lineToRelative(5.333f, -2.0f)
                horizontalLineToRelative(3.486f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.885f)
                curveToRelative(0.563f, -0.834f, 0.885f, -1.832f, 0.885f, -2.877f)
                curveToRelative(0.0f, -1.878f, -0.998f, -3.594f, -2.605f, -4.479f)
                curveToRelative(-1.364f, -0.75f, -3.581f, -1.645f, -6.395f, -1.645f)
                curveTo(6.647f, 0.0f, 3.428f, 3.158f, 3.293f, 3.293f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.387f, 0.391f, 1.021f, 0.395f, 1.413f, 0.007f)
                curveToRelative(0.027f, -0.027f, 2.8f, -2.71f, 7.295f, -2.71f)
                curveToRelative(2.389f, 0.0f, 4.272f, 0.76f, 5.431f, 1.396f)
                curveToRelative(0.968f, 0.533f, 1.569f, 1.578f, 1.569f, 2.727f)
                curveToRelative(0.0f, 1.242f, -0.743f, 2.375f, -1.868f, 2.877f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineTo(11.817f)
                lineToRelative(-5.333f, 2.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.927f)
                curveToRelative(-0.589f, 0.864f, -0.927f, 1.901f, -0.927f, 2.986f)
                curveToRelative(0.0f, 2.012f, 1.159f, 3.88f, 2.952f, 4.76f)
                curveToRelative(1.695f, 0.832f, 3.73f, 1.254f, 6.048f, 1.254f)
                curveToRelative(5.272f, 0.0f, 9.426f, -3.069f, 9.6f, -3.2f)
                curveToRelative(0.441f, -0.331f, 0.531f, -0.956f, 0.201f, -1.398f)
                reflectiveCurveToRelative(-0.957f, -0.532f, -1.399f, -0.202f)
                curveToRelative(-0.038f, 0.028f, -3.812f, 2.801f, -8.401f, 2.801f)
                curveToRelative(-2.01f, 0.0f, -3.748f, -0.353f, -5.167f, -1.049f)
                curveToRelative(-1.113f, -0.547f, -1.833f, -1.71f, -1.833f, -2.965f)
                curveToRelative(0.0f, -1.276f, 0.747f, -2.442f, 1.885f, -2.986f)
                close()
            }
        }
        .build()
        return _hryvnia!!
    }

private var _hryvnia: ImageVector? = null
