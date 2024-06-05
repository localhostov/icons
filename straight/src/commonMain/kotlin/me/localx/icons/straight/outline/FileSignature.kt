package me.localx.icons.straight.outline

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

public val Icons.Outline.FileSignature: ImageVector
    get() {
        if (_fileSignature != null) {
            return _fileSignature!!
        }
        _fileSignature = Builder(name = "FileSignature", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.12f, 11.88f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0.0f)
                lineToRelative(-7.88f, 7.88f)
                verticalLineToRelative(4.24f)
                horizontalLineToRelative(4.24f)
                lineToRelative(7.88f, -7.88f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                reflectiveCurveToRelative(-0.31f, -1.55f, -0.88f, -2.12f)
                close()
                moveTo(21.71f, 14.71f)
                lineToRelative(-7.29f, 7.29f)
                horizontalLineToRelative(-1.41f)
                verticalLineToRelative(-1.41f)
                lineToRelative(7.29f, -7.29f)
                curveToRelative(0.38f, -0.38f, 1.04f, -0.38f, 1.41f, 0.0f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                reflectiveCurveToRelative(-0.1f, 0.52f, -0.29f, 0.71f)
                close()
                moveTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.93f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(-3.34f)
                lineTo(11.41f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(12.0f, 3.41f)
                lineToRelative(2.59f, 2.59f)
                horizontalLineToRelative(-2.59f)
                lineTo(12.0f, 3.41f)
                close()
                moveTo(13.95f, 13.98f)
                curveToRelative(0.02f, -0.16f, 0.05f, -0.31f, 0.05f, -0.48f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.46f, 0.06f, 0.87f, 0.16f, 1.23f)
                curveToRelative(-0.52f, 0.25f, -1.05f, 0.27f, -1.17f, 0.27f)
                curveToRelative(-0.51f, 0.0f, -1.02f, -0.17f, -1.5f, -0.45f)
                curveToRelative(0.92f, -1.1f, 1.5f, -2.42f, 1.5f, -3.55f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.14f, 0.58f, 2.45f, 1.5f, 3.55f)
                curveToRelative(-0.48f, 0.28f, -0.99f, 0.45f, -1.5f, 0.45f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.05f, 0.0f, 2.09f, -0.41f, 3.0f, -1.05f)
                curveToRelative(0.91f, 0.64f, 1.95f, 1.05f, 3.0f, 1.05f)
                curveToRelative(0.3f, 0.0f, 0.67f, -0.04f, 1.05f, -0.12f)
                lineToRelative(2.9f, -2.9f)
                close()
                moveTo(7.0f, 13.24f)
                curveToRelative(-0.61f, -0.76f, -1.0f, -1.61f, -1.0f, -2.24f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.63f, -0.39f, 1.48f, -1.0f, 2.24f)
                close()
            }
        }
        .build()
        return _fileSignature!!
    }

private var _fileSignature: ImageVector? = null
