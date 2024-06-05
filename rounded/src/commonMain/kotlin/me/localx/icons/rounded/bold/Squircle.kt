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

public val Icons.Bold.Squircle: ImageVector
    get() {
        if (_squircle != null) {
            return _squircle!!
        }
        _squircle = Builder(name = "Squircle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-0.75f, 0.0f, -1.78f, -0.06f, -3.08f, -0.18f)
                curveTo(4.27f, 23.4f, 0.6f, 19.73f, 0.18f, 15.08f)
                curveToRelative(-0.12f, -1.3f, -0.18f, -2.33f, -0.18f, -3.08f)
                reflectiveCurveToRelative(0.06f, -1.78f, 0.18f, -3.08f)
                curveTo(0.6f, 4.27f, 4.27f, 0.6f, 8.92f, 0.18f)
                curveToRelative(1.3f, -0.12f, 2.33f, -0.18f, 3.08f, -0.18f)
                reflectiveCurveToRelative(1.78f, 0.06f, 3.08f, 0.18f)
                curveToRelative(4.65f, 0.42f, 8.32f, 4.1f, 8.74f, 8.74f)
                curveToRelative(0.12f, 1.3f, 0.18f, 2.33f, 0.18f, 3.08f)
                reflectiveCurveToRelative(-0.06f, 1.78f, -0.18f, 3.08f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.42f, 4.64f, -4.1f, 8.32f, -8.74f, 8.74f)
                curveToRelative(-1.3f, 0.12f, -2.33f, 0.18f, -3.08f, 0.18f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(-0.66f, 0.0f, -1.6f, 0.06f, -2.81f, 0.17f)
                curveToRelative(-3.2f, 0.29f, -5.73f, 2.82f, -6.02f, 6.02f)
                curveToRelative(-0.11f, 1.21f, -0.17f, 2.15f, -0.17f, 2.81f)
                reflectiveCurveToRelative(0.06f, 1.6f, 0.16f, 2.81f)
                curveToRelative(0.29f, 3.2f, 2.82f, 5.73f, 6.02f, 6.02f)
                curveToRelative(1.21f, 0.11f, 2.15f, 0.17f, 2.81f, 0.17f)
                reflectiveCurveToRelative(1.6f, -0.06f, 2.81f, -0.17f)
                curveToRelative(3.2f, -0.29f, 5.73f, -2.82f, 6.02f, -6.02f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.11f, -1.21f, 0.16f, -2.15f, 0.16f, -2.81f)
                reflectiveCurveToRelative(-0.06f, -1.6f, -0.16f, -2.81f)
                curveToRelative(-0.29f, -3.2f, -2.82f, -5.73f, -6.02f, -6.02f)
                curveToRelative(-1.21f, -0.11f, -2.15f, -0.17f, -2.81f, -0.17f)
                close()
            }
        }
        .build()
        return _squircle!!
    }

private var _squircle: ImageVector? = null
