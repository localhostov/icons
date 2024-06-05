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

public val Icons.Outline.Right: ImageVector
    get() {
        if (_right != null) {
            return _right!!
        }
        _right = Builder(name = "Right", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 22.03f)
                curveToRelative(-0.39f, 0.0f, -0.78f, -0.08f, -1.16f, -0.23f)
                curveToRelative(-1.13f, -0.47f, -1.84f, -1.52f, -1.85f, -2.75f)
                verticalLineToRelative(-2.06f)
                horizontalLineTo(3.97f)
                curveToRelative(-2.19f, 0.0f, -3.97f, -1.8f, -3.97f, -4.01f)
                verticalLineToRelative(-1.98f)
                curveToRelative(0.0f, -2.21f, 1.78f, -4.01f, 3.97f, -4.01f)
                horizontalLineToRelative(7.03f)
                verticalLineToRelative(-2.06f)
                curveToRelative(0.0f, -1.23f, 0.71f, -2.28f, 1.85f, -2.75f)
                curveToRelative(1.13f, -0.47f, 2.38f, -0.22f, 3.24f, 0.65f)
                lineToRelative(6.72f, 6.33f)
                lineToRelative(0.02f, 0.02f)
                curveToRelative(1.55f, 1.55f, 1.55f, 4.07f, 0.0f, 5.62f)
                lineToRelative(-6.77f, 6.37f)
                curveToRelative(-0.56f, 0.56f, -1.3f, 0.86f, -2.06f, 0.86f)
                close()
                moveTo(3.97f, 8.99f)
                curveToRelative(-1.09f, 0.0f, -1.97f, 0.9f, -1.97f, 2.01f)
                verticalLineToRelative(1.98f)
                curveToRelative(0.0f, 1.11f, 0.89f, 2.01f, 1.97f, 2.01f)
                horizontalLineTo(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(3.06f)
                curveToRelative(0.0f, 0.6f, 0.47f, 0.84f, 0.61f, 0.9f)
                curveToRelative(0.14f, 0.06f, 0.64f, 0.22f, 1.07f, -0.21f)
                lineToRelative(6.77f, -6.37f)
                curveToRelative(0.74f, -0.74f, 0.75f, -1.99f, -0.01f, -2.76f)
                lineToRelative(-6.73f, -6.33f)
                curveToRelative(-0.45f, -0.45f, -0.95f, -0.29f, -1.09f, -0.24f)
                curveToRelative(-0.14f, 0.06f, -0.61f, 0.3f, -0.61f, 0.9f)
                verticalLineToRelative(3.05f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(3.97f)
                close()
            }
        }
        .build()
        return _right!!
    }

private var _right: ImageVector? = null
