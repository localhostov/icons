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
                moveTo(20.0f, 14.0f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.16f)
                curveToRelative(0.75f, 0.0f, 1.12f, -0.91f, 0.59f, -1.43f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-0.33f, -0.33f, -0.86f, -0.33f, -1.19f, 0.0f)
                lineToRelative(-2.66f, 2.66f)
                curveToRelative(-0.53f, 0.53f, -0.15f, 1.43f, 0.59f, 1.43f)
                horizontalLineToRelative(1.16f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 14.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                lineTo(20.0f, 24.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(21.0f, 20.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(20.0f, 17.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-2.64f)
                curveToRelative(0.31f, -1.0f, 0.06f, -2.1f, -0.7f, -2.85f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-1.11f, -1.11f, -2.91f, -1.11f, -4.02f, 0.0f)
                lineToRelative(-2.66f, 2.66f)
                curveToRelative(-0.75f, 0.75f, -1.01f, 1.85f, -0.7f, 2.85f)
                horizontalLineToRelative(-2.64f)
                curveTo(1.79f, 10.0f, 0.0f, 8.21f, 0.0f, 6.0f)
                verticalLineToRelative(-2.0f)
                curveTo(0.0f, 1.79f, 1.79f, 0.0f, 4.0f, 0.0f)
                lineTo(20.0f, 0.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _diagramPrevious!!
    }

private var _diagramPrevious: ImageVector? = null
