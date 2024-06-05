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

public val Icons.Filled.DiagramNext: ImageVector
    get() {
        if (_diagramNext != null) {
            return _diagramNext!!
        }
        _diagramNext = Builder(name = "DiagramNext", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                curveTo(1.79f, 0.0f, 0.0f, 1.79f, 0.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.45f)
                curveToRelative(-0.69f, 0.0f, -1.04f, 0.83f, -0.55f, 1.32f)
                lineToRelative(2.45f, 2.45f)
                curveToRelative(0.3f, 0.3f, 0.79f, 0.3f, 1.1f, 0.0f)
                lineToRelative(2.45f, -2.45f)
                curveToRelative(0.49f, -0.49f, 0.14f, -1.32f, -0.55f, -1.32f)
                horizontalLineToRelative(-1.45f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(21.68f, 2.91f)
                lineToRelative(-5.09f, 5.09f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(6.0f, -6.0f)
                horizontalLineToRelative(0.59f)
                curveToRelative(0.7f, 0.0f, 1.32f, 0.36f, 1.68f, 0.91f)
                close()
                moveTo(7.41f, 8.0f)
                lineTo(13.41f, 2.0f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-6.0f, 6.0f)
                horizontalLineToRelative(-3.17f)
                close()
                moveTo(4.0f, 2.0f)
                horizontalLineToRelative(0.59f)
                lineToRelative(-2.59f, 2.59f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(2.32f, 7.09f)
                lineTo(7.41f, 2.0f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-6.0f, 6.0f)
                horizontalLineToRelative(-0.59f)
                curveToRelative(-0.7f, 0.0f, -1.32f, -0.36f, -1.68f, -0.91f)
                close()
                moveTo(20.0f, 8.0f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(2.59f, -2.59f)
                verticalLineToRelative(0.59f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(2.89f)
                curveToRelative(-0.28f, 0.97f, -0.02f, 2.01f, 0.7f, 2.74f)
                lineToRelative(2.45f, 2.45f)
                curveToRelative(0.54f, 0.54f, 1.25f, 0.81f, 1.96f, 0.81f)
                reflectiveCurveToRelative(1.42f, -0.27f, 1.96f, -0.81f)
                lineToRelative(2.45f, -2.45f)
                curveToRelative(0.72f, -0.72f, 0.99f, -1.77f, 0.7f, -2.74f)
                horizontalLineToRelative(2.89f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _diagramNext!!
    }

private var _diagramNext: ImageVector? = null
