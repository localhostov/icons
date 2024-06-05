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

public val Icons.Filled.LocationCrosshairsSlash: ImageVector
    get() {
        if (_locationCrosshairsSlash != null) {
            return _locationCrosshairsSlash!!
        }
        _locationCrosshairsSlash = Builder(name = "LocationCrosshairsSlash", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.049f)
                curveToRelative(-0.226f, -2.293f, -1.228f, -4.42f, -2.88f, -6.071f)
                curveToRelative(-1.651f, -1.651f, -3.778f, -2.653f, -6.071f, -2.879f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.049f)
                curveToRelative(-1.963f, 0.194f, -3.804f, 0.956f, -5.329f, 2.207f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineTo(22.543f, 23.957f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-4.214f, -4.214f)
                curveToRelative(1.251f, -1.525f, 2.014f, -3.366f, 2.207f, -5.329f)
                horizontalLineToRelative(2.049f)
                close()
                moveTo(16.214f, 14.714f)
                lineToRelative(-1.471f, -1.471f)
                curveToRelative(0.19f, -0.398f, 0.3f, -0.832f, 0.3f, -1.286f)
                curveToRelative(0.0f, -0.802f, -0.312f, -1.555f, -0.878f, -2.121f)
                curveToRelative(-0.921f, -0.921f, -2.292f, -1.106f, -3.406f, -0.577f)
                lineToRelative(-1.473f, -1.473f)
                curveToRelative(1.94f, -1.283f, 4.585f, -1.071f, 6.292f, 0.636f)
                curveToRelative(0.944f, 0.944f, 1.464f, 2.199f, 1.464f, 3.535f)
                curveToRelative(0.0f, 0.996f, -0.291f, 1.946f, -0.829f, 2.757f)
                close()
                moveTo(16.625f, 20.867f)
                curveToRelative(-1.121f, 0.586f, -2.348f, 0.945f, -3.625f, 1.073f)
                verticalLineToRelative(2.06f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.049f)
                curveToRelative(-2.293f, -0.226f, -4.42f, -1.228f, -6.071f, -2.879f)
                curveToRelative(-1.651f, -1.651f, -2.654f, -3.778f, -2.88f, -6.071f)
                lineTo(0.0f, 13.001f)
                verticalLineToRelative(-2.0f)
                lineTo(2.06f, 11.001f)
                curveToRelative(0.127f, -1.277f, 0.486f, -2.504f, 1.072f, -3.625f)
                lineToRelative(3.935f, 3.935f)
                curveToRelative(-0.031f, 0.228f, -0.067f, 0.456f, -0.067f, 0.69f)
                curveToRelative(0.0f, 1.336f, 0.52f, 2.591f, 1.464f, 3.535f)
                curveToRelative(0.975f, 0.975f, 2.255f, 1.462f, 3.536f, 1.462f)
                curveToRelative(0.231f, 0.0f, 0.46f, -0.034f, 0.689f, -0.066f)
                lineToRelative(3.936f, 3.936f)
                close()
            }
        }
        .build()
        return _locationCrosshairsSlash!!
    }

private var _locationCrosshairsSlash: ImageVector? = null
