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

public val Icons.Filled.KiwiBird: ImageVector
    get() {
        if (_kiwiBird != null) {
            return _kiwiBird!!
        }
        _kiwiBird = Builder(name = "KiwiBird", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.67f, 5.887f)
                curveToRelative(0.301f, -0.765f, 0.414f, -1.608f, 0.265f, -2.459f)
                curveToRelative(-0.295f, -1.684f, -1.674f, -3.067f, -3.354f, -3.362f)
                curveToRelative(-1.239f, -0.217f, -2.495f, 0.119f, -3.442f, 0.925f)
                curveToRelative(-1.171f, 0.997f, -3.054f, 2.185f, -5.368f, 2.185f)
                horizontalLineToRelative(-0.107f)
                curveTo(4.125f, 3.176f, 0.329f, 6.604f, 0.021f, 10.98f)
                curveToRelative(-0.172f, 2.447f, 0.719f, 4.84f, 2.445f, 6.566f)
                curveToRelative(0.85f, 0.85f, 1.865f, 1.488f, 2.965f, 1.904f)
                lineToRelative(0.569f, 4.551f)
                horizontalLineToRelative(2.191f)
                lineToRelative(-0.499f, -4.035f)
                curveToRelative(0.235f, 0.02f, 0.47f, 0.035f, 0.707f, 0.035f)
                curveToRelative(0.198f, 0.0f, 0.397f, -0.007f, 0.597f, -0.021f)
                curveToRelative(0.487f, -0.035f, 0.961f, -0.116f, 1.422f, -0.227f)
                lineToRelative(0.531f, 4.249f)
                horizontalLineToRelative(2.168f)
                lineToRelative(-0.707f, -5.0f)
                curveToRelative(2.733f, -1.436f, 4.59f, -4.268f, 4.59f, -7.482f)
                verticalLineToRelative(-2.887f)
                curveToRelative(0.005f, -0.036f, 0.046f, -0.098f, 0.083f, -0.132f)
                curveToRelative(0.495f, -0.01f, 0.964f, -0.127f, 1.404f, -0.312f)
                curveToRelative(4.075f, 3.201f, 4.513f, 8.813f, 4.513f, 8.813f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -5.556f, -2.192f, -9.459f, -3.33f, -11.113f)
                close()
                moveTo(17.5f, 6.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _kiwiBird!!
    }

private var _kiwiBird: ImageVector? = null
