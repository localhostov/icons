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

public val Icons.Outline.Dagger: ImageVector
    get() {
        if (_dagger != null) {
            return _dagger!!
        }
        _dagger = Builder(name = "Dagger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.41f, 5.996f)
                lineToRelative(4.296f, -4.288f)
                curveToRelative(0.392f, -0.391f, 0.392f, -1.023f, 0.002f, -1.415f)
                curveToRelative(-0.391f, -0.392f, -1.025f, -0.39f, -1.414f, -0.001f)
                lineToRelative(-4.298f, 4.29f)
                lineToRelative(-1.461f, -1.461f)
                curveTo(14.522f, 1.108f, 11.847f, 0.0f, 9.0f, 0.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                curveToRelative(1.876f, 0.0f, 3.656f, 0.602f, 5.136f, 1.699f)
                lineToRelative(-7.024f, 7.033f)
                curveToRelative(-2.463f, 2.463f, -4.507f, 5.291f, -6.074f, 8.403f)
                curveToRelative(0.0f, 0.0f, -0.964f, 1.938f, -0.981f, 2.019f)
                curveToRelative(-0.173f, 0.784f, 0.062f, 1.592f, 0.631f, 2.16f)
                curveToRelative(0.445f, 0.445f, 1.038f, 0.687f, 1.651f, 0.687f)
                curveToRelative(0.169f, 0.0f, 0.339f, -0.019f, 0.508f, -0.056f)
                curveToRelative(0.082f, -0.018f, 2.021f, -0.982f, 2.021f, -0.982f)
                curveToRelative(3.111f, -1.567f, 5.938f, -3.61f, 8.403f, -6.075f)
                lineToRelative(7.024f, -7.034f)
                curveToRelative(1.102f, 1.482f, 1.706f, 3.266f, 1.706f, 5.146f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -2.724f, -1.025f, -5.286f, -2.877f, -7.267f)
                curveToRelative(-0.02f, -0.023f, -1.713f, -1.737f, -1.713f, -1.737f)
                close()
                moveTo(11.854f, 15.474f)
                curveToRelative(-2.313f, 2.312f, -4.967f, 4.231f, -7.888f, 5.702f)
                lineToRelative(-1.638f, 0.824f)
                curveToRelative(-0.111f, -0.002f, -0.188f, -0.061f, -0.229f, -0.101f)
                curveToRelative(-0.04f, -0.04f, -0.098f, -0.117f, -0.101f, -0.229f)
                lineToRelative(0.824f, -1.636f)
                curveToRelative(1.471f, -2.921f, 3.39f, -5.576f, 5.702f, -7.889f)
                lineToRelative(7.098f, -7.107f)
                lineToRelative(3.328f, 3.327f)
                lineToRelative(-7.098f, 7.108f)
                close()
            }
        }
        .build()
        return _dagger!!
    }

private var _dagger: ImageVector? = null
