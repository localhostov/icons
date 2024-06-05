package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.KeyboardBrightness: ImageVector
    get() {
        if (_keyboardBrightness != null) {
            return _keyboardBrightness!!
        }
        _keyboardBrightness = Builder(name = "KeyboardBrightness", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 4.0f)
                close()
                moveTo(4.0f, 16.0f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(24.0f, 16.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.71f, 8.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-4.05f, 4.05f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.05f, -4.05f)
                close()
                moveTo(7.76f, 11.35f)
                lineTo(3.71f, 7.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4.05f, 4.05f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }
        .build()
        return _keyboardBrightness!!
    }

private var _keyboardBrightness: ImageVector? = null
