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
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 0.0f)
                lineTo(2.0f, 0.0f)
                curveTo(0.895f, 0.0f, 0.0f, 0.895f, 0.0f, 2.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(12.0f, 5.0f)
                lineTo(12.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
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
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(13.579f, 7.301f)
                lineToRelative(3.468f, 10.337f)
                lineToRelative(4.746f, -1.575f)
                lineToRelative(-3.468f, -10.337f)
                lineToRelative(-4.746f, 1.575f)
                close()
                moveTo(17.678f, 19.536f)
                lineToRelative(1.44f, 4.42f)
                lineToRelative(4.746f, -1.575f)
                lineToRelative(-1.44f, -4.42f)
                lineToRelative(-4.746f, 1.575f)
                close()
                moveTo(12.948f, 5.404f)
                lineToRelative(4.746f, -1.574f)
                lineToRelative(-0.803f, -2.415f)
                curveToRelative(-0.348f, -1.048f, -1.48f, -1.616f, -2.528f, -1.268f)
                lineToRelative(-0.949f, 0.315f)
                curveToRelative(-1.048f, 0.348f, -1.616f, 1.48f, -1.268f, 2.528f)
                lineToRelative(0.803f, 2.415f)
                close()
            }
        }
        .build()
        return _books!!
    }

private var _books: ImageVector? = null
