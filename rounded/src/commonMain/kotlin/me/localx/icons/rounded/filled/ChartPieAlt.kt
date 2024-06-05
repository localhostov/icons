package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.ChartPieAlt: ImageVector
    get() {
        if (_chartPieAlt != null) {
            return _chartPieAlt!!
        }
        _chartPieAlt = Builder(name = "ChartPieAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(399.211f, 256.0f)
                horizontalLineTo(298.667f)
                curveTo(275.103f, 256.0f, 256.0f, 236.897f, 256.0f, 213.333f)
                verticalLineTo(112.512f)
                curveToRelative(0.059f, -19.89f, -9.134f, -38.678f, -24.875f, -50.837f)
                curveToRelative(-14.916f, -11.812f, -34.474f, -16.022f, -52.928f, -11.392f)
                curveTo(52.767f, 81.419f, -23.674f, 208.342f, 7.463f, 333.773f)
                curveToRelative(21.937f, 88.372f, 93.145f, 155.995f, 182.532f, 173.342f)
                curveToRelative(122.11f, 23.373f, 241.257f, -52.547f, 271.659f, -173.099f)
                curveToRelative(4.647f, -18.478f, 0.445f, -38.066f, -11.371f, -53.013f)
                curveTo(437.984f, 265.29f, 419.165f, 256.076f, 399.211f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.555f, 158.848f)
                curveToRelative(-4.87f, -18.102f, -12.123f, -35.477f, -21.568f, -51.669f)
                curveToRelative(-28.41f, -48.738f, -74.818f, -84.375f, -129.237f, -99.243f)
                curveTo(350.165f, 6.969f, 342.144f, 6.4f, 342.144f, 6.4f)
                curveToRelative(-2.866f, 0.001f, -15.21f, 0.0f, -24.981f, 7.915f)
                curveToRelative(-14.361f, 11.301f, -16.619f, 24.149f, -16.832f, 25.152f)
                curveToRelative(-0.745f, 3.146f, -1.132f, 6.367f, -1.152f, 9.6f)
                verticalLineToRelative(100.267f)
                curveToRelative(0.0f, 35.346f, 28.654f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(100.672f)
                curveToRelative(13.356f, 0.038f, 25.927f, -6.303f, 33.835f, -17.067f)
                curveToRelative(5.848f, -7.885f, 8.856f, -17.517f, 8.533f, -27.328f)
                curveTo(506.049f, 165.523f, 505.491f, 162.137f, 504.555f, 158.848f)
                close()
            }
        }
        .build()
        return _chartPieAlt!!
    }

private var _chartPieAlt: ImageVector? = null
