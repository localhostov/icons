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

public val Icons.Bold.GasPump: ImageVector
    get() {
        if (_gasPump != null) {
            return _gasPump!!
        }
        _gasPump = Builder(name = "GasPump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.529f, 2.471f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.121f, 0.0f)
                lineTo(18.439f, 5.439f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 6.5f)
                verticalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(16.0f, 18.0f)
                lineTo(16.0f, 5.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 10.5f, 0.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 4.9f, -3.01f)
                curveToRelative(0.034f, 0.0f, 0.067f, 0.01f, 0.1f, 0.01f)
                horizontalLineToRelative(2.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 21.0f, 17.5f)
                lineTo(21.0f, 7.121f)
                lineToRelative(2.529f, -2.529f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 23.529f, 2.471f)
                close()
                moveTo(5.5f, 3.0f)
                horizontalLineToRelative(5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.0f, 5.5f)
                lineTo(13.0f, 9.0f)
                lineTo(10.816f, 9.0f)
                arcToRelative(2.969f, 2.969f, 0.0f, false, false, -0.521f, -0.91f)
                lineToRelative(0.491f, -0.819f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.214f, 5.729f)
                lineToRelative(-0.8f, 1.33f)
                arcTo(2.993f, 2.993f, 0.0f, false, false, 5.184f, 9.0f)
                lineTo(3.0f, 9.0f)
                lineTo(3.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 3.0f)
                close()
                moveTo(10.5f, 21.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                lineTo(3.0f, 12.0f)
                lineTo(13.0f, 12.0f)
                verticalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.5f, 21.0f)
                close()
            }
        }
        .build()
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
