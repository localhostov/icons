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

public val Icons.Bold.ExternalWorld: ImageVector
    get() {
        if (_externalWorld != null) {
            return _externalWorld!!
        }
        _externalWorld = Builder(name = "ExternalWorld", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.818f, -0.393f, 1.544f, -1.0f, 2.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2.559f)
                lineToRelative(-3.159f, 3.583f)
                curveToRelative(-0.48f, 0.556f, -1.32f, 0.556f, -1.8f, 0.0f)
                lineToRelative(-3.159f, -3.583f)
                horizontalLineToRelative(2.559f)
                verticalLineToRelative(-4.5f)
                curveToRelative(-0.607f, -0.456f, -1.0f, -1.182f, -1.0f, -2.0f)
                close()
                moveTo(23.0f, 13.0f)
                curveToRelative(0.0f, 6.065f, -4.935f, 11.0f, -11.0f, 11.0f)
                reflectiveCurveTo(1.0f, 19.065f, 1.0f, 13.0f)
                curveTo(1.0f, 8.521f, 3.695f, 4.665f, 7.545f, 2.951f)
                curveToRelative(0.107f, 1.054f, 0.555f, 2.006f, 1.262f, 2.718f)
                curveToRelative(-2.373f, 1.038f, -4.134f, 3.199f, -4.643f, 5.803f)
                horizontalLineToRelative(3.314f)
                lineToRelative(2.282f, 2.582f)
                lineToRelative(0.06f, 0.418f)
                curveToRelative(0.34f, 2.246f, 1.357f, 4.204f, 2.176f, 5.473f)
                curveToRelative(0.819f, -1.273f, 1.839f, -3.235f, 2.181f, -5.473f)
                lineToRelative(0.056f, -0.428f)
                lineToRelative(2.287f, -2.572f)
                horizontalLineToRelative(3.315f)
                curveToRelative(-0.509f, -2.604f, -2.269f, -4.765f, -4.643f, -5.803f)
                curveToRelative(0.706f, -0.712f, 1.155f, -1.664f, 1.262f, -2.718f)
                curveToRelative(3.85f, 1.714f, 6.545f, 5.57f, 6.545f, 10.049f)
                close()
                moveTo(8.728f, 20.293f)
                curveToRelative(-0.838f, -1.547f, -1.661f, -3.558f, -1.929f, -5.821f)
                horizontalLineToRelative(-2.658f)
                curveToRelative(0.487f, 2.603f, 2.235f, 4.762f, 4.586f, 5.821f)
                close()
                moveTo(19.858f, 14.472f)
                horizontalLineToRelative(-2.658f)
                curveToRelative(-0.267f, 2.263f, -1.09f, 4.274f, -1.929f, 5.821f)
                curveToRelative(2.351f, -1.059f, 4.1f, -3.218f, 4.586f, -5.821f)
                close()
            }
        }
        .build()
        return _externalWorld!!
    }

private var _externalWorld: ImageVector? = null
