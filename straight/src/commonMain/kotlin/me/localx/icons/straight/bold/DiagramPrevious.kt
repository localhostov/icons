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

public val Icons.Bold.DiagramPrevious: ImageVector
    get() {
        if (_diagramPrevious != null) {
            return _diagramPrevious!!
        }
        _diagramPrevious = Builder(name = "DiagramPrevious", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 10.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-3.79f, -3.71f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-3.79f, 3.71f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(20.5f, 24.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-6.5f)
                lineTo(13.5f, 14.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(21.0f, 20.5f)
                curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 21.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                lineTo(21.0f, 17.0f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-4.64f)
                lineToRelative(-5.24f, -5.12f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.23f, -0.02f)
                lineToRelative(-5.26f, 5.14f)
                lineTo(0.0f, 10.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _diagramPrevious!!
    }

private var _diagramPrevious: ImageVector? = null
