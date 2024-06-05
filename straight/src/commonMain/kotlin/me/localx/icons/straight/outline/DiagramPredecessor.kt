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

public val Icons.Outline.DiagramPredecessor: ImageVector
    get() {
        if (_diagramPredecessor != null) {
            return _diagramPredecessor!!
        }
        _diagramPredecessor = Builder(name = "DiagramPredecessor", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 21.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                lineTo(21.0f, 24.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(2.0f, 16.0f)
                lineTo(22.0f, 16.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(14.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(3.18f, 3.65f)
                curveToRelative(0.44f, 0.49f, 1.22f, 0.49f, 1.66f, 0.0f)
                lineToRelative(3.16f, -3.65f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, -0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                verticalLineToRelative(7.0f)
                lineTo(14.0f, 10.0f)
                lineTo(14.0f, 5.0f)
                close()
                moveTo(11.47f, 2.12f)
                lineToRelative(-5.88f, 5.88f)
                lineTo(2.41f, 8.0f)
                lineTo(8.41f, 2.0f)
                horizontalLineToRelative(2.59f)
                curveToRelative(0.17f, 0.0f, 0.33f, 0.04f, 0.47f, 0.12f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(2.59f)
                lineToRelative(-3.59f, 3.59f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(8.41f, 8.0f)
                lineToRelative(3.59f, -3.59f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(-3.59f)
                close()
            }
        }
        .build()
        return _diagramPredecessor!!
    }

private var _diagramPredecessor: ImageVector? = null