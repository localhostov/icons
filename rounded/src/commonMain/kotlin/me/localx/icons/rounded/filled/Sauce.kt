package me.localx.icons.rounded.filled

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

public val Icons.Filled.Sauce: ImageVector
    get() {
        if (_sauce != null) {
            return _sauce!!
        }
        _sauce = Builder(name = "Sauce", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.974f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(20.0f, 15.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                lineTo(9.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(4.0f, 15.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(6.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 20.0f, 15.0f)
                close()
                moveTo(15.974f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveToRelative(1.5f, 0.077f, 6.638f, -0.233f, 8.0f, 0.295f)
                curveToRelative(0.206f, -2.139f, -0.985f, -3.486f, -3.167f, -3.295f)
                lineTo(13.164f, 0.986f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, -2.328f, 0.0f)
                lineTo(10.167f, 5.0f)
                curveTo(7.984f, 4.809f, 6.8f, 6.157f, 7.0f, 8.3f)
                arcTo(6.956f, 6.956f, 0.0f, false, true, 9.0f, 8.0f)
                close()
            }
        }
        .build()
        return _sauce!!
    }

private var _sauce: ImageVector? = null
