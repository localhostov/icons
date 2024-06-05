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

public val Icons.Bold.DroneFront: ImageVector
    get() {
        if (_droneFront != null) {
            return _droneFront!!
        }
        _droneFront = Builder(name = "DroneFront", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 2.133f, -1.492f, 3.925f, -3.488f, 4.385f)
                curveToRelative(1.978f, 1.529f, 3.31f, 3.86f, 3.485f, 6.517f)
                curveToRelative(0.054f, 0.827f, -0.572f, 1.541f, -1.398f, 1.595f)
                curveToRelative(-0.034f, 0.002f, -0.067f, 0.003f, -0.101f, 0.003f)
                curveToRelative(-0.783f, 0.0f, -1.442f, -0.608f, -1.495f, -1.402f)
                curveToRelative(-0.126f, -1.926f, -1.167f, -3.595f, -2.683f, -4.598f)
                horizontalLineToRelative(-6.64f)
                curveToRelative(-1.515f, 1.003f, -2.556f, 2.673f, -2.683f, 4.598f)
                curveToRelative(-0.055f, 0.827f, -0.753f, 1.452f, -1.596f, 1.398f)
                curveToRelative(-0.826f, -0.054f, -1.452f, -0.768f, -1.398f, -1.595f)
                curveToRelative(0.175f, -2.656f, 1.507f, -4.988f, 3.485f, -6.517f)
                curveToRelative(-1.996f, -0.46f, -3.488f, -2.252f, -3.488f, -4.385f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _droneFront!!
    }

private var _droneFront: ImageVector? = null
