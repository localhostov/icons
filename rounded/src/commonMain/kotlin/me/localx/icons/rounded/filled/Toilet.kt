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

public val Icons.Filled.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 8.0f)
                verticalLineToRelative(-4.0f)
                curveTo(5.0f, 1.794f, 6.794f, 0.0f, 9.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.861f, 0.0f, 3.429f, 1.276f, 3.874f, 3.0f)
                horizontalLineToRelative(1.126f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(6.0f, 9.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                close()
                moveTo(18.206f, 11.0f)
                lineTo(5.794f, 11.0f)
                curveToRelative(-1.17f, 0.0f, -2.297f, 0.687f, -2.653f, 1.801f)
                curveToRelative(-0.04f, 0.124f, -0.07f, 0.248f, -0.089f, 0.369f)
                curveToRelative(0.512f, 1.631f, 5.296f, 1.83f, 8.949f, 1.83f)
                reflectiveCurveToRelative(8.437f, -0.199f, 8.949f, -1.83f)
                curveToRelative(-0.02f, -0.121f, -0.05f, -0.245f, -0.089f, -0.369f)
                curveToRelative(-0.356f, -1.114f, -1.483f, -1.801f, -2.653f, -1.801f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-3.043f, 0.0f, -6.198f, -0.107f, -8.346f, -0.908f)
                curveToRelative(-0.036f, -0.023f, -0.072f, -0.046f, -0.108f, -0.07f)
                curveToRelative(1.192f, 2.155f, 3.419f, 3.922f, 6.763f, 4.369f)
                curveToRelative(-0.584f, 1.264f, -2.309f, 1.609f, -2.309f, 1.609f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                curveToRelative(0.0f, 0.0f, -1.726f, -0.345f, -2.309f, -1.609f)
                curveToRelative(3.331f, -0.445f, 5.553f, -2.199f, 6.749f, -4.342f)
                curveToRelative(-0.031f, 0.014f, -0.062f, 0.029f, -0.093f, 0.043f)
                curveToRelative(-2.148f, 0.801f, -5.302f, 0.908f, -8.346f, 0.908f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

private var _toilet: ImageVector? = null
