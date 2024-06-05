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
                moveTo(24.0f, 0.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.83f)
                curveToRelative(-0.13f, 0.0f, -0.26f, 0.05f, -0.35f, 0.15f)
                lineToRelative(-3.85f, 3.85f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(10.38f)
                lineToRelative(2.97f, -2.97f)
                curveToRelative(0.66f, -0.66f, 1.54f, -1.03f, 2.47f, -1.03f)
                horizontalLineToRelative(8.17f)
                close()
                moveTo(12.47f, 20.85f)
                lineToRelative(-6.85f, -6.85f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.38f)
                lineToRelative(5.97f, 5.97f)
                curveToRelative(0.66f, 0.66f, 1.54f, 1.03f, 2.47f, 1.03f)
                horizontalLineToRelative(11.17f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(12.83f)
                curveToRelative(-0.13f, 0.0f, -0.26f, -0.05f, -0.35f, -0.15f)
                close()
                moveTo(0.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(9.38f)
                lineToRelative(4.97f, 4.97f)
                curveToRelative(0.66f, 0.66f, 1.54f, 1.03f, 2.47f, 1.03f)
                horizontalLineToRelative(7.17f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-7.17f)
                curveToRelative(-0.13f, 0.0f, -0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-2.85f, -2.85f)
                horizontalLineToRelative(10.38f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _diagramSankey!!
    }

private var _diagramSankey: ImageVector? = null
