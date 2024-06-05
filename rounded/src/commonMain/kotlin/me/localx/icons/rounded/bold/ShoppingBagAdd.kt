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

public val Icons.Bold.ShoppingBagAdd: ImageVector
    get() {
        if (_shoppingBagAdd != null) {
            return _shoppingBagAdd!!
        }
        _shoppingBagAdd = Builder(name = "ShoppingBagAdd", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 6.0f)
                horizontalLineTo(18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineTo(3.5f)
                arcTo(3.543f, 3.543f, 0.0f, false, false, 0.0f, 9.5f)
                verticalLineToRelative(9.0f)
                arcTo(5.549f, 5.549f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-6.0f)
                arcTo(2.476f, 2.476f, 0.0f, false, true, 3.0f, 18.5f)
                verticalLineToRelative(-9.0f)
                arcTo(0.472f, 0.472f, 0.0f, false, true, 3.5f, 9.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(1.5f)
                arcTo(1.538f, 1.538f, 0.0f, false, false, 7.5f, 12.0f)
                arcTo(1.538f, 1.538f, 0.0f, false, false, 9.0f, 10.5f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.472f, 0.472f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcTo(3.543f, 3.543f, 0.0f, false, false, 20.5f, 6.0f)
                close()
                moveTo(9.0f, 6.0f)
                horizontalLineTo(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _shoppingBagAdd!!
    }

private var _shoppingBagAdd: ImageVector? = null
