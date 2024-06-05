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

public val Icons.Outline.Square1: ImageVector
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
                verticalLineTo(3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineTo(21.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineTo(24.0f)
                close()
                moveTo(2.0f, 22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(13.0f, 6.0f)
                horizontalLineToRelative(-1.509f)
                lineToRelative(-3.507f, 3.602f)
                lineToRelative(1.433f, 1.396f)
                lineToRelative(1.583f, -1.626f)
                verticalLineToRelative(8.629f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _square1!!
    }

private var _square1: ImageVector? = null
