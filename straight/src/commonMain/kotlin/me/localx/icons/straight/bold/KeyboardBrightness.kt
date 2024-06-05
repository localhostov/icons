package me.localx.icons.straight.bold

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

public val Icons.Bold.KeyboardBrightness: ImageVector
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
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(13.5f, 4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 4.0f)
                close()
                moveTo(4.0f, 15.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(22.06f, 8.56f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-4.05f, 4.05f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.05f, -4.05f)
                close()
                moveTo(8.11f, 10.49f)
                lineTo(4.06f, 6.44f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(4.05f, 4.05f)
                lineToRelative(2.12f, -2.12f)
                close()
            }
        }
        .build()
        return _keyboardBrightness!!
    }

private var _keyboardBrightness: ImageVector? = null
