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

public val Icons.Bold.Tricycle: ImageVector
    get() {
        if (_tricycle != null) {
            return _tricycle!!
        }
        _tricycle = Builder(name = "Tricycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.388f, 12.188f)
                curveToRelative(-0.265f, -2.843f, -0.619f, -5.573f, -0.884f, -7.459f)
                curveToRelative(-0.378f, -2.696f, -2.72f, -4.729f, -5.446f, -4.729f)
                horizontalLineToRelative(-0.558f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.558f)
                curveToRelative(1.239f, 0.0f, 2.303f, 0.923f, 2.475f, 2.146f)
                curveToRelative(0.116f, 0.827f, 0.25f, 1.823f, 0.385f, 2.916f)
                curveToRelative(-1.783f, 0.139f, -4.542f, 0.559f, -7.104f, 1.789f)
                lineToRelative(-0.673f, -1.851f)
                horizontalLineToRelative(0.358f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                lineTo(4.5f, 5.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.449f)
                lineToRelative(1.274f, 3.502f)
                curveToRelative(-1.14f, 0.943f, -2.113f, 2.141f, -2.783f, 3.657f)
                curveToRelative(-1.969f, 0.48f, -3.44f, 2.246f, -3.44f, 4.36f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -1.716f, -0.977f, -3.193f, -2.393f, -3.952f)
                curveToRelative(2.182f, -3.531f, 7.145f, -4.346f, 9.653f, -4.523f)
                curveToRelative(0.042f, 0.398f, 0.082f, 0.799f, 0.12f, 1.204f)
                curveToRelative(-2.523f, 0.709f, -4.38f, 3.025f, -4.38f, 5.772f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                curveToRelative(0.0f, -2.83f, -1.972f, -5.203f, -4.612f, -5.831f)
                close()
                moveTo(4.5f, 21.02f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.499f, 1.498f, -1.5f)
                curveToRelative(0.0f, 0.0f, 0.001f, 0.0f, 0.002f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.001f, 0.0f, 0.002f, 0.0f)
                curveToRelative(0.826f, 0.001f, 1.498f, 0.673f, 1.498f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.0f, 21.02f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _tricycle!!
    }

private var _tricycle: ImageVector? = null
