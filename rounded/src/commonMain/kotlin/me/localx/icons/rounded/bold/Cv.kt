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

public val Icons.Bold.Cv: ImageVector
    get() {
        if (_cv != null) {
            return _cv!!
        }
        _cv = Builder(name = "Cv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.76f, 10.469f)
                lineToRelative(-1.072f, -5.253f)
                curveToRelative(-0.101f, -0.496f, 0.278f, -0.96f, 0.784f, -0.96f)
                curveToRelative(0.38f, 0.0f, 0.708f, 0.268f, 0.784f, 0.64f)
                lineToRelative(1.072f, 5.253f)
                curveToRelative(0.013f, 0.065f, 0.031f, 0.117f, 0.05f, 0.159f)
                curveToRelative(0.02f, -0.047f, 0.042f, -0.109f, 0.057f, -0.188f)
                lineToRelative(1.053f, -5.222f)
                curveToRelative(0.075f, -0.373f, 0.403f, -0.642f, 0.784f, -0.642f)
                curveToRelative(0.505f, 0.0f, 0.884f, 0.463f, 0.784f, 0.958f)
                lineToRelative(-1.051f, 5.211f)
                curveToRelative(-0.126f, 0.647f, -0.506f, 1.575f, -1.628f, 1.575f)
                reflectiveCurveToRelative(-1.51f, -0.97f, -1.618f, -1.531f)
                close()
                moveTo(8.5f, 5.6f)
                curveToRelative(0.408f, 0.0f, 0.753f, 0.272f, 0.863f, 0.645f)
                curveToRelative(0.024f, 0.081f, 0.027f, 0.755f, 0.833f, 0.755f)
                reflectiveCurveToRelative(0.815f, -0.699f, 0.804f, -0.796f)
                curveToRelative(-0.146f, -1.241f, -1.219f, -2.204f, -2.5f, -2.204f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                curveToRelative(1.278f, 0.0f, 2.35f, -0.958f, 2.5f, -2.196f)
                curveToRelative(0.012f, -0.1f, -0.032f, -0.804f, -0.799f, -0.804f)
                reflectiveCurveToRelative(-0.813f, 0.669f, -0.835f, 0.747f)
                curveToRelative(-0.108f, 0.376f, -0.455f, 0.653f, -0.866f, 0.653f)
                curveToRelative(-0.496f, 0.0f, -0.9f, -0.404f, -0.9f, -0.9f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.496f, 0.404f, -0.9f, 0.9f, -0.9f)
                close()
                moveTo(22.0f, 5.5f)
                verticalLineToRelative(10.343f)
                curveToRelative(0.0f, 1.47f, -0.572f, 2.851f, -1.611f, 3.89f)
                lineToRelative(-2.657f, 2.656f)
                curveToRelative(-1.039f, 1.039f, -2.42f, 1.611f, -3.889f, 1.611f)
                horizontalLineToRelative(-6.343f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                lineTo(2.0f, 5.5f)
                curveTo(2.0f, 2.468f, 4.467f, 0.0f, 7.5f, 0.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                close()
                moveTo(7.5f, 21.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(19.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(7.5f, 3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _cv!!
    }

private var _cv: ImageVector? = null
