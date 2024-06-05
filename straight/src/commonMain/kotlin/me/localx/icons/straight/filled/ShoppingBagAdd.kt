package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.ShoppingBagAdd: ImageVector
    get() {
        if (_shoppingBagAdd != null) {
            return _shoppingBagAdd!!
        }
        _shoppingBagAdd = Builder(name = "ShoppingBagAdd", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.0f, -4.472f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(16.683f)
                arcTo(5.994f, 5.994f, 0.0f, false, true, 14.0f, 19.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                horizontalLineTo(8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 18.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _shoppingBagAdd!!
    }

private var _shoppingBagAdd: ImageVector? = null
