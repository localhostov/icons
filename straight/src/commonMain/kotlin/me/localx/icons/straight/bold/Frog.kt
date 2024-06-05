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

public val Icons.Bold.Frog: ImageVector
    get() {
        if (_frog != null) {
            return _frog!!
        }
        _frog = Builder(name = "Frog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.332f, 8.507f)
                curveToRelative(0.96f, -1.086f, 0.871f, -2.752f, -0.199f, -3.714f)
                curveToRelative(-1.129f, -1.016f, -2.711f, -1.838f, -4.437f, -2.322f)
                curveToRelative(-0.602f, -1.449f, -2.031f, -2.471f, -3.696f, -2.471f)
                curveToRelative(-1.763f, 0.0f, -3.263f, 1.146f, -3.794f, 2.732f)
                curveTo(1.967f, 7.309f, 0.0f, 14.054f, 0.0f, 18.963f)
                curveToRelative(0.0f, 2.777f, 2.243f, 5.037f, 5.0f, 5.037f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.962f, 0.154f, -1.996f, 0.359f, -2.948f)
                lineToRelative(5.856f, 8.448f)
                horizontalLineToRelative(3.785f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.215f)
                lineToRelative(-5.672f, -8.183f)
                curveToRelative(3.139f, -0.527f, 6.314f, -2.154f, 8.218f, -4.31f)
                close()
                moveTo(15.0f, 2.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(13.0f, 10.0f)
                horizontalLineToRelative(-1.019f)
                lineToRelative(-0.376f, 0.947f)
                curveToRelative(-0.038f, 0.096f, -0.571f, 1.453f, -1.012f, 3.251f)
                curveToRelative(-1.002f, -0.752f, -2.247f, -1.198f, -3.593f, -1.198f)
                horizontalLineToRelative(-0.414f)
                curveToRelative(-0.562f, 0.937f, -0.975f, 1.936f, -1.237f, 3.0f)
                horizontalLineToRelative(1.65f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.914f, -2.0f, -2.037f)
                curveToRelative(0.0f, -5.531f, 2.862f, -9.9f, 8.512f, -13.007f)
                curveToRelative(0.686f, 1.219f, 1.992f, 2.044f, 3.488f, 2.044f)
                curveToRelative(1.634f, 0.0f, 3.042f, -0.985f, 3.662f, -2.392f)
                curveToRelative(0.832f, 0.306f, 1.582f, 0.708f, 2.178f, 1.175f)
                curveToRelative(-1.834f, 1.879f, -5.063f, 3.217f, -7.84f, 3.217f)
                close()
            }
        }
        .build()
        return _frog!!
    }

private var _frog: ImageVector? = null
