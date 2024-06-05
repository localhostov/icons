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

public val Icons.Outline.Cars: ImageVector
    get() {
        if (_cars != null) {
            return _cars!!
        }
        _cars = Builder(name = "Cars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.732f)
                arcToRelative(10.965f, 10.965f, 0.0f, false, false, -0.641f, -3.7f)
                lineTo(21.916f, 9.991f)
                arcTo(3.006f, 3.006f, 0.0f, false, false, 19.09f, 8.0f)
                horizontalLineTo(11.91f)
                arcTo(3.006f, 3.006f, 0.0f, false, false, 9.084f, 9.991f)
                lineTo(7.641f, 14.033f)
                arcTo(10.955f, 10.955f, 0.0f, false, false, 7.0f, 17.732f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(11.91f, 10.0f)
                horizontalLineToRelative(7.18f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.942f, 0.664f)
                lineTo(21.224f, 14.0f)
                horizontalLineTo(9.776f)
                lineToRelative(1.192f, -3.336f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.91f, 10.0f)
                close()
                moveTo(22.0f, 20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.732f)
                arcTo(8.959f, 8.959f, 0.0f, false, true, 9.168f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(1.832f)
                arcTo(8.959f, 8.959f, 0.0f, false, true, 22.0f, 17.732f)
                close()
                moveTo(4.0f, 9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.174f)
                arcTo(9.044f, 9.044f, 0.0f, false, false, 2.0f, 9.732f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(0.0f)
                curveToRelative(0.06f, -2.3f, -0.269f, -5.811f, 0.641f, -7.967f)
                lineTo(2.084f, 1.991f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.909f, 0.0f)
                horizontalLineToRelative(7.182f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.825f, 1.991f)
                lineTo(16.348f, 6.0f)
                horizontalLineTo(14.224f)
                lineTo(13.032f, 2.664f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.091f, 2.0f)
                horizontalLineTo(4.91f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.942f, 0.664f)
                lineTo(2.776f, 6.0f)
                horizontalLineTo(11.91f)
                arcTo(5.008f, 5.008f, 0.0f, false, false, 7.915f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 9.0f)
                close()
            }
        }
        .build()
        return _cars!!
    }

private var _cars: ImageVector? = null
