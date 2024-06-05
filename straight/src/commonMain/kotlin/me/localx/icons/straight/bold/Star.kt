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

public val Icons.Bold.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 6.987f)
                lineTo(16.272f, 6.987f)
                lineTo(14.046f, 0.031f)
                lineTo(9.954f, 0.031f)
                lineTo(7.728f, 6.987f)
                lineTo(1.0f, 6.987f)
                lineTo(0.0f, 11.454f)
                lineToRelative(5.1f, 3.734f)
                lineToRelative(-2.533f, 7.86f)
                lineToRelative(4.325f, 0.983f)
                lineTo(12.0f, 20.263f)
                lineToRelative(5.112f, 3.768f)
                lineToRelative(4.324f, -0.987f)
                lineTo(18.9f, 15.188f)
                lineTo(24.0f, 11.454f)
                close()
                moveTo(15.382f, 14.042f)
                lineTo(17.482f, 20.575f)
                lineTo(12.0f, 16.53f)
                lineTo(6.513f, 20.575f)
                lineToRelative(2.105f, -6.533f)
                lineTo(3.094f, 9.995f)
                lineTo(9.916f, 9.995f)
                lineTo(12.0f, 3.482f)
                lineToRelative(2.084f, 6.513f)
                horizontalLineToRelative(6.822f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
