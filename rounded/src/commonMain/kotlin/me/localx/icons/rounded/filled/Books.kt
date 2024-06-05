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

public val Icons.Filled.Books: ImageVector
    get() {
        if (_books != null) {
            return _books!!
        }
        _books = Builder(name = "Books", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.343f, 0.0f, 0.0f, 1.343f, 0.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(12.0f, 5.0f)
                lineTo(12.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(0.0f, 7.0f)
                verticalLineToRelative(10.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                close()
                moveTo(7.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(5.0f)
                lineTo(12.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(7.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(13.424f, 7.478f)
                lineToRelative(3.639f, 10.944f)
                lineToRelative(5.412f, -1.795f)
                lineToRelative(-3.639f, -10.944f)
                lineToRelative(-5.412f, 1.795f)
                close()
                moveTo(17.694f, 20.319f)
                lineToRelative(0.792f, 2.312f)
                curveToRelative(0.348f, 1.048f, 1.48f, 1.615f, 2.528f, 1.267f)
                lineToRelative(1.615f, -0.535f)
                curveToRelative(1.049f, -0.348f, 1.617f, -1.481f, 1.268f, -2.529f)
                lineToRelative(-0.791f, -2.309f)
                lineToRelative(-5.412f, 1.795f)
                close()
                moveTo(12.793f, 5.58f)
                lineToRelative(5.412f, -1.795f)
                lineToRelative(-0.803f, -2.415f)
                curveToRelative(-0.348f, -1.048f, -1.48f, -1.616f, -2.528f, -1.268f)
                lineToRelative(-1.615f, 0.535f)
                curveToRelative(-1.048f, 0.348f, -1.616f, 1.48f, -1.268f, 2.528f)
                lineToRelative(0.803f, 2.415f)
                close()
            }
        }
        .build()
        return _books!!
    }

private var _books: ImageVector? = null
