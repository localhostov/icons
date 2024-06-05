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
                moveTo(9.0f, 0.0f)
                curveToRelative(-1.9f, 0.0f, -3.49f, 1.33f, -3.9f, 3.1f)
                curveToRelative(-1.77f, 0.41f, -3.1f, 2.0f, -3.1f, 3.9f)
                verticalLineToRelative(0.02f)
                curveToRelative(-1.25f, 0.94f, -2.0f, 2.41f, -2.0f, 3.98f)
                curveToRelative(0.0f, 0.89f, 0.24f, 1.74f, 0.69f, 2.5f)
                curveToRelative(-0.45f, 0.76f, -0.69f, 1.61f, -0.69f, 2.5f)
                curveToRelative(0.0f, 1.69f, 0.86f, 3.24f, 2.27f, 4.17f)
                curveToRelative(0.72f, 2.28f, 2.81f, 3.83f, 5.23f, 3.83f)
                curveToRelative(0.01f, 0.0f, 0.03f, 0.0f, 0.04f, 0.0f)
                curveToRelative(1.94f, -0.01f, 3.46f, -1.7f, 3.46f, -3.64f)
                lineTo(11.0f, 2.01f)
                curveTo(11.0f, 0.9f, 10.11f, 0.0f, 9.0f, 0.0f)
                close()
                moveTo(13.0f, 2.01f)
                lineTo(13.0f, 20.36f)
                curveToRelative(0.0f, 1.94f, 1.52f, 3.63f, 3.46f, 3.64f)
                curveToRelative(0.01f, 0.0f, 0.03f, 0.0f, 0.04f, 0.0f)
                curveToRelative(2.42f, 0.0f, 4.51f, -1.56f, 5.23f, -3.83f)
                curveToRelative(1.41f, -0.92f, 2.27f, -2.48f, 2.27f, -4.17f)
                curveToRelative(0.0f, -0.89f, -0.24f, -1.74f, -0.69f, -2.5f)
                curveToRelative(0.45f, -0.76f, 0.69f, -1.61f, 0.69f, -2.5f)
                curveToRelative(0.0f, -1.57f, -0.75f, -3.04f, -2.0f, -3.98f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0.0f, -1.9f, -1.33f, -3.49f, -3.1f, -3.9f)
                curveTo(18.49f, 1.33f, 16.9f, 0.0f, 15.0f, 0.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.01f)
                close()
            }
        }
        .build()
        return _brain!!
    }

private var _brain: ImageVector? = null
