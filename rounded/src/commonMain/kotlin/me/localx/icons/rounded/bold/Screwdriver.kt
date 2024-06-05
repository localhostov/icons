package me.localx.icons.rounded.bold

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

public val Icons.Bold.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) {
            return _screwdriver!!
        }
        _screwdriver = Builder(name = "Screwdriver", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.537f, 1.635f)
                lineToRelative(-1.172f, -1.172f)
                curveToRelative(-0.505f, -0.505f, -1.286f, -0.608f, -1.905f, -0.251f)
                lineToRelative(-3.407f, 1.965f)
                curveToRelative(-0.652f, 0.376f, -1.053f, 1.071f, -1.053f, 1.823f)
                verticalLineToRelative(1.879f)
                lineToRelative(-5.455f, 5.455f)
                curveToRelative(-1.454f, -0.581f, -3.233f, -0.303f, -4.373f, 0.838f)
                lineToRelative(-4.898f, 4.898f)
                curveToRelative(-1.493f, 1.492f, -1.658f, 3.889f, -0.375f, 5.455f)
                curveToRelative(0.718f, 0.878f, 2.102f, 1.475f, 3.101f, 1.475f)
                curveToRelative(1.058f, 0.0f, 2.08f, -0.421f, 2.83f, -1.172f)
                lineToRelative(5.0f, -5.0f)
                curveToRelative(1.184f, -1.184f, 1.464f, -2.93f, 0.85f, -4.385f)
                lineToRelative(5.443f, -5.443f)
                horizontalLineToRelative(1.879f)
                curveToRelative(0.752f, 0.0f, 1.448f, -0.402f, 1.823f, -1.054f)
                lineToRelative(1.964f, -3.407f)
                curveToRelative(0.357f, -0.619f, 0.254f, -1.4f, -0.251f, -1.905f)
                close()
                moveTo(9.707f, 15.707f)
                lineToRelative(-5.0f, 5.0f)
                curveToRelative(-0.202f, 0.203f, -0.465f, 0.31f, -0.757f, 0.292f)
                curveToRelative(-0.166f, -0.009f, -0.48f, -0.067f, -0.73f, -0.373f)
                curveToRelative(-0.313f, -0.382f, -0.235f, -1.025f, 0.174f, -1.434f)
                lineToRelative(4.899f, -4.899f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.188f, -0.189f, 0.439f, -0.293f, 0.707f, -0.293f)
                reflectiveCurveToRelative(0.518f, 0.104f, 0.707f, 0.293f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
