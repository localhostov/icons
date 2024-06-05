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

public val Icons.Filled.FaceFearful: ImageVector
    get() {
        if (_faceFearful != null) {
            return _faceFearful!!
        }
        _faceFearful = Builder(name = "FaceFearful", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 11.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                close()
                moveTo(7.5f, 10.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(7.5f, 15.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.436f, 0.0f, -0.849f, 0.09f, -1.235f, 0.236f)
                curveToRelative(0.652f, -0.739f, 1.491f, -1.339f, 2.471f, -1.757f)
                lineToRelative(-0.783f, -1.84f)
                curveToRelative(-1.674f, 0.713f, -3.041f, 1.851f, -3.953f, 3.29f)
                lineToRelative(1.332f, 0.844f)
                curveToRelative(-0.805f, 0.642f, -1.332f, 1.619f, -1.332f, 2.726f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(15.0f, 19.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(20.0f, 11.5f)
                curveToRelative(0.0f, -1.217f, -0.626f, -2.288f, -1.571f, -2.916f)
                lineToRelative(1.18f, -0.78f)
                curveToRelative(-0.912f, -1.379f, -2.251f, -2.474f, -3.871f, -3.164f)
                lineToRelative(-0.785f, 1.84f)
                curveToRelative(0.916f, 0.39f, 1.707f, 0.944f, 2.34f, 1.619f)
                curveToRelative(-0.256f, -0.06f, -0.519f, -0.099f, -0.793f, -0.099f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _faceFearful!!
    }

private var _faceFearful: ImageVector? = null
