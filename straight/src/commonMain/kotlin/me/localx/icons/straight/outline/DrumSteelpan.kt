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

public val Icons.Outline.DrumSteelpan: ImageVector
    get() {
        if (_drumSteelpan != null) {
            return _drumSteelpan!!
        }
        _drumSteelpan = Builder(name = "DrumSteelpan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.994f, 8.0f)
                curveToRelative(-0.193f, -4.434f, -5.499f, -8.0f, -11.994f, -8.0f)
                reflectiveCurveTo(0.199f, 3.566f, 0.006f, 8.0f)
                horizontalLineToRelative(-0.006f)
                verticalLineToRelative(7.667f)
                curveToRelative(0.0f, 4.595f, 5.383f, 8.333f, 12.0f, 8.333f)
                reflectiveCurveToRelative(12.0f, -3.738f, 12.0f, -8.333f)
                verticalLineToRelative(-7.667f)
                horizontalLineToRelative(-0.006f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(1.368f, 0.0f, 2.683f, 0.183f, 3.883f, 0.51f)
                curveToRelative(-0.09f, 0.182f, -0.177f, 0.359f, -0.261f, 0.53f)
                curveToRelative(-1.58f, 3.204f, -2.014f, 3.96f, -3.622f, 3.96f)
                reflectiveCurveToRelative(-2.042f, -0.756f, -3.622f, -3.96f)
                curveToRelative(-0.084f, -0.172f, -0.171f, -0.348f, -0.261f, -0.53f)
                curveToRelative(1.201f, -0.327f, 2.515f, -0.51f, 3.883f, -0.51f)
                close()
                moveTo(18.674f, 12.859f)
                curveToRelative(-1.785f, 1.014f, -4.137f, 1.641f, -6.674f, 1.641f)
                reflectiveCurveToRelative(-4.889f, -0.627f, -6.674f, -1.641f)
                curveToRelative(1.464f, -0.249f, 3.136f, -0.896f, 4.126f, -2.469f)
                curveToRelative(0.285f, -0.592f, 0.492f, -1.25f, 0.534f, -1.813f)
                curveToRelative(0.558f, 0.277f, 1.211f, 0.422f, 2.014f, 0.422f)
                reflectiveCurveToRelative(1.456f, -0.145f, 2.014f, -0.422f)
                curveToRelative(0.042f, 0.563f, 0.248f, 1.221f, 0.534f, 1.813f)
                curveToRelative(0.99f, 1.573f, 2.662f, 2.22f, 4.126f, 2.469f)
                close()
                moveTo(6.074f, 3.254f)
                lineToRelative(0.226f, 0.466f)
                curveToRelative(1.604f, 3.278f, 2.052f, 4.312f, 1.429f, 5.652f)
                curveToRelative(-1.1f, 1.671f, -3.742f, 1.67f, -4.685f, 1.611f)
                curveToRelative(-0.667f, -0.831f, -1.045f, -1.76f, -1.045f, -2.733f)
                curveToRelative(0.0f, -2.015f, 1.62f, -3.844f, 4.074f, -4.996f)
                close()
                moveTo(22.0f, 15.667f)
                curveToRelative(0.0f, 3.492f, -4.486f, 6.333f, -10.0f, 6.333f)
                reflectiveCurveToRelative(-10.0f, -2.841f, -10.0f, -6.333f)
                verticalLineToRelative(-2.862f)
                curveToRelative(2.151f, 2.225f, 5.83f, 3.695f, 10.0f, 3.695f)
                reflectiveCurveToRelative(7.849f, -1.47f, 10.0f, -3.695f)
                verticalLineToRelative(2.862f)
                close()
                moveTo(20.956f, 10.982f)
                curveToRelative(-0.941f, 0.055f, -3.594f, 0.048f, -4.686f, -1.609f)
                curveToRelative(-0.623f, -1.341f, -0.175f, -2.374f, 1.429f, -5.652f)
                lineToRelative(0.226f, -0.466f)
                curveToRelative(2.454f, 1.151f, 4.074f, 2.981f, 4.074f, 4.996f)
                curveToRelative(0.0f, 0.972f, -0.378f, 1.901f, -1.044f, 2.732f)
                close()
            }
        }
        .build()
        return _drumSteelpan!!
    }

private var _drumSteelpan: ImageVector? = null
