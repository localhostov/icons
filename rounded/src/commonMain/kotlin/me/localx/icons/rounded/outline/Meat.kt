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

public val Icons.Outline.Meat: ImageVector
    get() {
        if (_meat != null) {
            return _meat!!
        }
        _meat = Builder(name = "Meat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.03f, 2.98f)
                curveTo(17.831f, -0.219f, 13.556f, -0.959f, 11.3f, 1.298f)
                curveToRelative(-3.098f, 3.098f, -4.876f, 7.202f, -5.286f, 12.198f)
                curveToRelative(-0.073f, 0.884f, 0.135f, 1.753f, 0.581f, 2.494f)
                lineToRelative(-3.783f, 3.784f)
                curveToRelative(-0.256f, -0.461f, -0.748f, -0.773f, -1.312f, -0.773f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.231f, 0.0f, 0.45f, -0.052f, 0.646f, -0.146f)
                curveToRelative(-0.093f, 0.196f, -0.146f, 0.415f, -0.146f, 0.646f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.565f, -0.312f, -1.057f, -0.774f, -1.312f)
                lineToRelative(3.783f, -3.784f)
                curveToRelative(0.644f, 0.388f, 1.386f, 0.596f, 2.149f, 0.596f)
                curveToRelative(0.115f, 0.0f, 0.23f, -0.005f, 0.345f, -0.014f)
                curveToRelative(5.011f, -0.411f, 9.119f, -2.187f, 12.208f, -5.276f)
                curveToRelative(2.256f, -2.256f, 1.518f, -6.53f, -1.682f, -9.73f)
                close()
                moveTo(19.616f, 4.394f)
                curveToRelative(2.326f, 2.327f, 3.097f, 5.487f, 1.682f, 6.902f)
                curveToRelative(-1.414f, 1.415f, -4.575f, 0.644f, -6.902f, -1.683f)
                curveToRelative(-1.198f, -1.198f, -2.011f, -2.618f, -2.29f, -3.998f)
                curveToRelative(-0.25f, -1.231f, -0.033f, -2.263f, 0.608f, -2.904f)
                curveToRelative(0.481f, -0.481f, 1.165f, -0.709f, 1.949f, -0.709f)
                curveToRelative(1.52f, 0.0f, 3.418f, 0.858f, 4.953f, 2.392f)
                close()
                moveTo(10.341f, 15.992f)
                curveToRelative(-0.64f, 0.061f, -1.262f, -0.175f, -1.71f, -0.623f)
                curveToRelative(-0.448f, -0.448f, -0.675f, -1.071f, -0.623f, -1.709f)
                curveToRelative(0.234f, -2.854f, 0.954f, -5.375f, 2.148f, -7.541f)
                curveToRelative(0.36f, 1.659f, 1.321f, 3.403f, 2.826f, 4.908f)
                reflectiveCurveToRelative(3.245f, 2.464f, 4.903f, 2.825f)
                curveToRelative(-2.163f, 1.188f, -4.686f, 1.905f, -7.544f, 2.139f)
                close()
                moveTo(16.28f, 7.73f)
                curveToRelative(-0.725f, -0.725f, -0.988f, -1.637f, -0.587f, -2.038f)
                reflectiveCurveToRelative(1.313f, -0.138f, 2.038f, 0.587f)
                curveToRelative(0.725f, 0.725f, 0.988f, 1.637f, 0.587f, 2.038f)
                reflectiveCurveToRelative(-1.313f, 0.138f, -2.038f, -0.587f)
                close()
            }
        }
        .build()
        return _meat!!
    }

private var _meat: ImageVector? = null
