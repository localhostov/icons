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

public val Icons.Bold.Sauce: ImageVector
    get() {
        if (_sauce != null) {
            return _sauce!!
        }
        _sauce = Builder(name = "Sauce", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.607f)
                lineTo(17.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(13.833f, 5.0f)
                lineTo(13.164f, 0.986f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, -2.328f, 0.0f)
                lineTo(10.167f, 5.0f)
                lineTo(9.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 7.0f)
                lineTo(7.0f, 8.607f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 4.0f, 13.5f)
                verticalLineToRelative(5.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 9.5f, 24.0f)
                horizontalLineToRelative(5.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 20.0f, 18.5f)
                verticalLineToRelative(-5.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 17.0f, 8.607f)
                close()
                moveTo(17.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.5f, 21.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.0f, 18.5f)
                verticalLineToRelative(-5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 11.0f)
                horizontalLineToRelative(5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.0f, 13.5f)
                close()
                moveTo(15.0f, 15.5f)
                verticalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 18.0f)
                horizontalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 16.5f)
                verticalLineToRelative(-1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 14.0f)
                horizontalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 15.5f)
                close()
            }
        }
        .build()
        return _sauce!!
    }

private var _sauce: ImageVector? = null
