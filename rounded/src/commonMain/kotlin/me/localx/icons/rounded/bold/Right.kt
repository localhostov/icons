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

public val Icons.Bold.Right: ImageVector
    get() {
        if (_right != null) {
            return _right!!
        }
        _right = Builder(name = "Right", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.37f, 22.0f)
                curveToRelative(-0.43f, 0.0f, -0.87f, -0.08f, -1.28f, -0.25f)
                curveToRelative(-1.26f, -0.52f, -2.08f, -1.73f, -2.08f, -3.1f)
                verticalLineToRelative(-1.65f)
                horizontalLineTo(3.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-1.64f)
                curveToRelative(0.0f, -1.37f, 0.82f, -2.59f, 2.08f, -3.1f)
                curveToRelative(1.26f, -0.52f, 2.7f, -0.23f, 3.66f, 0.73f)
                lineToRelative(6.0f, 5.97f)
                curveToRelative(1.68f, 1.68f, 1.68f, 4.4f, 0.0f, 6.08f)
                curveToRelative(0.0f, 0.0f, -6.0f, 5.97f, -6.0f, 5.97f)
                curveToRelative(-0.64f, 0.64f, -1.5f, 0.99f, -2.38f, 0.99f)
                close()
                moveTo(3.5f, 10.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.27f, 0.23f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(12.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.14f)
                curveToRelative(0.0f, 0.15f, 0.08f, 0.27f, 0.23f, 0.33f)
                curveToRelative(0.15f, 0.06f, 0.28f, 0.04f, 0.4f, -0.08f)
                lineToRelative(6.0f, -5.97f)
                curveToRelative(0.5f, -0.5f, 0.5f, -1.33f, 0.0f, -1.83f)
                lineToRelative(-6.0f, -5.97f)
                curveToRelative(-0.12f, -0.12f, -0.25f, -0.14f, -0.4f, -0.08f)
                curveToRelative(-0.15f, 0.06f, -0.22f, 0.17f, -0.23f, 0.33f)
                verticalLineToRelative(3.13f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(3.5f)
                close()
            }
        }
        .build()
        return _right!!
    }

private var _right: ImageVector? = null
