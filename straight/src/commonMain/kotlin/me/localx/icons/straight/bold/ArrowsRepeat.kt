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

public val Icons.Bold.ArrowsRepeat: ImageVector
    get() {
        if (_arrowsRepeat != null) {
            return _arrowsRepeat!!
        }
        _arrowsRepeat = Builder(name = "ArrowsRepeat", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 11.0f)
                lineTo(0.0f, 11.0f)
                curveTo(0.0f, 6.589f, 3.589f, 3.0f, 8.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                lineTo(20.0f, 0.0f)
                lineToRelative(3.707f, 3.793f)
                curveToRelative(0.39f, 0.391f, 0.39f, 1.024f, 0.0f, 1.414f)
                lineToRelative(-3.707f, 3.793f)
                verticalLineToRelative(-3.0f)
                lineTo(8.0f, 6.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                close()
                moveTo(16.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.293f, 18.793f)
                curveToRelative(-0.39f, 0.391f, -0.39f, 1.024f, 0.0f, 1.414f)
                lineToRelative(3.707f, 3.793f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, -3.589f, 8.0f, -8.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _arrowsRepeat!!
    }

private var _arrowsRepeat: ImageVector? = null
