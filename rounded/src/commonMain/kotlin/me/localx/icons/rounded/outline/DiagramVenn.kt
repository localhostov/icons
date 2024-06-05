package me.localx.icons.rounded.outline

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

public val Icons.Outline.DiagramVenn: ImageVector
    get() {
        if (_diagramVenn != null) {
            return _diagramVenn!!
        }
        _diagramVenn = Builder(name = "DiagramVenn", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveToRelative(-1.46f, 0.0f, -2.82f, 0.39f, -4.0f, 1.07f)
                curveToRelative(-1.18f, -0.68f, -2.54f, -1.07f, -4.0f, -1.07f)
                curveTo(3.59f, 4.0f, 0.0f, 7.59f, 0.0f, 12.0f)
                reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f)
                curveToRelative(1.46f, 0.0f, 2.82f, -0.39f, 4.0f, -1.07f)
                curveToRelative(1.18f, 0.68f, 2.54f, 1.07f, 4.0f, 1.07f)
                curveToRelative(4.41f, 0.0f, 8.0f, -3.59f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(10.81f, 15.0f)
                horizontalLineToRelative(2.39f)
                curveToRelative(-0.32f, 0.55f, -0.72f, 1.05f, -1.19f, 1.47f)
                curveToRelative(-0.47f, -0.42f, -0.88f, -0.92f, -1.19f, -1.47f)
                close()
                moveTo(12.0f, 7.53f)
                curveToRelative(0.47f, 0.42f, 0.88f, 0.92f, 1.19f, 1.47f)
                horizontalLineToRelative(-2.39f)
                curveToRelative(0.32f, -0.55f, 0.72f, -1.05f, 1.19f, -1.47f)
                close()
                moveTo(10.0f, 12.0f)
                curveToRelative(0.0f, -0.34f, 0.03f, -0.67f, 0.08f, -1.0f)
                horizontalLineToRelative(3.83f)
                curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1.0f)
                reflectiveCurveToRelative(-0.03f, 0.67f, -0.08f, 1.0f)
                horizontalLineToRelative(-3.83f)
                curveToRelative(-0.05f, -0.33f, -0.08f, -0.66f, -0.08f, -1.0f)
                close()
                moveTo(2.0f, 12.0f)
                curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f)
                curveToRelative(0.8f, 0.0f, 1.56f, 0.16f, 2.25f, 0.44f)
                curveToRelative(-1.39f, 1.44f, -2.25f, 3.4f, -2.25f, 5.56f)
                reflectiveCurveToRelative(0.86f, 4.12f, 2.25f, 5.56f)
                curveToRelative(-0.7f, 0.28f, -1.46f, 0.44f, -2.25f, 0.44f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _diagramVenn!!
    }

private var _diagramVenn: ImageVector? = null
