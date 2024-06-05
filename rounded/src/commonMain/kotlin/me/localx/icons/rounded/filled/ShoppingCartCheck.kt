package me.localx.icons.rounded.filled

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

public val Icons.Filled.ShoppingCartCheck: ImageVector
    get() {
        if (_shoppingCartCheck != null) {
            return _shoppingCartCheck!!
        }
        _shoppingCartCheck = Builder(name = "ShoppingCartCheck", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                arcToRelative(5.993f, 5.993f, 0.0f, false, true, -5.191f, -9.0f)
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
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.821f, -2.0f)
                horizontalLineTo(17.657f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.921f, -4.113f)
                lineToRelative(0.238f, -1.319f)
                arcTo(5.984f, 5.984f, 0.0f, false, true, 18.0f, 12.0f)
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.733f, 8.946f)
                arcToRelative(1.872f, 1.872f, 0.0f, false, false, 1.345f, 0.6f)
                horizontalLineToRelative(0.033f)
                arcToRelative(1.873f, 1.873f, 0.0f, false, false, 1.335f, -0.553f)
                lineToRelative(4.272f, -4.272f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 21.3f, 3.3f)
                lineTo(17.113f, 7.494f)
                lineTo(15.879f, 6.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.463f, 1.366f)
                close()
            }
        }
        .build()
        return _shoppingCartCheck!!
    }

private var _shoppingCartCheck: ImageVector? = null
