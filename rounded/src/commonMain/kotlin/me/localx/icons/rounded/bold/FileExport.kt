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

public val Icons.Bold.FileExport: ImageVector
    get() {
        if (_fileExport != null) {
            return _fileExport!!
        }
        _fileExport = Builder(name = "FileExport", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8f, 21.21f)
                curveToRelative(0.42f, 0.72f, 0.17f, 1.63f, -0.55f, 2.05f)
                curveToRelative(-0.83f, 0.48f, -1.78f, 0.74f, -2.75f, 0.74f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.47f, 2.47f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(6.34f)
                curveToRelative(1.45f, 0.0f, 2.87f, 0.59f, 3.89f, 1.61f)
                lineToRelative(2.66f, 2.66f)
                curveToRelative(0.82f, 0.82f, 1.35f, 1.85f, 1.54f, 2.99f)
                curveToRelative(0.14f, 0.82f, -0.42f, 1.61f, -1.23f, 1.75f)
                curveToRelative(-0.06f, 0.01f, -5.69f, 0.0f, -5.69f, 0.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                lineTo(11.01f, 3.0f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(14.5f, 21.0f)
                curveToRelative(0.44f, 0.0f, 0.87f, -0.12f, 1.25f, -0.33f)
                curveToRelative(0.71f, -0.41f, 1.63f, -0.17f, 2.05f, 0.55f)
                close()
                moveTo(23.71f, 14.79f)
                lineToRelative(-3.0f, -3.16f)
                curveToRelative(-0.63f, -0.63f, -1.71f, -0.18f, -1.71f, 0.71f)
                verticalLineToRelative(1.66f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1.66f)
                curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                lineToRelative(3.0f, -3.16f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                close()
            }
        }
        .build()
        return _fileExport!!
    }

private var _fileExport: ImageVector? = null
