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

public val Icons.Outline.Vest: ImageVector
    get() {
        if (_vest != null) {
            return _vest!!
        }
        _vest = Builder(name = "Vest", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.12f, 10.504f)
                curveToRelative(-0.712f, -1.031f, -1.12f, -1.943f, -1.12f, -2.504f)
                verticalLineToRelative(-2.935f)
                curveToRelative(0.0f, -2.563f, -1.91f, -4.699f, -4.443f, -4.969f)
                curveToRelative(-0.056f, -0.006f, -0.787f, -0.096f, -1.557f, -0.096f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.692f, 0.0f, -1.5f, 0.09f, -1.557f, 0.096f)
                curveTo(4.91f, 0.366f, 3.0f, 2.502f, 3.0f, 5.065f)
                verticalLineToRelative(2.935f)
                curveToRelative(0.0f, 0.561f, -0.408f, 1.473f, -1.12f, 2.504f)
                curveToRelative(-0.576f, 0.833f, -0.88f, 1.811f, -0.88f, 2.83f)
                verticalLineToRelative(5.666f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-5.666f)
                curveToRelative(0.0f, -1.019f, -0.304f, -1.998f, -0.88f, -2.83f)
                close()
                moveTo(12.0f, 9.074f)
                lineToRelative(-2.573f, -7.074f)
                horizontalLineToRelative(5.145f)
                lineToRelative(-2.573f, 7.074f)
                close()
                moveTo(3.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 17.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(-1.666f)
                curveToRelative(0.0f, -0.611f, 0.182f, -1.196f, 0.524f, -1.693f)
                curveToRelative(0.979f, -1.417f, 1.476f, -2.642f, 1.476f, -3.641f)
                verticalLineToRelative(-2.935f)
                curveToRelative(0.0f, -1.432f, 0.99f, -2.641f, 2.349f, -2.931f)
                lineToRelative(3.651f, 10.041f)
                verticalLineToRelative(9.825f)
                lineTo(6.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(18.0f, 22.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(13.0f, 12.175f)
                lineToRelative(3.651f, -10.041f)
                curveToRelative(1.359f, 0.29f, 2.349f, 1.5f, 2.349f, 2.931f)
                verticalLineToRelative(2.935f)
                curveToRelative(0.0f, 0.999f, 0.496f, 2.224f, 1.476f, 3.641f)
                curveToRelative(0.343f, 0.497f, 0.524f, 1.083f, 0.524f, 1.693f)
                verticalLineToRelative(1.666f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _vest!!
    }

private var _vest: ImageVector? = null
