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

public val Icons.Bold.BinarySlash: ImageVector
    get() {
        if (_binarySlash != null) {
            return _binarySlash!!
        }
        _binarySlash = Builder(name = "BinarySlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 22.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-2.48f, 0.0f, -4.5f, -2.02f, -4.5f, -4.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(16.0f, 4.92f)
                verticalLineToRelative(4.58f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(19.0f, 1.5f)
                curveToRelative(0.0f, -0.61f, -0.37f, -1.15f, -0.93f, -1.39f)
                curveToRelative(-0.56f, -0.23f, -1.21f, -0.1f, -1.63f, 0.33f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f)
                curveToRelative(0.42f, 0.42f, 1.03f, 0.54f, 1.56f, 0.35f)
                close()
                moveTo(8.07f, 13.12f)
                curveToRelative(-0.56f, -0.23f, -1.21f, -0.1f, -1.63f, 0.33f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f)
                curveToRelative(0.42f, 0.42f, 1.03f, 0.54f, 1.56f, 0.35f)
                verticalLineToRelative(4.58f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(9.0f, 14.5f)
                curveToRelative(0.0f, -0.61f, -0.37f, -1.15f, -0.93f, -1.39f)
                close()
                moveTo(23.56f, 23.57f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                lineTo(0.44f, 2.56f)
                curveTo(-0.15f, 1.97f, -0.15f, 1.03f, 0.44f, 0.44f)
                reflectiveCurveTo(1.97f, -0.15f, 2.56f, 0.44f)
                lineToRelative(1.36f, 1.36f)
                curveToRelative(0.82f, -1.09f, 2.11f, -1.8f, 3.58f, -1.8f)
                curveToRelative(2.48f, 0.0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.94f, -0.29f, 1.83f, -0.81f, 2.57f)
                lineToRelative(3.96f, 3.96f)
                curveToRelative(0.12f, 0.0f, 0.23f, -0.03f, 0.35f, -0.03f)
                curveToRelative(2.48f, 0.0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(0.38f)
                lineToRelative(3.56f, 3.56f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0.0f, 2.12f)
                close()
                moveTo(6.1f, 3.98f)
                lineToRelative(2.86f, 2.86f)
                curveToRelative(0.03f, -0.11f, 0.04f, -0.22f, 0.04f, -0.34f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.64f, 0.0f, -1.19f, 0.41f, -1.4f, 0.98f)
                close()
            }
        }
        .build()
        return _binarySlash!!
    }

private var _binarySlash: ImageVector? = null
