package me.localx.icons.straight.filled

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

public val Icons.Filled.DiagramSankey: ImageVector
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
                verticalLineTo(2.0f)
                horizontalLineTo(15.83f)
                curveToRelative(-0.26f, 0.0f, -0.52f, 0.11f, -0.71f, 0.29f)
                lineToRelative(-4.71f, 4.71f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(9.59f)
                lineTo(13.71f, 0.88f)
                curveToRelative(0.57f, -0.57f, 1.32f, -0.88f, 2.12f, -0.88f)
                horizontalLineToRelative(8.17f)
                close()
                moveTo(12.12f, 21.71f)
                lineToRelative(-6.71f, -6.71f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.59f)
                lineToRelative(6.12f, 6.12f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                horizontalLineToRelative(11.17f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(12.83f)
                curveToRelative(-0.26f, 0.0f, -0.52f, -0.11f, -0.71f, -0.29f)
                close()
                moveTo(0.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.59f)
                lineToRelative(5.12f, 5.12f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                horizontalLineToRelative(7.17f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.17f)
                curveToRelative(-0.26f, 0.0f, -0.52f, -0.11f, -0.71f, -0.29f)
                lineToRelative(-3.71f, -3.71f)
                horizontalLineToRelative(11.59f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _diagramSankey!!
    }

private var _diagramSankey: ImageVector? = null
