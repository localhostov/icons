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

public val Icons.Bold.PigFace: ImageVector
    get() {
        if (_pigFace != null) {
            return _pigFace!!
        }
        _pigFace = Builder(name = "PigFace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 15.5f)
                curveToRelative(0.0f, 1.381f, -1.343f, 2.5f, -3.0f, 2.5f)
                reflectiveCurveToRelative(-3.0f, -1.119f, -3.0f, -2.5f)
                reflectiveCurveToRelative(1.343f, -2.5f, 3.0f, -2.5f)
                reflectiveCurveToRelative(3.0f, 1.119f, 3.0f, 2.5f)
                close()
                moveTo(10.0f, 11.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(15.5f, 10.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 0.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-3.275f, 0.0f, -6.146f, 0.0f, -8.273f, 2.227f)
                curveToRelative(-0.719f, -0.149f, -1.464f, -0.227f, -2.227f, -0.227f)
                reflectiveCurveToRelative(-1.507f, 0.078f, -2.227f, 0.227f)
                curveTo(7.646f, 0.0f, 4.775f, 0.0f, 1.5f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.157f, 0.022f, 3.653f, 1.87f, 7.212f)
                curveToRelative(-0.56f, 1.318f, -0.87f, 2.767f, -0.87f, 4.288f)
                curveToRelative(0.0f, 6.065f, 4.935f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.935f, 11.0f, -11.0f)
                curveToRelative(0.0f, -1.52f, -0.31f, -2.969f, -0.87f, -4.288f)
                curveToRelative(1.848f, -3.559f, 1.87f, -7.056f, 1.87f, -7.212f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(3.145f, 3.013f)
                curveToRelative(1.437f, 0.032f, 2.485f, 0.139f, 3.308f, 0.491f)
                curveToRelative(-0.989f, 0.58f, -1.88f, 1.31f, -2.642f, 2.159f)
                curveToRelative(-0.354f, -1.0f, -0.554f, -1.927f, -0.667f, -2.651f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.418f, 0.0f, -8.0f, -3.582f, -8.0f, -8.0f)
                reflectiveCurveTo(7.582f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveToRelative(8.0f, 3.582f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.582f, 8.0f, -8.0f, 8.0f)
                close()
                moveTo(20.189f, 5.664f)
                curveToRelative(-0.761f, -0.849f, -1.652f, -1.579f, -2.642f, -2.159f)
                curveToRelative(0.825f, -0.352f, 1.871f, -0.46f, 3.308f, -0.491f)
                curveToRelative(-0.113f, 0.724f, -0.313f, 1.651f, -0.667f, 2.651f)
                close()
            }
        }
        .build()
        return _pigFace!!
    }

private var _pigFace: ImageVector? = null
