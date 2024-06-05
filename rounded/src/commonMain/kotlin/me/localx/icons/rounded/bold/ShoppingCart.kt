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

public val Icons.Bold.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(22.984f, 6.018f)
                arcTo(3.675f, 3.675f, 0.0f, false, false, 20.364f, 5.0f)
                horizontalLineTo(5.654f)
                lineTo(5.391f, 2.938f)
                arcTo(3.328f, 3.328f, 0.0f, false, false, 2.087f, 0.0f)
                horizontalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineTo(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 3.0f)
                horizontalLineToRelative(0.587f)
                arcToRelative(0.331f, 0.331f, 0.0f, false, true, 0.326f, 0.3f)
                lineToRelative(1.5f, 11.759f)
                arcTo(3.327f, 3.327f, 0.0f, false, false, 7.217f, 18.0f)
                horizontalLineTo(17.339f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.3f, -4.042f)
                lineToRelative(1.246f, -4.531f)
                arcTo(3.489f, 3.489f, 0.0f, false, false, 22.984f, 6.018f)
                close()
                moveTo(19.75f, 13.163f)
                arcTo(2.508f, 2.508f, 0.0f, false, true, 17.339f, 15.0f)
                horizontalLineTo(7.217f)
                arcToRelative(0.329f, 0.329f, 0.0f, false, true, -0.325f, -0.3f)
                lineTo(6.037f, 8.0f)
                horizontalLineTo(20.514f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 21.0f, 8.632f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
