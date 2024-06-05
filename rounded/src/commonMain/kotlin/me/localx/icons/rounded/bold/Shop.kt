package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Shop: ImageVector
    get() {
        if (_shop != null) {
            return _shop!!
        }
        _shop = Builder(name = "Shop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.091f)
                lineTo(22.751f, 4.307f)
                arcTo(5.466f, 5.466f, 0.0f, false, false, 17.382f, 0.0f)
                horizontalLineTo(6.618f)
                arcTo(5.466f, 5.466f, 0.0f, false, false, 1.249f, 4.307f)
                lineTo(0.036f, 9.766f)
                lineTo(0.0f, 11.046f)
                arcToRelative(4.321f, 4.321f, 0.0f, false, false, 1.0f, 2.745f)
                verticalLineTo(18.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 6.5f, 24.0f)
                horizontalLineToRelative(11.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 23.0f, 18.5f)
                verticalLineTo(13.791f)
                arcToRelative(4.321f, 4.321f, 0.0f, false, false, 1.0f, -2.745f)
                close()
                moveTo(3.0f, 10.256f)
                lineToRelative(1.177f, -5.3f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.618f, 3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 6.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 4.5f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 6.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 4.5f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(0.382f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.441f, 1.958f)
                lineTo(21.0f, 10.256f)
                verticalLineToRelative(0.79f)
                arcToRelative(1.364f, 1.364f, 0.0f, false, true, -2.727f, 0.0f)
                arcToRelative(2.455f, 2.455f, 0.0f, true, false, -4.909f, 0.0f)
                arcToRelative(1.364f, 1.364f, 0.0f, false, true, -2.728f, 0.0f)
                arcToRelative(2.455f, 2.455f, 0.0f, true, false, -4.909f, 0.0f)
                arcToRelative(1.364f, 1.364f, 0.0f, false, true, -2.727f, 0.0f)
                close()
                moveTo(17.5f, 21.0f)
                horizontalLineTo(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 18.5f)
                verticalLineTo(15.372f)
                curveToRelative(0.122f, 0.011f, 0.239f, 0.037f, 0.364f, 0.037f)
                arcToRelative(4.367f, 4.367f, 0.0f, false, false, 3.818f, -2.253f)
                arcToRelative(4.362f, 4.362f, 0.0f, false, false, 7.636f, 0.0f)
                arcToRelative(4.367f, 4.367f, 0.0f, false, false, 3.818f, 2.253f)
                curveToRelative(0.125f, 0.0f, 0.242f, -0.026f, 0.364f, -0.037f)
                verticalLineTo(18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.5f, 21.0f)
                close()
            }
        }
        .build()
        return _shop!!
    }

private var _shop: ImageVector? = null
