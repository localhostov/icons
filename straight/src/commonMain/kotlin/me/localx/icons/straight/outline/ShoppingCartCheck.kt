package me.localx.icons.straight.outline

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

public val Icons.Outline.ShoppingCartCheck: ImageVector
    get() {
        if (_shoppingCartCheck != null) {
            return _shoppingCartCheck!!
        }
        _shoppingCartCheck = Builder(name = "ShoppingCartCheck", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.164f, 13.0f)
                horizontalLineTo(5.419f)
                lineTo(4.478f, 5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.0f)
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
                lineToRelative(0.9f, -5.0f)
                horizontalLineTo(20.705f)
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
                moveTo(17.078f, 8.542f)
                horizontalLineToRelative(0.033f)
                arcToRelative(1.873f, 1.873f, 0.0f, false, false, 1.335f, -0.553f)
                lineToRelative(5.261f, -5.261f)
                lineTo(22.293f, 1.314f)
                lineTo(17.112f, 6.5f)
                lineTo(14.868f, 4.16f)
                lineTo(13.427f, 5.546f)
                lineToRelative(2.306f, 2.4f)
                arcTo(1.872f, 1.872f, 0.0f, false, false, 17.078f, 8.542f)
                close()
            }
        }
        .build()
        return _shoppingCartCheck!!
    }

private var _shoppingCartCheck: ImageVector? = null
