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

public val Icons.Bold.CallHistory: ImageVector
    get() {
        if (_callHistory != null) {
            return _callHistory!!
        }
        _callHistory = Builder(name = "CallHistory", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 24.0f)
                curveTo(9.351f, 24.23f, -5.077f, 9.785f, 1.863f, 1.938f)
                curveTo(1.888f, 1.914f, 2.954f, 0.984f, 2.954f, 0.984f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 4.907f, 0.041f)
                lineToRelative(2.153f, 2.319f)
                arcToRelative(3.522f, 3.522f, 0.0f, false, true, -0.039f, 4.909f)
                lineToRelative(-0.389f, 0.394f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 5.756f, 5.777f)
                lineToRelative(0.41f, -0.4f)
                arcToRelative(3.583f, 3.583f, 0.0f, false, true, 4.945f, 0.0f)
                lineTo(22.935f, 16.1f)
                arcToRelative(3.509f, 3.509f, 0.0f, false, true, 0.081f, 4.946f)
                reflectiveCurveToRelative(-0.93f, 1.067f, -0.954f, 1.092f)
                arcTo(6.4f, 6.4f, 0.0f, false, true, 17.5f, 24.0f)
                close()
                moveTo(3.95f, 4.1f)
                curveTo(-0.91f, 10.117f, 14.643f, 24.773f, 19.905f, 20.05f)
                curveToRelative(0.0f, 0.0f, 0.924f, -1.059f, 0.949f, -1.084f)
                arcToRelative(0.482f, 0.482f, 0.0f, false, false, 0.0f, -0.706f)
                lineToRelative(-2.238f, -2.074f)
                curveToRelative(-0.3f, -0.25f, -0.468f, -0.253f, -0.748f, -0.04f)
                lineToRelative(-1.135f, 1.117f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.587f, 0.332f)
                arcTo(14.849f, 14.849f, 0.0f, false, true, 6.414f, 8.878f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.322f, -1.611f)
                lineTo(7.845f, 6.14f)
                arcToRelative(0.482f, 0.482f, 0.0f, false, false, 0.009f, -0.715f)
                lineTo(5.7f, 3.106f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.668f, 0.04f)
                curveTo(5.009f, 3.171f, 3.95f, 4.1f, 3.95f, 4.1f)
                close()
                moveTo(23.65f, 10.933f)
                arcTo(8.543f, 8.543f, 0.0f, false, false, 13.071f, 0.353f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.858f, 2.875f)
                arcToRelative(5.535f, 5.535f, 0.0f, false, true, 6.843f, 6.844f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.01f, 1.866f)
                arcToRelative(1.519f, 1.519f, 0.0f, false, false, 0.429f, 0.062f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 23.647f, 10.928f)
                close()
                moveTo(18.064f, 11.066f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -2.122f)
                lineTo(17.0f, 7.879f)
                lineTo(17.0f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.439f, 1.061f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 0.0f)
                close()
            }
        }
        .build()
        return _callHistory!!
    }

private var _callHistory: ImageVector? = null
