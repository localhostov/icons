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

public val Icons.Outline.Down: ImageVector
    get() {
        if (_down != null) {
            return _down!!
        }
        _down = Builder(name = "Down", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.81f, 12.85f)
                curveToRelative(-0.47f, -1.13f, -1.52f, -1.84f, -2.75f, -1.85f)
                horizontalLineToRelative(-2.06f)
                lineTo(17.0f, 3.97f)
                curveToRelative(0.0f, -2.19f, -1.8f, -3.97f, -4.01f, -3.97f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-2.21f, 0.0f, -4.01f, 1.78f, -4.01f, 3.97f)
                verticalLineToRelative(7.03f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(-1.23f, 0.0f, -2.28f, 0.71f, -2.75f, 1.85f)
                curveToRelative(-0.47f, 1.13f, -0.22f, 2.38f, 0.63f, 3.22f)
                lineToRelative(6.37f, 6.77f)
                curveToRelative(0.77f, 0.77f, 1.79f, 1.16f, 2.81f, 1.16f)
                reflectiveCurveToRelative(2.03f, -0.39f, 2.81f, -1.16f)
                curveToRelative(0.0f, 0.0f, 6.35f, -6.75f, 6.35f, -6.75f)
                curveToRelative(0.87f, -0.87f, 1.12f, -2.11f, 0.65f, -3.24f)
                close()
                moveTo(19.73f, 14.7f)
                lineToRelative(-6.34f, 6.73f)
                curveToRelative(-0.77f, 0.76f, -2.01f, 0.75f, -2.76f, 0.01f)
                lineToRelative(-6.37f, -6.77f)
                curveToRelative(-0.43f, -0.43f, -0.27f, -0.93f, -0.21f, -1.07f)
                curveToRelative(0.06f, -0.14f, 0.3f, -0.61f, 0.9f, -0.61f)
                horizontalLineToRelative(3.06f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(9.01f, 3.97f)
                curveToRelative(0.0f, -1.09f, 0.9f, -1.97f, 2.01f, -1.97f)
                horizontalLineToRelative(1.98f)
                curveToRelative(1.11f, 0.0f, 2.01f, 0.89f, 2.01f, 1.97f)
                lineTo(15.01f, 12.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.61f, 0.0f, 0.84f, 0.47f, 0.9f, 0.61f)
                curveToRelative(0.06f, 0.14f, 0.22f, 0.64f, -0.24f, 1.09f)
                close()
            }
        }
        .build()
        return _down!!
    }

private var _down: ImageVector? = null
