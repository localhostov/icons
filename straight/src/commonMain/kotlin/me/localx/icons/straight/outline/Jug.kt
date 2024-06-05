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

public val Icons.Outline.Jug: ImageVector
    get() {
        if (_jug != null) {
            return _jug!!
        }
        _jug = Builder(name = "Jug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.66f, 10.57f)
                lineToRelative(-0.78f, -0.52f)
                curveToRelative(0.69f, -0.65f, 1.11f, -1.56f, 1.11f, -2.56f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.54f, 0.0f, -1.05f, 0.12f, -1.5f, 0.34f)
                lineTo(14.99f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(15.99f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(9.0f, 7.46f)
                lineToRelative(-4.66f, 3.11f)
                curveToRelative(-0.84f, 0.56f, -1.34f, 1.49f, -1.34f, 2.5f)
                verticalLineToRelative(10.93f)
                lineTo(21.0f, 24.0f)
                lineTo(21.0f, 13.07f)
                curveToRelative(0.0f, -1.0f, -0.5f, -1.94f, -1.34f, -2.5f)
                close()
                moveTo(16.5f, 6.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.6f, -0.36f, 1.14f, -0.89f, 1.37f)
                lineToRelative(-2.11f, -1.41f)
                curveToRelative(0.02f, -0.81f, 0.68f, -1.47f, 1.5f, -1.47f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 13.0f)
                curveToRelative(0.02f, -0.31f, 0.18f, -0.59f, 0.44f, -0.76f)
                lineToRelative(5.55f, -3.7f)
                lineTo(10.99f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.54f)
                lineToRelative(5.55f, 3.7f)
                curveToRelative(0.28f, 0.19f, 0.45f, 0.5f, 0.45f, 0.83f)
                verticalLineToRelative(8.93f)
                close()
            }
        }
        .build()
        return _jug!!
    }

private var _jug: ImageVector? = null
