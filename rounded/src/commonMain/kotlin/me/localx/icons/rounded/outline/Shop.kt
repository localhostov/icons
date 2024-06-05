package me.localx.icons.rounded.outline

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

public val Icons.Outline.Shop: ImageVector
    get() {
        if (_shop != null) {
            return _shop!!
        }
        _shop = Builder(name = "Shop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.0f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, false, -0.024f, -0.217f)
                lineToRelative(-1.3f, -5.868f)
                arcTo(4.968f, 4.968f, 0.0f, false, false, 17.792f, 0.0f)
                horizontalLineTo(6.208f)
                arcToRelative(4.968f, 4.968f, 0.0f, false, false, -4.88f, 3.915f)
                lineTo(0.024f, 9.783f)
                arcTo(0.988f, 0.988f, 0.0f, false, false, 0.0f, 10.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.984f, 3.984f, 0.0f, false, false, 1.0f, 2.643f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(18.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(13.643f)
                arcTo(3.984f, 3.984f, 0.0f, false, false, 24.0f, 11.0f)
                close()
                moveTo(2.0f, 10.109f)
                lineToRelative(1.28f, -5.76f)
                arcTo(2.982f, 2.982f, 0.0f, false, true, 6.208f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 5.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(0.792f)
                arcTo(2.982f, 2.982f, 0.0f, false, true, 20.72f, 4.349f)
                lineTo(22.0f, 10.109f)
                verticalLineTo(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(18.0f, 22.0f)
                horizontalLineTo(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(14.873f)
                arcTo(3.978f, 3.978f, 0.0f, false, false, 4.0f, 15.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, false, 3.0f, -1.357f)
                arcTo(3.99f, 3.99f, 0.0f, false, false, 11.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, false, 3.0f, -1.357f)
                arcTo(3.99f, 3.99f, 0.0f, false, false, 19.0f, 15.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.978f, 3.978f, 0.0f, false, false, 1.0f, -0.127f)
                verticalLineTo(19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 22.0f)
                close()
            }
        }
        .build()
        return _shop!!
    }

private var _shop: ImageVector? = null
