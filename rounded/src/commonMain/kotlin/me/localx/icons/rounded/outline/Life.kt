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

public val Icons.Outline.Life: ImageVector
    get() {
        if (_life != null) {
            return _life!!
        }
        _life = Builder(name = "Life", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.5f, 13.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(22.234f, 11.322f)
                curveToRelative(-0.373f, -0.405f, -1.007f, -0.431f, -1.413f, -0.057f)
                lineToRelative(-5.637f, 5.204f)
                curveToRelative(-0.371f, 0.342f, -0.854f, 0.531f, -1.357f, 0.531f)
                horizontalLineToRelative(-3.654f)
                curveToRelative(-0.504f, 0.0f, -0.986f, -0.188f, -1.356f, -0.53f)
                lineToRelative(-5.638f, -5.205f)
                curveToRelative(-0.405f, -0.374f, -1.039f, -0.349f, -1.413f, 0.057f)
                curveToRelative(-0.375f, 0.406f, -0.35f, 1.039f, 0.056f, 1.413f)
                lineToRelative(5.639f, 5.205f)
                curveToRelative(0.168f, 0.155f, 0.351f, 0.289f, 0.54f, 0.412f)
                verticalLineToRelative(4.648f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-4.016f)
                curveToRelative(0.058f, 0.003f, 0.114f, 0.016f, 0.173f, 0.016f)
                horizontalLineToRelative(3.654f)
                curveToRelative(0.058f, 0.0f, 0.115f, -0.014f, 0.173f, -0.016f)
                verticalLineToRelative(4.016f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-4.648f)
                curveToRelative(0.189f, -0.123f, 0.372f, -0.257f, 0.541f, -0.412f)
                lineToRelative(5.638f, -5.205f)
                curveToRelative(0.405f, -0.375f, 0.431f, -1.007f, 0.056f, -1.413f)
                close()
                moveTo(7.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                curveToRelative(0.768f, 0.0f, 1.469f, 0.29f, 2.0f, 0.766f)
                curveToRelative(0.531f, -0.476f, 1.232f, -0.766f, 2.0f, -0.766f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                curveToRelative(0.0f, 2.674f, -3.622f, 5.469f, -3.776f, 5.587f)
                curveToRelative(-0.36f, 0.274f, -0.792f, 0.412f, -1.224f, 0.412f)
                reflectiveCurveToRelative(-0.863f, -0.137f, -1.223f, -0.411f)
                curveToRelative(-0.155f, -0.118f, -3.777f, -2.914f, -3.777f, -5.587f)
                close()
                moveTo(9.0f, 3.0f)
                curveToRelative(0.0f, 1.06f, 1.552f, 2.9f, 2.989f, 3.997f)
                curveToRelative(1.459f, -1.097f, 3.011f, -2.938f, 3.011f, -3.997f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.449f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.449f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _life!!
    }

private var _life: ImageVector? = null
