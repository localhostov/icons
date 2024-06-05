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

public val Icons.Filled.Shirt: ImageVector
    get() {
        if (_shirt != null) {
            return _shirt!!
        }
        _shirt = Builder(name = "Shirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.093f, -0.007f)
                lineToRelative(-4.093f, 4.093f)
                lineTo(7.914f, 0.0f)
                lineToRelative(8.179f, -0.007f)
                close()
                moveTo(9.678f, 8.263f)
                lineToRelative(1.129f, -2.542f)
                lineTo(5.83f, 0.745f)
                lineToRelative(-1.832f, 1.84f)
                lineToRelative(5.679f, 5.679f)
                close()
                moveTo(13.78f, 19.306f)
                lineToRelative(-1.779f, -7.959f)
                lineToRelative(-1.779f, 7.959f)
                lineToRelative(1.779f, 1.779f)
                lineToRelative(1.779f, -1.779f)
                close()
                moveTo(14.053f, 11.361f)
                lineToRelative(1.918f, 8.581f)
                lineToRelative(-3.971f, 3.971f)
                lineToRelative(-3.971f, -3.971f)
                lineToRelative(1.918f, -8.581f)
                lineTo(2.43f, 3.845f)
                lineToRelative(-2.43f, 1.62f)
                verticalLineToRelative(18.535f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 5.465f)
                lineToRelative(-2.43f, -1.62f)
                lineToRelative(-7.517f, 7.517f)
                close()
                moveTo(20.0f, 2.585f)
                lineToRelative(-1.836f, -1.836f)
                lineToRelative(-4.972f, 4.972f)
                lineToRelative(1.129f, 2.542f)
                lineToRelative(5.678f, -5.678f)
                close()
            }
        }
        .build()
        return _shirt!!
    }

private var _shirt: ImageVector? = null
