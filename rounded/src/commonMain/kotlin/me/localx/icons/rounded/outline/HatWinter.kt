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

public val Icons.Outline.HatWinter: ImageVector
    get() {
        if (_hatWinter != null) {
            return _hatWinter!!
        }
        _hatWinter = Builder(name = "HatWinter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.902f, 17.298f)
                curveToRelative(-0.529f, -5.153f, -3.464f, -11.675f, -8.137f, -13.028f)
                curveToRelative(0.454f, -0.453f, 0.735f, -1.078f, 0.735f, -1.77f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.692f, 0.281f, 1.317f, 0.735f, 1.77f)
                curveToRelative(-4.673f, 1.353f, -7.608f, 7.875f, -8.137f, 13.028f)
                curveToRelative(-1.233f, 0.542f, -2.098f, 1.772f, -2.098f, 3.202f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.43f, -0.865f, -2.66f, -2.098f, -3.202f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(3.856f, 0.0f, 7.163f, 5.605f, 7.864f, 11.0f)
                lineTo(4.136f, 17.0f)
                curveToRelative(0.087f, -0.667f, 0.217f, -1.337f, 0.38f, -2.0f)
                horizontalLineToRelative(11.484f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(5.126f, 13.0f)
                curveToRelative(1.407f, -3.849f, 3.984f, -7.0f, 6.874f, -7.0f)
                close()
                moveTo(20.5f, 22.0f)
                lineTo(3.5f, 22.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _hatWinter!!
    }

private var _hatWinter: ImageVector? = null
