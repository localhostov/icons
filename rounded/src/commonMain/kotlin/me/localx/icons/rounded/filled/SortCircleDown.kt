package me.localx.icons.rounded.filled

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

public val Icons.Filled.SortCircleDown: ImageVector
    get() {
        if (_sortCircleDown != null) {
            return _sortCircleDown!!
        }
        _sortCircleDown = Builder(name = "SortCircleDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.577f, 9.0f)
                horizontalLineToRelative(-5.154f)
                lineToRelative(2.467f, -2.454f)
                curveToRelative(0.076f, -0.076f, 0.143f, -0.078f, 0.223f, 0.002f)
                lineToRelative(2.465f, 2.452f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(6.075f, 10.382f)
                curveToRelative(0.155f, 0.374f, 0.52f, 0.618f, 0.925f, 0.618f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.405f, 0.0f, 0.77f, -0.244f, 0.925f, -0.618f)
                curveToRelative(0.154f, -0.375f, 0.067f, -0.805f, -0.22f, -1.091f)
                lineToRelative(-4.181f, -4.159f)
                curveToRelative(-0.814f, -0.814f, -2.236f, -0.812f, -3.047f, -0.002f)
                lineToRelative(-4.183f, 4.161f)
                curveToRelative(-0.287f, 0.286f, -0.374f, 0.716f, -0.22f, 1.091f)
                close()
                moveTo(17.136f, 13.0f)
                lineTo(6.864f, 13.0f)
                curveToRelative(-0.795f, 0.0f, -1.189f, 0.966f, -0.62f, 1.521f)
                lineToRelative(4.607f, 4.503f)
                curveToRelative(0.635f, 0.635f, 1.663f, 0.635f, 2.298f, 0.0f)
                lineToRelative(4.607f, -4.503f)
                curveToRelative(0.569f, -0.556f, 0.175f, -1.521f, -0.62f, -1.521f)
                close()
            }
        }
        .build()
        return _sortCircleDown!!
    }

private var _sortCircleDown: ImageVector? = null
