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
                moveTo(22.813f, 9.583f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.8f, 3.0f)
                horizontalLineTo(4.242f)
                lineTo(4.2f, 2.648f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 1.222f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(1.222f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineTo(3.8f, 16.351f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.778f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.778f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.884f)
                lineTo(5.654f, 15.0f)
                horizontalLineTo(21.836f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.111f, 9.542f)
                horizontalLineToRelative(-0.033f)
                arcToRelative(1.872f, 1.872f, 0.0f, false, true, -1.345f, -0.6f)
                lineToRelative(-2.306f, -2.4f)
                lineTo(14.868f, 5.16f)
                lineTo(17.112f, 7.5f)
                lineTo(21.3f, 3.3f)
                lineToRelative(1.414f, 1.414f)
                lineTo(18.446f, 8.989f)
                arcTo(1.873f, 1.873f, 0.0f, false, true, 17.111f, 9.542f)
                close()
            }
        }
        .build()
        return _shoppingCartCheck!!
    }

private var _shoppingCartCheck: ImageVector? = null
