package me.localx.icons.rounded.outline

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

public val Icons.Outline.TrainTram: ImageVector
    get() {
        if (_trainTram != null) {
            return _trainTram!!
        }
        _trainTram = Builder(name = "TrainTram", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.0f, 2.023f)
                curveToRelative(3.2f, 0.144f, 5.668f, 0.921f, 5.694f, 0.929f)
                curveToRelative(0.524f, 0.168f, 1.089f, -0.12f, 1.258f, -0.647f)
                curveToRelative(0.168f, -0.525f, -0.121f, -1.088f, -0.646f, -1.257f)
                curveToRelative(-0.133f, -0.043f, -3.307f, -1.048f, -7.306f, -1.048f)
                reflectiveCurveTo(4.827f, 1.005f, 4.694f, 1.048f)
                curveToRelative(-0.526f, 0.169f, -0.815f, 0.732f, -0.646f, 1.258f)
                curveToRelative(0.137f, 0.425f, 0.529f, 0.694f, 0.952f, 0.694f)
                curveToRelative(0.102f, 0.0f, 0.204f, -0.016f, 0.306f, -0.048f)
                curveToRelative(0.027f, -0.009f, 2.482f, -0.786f, 5.694f, -0.93f)
                verticalLineToRelative(2.977f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 2.259f, 1.507f, 4.173f, 3.568f, 4.791f)
                lineToRelative(-0.421f, 0.687f)
                curveToRelative(-0.289f, 0.472f, -0.141f, 1.087f, 0.33f, 1.375f)
                curveToRelative(0.163f, 0.1f, 0.344f, 0.147f, 0.521f, 0.147f)
                curveToRelative(0.337f, 0.0f, 0.665f, -0.17f, 0.854f, -0.478f)
                lineToRelative(0.932f, -1.522f)
                horizontalLineToRelative(6.431f)
                lineToRelative(0.932f, 1.522f)
                curveToRelative(0.188f, 0.308f, 0.517f, 0.478f, 0.854f, 0.478f)
                curveToRelative(0.178f, 0.0f, 0.358f, -0.048f, 0.521f, -0.147f)
                curveToRelative(0.471f, -0.288f, 0.619f, -0.903f, 0.33f, -1.375f)
                lineToRelative(-0.421f, -0.687f)
                curveToRelative(2.061f, -0.617f, 3.568f, -2.531f, 3.568f, -4.791f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(13.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(5.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 14.0f)
                close()
                moveTo(8.0f, 7.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.304f, 0.0f, 2.415f, 0.836f, 2.828f, 2.0f)
                lineTo(5.172f, 9.0f)
                curveToRelative(0.413f, -1.164f, 1.524f, -2.0f, 2.828f, -2.0f)
                close()
                moveTo(16.0f, 20.0f)
                lineTo(8.0f, 20.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _trainTram!!
    }

private var _trainTram: ImageVector? = null
