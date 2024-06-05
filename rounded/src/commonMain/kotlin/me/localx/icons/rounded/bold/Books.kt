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

public val Icons.Bold.Books: ImageVector
    get() {
        if (_books != null) {
            return _books!!
        }
        _books = Builder(name = "Books", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                lineTo(7.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(8.0f)
                lineTo(5.0f, 16.0f)
                lineTo(5.0f, 8.0f)
                close()
                moveTo(12.0f, 5.0f)
                lineTo(12.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(7.0f, 19.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                lineTo(7.0f, 19.0f)
                close()
                moveTo(0.0f, 19.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 19.0f)
                close()
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(0.895f, 0.0f, 0.0f, 0.895f, 0.0f, 2.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(19.122f, 7.237f)
                lineToRelative(-4.762f, 1.524f)
                lineToRelative(2.63f, 8.188f)
                lineToRelative(4.762f, -1.524f)
                lineToRelative(-2.63f, -8.188f)
                close()
                moveTo(18.207f, 4.38f)
                lineToRelative(-0.992f, -2.989f)
                curveToRelative(-0.337f, -1.052f, -1.463f, -1.632f, -2.515f, -1.295f)
                lineToRelative(-0.952f, 0.305f)
                curveToRelative(-1.052f, 0.337f, -1.632f, 1.463f, -1.295f, 2.515f)
                lineToRelative(0.992f, 2.989f)
                lineToRelative(4.762f, -1.524f)
                close()
                moveTo(17.904f, 19.806f)
                lineToRelative(0.839f, 2.803f)
                curveToRelative(0.337f, 1.052f, 1.463f, 1.632f, 2.515f, 1.295f)
                lineToRelative(0.952f, -0.305f)
                curveToRelative(1.052f, -0.337f, 1.632f, -1.463f, 1.295f, -2.515f)
                lineToRelative(-0.839f, -2.803f)
                lineToRelative(-4.762f, 1.524f)
                close()
            }
        }
        .build()
        return _books!!
    }

private var _books: ImageVector? = null
