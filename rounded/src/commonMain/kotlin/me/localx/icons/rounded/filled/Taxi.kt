package me.localx.icons.rounded.filled

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

public val Icons.Filled.Taxi: ImageVector
    get() {
        if (_taxi != null) {
            return _taxi!!
        }
        _taxi = Builder(name = "Taxi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.57f, 2.0f)
                horizontalLineTo(8.43f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, true, 3.453f, -2.0f)
                horizontalLineToRelative(0.234f)
                arcTo(3.993f, 3.993f, 0.0f, false, true, 15.57f, 2.0f)
                close()
                moveTo(20.5f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.5f)
                arcTo(3.492f, 3.492f, 0.0f, false, false, 3.0f, 20.949f)
                verticalLineTo(22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineTo(20.951f)
                arcToRelative(3.458f, 3.458f, 0.0f, false, false, 3.0f, -3.421f)
                verticalLineTo(17.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 14.0f)
                close()
                moveTo(1.628f, 12.491f)
                arcTo(5.96f, 5.96f, 0.0f, false, true, 4.0f, 12.0f)
                horizontalLineTo(20.0f)
                arcToRelative(5.96f, 5.96f, 0.0f, false, true, 2.372f, 0.491f)
                lineTo(20.828f, 7.519f)
                arcTo(4.974f, 4.974f, 0.0f, false, false, 16.053f, 4.0f)
                horizontalLineTo(7.947f)
                arcTo(4.974f, 4.974f, 0.0f, false, false, 3.172f, 7.518f)
                close()
            }
        }
        .build()
        return _taxi!!
    }

private var _taxi: ImageVector? = null
