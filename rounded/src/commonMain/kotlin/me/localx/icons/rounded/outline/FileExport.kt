package me.localx.icons.rounded.outline

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

public val Icons.Outline.FileExport: ImageVector
    get() {
        if (_fileExport != null) {
            return _fileExport!!
        }
        _fileExport = Builder(name = "FileExport", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.66f, 20.9f)
                curveToRelative(-0.41f, -0.37f, -1.05f, -0.33f, -1.41f, 0.09f)
                curveToRelative(-0.57f, 0.65f, -1.39f, 1.02f, -2.25f, 1.02f)
                lineTo(5.0f, 22.01f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.51f)
                curveToRelative(0.16f, 0.0f, 0.33f, 0.0f, 0.49f, 0.02f)
                lineTo(10.0f, 7.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.81f)
                curveToRelative(0.31f, 0.0f, 0.6f, -0.14f, 0.79f, -0.39f)
                reflectiveCurveToRelative(0.25f, -0.56f, 0.18f, -0.86f)
                curveToRelative(-0.31f, -1.22f, -0.94f, -2.33f, -1.83f, -3.22f)
                lineToRelative(-3.48f, -3.48f)
                curveToRelative(-1.32f, -1.32f, -3.08f, -2.05f, -4.95f, -2.05f)
                lineTo(5.0f, -0.0f)
                curveTo(2.24f, 0.0f, 0.0f, 2.24f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                lineTo(15.0f, 24.0f)
                curveToRelative(1.43f, 0.0f, 2.8f, -0.62f, 3.75f, -1.69f)
                curveToRelative(0.37f, -0.41f, 0.33f, -1.05f, -0.09f, -1.41f)
                close()
                moveTo(12.0f, 2.66f)
                curveToRelative(0.38f, 0.22f, 0.73f, 0.49f, 1.05f, 0.81f)
                lineToRelative(3.48f, 3.48f)
                curveToRelative(0.31f, 0.31f, 0.58f, 0.67f, 0.8f, 1.05f)
                horizontalLineToRelative(-4.34f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(11.99f, 2.66f)
                close()
                moveTo(23.13f, 18.09f)
                lineToRelative(-1.61f, 1.61f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(1.29f, -1.29f)
                horizontalLineToRelative(-7.4f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.4f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(1.61f, 1.61f)
                curveToRelative(1.15f, 1.15f, 1.15f, 3.03f, 0.0f, 4.19f)
                close()
            }
        }
        .build()
        return _fileExport!!
    }

private var _fileExport: ImageVector? = null
