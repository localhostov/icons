package me.localx.icons.straight.bold

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

public val Icons.Bold.Invest: ImageVector
    get() {
        if (_invest != null) {
            return _invest!!
        }
        _invest = Builder(name = "Invest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 6.95f)
                verticalLineToRelative(3.591f)
                curveToRelative(1.224f, 1.099f, 2.0f, 2.688f, 2.0f, 4.46f)
                curveToRelative(0.0f, 1.111f, -0.309f, 2.148f, -0.837f, 3.042f)
                lineToRelative(-3.663f, -3.663f)
                verticalLineTo(4.021f)
                horizontalLineToRelative(2.484f)
                lineTo(12.827f, 0.371f)
                curveToRelative(-0.443f, -0.494f, -1.217f, -0.494f, -1.66f, 0.0f)
                lineToRelative(-3.183f, 3.65f)
                horizontalLineToRelative(2.516f)
                verticalLineToRelative(2.115f)
                curveToRelative(-4.249f, 0.718f, -7.5f, 4.414f, -7.5f, 8.865f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                curveToRelative(0.0f, -3.525f, -2.042f, -6.574f, -5.0f, -8.05f)
                close()
                moveTo(6.0f, 15.0f)
                curveToRelative(0.0f, -2.79f, 1.916f, -5.134f, 4.5f, -5.803f)
                verticalLineToRelative(6.424f)
                lineToRelative(4.542f, 4.542f)
                curveToRelative(-0.893f, 0.528f, -1.931f, 0.837f, -3.042f, 0.837f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _invest!!
    }

private var _invest: ImageVector? = null
