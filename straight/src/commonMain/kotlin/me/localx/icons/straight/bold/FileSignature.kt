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

public val Icons.Bold.FileSignature: ImageVector
    get() {
        if (_fileSignature != null) {
            return _fileSignature!!
        }
        _fileSignature = Builder(name = "FileSignature", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                lineTo(12.38f, 0.0f)
                lineToRelative(5.62f, 5.66f)
                verticalLineToRelative(7.42f)
                lineToRelative(-3.0f, 3.0f)
                lineTo(15.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(10.0f, 3.0f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                lineTo(11.0f, 19.0f)
                close()
                moveTo(23.36f, 13.64f)
                curveToRelative(-0.85f, -0.85f, -2.23f, -0.85f, -3.09f, 0.0f)
                lineToRelative(-7.28f, 7.28f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(3.09f)
                lineToRelative(7.28f, -7.28f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0.0f, -3.09f)
                close()
                moveTo(14.0f, 13.51f)
                curveToRelative(0.0f, 1.54f, -1.02f, 2.93f, -2.51f, 3.31f)
                curveToRelative(-0.44f, 0.11f, -0.94f, 0.19f, -1.49f, 0.19f)
                curveToRelative(-1.05f, 0.0f, -2.09f, -0.41f, -3.0f, -1.05f)
                curveToRelative(-0.91f, 0.64f, -1.95f, 1.05f, -3.0f, 1.05f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.51f, 0.0f, 1.02f, -0.17f, 1.5f, -0.45f)
                curveToRelative(-0.92f, -1.1f, -1.5f, -2.42f, -1.5f, -3.55f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.14f, -0.58f, 2.45f, -1.5f, 3.55f)
                curveToRelative(0.48f, 0.28f, 0.99f, 0.45f, 1.5f, 0.45f)
                curveToRelative(0.12f, 0.0f, 0.64f, -0.03f, 1.17f, -0.27f)
                curveToRelative(-0.1f, -0.36f, -0.16f, -0.76f, -0.16f, -1.23f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(8.0f, 11.01f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.63f, 0.39f, 1.48f, 1.0f, 2.24f)
                curveToRelative(0.61f, -0.76f, 1.0f, -1.61f, 1.0f, -2.24f)
                close()
            }
        }
        .build()
        return _fileSignature!!
    }

private var _fileSignature: ImageVector? = null
