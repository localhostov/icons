package me.localx.icons.straight.outline

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

public val Icons.Outline.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) {
            return _circleDashed!!
        }
        _circleDashed = Builder(name = "CircleDashed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                curveToRelative(0.0f, -1.1f, 0.15f, -2.19f, 0.44f, -3.24f)
                lineToRelative(1.93f, 0.54f)
                curveToRelative(-0.24f, 0.87f, -0.37f, 1.78f, -0.37f, 2.7f)
                close()
                moveTo(6.95f, 3.37f)
                lineToRelative(-1.01f, -1.72f)
                curveToRelative(-1.77f, 1.04f, -3.26f, 2.53f, -4.3f, 4.3f)
                lineToRelative(1.73f, 1.01f)
                curveToRelative(0.87f, -1.48f, 2.11f, -2.72f, 3.58f, -3.59f)
                close()
                moveTo(12.0f, 2.0f)
                lineTo(12.0f, 0.0f)
                curveToRelative(-1.1f, 0.0f, -2.19f, 0.15f, -3.24f, 0.44f)
                lineToRelative(0.54f, 1.93f)
                curveToRelative(0.87f, -0.24f, 1.78f, -0.37f, 2.7f, -0.37f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-0.92f, 0.0f, -1.83f, -0.12f, -2.7f, -0.37f)
                lineToRelative(-0.54f, 1.93f)
                curveToRelative(1.05f, 0.29f, 2.14f, 0.44f, 3.24f, 0.44f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(6.95f, 20.63f)
                curveToRelative(-1.48f, -0.87f, -2.72f, -2.11f, -3.59f, -3.58f)
                lineToRelative(-1.72f, 1.01f)
                curveToRelative(1.04f, 1.77f, 2.53f, 3.26f, 4.3f, 4.3f)
                lineToRelative(1.01f, -1.73f)
                close()
                moveTo(2.37f, 14.7f)
                curveToRelative(-0.24f, -0.87f, -0.37f, -1.78f, -0.37f, -2.7f)
                lineTo(0.0f, 12.0f)
                curveToRelative(0.0f, 1.1f, 0.15f, 2.19f, 0.44f, 3.24f)
                lineToRelative(1.93f, -0.54f)
                close()
                moveTo(24.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 0.92f, -0.12f, 1.83f, -0.37f, 2.7f)
                lineToRelative(1.93f, 0.54f)
                curveToRelative(0.29f, -1.05f, 0.44f, -2.14f, 0.44f, -3.24f)
                close()
                moveTo(22.36f, 18.06f)
                lineToRelative(-1.73f, -1.01f)
                curveToRelative(-0.87f, 1.48f, -2.11f, 2.72f, -3.58f, 3.59f)
                lineToRelative(1.01f, 1.72f)
                curveToRelative(1.77f, -1.04f, 3.26f, -2.53f, 4.3f, -4.3f)
                close()
                moveTo(15.24f, 23.56f)
                lineToRelative(-0.54f, -1.93f)
                curveToRelative(-0.87f, 0.24f, -1.78f, 0.37f, -2.7f, 0.37f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.1f, 0.0f, 2.19f, -0.15f, 3.24f, -0.44f)
                close()
                moveTo(15.24f, 0.44f)
                curveToRelative(-1.05f, -0.29f, -2.14f, -0.44f, -3.24f, -0.44f)
                lineTo(12.0f, 2.0f)
                curveToRelative(0.92f, 0.0f, 1.83f, 0.12f, 2.7f, 0.37f)
                lineToRelative(0.54f, -1.93f)
                close()
                moveTo(22.36f, 5.94f)
                curveToRelative(-1.04f, -1.77f, -2.53f, -3.26f, -4.3f, -4.3f)
                lineToRelative(-1.01f, 1.73f)
                curveToRelative(1.48f, 0.87f, 2.72f, 2.11f, 3.59f, 3.58f)
                lineToRelative(1.72f, -1.01f)
                close()
                moveTo(23.56f, 8.76f)
                lineToRelative(-1.93f, 0.54f)
                curveToRelative(0.24f, 0.87f, 0.37f, 1.78f, 0.37f, 2.7f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.1f, -0.15f, -2.19f, -0.44f, -3.24f)
                close()
            }
        }
        .build()
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
