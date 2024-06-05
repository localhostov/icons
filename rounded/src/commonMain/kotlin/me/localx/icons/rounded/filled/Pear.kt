package me.localx.icons.rounded.filled

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

public val Icons.Filled.Pear: ImageVector
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
                moveTo(11.462f, 20.115f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(14.462f, 16.115f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _pear!!
    }

private var _pear: ImageVector? = null
