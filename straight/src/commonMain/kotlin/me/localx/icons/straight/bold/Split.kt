package me.localx.icons.straight.bold

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
                moveTo(23.28f, 16.74f)
                lineToRelative(-3.71f, -3.79f)
                lineToRelative(-2.14f, 2.1f)
                lineToRelative(1.91f, 1.95f)
                horizontalLineToRelative(-4.96f)
                curveToRelative(-0.14f, 0.0f, -0.27f, -0.06f, -0.37f, -0.16f)
                lineToRelative(-4.47f, -4.84f)
                lineToRelative(4.47f, -4.84f)
                curveToRelative(0.09f, -0.1f, 0.23f, -0.16f, 0.37f, -0.16f)
                horizontalLineToRelative(4.96f)
                lineToRelative(-1.91f, 1.95f)
                lineToRelative(2.14f, 2.1f)
                lineToRelative(3.7f, -3.78f)
                curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0.0f, -3.54f)
                lineTo(19.52f, -0.02f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.9f, 1.9f)
                horizontalLineToRelative(-4.92f)
                curveToRelative(-0.97f, 0.0f, -1.91f, 0.41f, -2.57f, 1.13f)
                lineToRelative(-4.96f, 5.37f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(6.84f)
                lineToRelative(4.96f, 5.37f)
                curveToRelative(0.66f, 0.72f, 1.6f, 1.13f, 2.57f, 1.13f)
                horizontalLineToRelative(4.96f)
                lineToRelative(-1.91f, 1.95f)
                lineToRelative(2.14f, 2.1f)
                lineToRelative(3.7f, -3.78f)
                curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0.01f, -3.52f)
                close()
            }
        }
        .build()
        return _split!!
    }

private var _split: ImageVector? = null
