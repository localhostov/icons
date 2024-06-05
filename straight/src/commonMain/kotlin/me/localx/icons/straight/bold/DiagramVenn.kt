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

public val Icons.Bold.DiagramVenn: ImageVector
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
                moveTo(11.0f, 12.0f)
                curveToRelative(0.0f, -1.12f, 0.37f, -2.16f, 1.0f, -3.0f)
                curveToRelative(0.63f, 0.84f, 1.0f, 1.87f, 1.0f, 3.0f)
                reflectiveCurveToRelative(-0.37f, 2.16f, -1.0f, 3.0f)
                curveToRelative(-0.63f, -0.84f, -1.0f, -1.87f, -1.0f, -3.0f)
                close()
                moveTo(3.0f, 12.0f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                curveToRelative(0.55f, 0.0f, 1.07f, 0.09f, 1.57f, 0.25f)
                curveToRelative(-0.98f, 1.33f, -1.57f, 2.97f, -1.57f, 4.75f)
                reflectiveCurveToRelative(0.58f, 3.42f, 1.57f, 4.75f)
                curveToRelative(-0.49f, 0.16f, -1.02f, 0.25f, -1.57f, 0.25f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _diagramVenn!!
    }

private var _diagramVenn: ImageVector? = null
