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

public val Icons.Filled.Drum: ImageVector
    get() {
        if (_drum != null) {
            return _drum!!
        }
        _drum = Builder(name = "Drum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 15.309f)
                curveToRelative(1.52f, 0.37f, 3.201f, 0.595f, 5.0f, 0.658f)
                verticalLineToRelative(8.007f)
                curveToRelative(-1.821f, -0.078f, -3.513f, -0.367f, -5.0f, -0.824f)
                verticalLineToRelative(-7.841f)
                close()
                moveTo(0.0f, 17.5f)
                curveToRelative(0.0f, 1.963f, 1.538f, 3.692f, 4.0f, 4.874f)
                verticalLineToRelative(-7.665f)
                curveToRelative(-1.619f, -0.588f, -2.991f, -1.346f, -4.0f, -2.25f)
                verticalLineToRelative(5.041f)
                close()
                moveTo(13.0f, 23.974f)
                curveToRelative(1.821f, -0.078f, 3.513f, -0.367f, 5.0f, -0.824f)
                verticalLineToRelative(-7.841f)
                curveToRelative(-1.52f, 0.37f, -3.201f, 0.595f, -5.0f, 0.658f)
                verticalLineToRelative(8.007f)
                close()
                moveTo(20.0f, 22.374f)
                curveToRelative(2.462f, -1.182f, 4.0f, -2.911f, 4.0f, -4.874f)
                verticalLineToRelative(-5.041f)
                curveToRelative(-1.009f, 0.904f, -2.381f, 1.662f, -4.0f, 2.25f)
                verticalLineToRelative(7.665f)
                close()
                moveTo(24.0f, 8.5f)
                curveToRelative(0.0f, -1.506f, -1.332f, -2.864f, -3.473f, -3.856f)
                lineToRelative(3.153f, -2.905f)
                curveToRelative(0.406f, -0.378f, 0.429f, -1.013f, 0.051f, -1.419f)
                curveToRelative(-0.376f, -0.404f, -1.007f, -0.429f, -1.414f, -0.056f)
                lineToRelative(-10.118f, 9.256f)
                curveToRelative(-0.405f, 0.37f, -1.033f, 0.345f, -1.407f, -0.057f)
                curveToRelative(-0.379f, -0.407f, -0.353f, -1.045f, 0.058f, -1.42f)
                lineToRelative(5.174f, -4.72f)
                curveToRelative(-1.26f, -0.206f, -2.61f, -0.324f, -4.024f, -0.324f)
                curveTo(5.373f, 3.0f, 0.0f, 5.462f, 0.0f, 8.5f)
                reflectiveCurveToRelative(5.373f, 5.5f, 12.0f, 5.5f)
                reflectiveCurveToRelative(12.0f, -2.462f, 12.0f, -5.5f)
                close()
            }
        }
        .build()
        return _drum!!
    }

private var _drum: ImageVector? = null
