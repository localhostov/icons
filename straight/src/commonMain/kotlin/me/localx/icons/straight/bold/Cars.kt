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

public val Icons.Bold.Cars: ImageVector
    get() {
        if (_cars != null) {
            return _cars!!
        }
        _cars = Builder(name = "Cars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 12.0f)
                horizontalLineTo(6.034f)
                lineToRelative(-0.248f, 0.692f)
                arcTo(13.482f, 13.482f, 0.0f, false, false, 5.01f, 17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(10.233f)
                arcTo(11.508f, 11.508f, 0.0f, false, true, 0.67f, 6.365f)
                lineTo(2.113f, 2.323f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.409f, 0.0f)
                horizontalLineToRelative(6.182f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.3f, 2.323f)
                lineTo(15.843f, 5.0f)
                horizontalLineTo(12.657f)
                lineToRelative(-0.6f, -1.668f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 11.59f, 3.0f)
                horizontalLineTo(5.41f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.472f, 0.332f)
                lineTo(3.985f, 6.0f)
                horizontalLineTo(9.253f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 7.23f, 8.65f)
                lineTo(7.105f, 9.0f)
                horizontalLineTo(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(24.0f, 17.232f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.232f)
                arcToRelative(11.482f, 11.482f, 0.0f, false, true, 0.67f, -3.867f)
                lineTo(9.113f, 9.323f)
                arcTo(3.508f, 3.508f, 0.0f, false, true, 12.41f, 7.0f)
                horizontalLineToRelative(6.18f)
                arcToRelative(3.508f, 3.508f, 0.0f, false, true, 3.3f, 2.323f)
                lineToRelative(1.443f, 4.041f)
                arcTo(11.492f, 11.492f, 0.0f, false, true, 24.0f, 17.232f)
                close()
                moveTo(13.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 11.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.0f, 17.5f)
                close()
                moveTo(20.015f, 13.0f)
                lineToRelative(-0.953f, -2.668f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 18.59f, 10.0f)
                horizontalLineTo(12.41f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.472f, 0.332f)
                lineTo(10.985f, 13.0f)
                close()
                moveTo(21.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 19.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 17.5f)
                close()
            }
        }
        .build()
        return _cars!!
    }

private var _cars: ImageVector? = null
