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

public val Icons.Outline.PigFace: ImageVector
    get() {
        if (_pigFace != null) {
            return _pigFace!!
        }
        _pigFace = Builder(name = "PigFace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 12.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.57f, -4.0f, 3.5f)
                reflectiveCurveToRelative(1.794f, 3.5f, 4.0f, 3.5f)
                reflectiveCurveToRelative(4.0f, -1.57f, 4.0f, -3.5f)
                reflectiveCurveToRelative(-1.794f, -3.5f, -4.0f, -3.5f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.084f, 0.0f, -2.0f, -0.687f, -2.0f, -1.5f)
                reflectiveCurveToRelative(0.916f, -1.5f, 2.0f, -1.5f)
                reflectiveCurveToRelative(2.0f, 0.687f, 2.0f, 1.5f)
                reflectiveCurveToRelative(-0.916f, 1.5f, -2.0f, 1.5f)
                close()
                moveTo(24.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-3.428f, 0.0f, -6.178f, 0.0f, -8.177f, 2.368f)
                curveToRelative(-0.901f, -0.24f, -1.847f, -0.368f, -2.823f, -0.368f)
                reflectiveCurveToRelative(-1.921f, 0.128f, -2.822f, 0.368f)
                curveTo(7.178f, 0.0f, 4.428f, 0.0f, 1.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.157f, 0.024f, 3.79f, 2.023f, 7.37f)
                curveToRelative(-0.656f, 1.408f, -1.023f, 2.977f, -1.023f, 4.63f)
                curveToRelative(0.0f, 6.065f, 4.935f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.935f, 11.0f, -11.0f)
                curveToRelative(0.0f, -1.653f, -0.367f, -3.222f, -1.023f, -4.63f)
                curveToRelative(1.999f, -3.58f, 2.023f, -7.213f, 2.023f, -7.37f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(2.073f, 2.004f)
                curveToRelative(2.406f, 0.025f, 3.918f, 0.187f, 5.056f, 1.135f)
                curveToRelative(-1.529f, 0.758f, -2.857f, 1.861f, -3.883f, 3.207f)
                curveToRelative(-0.761f, -1.711f, -1.058f, -3.341f, -1.173f, -4.342f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(16.871f, 3.139f)
                curveToRelative(1.137f, -0.948f, 2.649f, -1.109f, 5.056f, -1.135f)
                curveToRelative(-0.115f, 1.001f, -0.412f, 2.631f, -1.173f, 4.342f)
                curveToRelative(-1.026f, -1.346f, -2.354f, -2.449f, -3.883f, -3.207f)
                close()
                moveTo(8.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _pigFace!!
    }

private var _pigFace: ImageVector? = null
