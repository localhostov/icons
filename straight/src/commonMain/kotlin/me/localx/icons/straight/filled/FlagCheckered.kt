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

public val Icons.Filled.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 6.962f)
                curveToRelative(-1.346f, -0.384f, -2.714f, -0.749f, -4.0f, -0.89f)
                lineTo(8.001f, 0.072f)
                curveToRelative(1.286f, 0.141f, 2.654f, 0.506f, 4.0f, 0.89f)
                lineTo(12.001f, 6.962f)
                close()
                moveTo(14.001f, 7.509f)
                curveToRelative(1.072f, 0.276f, 2.112f, 0.491f, 3.0f, 0.491f)
                curveToRelative(0.289f, 0.0f, 0.627f, -0.034f, 1.001f, -0.094f)
                lineTo(18.002f, 1.948f)
                curveToRelative(-0.331f, 0.033f, -0.666f, 0.052f, -1.0f, 0.052f)
                curveToRelative(-0.887f, 0.0f, -1.928f, -0.216f, -3.0f, -0.491f)
                lineTo(14.002f, 7.509f)
                close()
                moveTo(20.002f, 7.447f)
                curveToRelative(1.313f, -0.366f, 2.75f, -0.862f, 3.999f, -1.329f)
                lineTo(24.001f, 0.09f)
                lineToRelative(-1.413f, 0.64f)
                curveToRelative(-0.017f, 0.008f, -1.105f, 0.495f, -2.586f, 0.863f)
                lineTo(20.002f, 7.447f)
                close()
                moveTo(20.002f, 9.515f)
                verticalLineToRelative(6.132f)
                curveToRelative(1.893f, -0.416f, 3.325f, -1.055f, 3.413f, -1.095f)
                lineToRelative(0.587f, -0.266f)
                verticalLineToRelative(-6.037f)
                curveToRelative(-1.244f, 0.451f, -2.671f, 0.924f, -4.0f, 1.266f)
                close()
                moveTo(18.002f, 9.919f)
                curveToRelative(-0.359f, 0.048f, -0.701f, 0.082f, -1.001f, 0.082f)
                curveToRelative(-0.947f, 0.0f, -1.965f, -0.184f, -3.0f, -0.431f)
                verticalLineToRelative(6.0f)
                curveToRelative(1.034f, 0.247f, 2.053f, 0.431f, 3.001f, 0.431f)
                curveToRelative(0.336f, 0.0f, 0.67f, -0.018f, 1.0f, -0.046f)
                verticalLineToRelative(-6.036f)
                close()
                moveTo(12.001f, 9.039f)
                curveToRelative(-0.091f, -0.026f, -0.184f, -0.051f, -0.275f, -0.077f)
                curveToRelative(-1.272f, -0.363f, -2.572f, -0.731f, -3.725f, -0.884f)
                verticalLineToRelative(6.0f)
                curveToRelative(1.153f, 0.153f, 2.454f, 0.521f, 3.726f, 0.884f)
                curveToRelative(0.091f, 0.026f, 0.183f, 0.051f, 0.274f, 0.077f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(6.001f, 6.104f)
                lineTo(6.001f, 0.066f)
                curveTo(3.119f, 0.411f, 0.563f, 2.088f, 0.444f, 2.168f)
                lineTo(0.0f, 2.465f)
                lineTo(0.0f, 24.0f)
                lineTo(1.999f, 24.0f)
                lineTo(1.999f, 15.563f)
                curveToRelative(0.744f, -0.425f, 2.325f, -1.222f, 4.001f, -1.476f)
                verticalLineToRelative(-5.959f)
                curveToRelative(-1.123f, 0.245f, -2.579f, 0.815f, -4.0f, 1.456f)
                verticalLineToRelative(-2.186f)
                curveToRelative(1.391f, -0.587f, 2.819f, -1.092f, 4.0f, -1.295f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
