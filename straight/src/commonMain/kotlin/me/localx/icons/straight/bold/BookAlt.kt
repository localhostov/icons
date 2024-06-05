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

public val Icons.Bold.BookAlt: ImageVector
    get() {
        if (_bookAlt != null) {
            return _bookAlt!!
        }
        _bookAlt = Builder(name = "BookAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.775f, 1.747f)
                arcToRelative(3.407f, 3.407f, 0.0f, false, false, -2.795f, -0.737f)
                lineToRelative(-5.9f, 1.073f)
                arcToRelative(4.348f, 4.348f, 0.0f, false, false, -2.083f, 1.0f)
                arcToRelative(4.343f, 4.343f, 0.0f, false, false, -2.083f, -1.0f)
                lineToRelative(-5.894f, -1.073f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, false, -4.02f, 3.354f)
                verticalLineToRelative(16.524f)
                lineToRelative(12.0f, 2.182f)
                lineToRelative(12.0f, -2.182f)
                verticalLineToRelative(-16.524f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -1.225f, -2.617f)
                close()
                moveTo(10.5f, 19.747f)
                lineTo(3.0f, 18.384f)
                verticalLineToRelative(-14.02f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.482f, -0.4f)
                lineToRelative(5.9f, 1.073f)
                arcToRelative(1.363f, 1.363f, 0.0f, false, true, 1.118f, 1.338f)
                close()
                moveTo(21.0f, 18.384f)
                lineTo(13.5f, 19.748f)
                verticalLineToRelative(-13.373f)
                arcToRelative(1.363f, 1.363f, 0.0f, false, true, 1.12f, -1.341f)
                lineToRelative(5.9f, -1.072f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, true, 0.482f, 0.4f)
                close()
            }
        }
        .build()
        return _bookAlt!!
    }

private var _bookAlt: ImageVector? = null
