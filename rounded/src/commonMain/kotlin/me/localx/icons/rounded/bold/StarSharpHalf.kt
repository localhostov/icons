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

public val Icons.Bold.StarSharpHalf: ImageVector
    get() {
        if (_starSharpHalf != null) {
            return _starSharpHalf!!
        }
        _starSharpHalf = Builder(name = "StarSharpHalf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.437f, 0.384f)
                curveToRelative(-0.356f, -0.285f, -0.819f, -0.393f, -1.267f, -0.292f)
                curveToRelative(-1.244f, 0.279f, -2.225f, 1.187f, -2.625f, 2.428f)
                lineToRelative(-1.144f, 3.568f)
                horizontalLineToRelative(-3.772f)
                curveToRelative(-1.599f, 0.0f, -2.951f, 0.981f, -3.446f, 2.501f)
                curveToRelative(-0.496f, 1.52f, 0.018f, 3.11f, 1.307f, 4.052f)
                lineToRelative(3.08f, 2.252f)
                lineToRelative(-1.169f, 3.618f)
                curveToRelative(-0.493f, 1.527f, 0.028f, 3.119f, 1.329f, 4.056f)
                curveToRelative(0.636f, 0.458f, 1.378f, 0.687f, 2.121f, 0.687f)
                curveToRelative(0.753f, 0.0f, 1.507f, -0.236f, 2.148f, -0.707f)
                lineToRelative(3.389f, -2.492f)
                curveToRelative(0.385f, -0.283f, 0.611f, -0.731f, 0.611f, -1.208f)
                lineTo(12.999f, 1.555f)
                curveToRelative(0.0f, -0.456f, -0.207f, -0.886f, -0.563f, -1.171f)
                close()
                moveTo(10.0f, 18.086f)
                lineToRelative(-2.776f, 2.042f)
                curveToRelative(-0.231f, 0.169f, -0.507f, 0.171f, -0.739f, 0.004f)
                curveToRelative(-0.244f, -0.176f, -0.321f, -0.412f, -0.228f, -0.7f)
                lineToRelative(1.502f, -4.65f)
                curveToRelative(0.198f, -0.616f, -0.02f, -1.29f, -0.542f, -1.672f)
                lineToRelative(-3.956f, -2.893f)
                curveToRelative(-0.243f, -0.177f, -0.318f, -0.413f, -0.226f, -0.699f)
                curveToRelative(0.094f, -0.286f, 0.294f, -0.431f, 0.595f, -0.431f)
                horizontalLineToRelative(4.867f)
                curveToRelative(0.652f, 0.0f, 1.229f, -0.421f, 1.429f, -1.042f)
                lineToRelative(0.074f, -0.232f)
                verticalLineToRelative(10.273f)
                close()
            }
        }
        .build()
        return _starSharpHalf!!
    }

private var _starSharpHalf: ImageVector? = null
