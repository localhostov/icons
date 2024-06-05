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

public val Icons.Bold.ArrowsFromLine: ImageVector
    get() {
        if (_arrowsFromLine != null) {
            return _arrowsFromLine!!
        }
        _arrowsFromLine = Builder(name = "ArrowsFromLine", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.5f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                lineTo(24.0f, 10.5f)
                close()
                moveTo(13.5f, 16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(3.793f, 3.707f)
                curveToRelative(0.391f, 0.391f, 1.024f, 0.391f, 1.414f, 0.0f)
                lineToRelative(3.793f, -3.707f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(10.5f, 8.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 4.0f)
                horizontalLineToRelative(3.0f)
                lineTo(12.707f, 0.293f)
                curveToRelative(-0.391f, -0.391f, -1.024f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-3.793f, 3.707f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _arrowsFromLine!!
    }

private var _arrowsFromLine: ImageVector? = null
