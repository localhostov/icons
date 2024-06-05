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

public val Icons.Outline.Pear: ImageVector
    get() {
        if (_pear != null) {
            return _pear!!
        }
        _pear = Builder(name = "Pear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.949f, 1.316f)
                curveToRelative(0.175f, -0.524f, -0.108f, -1.09f, -0.632f, -1.265f)
                curveToRelative(-0.525f, -0.176f, -1.091f, 0.109f, -1.265f, 0.632f)
                curveToRelative(-0.229f, 0.689f, -0.954f, 1.464f, -1.536f, 1.996f)
                curveToRelative(-0.905f, -0.77f, -1.995f, -1.327f, -3.203f, -1.553f)
                curveToRelative(-2.652f, -0.494f, -5.309f, 0.512f, -6.933f, 2.628f)
                curveToRelative(-0.668f, 0.869f, -1.529f, 1.416f, -2.425f, 1.538f)
                curveToRelative(-1.91f, 0.261f, -3.673f, 1.083f, -5.1f, 2.376f)
                curveToRelative(-3.402f, 3.085f, -3.675f, 8.459f, -0.62f, 12.232f)
                curveToRelative(1.986f, 2.454f, 4.696f, 3.943f, 7.437f, 4.087f)
                curveToRelative(0.151f, 0.008f, 0.301f, 0.012f, 0.451f, 0.012f)
                curveToRelative(2.208f, 0.0f, 4.234f, -0.863f, 5.884f, -2.513f)
                curveToRelative(1.444f, -1.443f, 2.371f, -3.272f, 2.679f, -5.287f)
                curveToRelative(0.161f, -1.051f, 0.655f, -1.922f, 1.392f, -2.453f)
                curveToRelative(2.238f, -1.614f, 3.31f, -4.319f, 2.797f, -7.06f)
                curveToRelative(-0.171f, -0.913f, -0.538f, -1.756f, -1.033f, -2.509f)
                curveToRelative(0.714f, -0.646f, 1.724f, -1.71f, 2.108f, -2.862f)
                close()
                moveTo(18.907f, 12.125f)
                curveToRelative(-1.175f, 0.847f, -1.956f, 2.186f, -2.198f, 3.772f)
                curveToRelative(-0.244f, 1.591f, -0.976f, 3.035f, -2.117f, 4.176f)
                curveToRelative(-1.35f, 1.349f, -3.015f, 2.011f, -4.816f, 1.918f)
                curveToRelative(-2.174f, -0.114f, -4.356f, -1.334f, -5.986f, -3.348f)
                curveToRelative(-2.388f, -2.95f, -2.208f, -7.12f, 0.409f, -9.493f)
                curveToRelative(1.126f, -1.021f, 2.519f, -1.67f, 4.026f, -1.876f)
                curveToRelative(1.421f, -0.194f, 2.75f, -1.011f, 3.741f, -2.302f)
                curveToRelative(0.967f, -1.26f, 2.447f, -1.97f, 4.014f, -1.97f)
                curveToRelative(0.319f, 0.0f, 0.643f, 0.03f, 0.965f, 0.09f)
                curveToRelative(1.997f, 0.373f, 3.589f, 1.966f, 3.963f, 3.963f)
                curveToRelative(0.369f, 1.971f, -0.398f, 3.914f, -2.001f, 5.07f)
                close()
                moveTo(15.001f, 13.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(12.001f, 17.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _pear!!
    }

private var _pear: ImageVector? = null
