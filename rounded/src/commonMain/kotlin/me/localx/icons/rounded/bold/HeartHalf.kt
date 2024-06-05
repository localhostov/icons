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

public val Icons.Bold.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) {
            return _heartHalf!!
        }
        _heartHalf = Builder(name = "HeartHalf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.76f, 23.0f)
                curveToRelative(-0.71f, 0.0f, -1.41f, -0.25f, -1.98f, -0.72f)
                curveTo(4.68f, 18.79f, 0.0f, 14.22f, 0.0f, 9.5f)
                curveToRelative(-0.08f, -2.03f, 0.65f, -4.04f, 2.01f, -5.45f)
                curveToRelative(1.28f, -1.33f, 3.06f, -2.06f, 5.0f, -2.06f)
                curveToRelative(2.46f, 0.05f, 4.69f, 1.39f, 5.89f, 3.49f)
                curveToRelative(0.25f, 0.38f, 1.09f, 1.82f, 1.1f, 3.99f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(10.27f)
                curveToRelative(0.0f, 1.25f, -0.74f, 2.41f, -1.89f, 2.94f)
                curveToRelative(-0.44f, 0.2f, -0.9f, 0.3f, -1.35f, 0.3f)
                close()
                moveTo(6.98f, 4.99f)
                curveToRelative(-1.11f, 0.0f, -2.09f, 0.4f, -2.81f, 1.14f)
                curveToRelative(-0.79f, 0.82f, -1.22f, 2.03f, -1.17f, 3.31f)
                curveToRelative(0.0f, 3.99f, 5.79f, 8.91f, 7.69f, 10.52f)
                curveToRelative(0.04f, 0.03f, 0.07f, 0.05f, 0.15f, 0.02f)
                curveToRelative(0.04f, -0.02f, 0.16f, -0.08f, 0.16f, -0.23f)
                verticalLineTo(9.48f)
                curveToRelative(0.0f, -1.44f, -0.67f, -2.44f, -0.69f, -2.48f)
                curveToRelative(-0.67f, -1.21f, -1.94f, -1.98f, -3.33f, -2.01f)
                close()
            }
        }
        .build()
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
