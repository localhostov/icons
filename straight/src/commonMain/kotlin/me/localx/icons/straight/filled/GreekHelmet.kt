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

public val Icons.Filled.GreekHelmet: ImageVector
    get() {
        if (_greekHelmet != null) {
            return _greekHelmet!!
        }
        _greekHelmet = Builder(name = "GreekHelmet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 19.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(-0.037f, 24.0f)
                lineToRelative(2.339f, -3.946f)
                curveToRelative(0.457f, -0.771f, 0.698f, -1.653f, 0.698f, -2.549f)
                verticalLineToRelative(-5.505f)
                curveTo(3.0f, 5.383f, 8.383f, 0.0f, 15.0f, 0.0f)
                curveToRelative(2.911f, 0.0f, 5.719f, 1.056f, 7.906f, 2.973f)
                lineToRelative(0.749f, 0.657f)
                lineToRelative(-2.686f, 3.087f)
                curveToRelative(-1.449f, -1.632f, -3.54f, -2.684f, -5.856f, -2.716f)
                curveToRelative(-2.151f, -0.042f, -4.194f, 0.788f, -5.73f, 2.303f)
                curveToRelative(-1.536f, 1.516f, -2.383f, 3.539f, -2.383f, 5.696f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(19.0f, 13.0f)
                lineToRelative(1.429f, 2.859f)
                curveToRelative(0.494f, 0.988f, 1.698f, 1.384f, 2.682f, 0.881f)
                lineToRelative(-2.128f, -4.535f)
                verticalLineToRelative(-0.528f)
                curveToRelative(-0.173f, -3.058f, -2.816f, -5.634f, -5.897f, -5.677f)
                curveToRelative(-0.883f, 0.0f, -1.859f, 0.153f, -2.648f, 0.55f)
                curveToRelative(-2.184f, 1.099f, -3.438f, 3.174f, -3.438f, 5.45f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.958f, -0.81f, 3.728f, -2.111f, 5.0f)
                lineTo(23.0f, 24.0f)
                lineToRelative(-3.018f, -6.904f)
                lineToRelative(-4.982f, -2.096f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _greekHelmet!!
    }

private var _greekHelmet: ImageVector? = null
