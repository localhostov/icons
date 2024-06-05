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

public val Icons.Outline.CircleExclamationCheck: ImageVector
    get() {
        if (_circleExclamationCheck != null) {
            return _circleExclamationCheck!!
        }
        _circleExclamationCheck = Builder(name = "CircleExclamationCheck", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 13.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(8.5f, 15.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(17.375f, 17.255f)
                curveToRelative(-0.413f, -0.369f, -1.044f, -0.333f, -1.412f, 0.078f)
                curveToRelative(-1.515f, 1.692f, -3.684f, 2.664f, -5.952f, 2.667f)
                curveToRelative(-4.405f, -0.006f, -7.988f, -3.593f, -7.988f, -8.0f)
                reflectiveCurveToRelative(3.583f, -7.994f, 7.989f, -8.0f)
                curveToRelative(3.38f, 0.005f, 6.407f, 2.146f, 7.534f, 5.333f)
                curveToRelative(0.183f, 0.521f, 0.757f, 0.796f, 1.275f, 0.609f)
                curveToRelative(0.521f, -0.184f, 0.794f, -0.755f, 0.609f, -1.275f)
                curveToRelative(-1.406f, -3.978f, -5.18f, -6.653f, -9.397f, -6.667f)
                horizontalLineToRelative(-0.044f)
                curveTo(4.491f, 2.019f, 0.022f, 6.497f, 0.022f, 12.0f)
                reflectiveCurveToRelative(4.469f, 9.981f, 9.967f, 10.0f)
                horizontalLineToRelative(0.011f)
                curveToRelative(0.01f, 0.0f, 0.016f, 0.0f, 0.022f, 0.0f)
                horizontalLineToRelative(0.011f)
                curveToRelative(2.829f, -0.01f, 5.531f, -1.223f, 7.42f, -3.333f)
                curveToRelative(0.368f, -0.411f, 0.333f, -1.044f, -0.078f, -1.412f)
                close()
                moveTo(23.719f, 9.305f)
                curveToRelative(-0.384f, -0.396f, -1.016f, -0.406f, -1.414f, -0.023f)
                lineToRelative(-3.504f, 3.387f)
                curveToRelative(-0.441f, 0.44f, -1.159f, 0.441f, -1.631f, -0.028f)
                lineToRelative(-1.492f, -1.375f)
                curveToRelative(-0.406f, -0.372f, -1.038f, -0.348f, -1.413f, 0.058f)
                curveToRelative(-0.374f, 0.406f, -0.349f, 1.039f, 0.058f, 1.413f)
                lineToRelative(1.463f, 1.347f)
                curveToRelative(0.612f, 0.612f, 1.417f, 0.918f, 2.219f, 0.918f)
                reflectiveCurveToRelative(1.596f, -0.303f, 2.199f, -0.906f)
                lineToRelative(3.492f, -3.375f)
                curveToRelative(0.396f, -0.384f, 0.407f, -1.017f, 0.023f, -1.414f)
                close()
            }
        }
        .build()
        return _circleExclamationCheck!!
    }

private var _circleExclamationCheck: ImageVector? = null
