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

public val Icons.Bold.SpaceStationMoon: ImageVector
    get() {
        if (_spaceStationMoon != null) {
            return _spaceStationMoon!!
        }
        _spaceStationMoon = Builder(name = "SpaceStationMoon", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.224f, 2.002f)
                curveToRelative(-3.232f, -0.042f, -6.314f, 1.161f, -8.631f, 3.436f)
                curveTo(1.276f, 7.713f, 0.0f, 10.753f, 0.0f, 14.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-3.151f)
                curveToRelative(0.0f, -6.689f, -5.283f, -12.228f, -11.776f, -12.347f)
                close()
                moveTo(16.0f, 15.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.978f, 0.323f, -3.776f, 0.882f, -5.0f)
                horizontalLineToRelative(6.236f)
                curveToRelative(0.559f, 1.224f, 0.882f, 3.022f, 0.882f, 5.0f)
                close()
                moveTo(11.999f, 5.0f)
                curveToRelative(0.057f, 0.0f, 0.113f, 0.0f, 0.17f, 0.002f)
                curveToRelative(2.019f, 0.037f, 3.882f, 0.78f, 5.372f, 1.998f)
                horizontalLineToRelative(-1.522f)
                curveToRelative(-0.011f, 0.0f, -0.021f, 0.0f, -0.032f, 0.0f)
                horizontalLineToRelative(-7.975f)
                curveToRelative(-0.011f, 0.0f, -0.021f, 0.0f, -0.032f, 0.0f)
                horizontalLineToRelative(-1.639f)
                curveToRelative(1.599f, -1.298f, 3.574f, -2.0f, 5.657f, -2.0f)
                close()
                moveTo(3.0f, 17.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.412f, 0.323f, -2.773f, 0.933f, -4.0f)
                horizontalLineToRelative(1.748f)
                curveToRelative(-0.445f, 1.43f, -0.68f, 3.133f, -0.68f, 5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(21.0f, 17.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.867f, -0.236f, -3.57f, -0.68f, -5.0f)
                horizontalLineToRelative(1.636f)
                curveToRelative(0.666f, 1.303f, 1.044f, 2.784f, 1.044f, 4.349f)
                verticalLineToRelative(3.151f)
                close()
            }
        }
        .build()
        return _spaceStationMoon!!
    }

private var _spaceStationMoon: ImageVector? = null
