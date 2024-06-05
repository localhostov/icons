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

public val Icons.Filled.Shop: ImageVector
    get() {
        if (_shop != null) {
            return _shop!!
        }
        _shop = Builder(name = "Shop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 17.0f)
                arcToRelative(5.994f, 5.994f, 0.0f, false, true, -3.0f, -0.806f)
                arcTo(5.994f, 5.994f, 0.0f, false, true, 13.0f, 17.0f)
                horizontalLineTo(11.0f)
                arcToRelative(5.938f, 5.938f, 0.0f, false, true, -3.0f, -0.818f)
                arcTo(5.936f, 5.936f, 0.0f, false, true, 5.0f, 17.0f)
                horizontalLineTo(4.0f)
                arcToRelative(5.949f, 5.949f, 0.0f, false, true, -3.0f, -0.813f)
                verticalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(16.188f)
                arcTo(5.958f, 5.958f, 0.0f, false, true, 20.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 0.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(2.2f)
                lineTo(0.024f, 9.783f)
                lineTo(0.0f, 11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.975f, 3.975f, 0.0f, false, false, 3.0f, -1.382f)
                arcTo(3.975f, 3.975f, 0.0f, false, false, 11.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, false, 3.0f, -1.357f)
                arcTo(3.99f, 3.99f, 0.0f, false, false, 19.0f, 15.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(10.0f)
                lineTo(21.8f, 0.0f)
                close()
            }
        }
        .build()
        return _shop!!
    }

private var _shop: ImageVector? = null
