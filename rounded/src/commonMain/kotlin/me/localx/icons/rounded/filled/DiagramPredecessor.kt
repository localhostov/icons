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

public val Icons.Filled.DiagramPredecessor: ImageVector
    get() {
        if (_diagramPredecessor != null) {
            return _diagramPredecessor!!
        }
        _diagramPredecessor = Builder(name = "DiagramPredecessor", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                lineTo(20.0f, 14.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                close()
                moveTo(0.0f, 6.0f)
                verticalLineToRelative(-2.0f)
                curveTo(0.0f, 1.79f, 1.79f, 0.0f, 4.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.86f, 0.0f, 3.43f, 1.28f, 3.87f, 3.0f)
                horizontalLineToRelative(3.13f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.45f)
                curveToRelative(0.69f, 0.0f, 1.04f, 0.83f, 0.55f, 1.32f)
                lineToRelative(-2.45f, 2.45f)
                curveToRelative(-0.3f, 0.3f, -0.79f, 0.3f, -1.1f, 0.0f)
                lineToRelative(-2.45f, -2.45f)
                curveToRelative(-0.49f, -0.49f, -0.14f, -1.32f, 0.55f, -1.32f)
                horizontalLineToRelative(1.45f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                lineTo(4.0f, 10.0f)
                curveTo(1.79f, 10.0f, 0.0f, 8.21f, 0.0f, 6.0f)
                close()
                moveTo(12.0f, 6.0f)
                verticalLineToRelative(-1.59f)
                lineToRelative(-3.59f, 3.59f)
                horizontalLineToRelative(1.59f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                close()
                moveTo(10.0f, 2.0f)
                horizontalLineToRelative(-1.59f)
                lineTo(2.81f, 7.61f)
                curveToRelative(0.33f, 0.25f, 0.75f, 0.39f, 1.19f, 0.39f)
                horizontalLineToRelative(1.59f)
                lineTo(11.19f, 2.39f)
                curveToRelative(-0.33f, -0.25f, -0.75f, -0.39f, -1.19f, -0.39f)
                close()
                moveTo(2.0f, 4.0f)
                verticalLineToRelative(1.59f)
                lineToRelative(3.59f, -3.59f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _diagramPredecessor!!
    }

private var _diagramPredecessor: ImageVector? = null
