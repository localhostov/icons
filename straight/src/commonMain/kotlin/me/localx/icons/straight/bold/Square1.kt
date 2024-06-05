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

public val Icons.Bold.Square1: ImageVector
    get() {
        if (_square1 != null) {
            return _square1!!
        }
        _square1 = Builder(name = "Square1", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineTo(20.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineTo(24.0f)
                close()
                moveTo(3.0f, 21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineTo(21.0f)
                close()
                moveTo(14.0f, 5.0f)
                horizontalLineToRelative(-2.219f)
                lineToRelative(-3.854f, 3.953f)
                lineToRelative(2.147f, 2.095f)
                lineToRelative(0.926f, -0.95f)
                verticalLineToRelative(8.902f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _square1!!
    }

private var _square1: ImageVector? = null
