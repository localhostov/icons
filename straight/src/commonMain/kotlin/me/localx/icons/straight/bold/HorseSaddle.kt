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

public val Icons.Bold.HorseSaddle: ImageVector
    get() {
        if (_horseSaddle != null) {
            return _horseSaddle!!
        }
        _horseSaddle = Builder(name = "HorseSaddle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.286f, 6.205f)
                curveToRelative(-1.399f, -0.672f, -2.607f, -1.251f, -3.062f, -3.069f)
                lineToRelative(-0.224f, -0.898f)
                lineTo(19.0f, 0.0f)
                curveToRelative(-1.369f, 0.0f, -2.524f, 0.918f, -2.883f, 2.172f)
                curveToRelative(-3.72f, 0.813f, -5.117f, 4.352f, -5.117f, 6.828f)
                horizontalLineToRelative(-2.506f)
                curveToRelative(-1.354f, 0.0f, -2.646f, 0.627f, -3.472f, 1.578f)
                curveTo(1.643f, 11.713f, 0.0f, 14.468f, 0.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -2.199f, 0.447f, -3.51f, 1.092f, -4.329f)
                curveToRelative(0.182f, 1.086f, 0.586f, 1.994f, 0.954f, 2.819f)
                curveToRelative(0.176f, 0.396f, 0.345f, 0.775f, 0.475f, 1.144f)
                lineToRelative(-0.742f, 5.366f)
                horizontalLineToRelative(4.828f)
                lineToRelative(0.5f, -4.0f)
                horizontalLineToRelative(3.894f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.79f)
                lineToRelative(0.365f, -1.278f)
                curveToRelative(0.421f, -1.475f, 0.635f, -3.0f, 0.635f, -4.533f)
                verticalLineToRelative(-1.075f)
                lineToRelative(4.0f, -0.5f)
                verticalLineToRelative(-1.91f)
                curveToRelative(0.0f, -1.146f, -0.667f, -2.207f, -1.714f, -2.709f)
                close()
                moveTo(17.0f, 8.676f)
                verticalLineToRelative(3.723f)
                curveToRelative(0.0f, 1.254f, -0.175f, 2.502f, -0.52f, 3.709f)
                lineToRelative(-0.255f, 0.892f)
                horizontalLineToRelative(-8.121f)
                curveToRelative(-0.104f, -0.249f, -0.212f, -0.492f, -0.318f, -0.73f)
                curveToRelative(-0.425f, -0.955f, -0.792f, -1.779f, -0.792f, -2.772f)
                curveToRelative(0.001f, -0.825f, 0.675f, -1.497f, 1.5f, -1.497f)
                horizontalLineToRelative(0.506f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.367f, 0.085f, -3.289f, 2.739f, -3.892f)
                curveToRelative(0.74f, 1.658f, 1.942f, 2.575f, 3.09f, 3.214f)
                lineToRelative(-2.829f, 0.354f)
                close()
            }
        }
        .build()
        return _horseSaddle!!
    }

private var _horseSaddle: ImageVector? = null
