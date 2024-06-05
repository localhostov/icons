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

public val Icons.Filled.FileExport: ImageVector
    get() {
        if (_fileExport != null) {
            return _fileExport!!
        }
        _fileExport = Builder(name = "FileExport", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(13.0f, 8.0f)
                horizontalLineToRelative(6.54f)
                curveToRelative(-0.35f, -0.91f, -0.88f, -1.75f, -1.59f, -2.46f)
                lineToRelative(-3.48f, -3.49f)
                curveToRelative(-0.71f, -0.71f, -1.55f, -1.24f, -2.46f, -1.59f)
                lineTo(12.01f, 7.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(17.81f, 19.0f)
                horizontalLineToRelative(-3.81f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.81f)
                curveToRelative(0.0f, -0.77f, 0.29f, -1.54f, 0.88f, -2.12f)
                curveToRelative(0.37f, -0.37f, 0.82f, -0.63f, 1.29f, -0.76f)
                verticalLineToRelative(-0.12f)
                horizontalLineToRelative(-6.98f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(10.0f, 0.02f)
                curveToRelative(-0.16f, -0.01f, -0.32f, -0.02f, -0.49f, -0.02f)
                lineTo(5.0f, 0.0f)
                curveTo(2.24f, 0.0f, 0.0f, 2.24f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                lineTo(15.0f, 24.0f)
                curveToRelative(1.81f, 0.0f, 3.4f, -0.97f, 4.28f, -2.42f)
                curveToRelative(-0.21f, -0.13f, -0.41f, -0.28f, -0.59f, -0.46f)
                curveToRelative(-0.58f, -0.58f, -0.88f, -1.35f, -0.88f, -2.12f)
                close()
            }
        }
        .build()
        return _fileExport!!
    }

private var _fileExport: ImageVector? = null
