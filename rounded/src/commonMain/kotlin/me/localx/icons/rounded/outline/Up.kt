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

public val Icons.Outline.Up: ImageVector
    get() {
        if (_up != null) {
            return _up!!
        }
        _up = Builder(name = "Up", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.99f, 24.0f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-2.21f, 0.0f, -4.01f, -1.78f, -4.01f, -3.97f)
                verticalLineToRelative(-7.03f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(-1.23f, 0.0f, -2.28f, -0.71f, -2.75f, -1.85f)
                curveToRelative(-0.47f, -1.13f, -0.22f, -2.38f, 0.65f, -3.25f)
                lineTo(9.17f, 1.18f)
                curveToRelative(1.57f, -1.57f, 4.09f, -1.57f, 5.64f, -0.02f)
                curveToRelative(0.0f, 0.0f, 6.37f, 6.77f, 6.37f, 6.77f)
                curveToRelative(0.85f, 0.84f, 1.1f, 2.09f, 0.63f, 3.22f)
                curveToRelative(-0.47f, 1.13f, -1.52f, 1.84f, -2.74f, 1.85f)
                horizontalLineToRelative(-2.06f)
                verticalLineToRelative(7.03f)
                curveToRelative(0.0f, 2.19f, -1.8f, 3.97f, -4.01f, 3.97f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(-0.51f, 0.0f, -1.01f, 0.19f, -1.4f, 0.58f)
                lineToRelative(-6.33f, 6.72f)
                curveToRelative(-0.45f, 0.45f, -0.29f, 0.95f, -0.24f, 1.09f)
                curveToRelative(0.06f, 0.14f, 0.3f, 0.61f, 0.9f, 0.61f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(8.03f)
                curveToRelative(0.0f, 1.09f, 0.9f, 1.97f, 2.01f, 1.97f)
                horizontalLineToRelative(1.98f)
                curveToRelative(1.11f, 0.0f, 2.01f, -0.89f, 2.01f, -1.97f)
                lineTo(14.98f, 12.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.06f)
                curveToRelative(0.6f, 0.0f, 0.84f, -0.47f, 0.9f, -0.61f)
                curveToRelative(0.06f, -0.14f, 0.22f, -0.64f, -0.21f, -1.07f)
                lineTo(13.39f, 2.57f)
                curveToRelative(-0.38f, -0.38f, -0.88f, -0.57f, -1.38f, -0.57f)
                close()
            }
        }
        .build()
        return _up!!
    }

private var _up: ImageVector? = null
