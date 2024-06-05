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

public val Icons.Outline.HouseChimneyHeart: ImageVector
    get() {
        if (_houseChimneyHeart != null) {
            return _houseChimneyHeart!!
        }
        _houseChimneyHeart = Builder(name = "HouseChimneyHeart", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.813f, 7.635f)
                lineToRelative(-0.813f, -0.637f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.431f)
                lineTo(13.907f, 0.658f)
                curveToRelative(-1.123f, -0.881f, -2.692f, -0.879f, -3.815f, 0.0f)
                lineTo(1.188f, 7.635f)
                curveToRelative(-0.755f, 0.591f, -1.188f, 1.479f, -1.188f, 2.439f)
                verticalLineToRelative(13.926f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.926f)
                curveToRelative(0.0f, -0.959f, -0.433f, -1.848f, -1.187f, -2.439f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-11.926f)
                curveToRelative(0.0f, -0.341f, 0.153f, -0.655f, 0.421f, -0.865f)
                lineTo(11.326f, 2.232f)
                curveToRelative(0.396f, -0.311f, 0.952f, -0.311f, 1.349f, 0.0f)
                lineToRelative(8.905f, 6.977f)
                curveToRelative(0.268f, 0.21f, 0.421f, 0.525f, 0.421f, 0.865f)
                verticalLineToRelative(11.926f)
                close()
                moveTo(14.23f, 9.0f)
                curveToRelative(-0.89f, 0.0f, -1.674f, 0.318f, -2.25f, 0.852f)
                curveToRelative(-0.575f, -0.533f, -1.36f, -0.852f, -2.25f, -0.852f)
                curveToRelative(-1.792f, 0.0f, -3.25f, 1.538f, -3.25f, 3.43f)
                curveToRelative(0.0f, 2.981f, 4.425f, 6.141f, 4.93f, 6.491f)
                lineToRelative(0.57f, 0.396f)
                lineToRelative(0.57f, -0.396f)
                curveToRelative(0.504f, -0.351f, 4.929f, -3.51f, 4.929f, -6.491f)
                curveToRelative(0.0f, -1.892f, -1.458f, -3.43f, -3.25f, -3.43f)
                close()
                moveTo(11.982f, 16.857f)
                curveToRelative(-1.415f, -1.1f, -3.501f, -3.095f, -3.501f, -4.428f)
                curveToRelative(0.0f, -0.788f, 0.561f, -1.43f, 1.25f, -1.43f)
                curveToRelative(0.622f, 0.0f, 1.25f, 0.374f, 1.25f, 1.209f)
                horizontalLineToRelative(0.019f)
                verticalLineToRelative(0.791f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(0.096f, -0.689f, 0.668f, -1.0f, 1.235f, -1.0f)
                curveToRelative(0.689f, 0.0f, 1.25f, 0.642f, 1.25f, 1.43f)
                curveToRelative(0.0f, 1.238f, -1.891f, 3.187f, -3.498f, 4.428f)
                close()
            }
        }
        .build()
        return _houseChimneyHeart!!
    }

private var _houseChimneyHeart: ImageVector? = null
