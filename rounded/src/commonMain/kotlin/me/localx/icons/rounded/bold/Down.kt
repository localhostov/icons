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

public val Icons.Bold.Down: ImageVector
    get() {
        if (_down != null) {
            return _down!!
        }
        _down = Builder(name = "Down", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-1.1f, 0.0f, -2.2f, -0.42f, -3.04f, -1.25f)
                lineToRelative(-5.98f, -6.0f)
                curveToRelative(-0.96f, -0.96f, -1.25f, -2.4f, -0.73f, -3.66f)
                curveToRelative(0.52f, -1.26f, 1.74f, -2.08f, 3.1f, -2.08f)
                horizontalLineToRelative(1.64f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(1.64f)
                curveToRelative(1.37f, 0.0f, 2.58f, 0.83f, 3.1f, 2.08f)
                curveToRelative(0.52f, 1.26f, 0.23f, 2.7f, -0.73f, 3.66f)
                lineToRelative(-5.97f, 5.99f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-0.84f, 0.84f, -1.94f, 1.25f, -3.04f, 1.25f)
                close()
                moveTo(5.36f, 14.0f)
                curveToRelative(-0.16f, 0.0f, -0.27f, 0.08f, -0.33f, 0.23f)
                curveToRelative(-0.06f, 0.15f, -0.04f, 0.28f, 0.08f, 0.4f)
                lineToRelative(5.98f, 6.0f)
                curveToRelative(0.5f, 0.5f, 1.32f, 0.5f, 1.83f, 0.0f)
                lineToRelative(5.97f, -6.0f)
                curveToRelative(0.12f, -0.12f, 0.14f, -0.25f, 0.08f, -0.4f)
                reflectiveCurveToRelative(-0.17f, -0.23f, -0.34f, -0.23f)
                horizontalLineToRelative(-3.13f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -0.27f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(12.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.14f)
                close()
            }
        }
        .build()
        return _down!!
    }

private var _down: ImageVector? = null
