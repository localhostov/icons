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

public val Icons.Bold.ArrowUpRightAndArrowDownLeftFromCenter: ImageVector
    get() {
        if (_arrowUpRightAndArrowDownLeftFromCenter != null) {
            return _arrowUpRightAndArrowDownLeftFromCenter!!
        }
        _arrowUpRightAndArrowDownLeftFromCenter = Builder(name =
                "ArrowUpRightAndArrowDownLeftFromCenter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.061f, 15.061f)
                lineToRelative(-5.939f, 5.939f)
                horizontalLineToRelative(3.879f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(2.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(3.879f)
                lineToRelative(5.939f, -5.939f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(21.5f, 0.0f)
                horizontalLineToRelative(-6.5f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(3.879f)
                lineToRelative(-5.939f, 5.939f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(5.939f, -5.939f)
                verticalLineToRelative(3.879f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(2.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _arrowUpRightAndArrowDownLeftFromCenter!!
    }

private var _arrowUpRightAndArrowDownLeftFromCenter: ImageVector? = null
