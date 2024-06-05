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

public val Icons.Bold.CircleS: ImageVector
    get() {
        if (_circleS != null) {
            return _circleS!!
        }
        _circleS = Builder(name = "CircleS", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(17.0f, 14.53f)
                curveToRelative(0.0f, 1.913f, -1.557f, 3.47f, -3.47f, 3.47f)
                horizontalLineToRelative(-2.53f)
                curveToRelative(-0.95f, 0.0f, -2.927f, 0.0f, -3.842f, -1.829f)
                curveToRelative(-0.37f, -0.741f, -0.07f, -1.642f, 0.671f, -2.013f)
                curveToRelative(0.743f, -0.369f, 1.642f, -0.069f, 2.013f, 0.671f)
                curveToRelative(0.085f, 0.171f, 0.837f, 0.171f, 1.158f, 0.171f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.259f, 0.0f, 0.47f, -0.211f, 0.47f, -0.47f)
                curveToRelative(0.0f, -0.208f, -0.14f, -0.394f, -0.34f, -0.451f)
                lineToRelative(-4.173f, -1.287f)
                curveToRelative(-1.451f, -0.412f, -2.487f, -1.783f, -2.487f, -3.325f)
                curveToRelative(0.0f, -1.911f, 1.556f, -3.467f, 3.467f, -3.467f)
                horizontalLineToRelative(2.533f)
                curveToRelative(0.95f, 0.0f, 2.927f, 0.0f, 3.842f, 1.829f)
                curveToRelative(0.37f, 0.741f, 0.07f, 1.642f, -0.671f, 2.013f)
                curveToRelative(-0.74f, 0.369f, -1.642f, 0.07f, -2.013f, -0.671f)
                curveToRelative(-0.085f, -0.171f, -0.837f, -0.171f, -1.158f, -0.171f)
                horizontalLineToRelative(-2.533f)
                curveToRelative(-0.258f, 0.0f, -0.467f, 0.209f, -0.467f, 0.467f)
                curveToRelative(0.0f, 0.207f, 0.14f, 0.392f, 0.34f, 0.448f)
                lineToRelative(4.178f, 1.289f)
                curveToRelative(1.45f, 0.418f, 2.482f, 1.789f, 2.482f, 3.326f)
                close()
            }
        }
        .build()
        return _circleS!!
    }

private var _circleS: ImageVector? = null
