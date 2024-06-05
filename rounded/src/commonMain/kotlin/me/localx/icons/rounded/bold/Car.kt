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

public val Icons.Bold.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.005f, 3.5f)
                arcToRelative(5.335f, 5.335f, 0.0f, false, false, -5.0f, -3.5f)
                horizontalLineTo(7.992f)
                arcTo(5.335f, 5.335f, 0.0f, false, false, 3.0f, 3.5f)
                lineTo(0.416f, 10.59f)
                arcTo(6.912f, 6.912f, 0.0f, false, false, 0.0f, 12.954f)
                verticalLineToRelative(2.728f)
                arcToRelative(5.307f, 5.307f, 0.0f, false, false, 3.0f, 4.763f)
                verticalLineTo(22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineTo(20.445f)
                arcToRelative(5.307f, 5.307f, 0.0f, false, false, 3.0f, -4.763f)
                verticalLineTo(12.954f)
                arcToRelative(6.912f, 6.912f, 0.0f, false, false, -0.416f, -2.364f)
                close()
                moveTo(5.813f, 4.526f)
                arcTo(2.327f, 2.327f, 0.0f, false, true, 7.992f, 3.0f)
                horizontalLineToRelative(8.016f)
                arcToRelative(2.327f, 2.327f, 0.0f, false, true, 2.179f, 1.526f)
                lineTo(20.54f, 11.0f)
                horizontalLineTo(3.46f)
                close()
                moveTo(18.682f, 18.0f)
                horizontalLineTo(5.318f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 3.0f, 15.682f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.682f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 18.682f, 18.0f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
