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

public val Icons.Outline.Selection: ImageVector
    get() {
        if (_selection != null) {
            return _selection!!
        }
        _selection = Builder(name = "Selection", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(3.0f, 4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveTo(4.105f, 0.0f, 3.0f, 0.0f)
                reflectiveCurveTo(1.0f, 0.895f, 1.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(23.969f, 7.121f)
                curveToRelative(-0.376f, -1.228f, -1.518f, -2.121f, -2.869f, -2.121f)
                horizontalLineToRelative(-1.169f)
                curveToRelative(0.041f, 0.328f, 0.069f, 0.661f, 0.069f, 1.0f)
                curveToRelative(0.0f, 0.692f, -0.097f, 1.36f, -0.262f, 2.0f)
                horizontalLineToRelative(3.603f)
                curveToRelative(0.454f, 0.0f, 0.76f, -0.444f, 0.628f, -0.879f)
                close()
                moveTo(4.0f, 6.0f)
                curveToRelative(0.0f, -0.339f, 0.028f, -0.672f, 0.069f, -1.0f)
                horizontalLineToRelative(-1.154f)
                curveTo(1.533f, 5.0f, 0.368f, 5.935f, 0.021f, 7.208f)
                curveToRelative(-0.11f, 0.403f, 0.229f, 0.792f, 0.647f, 0.792f)
                horizontalLineToRelative(3.594f)
                curveToRelative(-0.165f, -0.64f, -0.262f, -1.308f, -0.262f, -2.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(21.999f, 22.942f)
                curveToRelative(0.032f, 0.551f, -0.389f, 1.024f, -0.94f, 1.057f)
                curveToRelative(-0.02f, 0.0f, -0.04f, 0.001f, -0.059f, 0.001f)
                curveToRelative(-0.526f, 0.0f, -0.966f, -0.41f, -0.998f, -0.942f)
                curveToRelative(-0.068f, -1.183f, -0.831f, -2.217f, -1.941f, -2.633f)
                lineToRelative(-4.38f, -1.477f)
                curveToRelative(-0.406f, -0.137f, -0.68f, -0.519f, -0.68f, -0.948f)
                verticalLineToRelative(-4.893f)
                curveToRelative(0.0f, -0.537f, -0.362f, -1.017f, -0.825f, -1.093f)
                curveToRelative(-0.304f, -0.049f, -0.595f, 0.03f, -0.823f, 0.224f)
                curveToRelative(-0.224f, 0.19f, -0.353f, 0.468f, -0.353f, 0.762f)
                verticalLineToRelative(7.455f)
                curveToRelative(0.0f, 0.608f, -0.34f, 1.15f, -0.889f, 1.415f)
                reflectiveCurveToRelative(-1.184f, 0.191f, -1.66f, -0.186f)
                curveToRelative(0.0f, 0.0f, -1.761f, -1.405f, -1.771f, -1.415f)
                curveToRelative(-0.402f, -0.373f, -1.034f, -0.354f, -1.41f, 0.048f)
                curveToRelative(-0.377f, 0.403f, -0.356f, 1.038f, 0.046f, 1.416f)
                lineToRelative(0.568f, 0.548f)
                curveToRelative(0.648f, 0.624f, 0.206f, 1.72f, -0.694f, 1.72f)
                curveToRelative(-0.259f, 0.0f, -0.508f, -0.1f, -0.694f, -0.28f)
                lineToRelative(-0.558f, -0.538f)
                curveToRelative(-1.196f, -1.12f, -1.26f, -3.022f, -0.13f, -4.23f)
                curveToRelative(1.103f, -1.181f, 2.94f, -1.26f, 4.151f, -0.208f)
                curveToRelative(0.008f, 0.006f, 1.04f, 0.821f, 1.04f, 0.821f)
                verticalLineToRelative(-6.563f)
                curveToRelative(0.0f, -0.567f, 0.174f, -1.106f, 0.467f, -1.576f)
                curveToRelative(-2.093f, -0.976f, -3.467f, -3.072f, -3.467f, -5.424f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                curveToRelative(0.0f, 2.373f, -1.375f, 4.464f, -3.482f, 5.435f)
                curveToRelative(0.302f, 0.488f, 0.482f, 1.062f, 0.482f, 1.672f)
                verticalLineToRelative(4.175f)
                lineToRelative(3.731f, 1.258f)
                curveToRelative(1.882f, 0.706f, 3.153f, 2.429f, 3.268f, 4.401f)
                close()
                moveTo(8.0f, 6.0f)
                curveToRelative(0.0f, 1.11f, 0.46f, 2.135f, 1.221f, 2.872f)
                curveToRelative(0.444f, -1.097f, 1.515f, -1.872f, 2.771f, -1.872f)
                horizontalLineToRelative(0.016f)
                curveToRelative(1.255f, 0.0f, 2.325f, 0.778f, 2.769f, 1.875f)
                curveToRelative(0.762f, -0.735f, 1.223f, -1.757f, 1.223f, -2.875f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _selection!!
    }

private var _selection: ImageVector? = null
