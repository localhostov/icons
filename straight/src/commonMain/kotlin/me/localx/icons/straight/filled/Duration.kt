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

public val Icons.Filled.Duration: ImageVector
    get() {
        if (_duration != null) {
            return _duration!!
        }
        _duration = Builder(name = "Duration", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.455f, 12.0f)
                curveToRelative(-0.591f, -0.52f, -2.154f, -2.09f, -2.417f, -4.354f)
                curveToRelative(-0.048f, -0.412f, 0.084f, -0.827f, 0.363f, -1.139f)
                curveToRelative(0.287f, -0.322f, 0.7f, -0.507f, 1.131f, -0.507f)
                horizontalLineToRelative(4.936f)
                curveToRelative(0.432f, 0.0f, 0.844f, 0.185f, 1.131f, 0.507f)
                curveToRelative(0.278f, 0.312f, 0.411f, 0.728f, 0.363f, 1.139f)
                curveToRelative(-0.259f, 2.212f, -1.721f, 3.739f, -2.421f, 4.354f)
                curveToRelative(1.137f, 0.991f, 2.451f, 2.617f, 2.451f, 4.841f)
                lineToRelative(0.059f, 1.159f)
                horizontalLineToRelative(-8.003f)
                lineToRelative(-0.055f, -1.109f)
                curveToRelative(0.0f, -2.274f, 1.319f, -3.901f, 2.461f, -4.891f)
                close()
                moveTo(6.598f, 3.593f)
                lineToRelative(-1.087f, -1.688f)
                curveToRelative(-0.962f, 0.62f, -1.83f, 1.372f, -2.58f, 2.238f)
                lineToRelative(1.517f, 1.315f)
                curveToRelative(0.624f, -0.719f, 1.346f, -1.347f, 2.15f, -1.865f)
                close()
                moveTo(12.0f, 2.0f)
                lineTo(12.0f, 0.0f)
                curveToRelative(-1.15f, 0.0f, -2.288f, 0.163f, -3.381f, 0.483f)
                lineToRelative(0.565f, 1.926f)
                curveToRelative(0.894f, -0.262f, 1.837f, -0.409f, 2.816f, -0.409f)
                close()
                moveTo(2.91f, 7.85f)
                lineToRelative(-1.828f, -0.836f)
                curveToRelative(-0.477f, 1.042f, -0.8f, 2.146f, -0.961f, 3.28f)
                lineToRelative(1.992f, 0.284f)
                curveToRelative(0.137f, -0.96f, 0.408f, -1.876f, 0.797f, -2.728f)
                close()
                moveTo(2.113f, 13.423f)
                lineToRelative(-1.992f, 0.284f)
                curveToRelative(0.162f, 1.135f, 0.485f, 2.239f, 0.962f, 3.281f)
                lineToRelative(1.828f, -0.836f)
                curveToRelative(-0.39f, -0.852f, -0.661f, -1.768f, -0.798f, -2.729f)
                close()
                moveTo(20.92f, 4.0f)
                horizontalLineToRelative(2.08f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.123f)
                curveToRelative(1.893f, 1.867f, 3.0f, 4.435f, 3.0f, 7.123f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-2.994f, 0.0f, -5.806f, -1.326f, -7.715f, -3.637f)
                lineToRelative(-1.542f, 1.273f)
                curveToRelative(2.29f, 2.773f, 5.664f, 4.363f, 9.257f, 4.363f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                curveToRelative(0.0f, -2.971f, -1.129f, -5.817f, -3.08f, -8.0f)
                close()
            }
        }
        .build()
        return _duration!!
    }

private var _duration: ImageVector? = null
