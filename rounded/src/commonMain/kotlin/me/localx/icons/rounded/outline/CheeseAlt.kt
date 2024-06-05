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

public val Icons.Outline.CheeseAlt: ImageVector
    get() {
        if (_cheeseAlt != null) {
            return _cheeseAlt!!
        }
        _cheeseAlt = Builder(name = "CheeseAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 16.0f)
                curveToRelative(0.0f, 1.52f, 0.27f, 3.07f, 0.79f, 4.61f)
                curveToRelative(0.69f, 2.03f, 2.6f, 3.39f, 4.74f, 3.39f)
                horizontalLineToRelative(13.47f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineToRelative(-7.49f)
                curveToRelative(0.0f, -1.88f, -0.9f, -3.68f, -2.41f, -4.81f)
                lineTo(13.79f, 0.88f)
                curveToRelative(-1.8f, -1.2f, -4.1f, -1.16f, -5.75f, 0.08f)
                curveTo(2.74f, 4.92f, 0.87f, 11.16f, 0.79f, 11.39f)
                curveTo(0.27f, 12.93f, 0.0f, 14.48f, 0.0f, 16.0f)
                close()
                moveTo(19.99f, 8.0f)
                lineTo(5.53f, 8.0f)
                curveToRelative(-0.4f, 0.0f, -0.78f, 0.05f, -1.16f, 0.14f)
                curveToRelative(0.96f, -1.69f, 2.51f, -3.81f, 4.87f, -5.57f)
                curveToRelative(0.98f, -0.73f, 2.35f, -0.75f, 3.4f, -0.05f)
                lineToRelative(7.35f, 5.49f)
                close()
                moveTo(2.0f, 16.0f)
                curveToRelative(0.0f, -1.3f, 0.23f, -2.64f, 0.68f, -3.96f)
                curveToRelative(0.42f, -1.22f, 1.56f, -2.04f, 2.84f, -2.04f)
                lineTo(21.7f, 10.0f)
                curveToRelative(0.19f, 0.47f, 0.3f, 0.99f, 0.3f, 1.51f)
                verticalLineToRelative(7.49f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                lineTo(5.53f, 22.0f)
                curveToRelative(-1.29f, 0.0f, -2.43f, -0.82f, -2.84f, -2.04f)
                curveToRelative(-0.45f, -1.33f, -0.68f, -2.66f, -0.68f, -3.96f)
                close()
            }
        }
        .build()
        return _cheeseAlt!!
    }

private var _cheeseAlt: ImageVector? = null
