package me.localx.icons.rounded.filled

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

public val Icons.Filled.CheeseAlt: ImageVector
    get() {
        if (_cheeseAlt != null) {
            return _cheeseAlt!!
        }
        _cheeseAlt = Builder(name = "CheeseAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.51f)
                curveToRelative(0.0f, -0.51f, -0.07f, -1.02f, -0.2f, -1.51f)
                lineTo(2.67f, 10.0f)
                curveToRelative(-0.78f, 0.0f, -1.46f, 0.45f, -1.79f, 1.13f)
                curveTo(0.44f, 12.37f, 0.0f, 14.07f, 0.0f, 16.0f)
                curveToRelative(0.0f, 2.3f, 0.62f, 4.28f, 1.14f, 5.54f)
                curveToRelative(0.62f, 1.49f, 2.07f, 2.46f, 3.69f, 2.46f)
                horizontalLineToRelative(13.96f)
                curveToRelative(2.96f, 0.0f, 5.2f, -2.24f, 5.2f, -5.0f)
                verticalLineToRelative(-7.49f)
                close()
                moveTo(22.85f, 8.0f)
                lineTo(2.67f, 8.0f)
                curveToRelative(-0.18f, 0.0f, -0.36f, 0.02f, -0.53f, 0.04f)
                curveToRelative(1.0f, -1.98f, 2.81f, -4.77f, 5.9f, -7.08f)
                curveToRelative(1.66f, -1.24f, 3.95f, -1.28f, 5.71f, -0.11f)
                lineToRelative(4.2f, 3.13f)
                lineToRelative(3.64f, 2.72f)
                curveToRelative(0.49f, 0.37f, 0.91f, 0.81f, 1.26f, 1.3f)
                close()
            }
        }
        .build()
        return _cheeseAlt!!
    }

private var _cheeseAlt: ImageVector? = null
