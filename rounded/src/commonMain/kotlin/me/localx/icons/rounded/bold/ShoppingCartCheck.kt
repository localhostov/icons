package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.ShoppingCartCheck: ImageVector
    get() {
        if (_shoppingCartCheck != null) {
            return _shoppingCartCheck!!
        }
        _shoppingCartCheck = Builder(name = "ShoppingCartCheck", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 22.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 22.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.75f, 13.163f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.34f, 15.0f)
                horizontalLineTo(7.217f)
                arcToRelative(0.329f, 0.329f, 0.0f, false, true, -0.325f, -0.3f)
                lineTo(6.036f, 8.0f)
                horizontalLineTo(9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 6.5f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 5.0f)
                horizontalLineTo(5.653f)
                lineTo(5.391f, 2.939f)
                arcTo(3.327f, 3.327f, 0.0f, false, false, 2.087f, 0.0f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(0.587f)
                arcToRelative(0.329f, 0.329f, 0.0f, false, true, 0.325f, 0.3f)
                lineToRelative(1.5f, 11.76f)
                arcTo(3.327f, 3.327f, 0.0f, false, false, 7.217f, 18.0f)
                horizontalLineTo(17.339f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.3f, -4.042f)
                lineToRelative(0.016f, -0.06f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.213f, 12.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.446f, 1.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.413f, 2.487f)
                lineTo(17.119f, 6.781f)
                lineTo(16.268f, 5.9f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.163f, 2.079f)
                lineToRelative(1.263f, 1.314f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 1.7f, 0.754f)
                horizontalLineToRelative(0.04f)
                arcToRelative(2.407f, 2.407f, 0.0f, false, false, 1.691f, -0.7f)
                lineToRelative(4.734f, -4.735f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.121f, -2.121f)
                close()
            }
        }
        .build()
        return _shoppingCartCheck!!
    }

private var _shoppingCartCheck: ImageVector? = null
