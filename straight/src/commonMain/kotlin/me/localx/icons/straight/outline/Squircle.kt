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

public val Icons.Outline.Squircle: ImageVector
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
                curveToRelative(-0.77f, 0.0f, -1.81f, -0.06f, -3.18f, -0.18f)
                curveTo(4.23f, 23.4f, 0.6f, 19.77f, 0.18f, 15.18f)
                curveToRelative(-0.12f, -1.34f, -0.18f, -2.41f, -0.18f, -3.18f)
                reflectiveCurveToRelative(0.06f, -1.83f, 0.18f, -3.18f)
                curveTo(0.6f, 4.23f, 4.23f, 0.6f, 8.82f, 0.18f)
                curveToRelative(1.37f, -0.12f, 2.41f, -0.18f, 3.18f, -0.18f)
                reflectiveCurveToRelative(1.81f, 0.06f, 3.18f, 0.18f)
                curveToRelative(4.59f, 0.42f, 8.23f, 4.05f, 8.64f, 8.64f)
                curveToRelative(0.12f, 1.34f, 0.18f, 2.41f, 0.18f, 3.18f)
                reflectiveCurveToRelative(-0.06f, 1.83f, -0.18f, 3.18f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.42f, 4.59f, -4.05f, 8.22f, -8.64f, 8.64f)
                curveToRelative(-1.37f, 0.12f, -2.41f, 0.18f, -3.18f, 0.18f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(-0.7f, 0.0f, -1.7f, 0.06f, -3.0f, 0.17f)
                curveToRelative(-3.63f, 0.33f, -6.5f, 3.2f, -6.83f, 6.83f)
                curveToRelative(-0.12f, 1.29f, -0.18f, 2.29f, -0.18f, 3.0f)
                reflectiveCurveToRelative(0.06f, 1.71f, 0.18f, 3.0f)
                curveToRelative(0.33f, 3.63f, 3.2f, 6.5f, 6.83f, 6.83f)
                curveToRelative(1.29f, 0.12f, 2.3f, 0.17f, 3.0f, 0.17f)
                reflectiveCurveToRelative(1.7f, -0.06f, 3.0f, -0.17f)
                curveToRelative(3.63f, -0.33f, 6.5f, -3.2f, 6.83f, -6.83f)
                curveToRelative(0.12f, -1.29f, 0.18f, -2.29f, 0.18f, -3.0f)
                reflectiveCurveToRelative(-0.06f, -1.71f, -0.18f, -3.0f)
                curveToRelative(-0.33f, -3.63f, -3.2f, -6.5f, -6.83f, -6.83f)
                curveToRelative(-1.29f, -0.12f, -2.3f, -0.17f, -3.0f, -0.17f)
                close()
            }
        }
        .build()
        return _squircle!!
    }

private var _squircle: ImageVector? = null
