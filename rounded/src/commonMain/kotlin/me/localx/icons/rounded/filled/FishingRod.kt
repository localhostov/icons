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

public val Icons.Filled.FishingRod: ImageVector
    get() {
        if (_fishingRod != null) {
            return _fishingRod!!
        }
        _fishingRod = Builder(name = "FishingRod", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.992f, 22.875f)
                curveToRelative(0.043f, 0.341f, -0.092f, 0.681f, -0.358f, 0.898f)
                curveToRelative(-0.181f, 0.148f, -0.406f, 0.227f, -0.634f, 0.227f)
                curveToRelative(-0.256f, 0.0f, -2.0f, -0.613f, -2.0f, -0.613f)
                lineToRelative(-1.684f, 0.562f)
                curveToRelative(-0.327f, 0.11f, -0.685f, 0.042f, -0.951f, -0.175f)
                curveToRelative(-0.266f, -0.218f, -0.401f, -0.558f, -0.358f, -0.898f)
                lineToRelative(0.095f, -0.753f)
                curveToRelative(0.114f, -0.904f, 0.555f, -1.657f, 0.987f, -2.199f)
                curveToRelative(-0.959f, -1.047f, -2.09f, -2.685f, -2.09f, -4.584f)
                curveToRelative(0.0f, -1.427f, 0.65f, -2.932f, 1.881f, -4.353f)
                curveToRelative(1.067f, -1.232f, 3.17f, -1.231f, 4.237f, 0.0f)
                curveToRelative(1.231f, 1.422f, 1.882f, 2.927f, 1.882f, 4.354f)
                curveToRelative(0.0f, 1.899f, -1.131f, 3.536f, -2.09f, 4.584f)
                curveToRelative(0.433f, 0.542f, 0.874f, 1.295f, 0.987f, 2.199f)
                lineToRelative(0.095f, 0.753f)
                close()
                moveTo(8.0f, 15.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-0.351f, 0.0f, -0.687f, -0.061f, -1.0f, -0.172f)
                verticalLineToRelative(4.172f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.777f, 0.446f, -1.452f, 1.096f, -1.783f)
                curveTo(1.592f, 9.479f, 4.449f, 0.411f, 18.949f, -0.004f)
                curveToRelative(0.542f, -0.003f, 1.052f, 0.186f, 1.442f, 0.564f)
                curveToRelative(0.387f, 0.377f, 0.609f, 0.901f, 0.609f, 1.439f)
                lineTo(21.0f, 7.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(19.0f, 2.0f)
                curveTo(7.909f, 2.314f, 4.417f, 8.002f, 3.393f, 12.469f)
                curveToRelative(0.465f, -0.296f, 1.016f, -0.469f, 1.607f, -0.469f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(6.0f, 15.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.449f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _fishingRod!!
    }

private var _fishingRod: ImageVector? = null
