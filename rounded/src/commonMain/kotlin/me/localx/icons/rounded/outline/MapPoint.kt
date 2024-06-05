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

public val Icons.Outline.MapPoint: ImageVector
    get() {
        if (_mapPoint != null) {
            return _mapPoint!!
        }
        _mapPoint = Builder(name = "MapPoint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.336f, 10.366f)
                curveToRelative(0.459f, 0.449f, 1.061f, 0.674f, 1.664f, 0.674f)
                reflectiveCurveToRelative(1.205f, -0.225f, 1.663f, -0.673f)
                lineToRelative(1.872f, -1.831f)
                curveToRelative(0.944f, -0.944f, 1.465f, -2.2f, 1.465f, -3.536f)
                reflectiveCurveToRelative(-0.521f, -2.592f, -1.465f, -3.536f)
                curveToRelative(-0.945f, -0.944f, -2.2f, -1.464f, -3.535f, -1.464f)
                reflectiveCurveToRelative(-2.592f, 0.52f, -3.535f, 1.464f)
                curveToRelative(-0.944f, 0.944f, -1.465f, 2.2f, -1.465f, 3.536f)
                reflectiveCurveToRelative(0.523f, 2.595f, 1.48f, 3.551f)
                lineToRelative(1.856f, 1.815f)
                close()
                moveTo(9.879f, 2.878f)
                curveToRelative(0.565f, -0.566f, 1.319f, -0.878f, 2.121f, -0.878f)
                reflectiveCurveToRelative(1.555f, 0.312f, 2.121f, 0.879f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.319f, 0.879f, 2.121f)
                reflectiveCurveToRelative(-0.312f, 1.555f, -0.871f, 2.114f)
                lineToRelative(-1.864f, 1.824f)
                curveToRelative(-0.146f, 0.143f, -0.384f, 0.142f, -0.529f, 0.0f)
                lineToRelative(-1.849f, -1.808f)
                curveToRelative(-0.572f, -0.571f, -0.887f, -1.327f, -0.887f, -2.129f)
                reflectiveCurveToRelative(0.312f, -1.555f, 0.879f, -2.122f)
                close()
                moveTo(23.0f, 6.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.258f)
                curveToRelative(-0.526f, 0.0f, -1.042f, -0.213f, -1.414f, -0.586f)
                lineToRelative(-2.621f, -2.621f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(2.621f, 2.621f)
                curveToRelative(0.744f, 0.745f, 1.774f, 1.172f, 2.828f, 1.172f)
                horizontalLineToRelative(2.258f)
                verticalLineToRelative(3.0f)
                lineTo(10.0f, 21.0f)
                verticalLineToRelative(-1.757f)
                curveToRelative(0.0f, -1.068f, -0.416f, -2.073f, -1.172f, -2.829f)
                lineToRelative(-2.242f, -2.242f)
                curveToRelative(-0.755f, -0.756f, -1.76f, -1.172f, -2.829f, -1.172f)
                horizontalLineToRelative(-1.757f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(2.0f, 7.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                lineTo(0.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(22.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineToRelative(1.757f)
                curveToRelative(0.534f, 0.0f, 1.037f, 0.208f, 1.415f, 0.586f)
                lineToRelative(2.242f, 2.242f)
                curveToRelative(0.378f, 0.378f, 0.586f, 0.88f, 0.586f, 1.415f)
                verticalLineToRelative(1.757f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(10.5f, 5.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _mapPoint!!
    }

private var _mapPoint: ImageVector? = null
