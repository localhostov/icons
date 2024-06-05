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

public val Icons.Outline.Sauce: ImageVector
    get() {
        if (_sauce != null) {
            return _sauce!!
        }
        _sauce = Builder(name = "Sauce", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 9.424f)
                lineTo(17.0f, 8.0f)
                arcToRelative(3.014f, 3.014f, 0.0f, false, false, -3.167f, -3.0f)
                lineTo(13.164f, 0.986f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, -2.328f, 0.0f)
                lineTo(10.167f, 5.0f)
                arcTo(3.014f, 3.014f, 0.0f, false, false, 7.0f, 8.0f)
                lineTo(7.0f, 9.424f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 4.0f, 14.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(20.0f, 14.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 9.424f)
                close()
                moveTo(9.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(15.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                close()
                moveTo(18.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(9.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(6.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(14.974f, 14.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(15.974f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.974f, 14.0f)
                close()
                moveTo(13.974f, 18.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(9.974f, 16.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _sauce!!
    }

private var _sauce: ImageVector? = null
