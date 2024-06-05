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

public val Icons.Bold.Split: ImageVector
    get() {
        if (_split != null) {
            return _split!!
        }
        _split = Builder(name = "Split", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.01f, 16.06f)
                curveToRelative(1.33f, 1.33f, 1.33f, 3.55f, -0.04f, 4.91f)
                lineToRelative(-2.38f, 2.55f)
                curveToRelative(-0.3f, 0.32f, -0.7f, 0.48f, -1.1f, 0.48f)
                curveToRelative(-0.37f, 0.0f, -0.73f, -0.13f, -1.02f, -0.4f)
                curveToRelative(-0.61f, -0.57f, -0.64f, -1.51f, -0.07f, -2.12f)
                lineToRelative(1.38f, -1.48f)
                horizontalLineToRelative(-5.03f)
                curveToRelative(-1.53f, 0.0f, -3.0f, -0.64f, -4.04f, -1.77f)
                lineToRelative(-4.37f, -4.73f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineTo(6.34f)
                lineToRelative(4.37f, -4.73f)
                curveToRelative(1.04f, -1.12f, 2.51f, -1.77f, 4.04f, -1.77f)
                horizontalLineToRelative(5.03f)
                lineToRelative(-1.38f, -1.48f)
                curveToRelative(-0.57f, -0.61f, -0.53f, -1.55f, 0.07f, -2.12f)
                curveToRelative(0.61f, -0.56f, 1.55f, -0.53f, 2.12f, 0.07f)
                lineToRelative(2.41f, 2.59f)
                curveToRelative(1.33f, 1.33f, 1.33f, 3.55f, -0.04f, 4.91f)
                lineToRelative(-2.38f, 2.55f)
                curveToRelative(-0.3f, 0.32f, -0.7f, 0.48f, -1.1f, 0.48f)
                curveToRelative(-0.37f, 0.0f, -0.73f, -0.13f, -1.02f, -0.4f)
                curveToRelative(-0.61f, -0.57f, -0.64f, -1.51f, -0.07f, -2.12f)
                lineToRelative(1.38f, -1.48f)
                horizontalLineToRelative(-5.03f)
                curveToRelative(-0.7f, 0.0f, -1.37f, 0.29f, -1.84f, 0.8f)
                lineToRelative(-3.87f, 4.2f)
                lineToRelative(3.87f, 4.2f)
                curveToRelative(0.47f, 0.51f, 1.14f, 0.8f, 1.84f, 0.8f)
                horizontalLineToRelative(5.03f)
                lineToRelative(-1.38f, -1.48f)
                curveToRelative(-0.57f, -0.61f, -0.53f, -1.55f, 0.07f, -2.12f)
                curveToRelative(0.61f, -0.56f, 1.55f, -0.53f, 2.12f, 0.07f)
                lineToRelative(2.41f, 2.59f)
                close()
            }
        }
        .build()
        return _split!!
    }

private var _split: ImageVector? = null
