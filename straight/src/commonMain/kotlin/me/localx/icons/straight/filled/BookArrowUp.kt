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

public val Icons.Filled.BookArrowUp: ImageVector
    get() {
        if (_bookArrowUp != null) {
            return _bookArrowUp!!
        }
        _bookArrowUp = Builder(name = "BookArrowUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 17.999f)
                curveToRelative(-0.738f, -0.001f, -1.451f, 0.271f, -2.0f, 0.765f)
                verticalLineTo(2.999f)
                curveTo(2.0f, 1.342f, 3.343f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(17.999f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 0.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-7.008f)
                lineToRelative(-2.291f, 2.302f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.298f, -3.299f)
                curveToRelative(0.776f, -0.775f, 2.037f, -0.775f, 2.812f, 0.0f)
                lineToRelative(3.299f, 3.299f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.291f, -2.291f)
                verticalLineToRelative(6.996f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(4.0f, 20.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _bookArrowUp!!
    }

private var _bookArrowUp: ImageVector? = null
