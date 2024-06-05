package me.localx.icons.straight.filled

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

public val Icons.Filled.Brain: ImageVector
    get() {
        if (_brain != null) {
            return _brain!!
        }
        _brain = Builder(name = "Brain", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.02f, 0.0f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-1.9f, 0.0f, -3.49f, 1.33f, -3.9f, 3.1f)
                curveToRelative(-1.77f, 0.41f, -3.1f, 2.0f, -3.1f, 3.9f)
                verticalLineToRelative(0.02f)
                curveToRelative(-1.25f, 0.94f, -2.0f, 2.41f, -2.0f, 3.98f)
                curveToRelative(0.0f, 0.89f, 0.24f, 1.74f, 0.69f, 2.5f)
                curveToRelative(-0.45f, 0.76f, -0.69f, 1.61f, -0.69f, 2.5f)
                curveToRelative(0.0f, 1.69f, 0.86f, 3.24f, 2.27f, 4.17f)
                curveToRelative(0.72f, 2.28f, 2.81f, 3.83f, 5.23f, 3.83f)
                curveToRelative(0.43f, 0.0f, 0.85f, -0.05f, 1.25f, -0.14f)
                curveToRelative(1.33f, -0.31f, 2.25f, -1.54f, 2.25f, -2.91f)
                lineTo(11.0f, 1.98f)
                curveTo(11.0f, 0.89f, 10.12f, 0.0f, 9.02f, 0.0f)
                close()
                moveTo(13.0f, 1.98f)
                lineTo(13.0f, 20.95f)
                curveToRelative(0.0f, 1.37f, 0.92f, 2.6f, 2.25f, 2.91f)
                curveToRelative(0.4f, 0.09f, 0.82f, 0.14f, 1.25f, 0.14f)
                curveToRelative(2.42f, 0.0f, 4.51f, -1.56f, 5.23f, -3.83f)
                curveToRelative(1.41f, -0.92f, 2.27f, -2.48f, 2.27f, -4.17f)
                curveToRelative(0.0f, -0.89f, -0.24f, -1.74f, -0.69f, -2.5f)
                curveToRelative(0.45f, -0.76f, 0.69f, -1.61f, 0.69f, -2.5f)
                curveToRelative(0.0f, -1.57f, -0.75f, -3.04f, -2.0f, -3.98f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0.0f, -1.9f, -1.33f, -3.49f, -3.1f, -3.9f)
                curveTo(18.49f, 1.33f, 16.9f, 0.0f, 15.0f, 0.0f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-1.09f, 0.0f, -1.98f, 0.89f, -1.98f, 1.98f)
                close()
            }
        }
        .build()
        return _brain!!
    }

private var _brain: ImageVector? = null
