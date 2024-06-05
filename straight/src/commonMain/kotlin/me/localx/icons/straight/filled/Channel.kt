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

public val Icons.Filled.Channel: ImageVector
    get() {
        if (_channel != null) {
            return _channel!!
        }
        _channel = Builder(name = "Channel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 9.5f)
                curveToRelative(-1.025f, 0.0f, -1.903f, 0.618f, -2.289f, 1.5f)
                horizontalLineToRelative(-3.353f)
                curveToRelative(-0.176f, -0.677f, -0.515f, -1.286f, -0.987f, -1.774f)
                curveToRelative(0.45f, -0.734f, 1.144f, -1.867f, 1.747f, -2.853f)
                curveToRelative(0.954f, 0.131f, 1.94f, -0.295f, 2.475f, -1.169f)
                curveToRelative(0.721f, -1.177f, 0.351f, -2.717f, -0.826f, -3.438f)
                reflectiveCurveToRelative(-2.717f, -0.351f, -3.438f, 0.827f)
                curveToRelative(-0.535f, 0.874f, -0.467f, 1.946f, 0.084f, 2.736f)
                curveToRelative(-0.607f, 0.991f, -1.304f, 2.13f, -1.753f, 2.863f)
                curveToRelative(-0.37f, -0.113f, -0.754f, -0.192f, -1.16f, -0.192f)
                reflectiveCurveToRelative(-0.79f, 0.079f, -1.16f, 0.192f)
                curveToRelative(-0.449f, -0.733f, -1.147f, -1.872f, -1.753f, -2.863f)
                curveToRelative(0.551f, -0.79f, 0.619f, -1.862f, 0.084f, -2.736f)
                curveToRelative(-0.721f, -1.177f, -2.26f, -1.548f, -3.438f, -0.827f)
                reflectiveCurveToRelative(-1.548f, 2.26f, -0.826f, 3.438f)
                curveToRelative(0.535f, 0.874f, 1.521f, 1.3f, 2.475f, 1.169f)
                curveToRelative(0.604f, 0.986f, 1.298f, 2.119f, 1.747f, 2.853f)
                curveToRelative(-0.472f, 0.488f, -0.811f, 1.098f, -0.987f, 1.774f)
                horizontalLineToRelative(-3.353f)
                curveToRelative(-0.386f, -0.882f, -1.264f, -1.5f, -2.289f, -1.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                curveToRelative(1.025f, 0.0f, 1.903f, -0.618f, 2.289f, -1.5f)
                horizontalLineToRelative(3.353f)
                curveToRelative(0.176f, 0.677f, 0.515f, 1.286f, 0.987f, 1.774f)
                lineToRelative(-1.747f, 2.853f)
                curveToRelative(-0.954f, -0.132f, -1.94f, 0.295f, -2.475f, 1.169f)
                curveToRelative(-0.721f, 1.177f, -0.351f, 2.717f, 0.826f, 3.438f)
                reflectiveCurveToRelative(2.717f, 0.351f, 3.438f, -0.826f)
                curveToRelative(0.535f, -0.874f, 0.467f, -1.945f, -0.084f, -2.735f)
                lineToRelative(1.754f, -2.863f)
                curveToRelative(0.369f, 0.113f, 0.753f, 0.192f, 1.159f, 0.192f)
                reflectiveCurveToRelative(0.79f, -0.079f, 1.159f, -0.192f)
                lineToRelative(1.754f, 2.863f)
                curveToRelative(-0.551f, 0.79f, -0.619f, 1.862f, -0.084f, 2.735f)
                curveToRelative(0.721f, 1.177f, 2.26f, 1.547f, 3.438f, 0.826f)
                reflectiveCurveToRelative(1.548f, -2.26f, 0.826f, -3.438f)
                curveToRelative(-0.535f, -0.874f, -1.521f, -1.3f, -2.475f, -1.169f)
                lineToRelative(-1.747f, -2.853f)
                curveToRelative(0.472f, -0.488f, 0.811f, -1.098f, 0.987f, -1.774f)
                horizontalLineToRelative(3.353f)
                curveToRelative(0.386f, 0.882f, 1.264f, 1.5f, 2.289f, 1.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _channel!!
    }

private var _channel: ImageVector? = null
