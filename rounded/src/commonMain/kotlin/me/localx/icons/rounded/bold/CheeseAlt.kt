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

public val Icons.Bold.CheeseAlt: ImageVector
    get() {
        if (_cheeseAlt != null) {
            return _cheeseAlt!!
        }
        _cheeseAlt = Builder(name = "CheeseAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 15.5f)
                curveToRelative(0.0f, 1.58f, 0.27f, 3.18f, 0.82f, 4.77f)
                curveToRelative(0.76f, 2.23f, 2.85f, 3.73f, 5.21f, 3.73f)
                horizontalLineToRelative(12.47f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                verticalLineToRelative(-7.49f)
                curveToRelative(0.0f, -2.04f, -0.98f, -3.99f, -2.61f, -5.21f)
                lineTo(14.02f, 0.93f)
                curveToRelative(-1.93f, -1.29f, -4.45f, -1.24f, -6.28f, 0.13f)
                curveTo(2.55f, 4.95f, 0.98f, 10.11f, 0.8f, 10.78f)
                curveTo(0.27f, 12.35f, 0.0f, 13.94f, 0.0f, 15.5f)
                close()
                moveTo(17.77f, 7.0f)
                horizontalLineTo(6.05f)
                curveToRelative(0.86f, -1.18f, 2.0f, -2.42f, 3.49f, -3.54f)
                curveToRelative(0.81f, -0.61f, 1.95f, -0.62f, 2.82f, -0.03f)
                lineToRelative(5.41f, 3.57f)
                close()
                moveTo(3.0f, 15.5f)
                curveToRelative(0.0f, -1.24f, 0.22f, -2.52f, 0.65f, -3.78f)
                curveToRelative(0.0f, 0.0f, 0.0f, -0.02f, 0.0f, -0.03f)
                curveToRelative(0.35f, -1.01f, 1.3f, -1.69f, 2.37f, -1.69f)
                horizontalLineToRelative(14.83f)
                curveToRelative(0.1f, 0.32f, 0.15f, 0.66f, 0.15f, 1.01f)
                verticalLineToRelative(7.49f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineTo(6.03f)
                curveToRelative(-1.07f, 0.0f, -2.02f, -0.68f, -2.37f, -1.7f)
                curveToRelative(-0.43f, -1.28f, -0.66f, -2.55f, -0.66f, -3.8f)
                close()
            }
        }
        .build()
        return _cheeseAlt!!
    }

private var _cheeseAlt: ImageVector? = null
