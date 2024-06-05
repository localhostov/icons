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

public val Icons.Filled.Pepper: ImageVector
    get() {
        if (_pepper != null) {
            return _pepper!!
        }
        _pepper = Builder(name = "Pepper", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(1.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 0.207f, 9.819f)
                lineTo(0.357f, 9.0f)
                horizontalLineTo(2.2f)
                lineToRelative(0.129f, 0.849f)
                curveTo(2.691f, 12.2f, 3.848f, 15.0f, 7.319f, 15.0f)
                curveTo(9.62f, 15.0f, 12.0f, 13.5f, 12.0f, 11.0f)
                arcToRelative(5.962f, 5.962f, 0.0f, false, true, 1.22f, -3.612f)
                arcToRelative(4.969f, 4.969f, 0.0f, false, false, 9.56f, 0.0f)
                arcTo(5.962f, 5.962f, 0.0f, false, true, 24.0f, 11.0f)
                close()
                moveTo(16.8f, 5.136f)
                arcTo(5.99f, 5.99f, 0.0f, false, false, 15.02f, 5.8f)
                curveToRelative(0.0f, 0.068f, -0.02f, 0.132f, -0.02f, 0.2f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                curveToRelative(0.0f, -0.069f, -0.016f, -0.133f, -0.02f, -0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.144f, -0.738f)
                curveTo(18.239f, 1.6f, 16.056f, 0.0f, 14.0f, 0.0f)
                verticalLineTo(2.0f)
                curveTo(15.174f, 2.0f, 16.347f, 3.08f, 16.8f, 5.136f)
                close()
            }
        }
        .build()
        return _pepper!!
    }

private var _pepper: ImageVector? = null
