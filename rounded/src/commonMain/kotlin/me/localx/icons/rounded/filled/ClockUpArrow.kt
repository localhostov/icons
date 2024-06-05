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

public val Icons.Filled.ClockUpArrow: ImageVector
    get() {
        if (_clockUpArrow != null) {
            return _clockUpArrow!!
        }
        _clockUpArrow = Builder(name = "ClockUpArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 15.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.604f)
                lineToRelative(-4.346f, 4.345f)
                curveToRelative(-0.949f, 0.951f, -2.608f, 0.952f, -3.56f, 0.0f)
                lineToRelative(-1.104f, -1.104f)
                curveToRelative(-0.195f, -0.195f, -0.536f, -0.194f, -0.729f, 0.0f)
                lineToRelative(-4.052f, 4.07f)
                curveToRelative(-0.195f, 0.195f, -0.452f, 0.294f, -0.709f, 0.294f)
                curveToRelative(-0.255f, 0.0f, -0.511f, -0.097f, -0.706f, -0.291f)
                curveToRelative(-0.391f, -0.39f, -0.393f, -1.023f, -0.003f, -1.415f)
                lineToRelative(4.053f, -4.07f)
                curveToRelative(0.953f, -0.953f, 2.61f, -0.953f, 3.562f, 0.0f)
                lineToRelative(1.104f, 1.104f)
                curveToRelative(0.195f, 0.195f, 0.536f, 0.194f, 0.729f, 0.0f)
                lineToRelative(4.329f, -4.328f)
                horizontalLineToRelative(-2.568f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(9.427f, 16.812f)
                lineToRelative(-4.697f, 4.708f)
                curveTo(1.863f, 19.328f, 0.0f, 15.888f, 0.0f, 12.0f)
                curveTo(0.0f, 5.373f, 5.373f, 0.0f, 12.0f, 0.0f)
                curveToRelative(6.473f, 0.0f, 11.735f, 5.129f, 11.977f, 11.544f)
                curveToRelative(-0.586f, -0.336f, -1.255f, -0.544f, -1.977f, -0.544f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.016f, 0.51f, 1.912f, 1.285f, 2.455f)
                lineToRelative(-0.41f, 0.41f)
                lineToRelative(-0.054f, -0.054f)
                curveToRelative(-0.825f, -0.826f, -1.989f, -1.301f, -3.193f, -1.302f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-1.204f, 0.0f, -2.369f, 0.474f, -3.198f, 1.304f)
                close()
                moveTo(8.114f, 15.425f)
                lineToRelative(4.408f, -2.696f)
                curveToRelative(0.298f, -0.183f, 0.479f, -0.505f, 0.479f, -0.854f)
                verticalLineToRelative(-5.876f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(5.315f)
                lineToRelative(-3.93f, 2.403f)
                curveToRelative(-0.472f, 0.289f, -0.62f, 0.904f, -0.332f, 1.375f)
                curveToRelative(0.189f, 0.309f, 0.518f, 0.479f, 0.854f, 0.479f)
                curveToRelative(0.178f, 0.0f, 0.358f, -0.047f, 0.521f, -0.146f)
                close()
            }
        }
        .build()
        return _clockUpArrow!!
    }

private var _clockUpArrow: ImageVector? = null
