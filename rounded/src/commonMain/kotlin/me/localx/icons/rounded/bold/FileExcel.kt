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

public val Icons.Bold.FileExcel: ImageVector
    get() {
        if (_fileExcel != null) {
            return _fileExcel!!
        }
        _fileExcel = Builder(name = "FileExcel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.39f, 4.27f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-1.04f, -1.04f, -2.42f, -1.61f, -3.89f, -1.61f)
                lineTo(7.5f, -0.0f)
                curveTo(4.47f, 0.0f, 2.0f, 2.47f, 2.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(22.0f, 8.16f)
                curveToRelative(0.0f, -1.47f, -0.57f, -2.85f, -1.61f, -3.89f)
                close()
                moveTo(15.22f, 20.36f)
                curveToRelative(0.35f, 0.42f, 0.3f, 1.05f, -0.13f, 1.41f)
                curveToRelative(-0.19f, 0.16f, -0.41f, 0.23f, -0.64f, 0.23f)
                curveToRelative(-0.29f, 0.0f, -0.57f, -0.12f, -0.77f, -0.36f)
                lineToRelative(-1.73f, -2.08f)
                lineToRelative(-1.73f, 2.08f)
                curveToRelative(-0.2f, 0.24f, -0.48f, 0.36f, -0.77f, 0.36f)
                curveToRelative(-0.23f, 0.0f, -0.45f, -0.08f, -0.64f, -0.23f)
                curveToRelative(-0.42f, -0.35f, -0.48f, -0.98f, -0.13f, -1.41f)
                lineToRelative(1.97f, -2.36f)
                lineToRelative(-1.97f, -2.36f)
                curveToRelative(-0.35f, -0.42f, -0.3f, -1.05f, 0.13f, -1.41f)
                curveToRelative(0.43f, -0.35f, 1.06f, -0.3f, 1.41f, 0.13f)
                lineToRelative(1.73f, 2.08f)
                lineToRelative(1.73f, -2.08f)
                curveToRelative(0.35f, -0.42f, 0.98f, -0.48f, 1.41f, -0.13f)
                curveToRelative(0.42f, 0.35f, 0.48f, 0.98f, 0.13f, 1.41f)
                lineToRelative(-1.97f, 2.36f)
                lineToRelative(1.97f, 2.36f)
                close()
                moveTo(5.0f, 12.0f)
                lineTo(5.0f, 5.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.5f)
                lineTo(13.0f, 7.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 12.0f)
                close()
            }
        }
        .build()
        return _fileExcel!!
    }

private var _fileExcel: ImageVector? = null
