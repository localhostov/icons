package me.localx.icons.rounded.outline

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

public val Icons.Outline.ShoppingCartAdd: ImageVector
    get() {
        if (_shoppingCartAdd != null) {
            return _shoppingCartAdd!!
        }
        _shoppingCartAdd = Builder(name = "ShoppingCartAdd", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(23.0f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.771f, 9.726f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -1.162f, 0.806f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.657f, 13.0f)
                horizontalLineTo(5.418f)
                lineToRelative(-0.94f, -8.0f)
                horizontalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(4.242f)
                lineTo(4.2f, 2.648f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 1.222f, 0.0f)
                horizontalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 2.0f)
                horizontalLineToRelative(0.222f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineToRelative(1.376f, 11.7f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 8.557f, 19.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(8.557f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.829f, -2.0f)
                horizontalLineTo(17.657f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.921f, -4.112f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.771f, 9.726f)
                close()
            }
        }
        .build()
        return _shoppingCartAdd!!
    }

private var _shoppingCartAdd: ImageVector? = null
