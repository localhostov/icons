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

public val Icons.Outline.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.713f, 4.077f)
                arcTo(2.993f, 2.993f, 0.0f, false, false, 20.41f, 3.0f)
                horizontalLineTo(4.242f)
                lineTo(4.2f, 2.649f)
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
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.82f, -2.0f)
                horizontalLineToRelative(11.92f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.921f, -4.113f)
                lineToRelative(0.785f, -4.354f)
                arcTo(2.994f, 2.994f, 0.0f, false, false, 22.713f, 4.077f)
                close()
                moveTo(21.4f, 6.178f)
                lineToRelative(-0.786f, 4.354f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.657f, 13.0f)
                horizontalLineTo(5.419f)
                lineTo(4.478f, 5.0f)
                horizontalLineTo(20.41f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.4f, 6.178f)
                close()
            }
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
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
