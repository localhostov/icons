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

public val Icons.Bold.Taxi: ImageVector
    get() {
        if (_taxi != null) {
            return _taxi!!
        }
        _taxi = Builder(name = "Taxi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                horizontalLineTo(21.032f)
                lineToRelative(-0.779f, -2.63f)
                arcTo(5.459f, 5.459f, 0.0f, false, false, 15.6f, 2.048f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.117f, 0.0f)
                horizontalLineToRelative(-0.234f)
                arcTo(3.993f, 3.993f, 0.0f, false, false, 8.4f, 2.044f)
                arcTo(5.467f, 5.467f, 0.0f, false, false, 3.688f, 5.889f)
                lineTo(2.916f, 8.5f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(0.528f)
                lineToRelative(-0.477f, 1.628f)
                arcTo(4.461f, 4.461f, 0.0f, false, false, 3.0f, 20.724f)
                verticalLineTo(22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineTo(20.724f)
                arcToRelative(4.46f, 4.46f, 0.0f, false, false, 1.386f, -7.648f)
                verticalLineToRelative(0.0f)
                lineTo(21.92f, 11.5f)
                horizontalLineToRelative(0.58f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.0f, 10.0f)
                close()
                moveTo(6.56f, 6.758f)
                arcTo(2.487f, 2.487f, 0.0f, false, true, 8.947f, 5.0f)
                horizontalLineTo(15.0f)
                arcToRelative(2.482f, 2.482f, 0.0f, false, true, 2.382f, 1.74f)
                lineTo(18.939f, 12.0f)
                horizontalLineTo(5.008f)
                close()
                moveTo(19.5f, 18.0f)
                horizontalLineTo(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _taxi!!
    }

private var _taxi: ImageVector? = null
