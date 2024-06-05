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

public val Icons.Outline.PlaneTail: ImageVector
    get() {
        if (_planeTail != null) {
            return _planeTail!!
        }
        _planeTail = Builder(name = "PlaneTail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.61f, 16.085f)
                curveToRelative(-1.15f, -0.415f, -2.591f, -0.906f, -4.225f, -1.401f)
                lineToRelative(3.077f, -11.539f)
                curveToRelative(0.202f, -0.757f, 0.044f, -1.547f, -0.433f, -2.168f)
                curveToRelative(-0.478f, -0.62f, -1.199f, -0.977f, -1.982f, -0.977f)
                horizontalLineToRelative(-0.298f)
                curveToRelative(-1.409f, 0.0f, -2.755f, 0.673f, -3.6f, 1.801f)
                lineToRelative(-5.851f, 7.8f)
                curveToRelative(-1.174f, 1.565f, -2.956f, 2.399f, -3.792f, 2.399f)
                lineTo(1.0f, 12.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                lineTo(3.008f, 14.0f)
                curveToRelative(6.901f, 0.0f, 14.818f, 2.484f, 18.924f, 3.966f)
                curveToRelative(0.029f, 0.011f, 0.069f, 0.025f, 0.068f, 0.096f)
                curveToRelative(0.0f, 0.071f, -0.04f, 0.085f, -0.069f, 0.095f)
                curveToRelative(-4.104f, 1.436f, -12.021f, 3.844f, -18.923f, 3.844f)
                lineTo(1.0f, 22.001f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                lineTo(3.008f, 24.001f)
                curveToRelative(7.196f, 0.0f, 15.358f, -2.479f, 19.583f, -3.956f)
                curveToRelative(0.853f, -0.298f, 1.405f, -1.072f, 1.409f, -1.973f)
                reflectiveCurveToRelative(-0.541f, -1.681f, -1.39f, -1.986f)
                close()
                moveTo(10.899f, 10.8f)
                lineToRelative(5.851f, -7.8f)
                curveToRelative(0.47f, -0.626f, 1.218f, -1.0f, 2.0f, -1.0f)
                horizontalLineToRelative(0.298f)
                curveToRelative(0.214f, 0.0f, 0.34f, 0.122f, 0.396f, 0.195f)
                curveToRelative(0.056f, 0.073f, 0.142f, 0.227f, 0.087f, 0.434f)
                lineToRelative(-3.066f, 11.498f)
                curveToRelative(-2.246f, -0.622f, -4.745f, -1.206f, -7.292f, -1.604f)
                curveToRelative(0.623f, -0.469f, 1.219f, -1.044f, 1.727f, -1.722f)
                close()
                moveTo(8.0f, 19.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _planeTail!!
    }

private var _planeTail: ImageVector? = null
