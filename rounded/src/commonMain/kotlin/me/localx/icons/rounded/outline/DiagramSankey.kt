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

public val Icons.Outline.DiagramSankey: ImageVector
    get() {
        if (_diagramSankey != null) {
            return _diagramSankey!!
        }
        _diagramSankey = Builder(name = "DiagramSankey", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 6.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.34f)
                curveToRelative(0.8f, 0.0f, 1.56f, -0.31f, 2.12f, -0.88f)
                lineToRelative(2.66f, -2.66f)
                curveToRelative(0.94f, -0.94f, 2.2f, -1.46f, 3.54f, -1.46f)
                horizontalLineToRelative(6.34f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-6.34f)
                curveToRelative(-0.8f, 0.0f, -1.56f, 0.31f, -2.12f, 0.88f)
                lineToRelative(-2.66f, 2.66f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                lineTo(1.0f, 7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                close()
                moveTo(23.0f, 22.0f)
                lineTo(13.66f, 22.0f)
                curveToRelative(-0.8f, 0.0f, -1.56f, -0.31f, -2.12f, -0.88f)
                lineToRelative(-4.66f, -4.66f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.46f, -3.54f, -1.46f)
                lineTo(1.0f, 15.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                lineTo(3.34f, 17.0f)
                curveToRelative(0.8f, 0.0f, 1.56f, 0.31f, 2.12f, 0.88f)
                lineToRelative(4.66f, 4.66f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                horizontalLineToRelative(9.34f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(24.0f, 11.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(1.0f, 10.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                lineTo(9.59f, 12.0f)
                lineToRelative(4.54f, 4.54f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                horizontalLineToRelative(5.34f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-5.34f)
                curveToRelative(-0.8f, 0.0f, -1.56f, -0.31f, -2.12f, -0.88f)
                lineToRelative(-3.12f, -3.12f)
                horizontalLineToRelative(10.59f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _diagramSankey!!
    }

private var _diagramSankey: ImageVector? = null
