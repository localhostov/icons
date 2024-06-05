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

public val Icons.Bold.Hiking: ImageVector
    get() {
        if (_hiking != null) {
            return _hiking!!
        }
        _hiking = Builder(name = "Hiking", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.572f, 19.824f)
                lineTo(7.97f, 22.8f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 24.0f)
                arcToRelative(1.461f, 1.461f, 0.0f, false, true, -0.3f, -0.03f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.03f, 22.2f)
                lineToRelative(0.6f, -2.974f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.939f, 0.6f)
                close()
                moveTo(12.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 10.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.5f, 5.0f)
                close()
                moveTo(22.0f, 9.5f)
                verticalLineToRelative(13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.408f)
                arcToRelative(3.494f, 3.494f, 0.0f, false, true, -2.673f, -1.24f)
                lineToRelative(-1.048f, -1.24f)
                lineTo(11.5f, 15.3f)
                lineToRelative(1.171f, 0.929f)
                arcTo(3.481f, 3.481f, 0.0f, false, true, 14.0f, 18.967f)
                verticalLineTo(22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineTo(18.967f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.189f, -0.392f)
                lineTo(8.118f, 16.44f)
                arcToRelative(3.525f, 3.525f, 0.0f, false, true, -0.679f, -0.714f)
                arcTo(3.992f, 3.992f, 0.0f, false, true, 5.969f, 16.0f)
                arcTo(3.845f, 3.845f, 0.0f, false, true, 2.0f, 12.026f)
                curveTo(2.0f, 8.759f, 5.4f, 6.0f, 9.413f, 6.0f)
                horizontalLineToRelative(1.831f)
                arcToRelative(3.859f, 3.859f, 0.0f, false, true, 2.915f, 1.614f)
                lineToRelative(1.867f, 2.209f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.382f, 0.177f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
                moveTo(5.969f, 13.0f)
                arcToRelative(1.369f, 1.369f, 0.0f, false, false, 1.052f, -0.637f)
                lineTo(7.8f, 9.236f)
                curveTo(6.207f, 9.708f, 5.0f, 10.827f, 5.0f, 12.026f)
                arcTo(0.861f, 0.861f, 0.0f, false, false, 5.969f, 13.0f)
                close()
            }
        }
        .build()
        return _hiking!!
    }

private var _hiking: ImageVector? = null
