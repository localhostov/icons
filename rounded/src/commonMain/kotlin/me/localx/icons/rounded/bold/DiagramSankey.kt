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

public val Icons.Bold.DiagramSankey: ImageVector
    get() {
        if (_diagramSankey != null) {
            return _diagramSankey!!
        }
        _diagramSankey = Builder(name = "DiagramSankey", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.84f)
                curveToRelative(0.67f, 0.0f, 1.3f, -0.26f, 1.77f, -0.73f)
                lineToRelative(1.66f, -1.66f)
                curveToRelative(1.04f, -1.04f, 2.42f, -1.61f, 3.89f, -1.61f)
                horizontalLineToRelative(5.84f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.84f)
                curveToRelative(-0.67f, 0.0f, -1.3f, 0.26f, -1.77f, 0.73f)
                lineToRelative(-1.66f, 1.66f)
                curveToRelative(-1.04f, 1.04f, -2.42f, 1.61f, -3.89f, 1.61f)
                lineTo(1.5f, 7.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 21.0f)
                lineTo(13.66f, 21.0f)
                curveToRelative(-0.67f, 0.0f, -1.3f, -0.26f, -1.77f, -0.73f)
                lineToRelative(-4.66f, -4.66f)
                curveToRelative(-1.04f, -1.04f, -2.42f, -1.61f, -3.89f, -1.61f)
                lineTo(1.5f, 14.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.84f)
                curveToRelative(0.67f, 0.0f, 1.3f, 0.26f, 1.77f, 0.73f)
                lineToRelative(4.66f, 4.66f)
                curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
                horizontalLineToRelative(8.84f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 10.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(1.5f, 9.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.88f)
                lineToRelative(4.39f, 4.39f)
                curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
                horizontalLineToRelative(4.84f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-4.84f)
                curveToRelative(-0.67f, 0.0f, -1.3f, -0.26f, -1.77f, -0.73f)
                lineToRelative(-2.27f, -2.27f)
                horizontalLineToRelative(8.88f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _diagramSankey!!
    }

private var _diagramSankey: ImageVector? = null
