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

public val Icons.Outline.Meditation: ImageVector
    get() {
        if (_meditation != null) {
            return _meditation!!
        }
        _meditation = Builder(name = "Meditation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.947f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.367f, -3.0f, 3.054f, -3.0f)
                reflectiveCurveToRelative(2.946f, 1.343f, 2.946f, 3.0f)
                reflectiveCurveToRelative(-1.26f, 3.0f, -2.946f, 3.0f)
                reflectiveCurveToRelative(-3.054f, -1.343f, -3.054f, -3.0f)
                close()
                moveTo(23.547f, 15.663f)
                lineToRelative(-3.812f, -2.493f)
                lineToRelative(-1.308f, -2.13f)
                curveToRelative(-1.152f, -1.875f, -3.235f, -3.041f, -5.436f, -3.041f)
                horizontalLineToRelative(-1.83f)
                curveToRelative(-2.312f, 0.0f, -4.448f, 1.255f, -5.573f, 3.274f)
                lineToRelative(-1.341f, 2.408f)
                lineTo(0.453f, 16.163f)
                curveToRelative(-0.462f, 0.302f, -0.592f, 0.922f, -0.29f, 1.384f)
                curveToRelative(0.192f, 0.293f, 0.512f, 0.453f, 0.838f, 0.453f)
                curveToRelative(0.188f, 0.0f, 0.377f, -0.053f, 0.546f, -0.163f)
                lineToRelative(4.0f, -2.615f)
                curveToRelative(0.135f, -0.088f, 0.248f, -0.209f, 0.326f, -0.35f)
                lineToRelative(1.461f, -2.624f)
                curveToRelative(0.184f, -0.331f, 0.41f, -0.629f, 0.665f, -0.895f)
                verticalLineToRelative(7.012f)
                lineToRelative(-5.13f, 2.414f)
                curveToRelative(-0.689f, 0.394f, -1.015f, 1.173f, -0.811f, 1.939f)
                reflectiveCurveToRelative(0.873f, 1.282f, 1.667f, 1.282f)
                horizontalLineToRelative(3.274f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.034f)
                lineToRelative(4.459f, -2.095f)
                curveToRelative(0.351f, -0.165f, 0.575f, -0.518f, 0.575f, -0.905f)
                lineTo(9.999f, 10.157f)
                curveToRelative(0.373f, -0.103f, 0.763f, -0.157f, 1.161f, -0.157f)
                horizontalLineToRelative(1.83f)
                curveToRelative(0.343f, 0.0f, 0.681f, 0.046f, 1.009f, 0.125f)
                verticalLineToRelative(8.875f)
                curveToRelative(0.0f, 0.388f, 0.224f, 0.74f, 0.575f, 0.905f)
                lineToRelative(4.465f, 2.095f)
                lineTo(11.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.274f)
                curveToRelative(0.793f, 0.0f, 1.463f, -0.515f, 1.667f, -1.282f)
                reflectiveCurveToRelative(-0.122f, -1.546f, -0.882f, -1.977f)
                lineToRelative(-5.059f, -2.377f)
                verticalLineToRelative(-7.162f)
                curveToRelative(0.276f, 0.26f, 0.521f, 0.556f, 0.723f, 0.885f)
                lineToRelative(1.425f, 2.321f)
                curveToRelative(0.077f, 0.125f, 0.181f, 0.233f, 0.305f, 0.313f)
                lineToRelative(4.0f, 2.615f)
                curveToRelative(0.463f, 0.303f, 1.082f, 0.173f, 1.384f, -0.29f)
                reflectiveCurveToRelative(0.172f, -1.082f, -0.29f, -1.384f)
                close()
            }
        }
        .build()
        return _meditation!!
    }

private var _meditation: ImageVector? = null
