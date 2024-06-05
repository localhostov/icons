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

public val Icons.Outline.ArrowUpRightAndArrowDownLeftFromCenter: ImageVector
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
                moveTo(10.207f, 15.207f)
                lineToRelative(-6.793f, 6.793f)
                horizontalLineToRelative(4.586f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(4.586f)
                lineToRelative(6.793f, -6.793f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(22.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(4.586f)
                lineToRelative(-6.793f, 6.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(6.793f, -6.793f)
                verticalLineToRelative(4.586f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _arrowUpRightAndArrowDownLeftFromCenter!!
    }

private var _arrowUpRightAndArrowDownLeftFromCenter: ImageVector? = null
