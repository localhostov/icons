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

public val Icons.Outline.Comet: ImageVector
    get() {
        if (_comet != null) {
            return _comet!!
        }
        _comet = Builder(name = "Comet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 24.0f)
                curveToRelative(-2.27f, 0.0f, -4.404f, -0.884f, -6.011f, -2.489f)
                curveTo(-3.854f, 14.954f, 3.139f, 4.91f, 9.141f, 1.4f)
                curveToRelative(0.771f, -0.495f, 1.751f, -0.531f, 2.556f, -0.092f)
                curveToRelative(0.804f, 0.438f, 1.304f, 1.28f, 1.304f, 2.196f)
                verticalLineToRelative(0.729f)
                curveToRelative(0.443f, -0.273f, 0.913f, -0.568f, 1.395f, -0.87f)
                curveToRelative(2.076f, -1.301f, 4.224f, -2.646f, 5.516f, -3.152f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.123f, -0.441f, 2.351f, -0.182f, 3.206f, 0.673f)
                curveToRelative(0.855f, 0.855f, 1.113f, 2.084f, 0.673f, 3.206f)
                curveToRelative(-0.506f, 1.292f, -1.852f, 3.438f, -3.152f, 5.516f)
                curveToRelative(-0.302f, 0.481f, -0.597f, 0.951f, -0.87f, 1.395f)
                horizontalLineToRelative(0.729f)
                curveToRelative(0.916f, 0.0f, 1.758f, 0.5f, 2.196f, 1.304f)
                curveToRelative(0.439f, 0.806f, 0.404f, 1.784f, -0.093f, 2.556f)
                curveToRelative(-2.841f, 4.419f, -8.036f, 9.141f, -14.099f, 9.141f)
                close()
                moveTo(10.492f, 3.0f)
                curveToRelative(-0.081f, 0.0f, -0.174f, 0.021f, -0.27f, 0.082f)
                curveTo(5.174f, 6.134f, -1.308f, 14.396f, 3.903f, 20.097f)
                curveToRelative(5.703f, 5.21f, 13.96f, -1.269f, 17.014f, -6.319f)
                curveToRelative(0.146f, -0.229f, 0.062f, -0.437f, 0.02f, -0.516f)
                reflectiveCurveToRelative(-0.172f, -0.262f, -0.441f, -0.262f)
                horizontalLineToRelative(-2.495f)
                curveToRelative(-0.745f, 0.023f, -1.257f, -0.862f, -0.868f, -1.497f)
                curveToRelative(0.478f, -0.834f, 1.125f, -1.866f, 1.811f, -2.96f)
                curveToRelative(1.193f, -1.905f, 2.547f, -4.064f, 2.984f, -5.183f)
                curveToRelative(0.22f, -0.559f, -0.116f, -0.954f, -0.225f, -1.062f)
                curveToRelative(-0.108f, -0.107f, -0.505f, -0.444f, -1.062f, -0.226f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.118f, 0.438f, -3.277f, 1.792f, -5.183f, 2.985f)
                curveToRelative(-1.094f, 0.686f, -2.126f, 1.333f, -2.96f, 1.811f)
                curveToRelative(-0.311f, 0.176f, -0.69f, 0.175f, -0.999f, -0.003f)
                curveToRelative(-0.309f, -0.179f, -0.498f, -0.509f, -0.498f, -0.865f)
                lineTo(11.001f, 3.505f)
                curveToRelative(0.0f, -0.269f, -0.184f, -0.398f, -0.262f, -0.441f)
                curveToRelative(-0.046f, -0.024f, -0.136f, -0.063f, -0.246f, -0.063f)
                close()
                moveTo(9.0f, 19.0f)
                curveToRelative(-5.275f, -0.138f, -5.274f, -7.863f, 0.0f, -8.0f)
                curveToRelative(5.275f, 0.138f, 5.273f, 7.863f, 0.0f, 8.0f)
                close()
                moveTo(9.0f, 13.0f)
                curveToRelative(-2.628f, 0.047f, -2.628f, 3.953f, 0.0f, 4.0f)
                curveToRelative(2.628f, -0.047f, 2.628f, -3.953f, 0.0f, -4.0f)
                close()
            }
        }
        .build()
        return _comet!!
    }

private var _comet: ImageVector? = null
