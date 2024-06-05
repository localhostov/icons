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

public val Icons.Filled.FileExcel: ImageVector
    get() {
        if (_fileExcel != null) {
            return _fileExcel!!
        }
        _fileExcel = Builder(name = "FileExcel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                lineTo(14.0f, 0.46f)
                curveToRelative(0.91f, 0.35f, 1.75f, 0.88f, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.71f, 0.71f, 1.24f, 1.55f, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                close()
                moveTo(22.0f, 10.49f)
                verticalLineToRelative(8.51f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(2.0f, 5.0f)
                curveTo(2.0f, 2.24f, 4.24f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(4.51f)
                curveToRelative(0.16f, 0.0f, 0.32f, 0.01f, 0.49f, 0.02f)
                lineTo(12.0f, 7.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(6.98f)
                curveToRelative(0.01f, 0.16f, 0.02f, 0.32f, 0.02f, 0.49f)
                close()
                moveTo(13.3f, 17.0f)
                lineToRelative(1.97f, -2.36f)
                curveToRelative(0.35f, -0.42f, 0.3f, -1.05f, -0.13f, -1.41f)
                curveToRelative(-0.43f, -0.35f, -1.05f, -0.3f, -1.41f, 0.13f)
                lineToRelative(-1.73f, 2.08f)
                lineToRelative(-1.73f, -2.08f)
                curveToRelative(-0.35f, -0.42f, -0.98f, -0.48f, -1.41f, -0.13f)
                curveToRelative(-0.42f, 0.35f, -0.48f, 0.98f, -0.13f, 1.41f)
                lineToRelative(1.97f, 2.36f)
                lineToRelative(-1.97f, 2.36f)
                curveToRelative(-0.35f, 0.42f, -0.3f, 1.05f, 0.13f, 1.41f)
                curveToRelative(0.19f, 0.16f, 0.41f, 0.23f, 0.64f, 0.23f)
                curveToRelative(0.29f, 0.0f, 0.57f, -0.12f, 0.77f, -0.36f)
                lineToRelative(1.73f, -2.08f)
                lineToRelative(1.73f, 2.08f)
                curveToRelative(0.2f, 0.24f, 0.48f, 0.36f, 0.77f, 0.36f)
                curveToRelative(0.23f, 0.0f, 0.45f, -0.08f, 0.64f, -0.23f)
                curveToRelative(0.42f, -0.35f, 0.48f, -0.98f, 0.13f, -1.41f)
                lineToRelative(-1.97f, -2.36f)
                close()
            }
        }
        .build()
        return _fileExcel!!
    }

private var _fileExcel: ImageVector? = null
