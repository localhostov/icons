package me.localx.icons.straight.outline

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

public val Icons.Outline.SmartHome: ImageVector
    get() {
        if (_smartHome != null) {
            return _smartHome!!
        }
        _smartHome = Builder(name = "SmartHome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.812f, 7.635f)
                lineTo(13.908f, 0.658f)
                curveToRelative(-1.123f, -0.881f, -2.692f, -0.879f, -3.815f, 0.0f)
                lineTo(1.188f, 7.635f)
                curveToRelative(-0.755f, 0.591f, -1.188f, 1.479f, -1.188f, 2.439f)
                verticalLineToRelative(13.926f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.926f)
                curveToRelative(0.0f, -0.96f, -0.433f, -1.849f, -1.188f, -2.439f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-11.926f)
                curveToRelative(0.0f, -0.341f, 0.153f, -0.655f, 0.421f, -0.865f)
                lineTo(11.326f, 2.232f)
                curveToRelative(0.396f, -0.311f, 0.952f, -0.311f, 1.349f, 0.0f)
                lineToRelative(8.905f, 6.977f)
                curveToRelative(0.267f, 0.21f, 0.42f, 0.524f, 0.42f, 0.865f)
                verticalLineToRelative(11.926f)
                close()
                moveTo(13.5f, 17.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(15.536f, 13.465f)
                lineToRelative(-1.414f, 1.414f)
                curveToRelative(-1.17f, -1.17f, -3.073f, -1.17f, -4.243f, 0.0f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(1.949f, -1.949f, 5.122f, -1.949f, 7.071f, 0.0f)
                close()
                moveTo(18.364f, 10.636f)
                lineToRelative(-1.414f, 1.414f)
                curveToRelative(-2.729f, -2.729f, -7.17f, -2.729f, -9.899f, 0.0f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(3.509f, -3.51f, 9.219f, -3.51f, 12.728f, 0.0f)
                close()
            }
        }
        .build()
        return _smartHome!!
    }

private var _smartHome: ImageVector? = null
