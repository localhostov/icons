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

public val Icons.Filled.FileSignature: ImageVector
    get() {
        if (_fileSignature != null) {
            return _fileSignature!!
        }
        _fileSignature = Builder(name = "FileSignature", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.41f, 5.0f)
                horizontalLineToRelative(-4.41f)
                lineTo(13.0f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(11.0f, 7.0f)
                lineTo(11.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.34f, 0.0f, 0.0f, 1.34f, 0.0f, 3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(10.0f, 22.0f)
                verticalLineToRelative(-2.42f)
                lineToRelative(2.75f, -2.75f)
                lineToRelative(-1.25f, -0.34f)
                lineToRelative(-1.45f, 0.39f)
                curveToRelative(-0.38f, 0.08f, -0.75f, 0.12f, -1.05f, 0.12f)
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
                curveToRelative(-0.1f, -0.36f, -0.17f, -0.77f, -0.17f, -1.23f)
                curveToRelative(0.0f, -0.83f, 0.68f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.46f, -0.07f, 0.87f, -0.17f, 1.23f)
                curveToRelative(0.53f, 0.25f, 1.05f, 0.27f, 1.17f, 0.27f)
                horizontalLineToRelative(0.57f)
                reflectiveCurveToRelative(3.43f, -3.42f, 3.43f, -3.42f)
                lineTo(18.0f, 7.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(23.26f, 12.74f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0.0f)
                lineToRelative(-7.67f, 7.67f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(3.59f)
                lineToRelative(7.67f, -7.67f)
                curveToRelative(0.48f, -0.48f, 0.74f, -1.12f, 0.74f, -1.8f)
                reflectiveCurveToRelative(-0.26f, -1.32f, -0.74f, -1.79f)
                close()
                moveTo(5.0f, 11.0f)
                curveToRelative(0.0f, 0.63f, 0.39f, 1.48f, 1.0f, 2.24f)
                curveToRelative(0.61f, -0.76f, 1.0f, -1.61f, 1.0f, -2.24f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _fileSignature!!
    }

private var _fileSignature: ImageVector? = null
