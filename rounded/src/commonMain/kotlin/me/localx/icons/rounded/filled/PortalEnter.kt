package me.localx.icons.rounded.filled

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

public val Icons.Filled.PortalEnter: ImageVector
    get() {
        if (_portalEnter != null) {
            return _portalEnter!!
        }
        _portalEnter = Builder(name = "PortalEnter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.431f, 18.115f)
                curveToRelative(-0.458f, 1.145f, -1.552f, 1.885f, -2.785f, 1.885f)
                lineTo(1.0f, 20.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.646f)
                curveToRelative(0.411f, 0.0f, 0.776f, -0.247f, 0.929f, -0.629f)
                curveToRelative(0.205f, -0.513f, 0.785f, -0.764f, 1.3f, -0.557f)
                curveToRelative(0.513f, 0.205f, 0.762f, 0.787f, 0.557f, 1.301f)
                close()
                moveTo(13.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(21.0f, 0.0f)
                curveToRelative(-2.481f, 0.0f, -2.934f, 7.045f, -2.993f, 11.0f)
                horizontalLineToRelative(-1.377f)
                curveToRelative(-0.351f, 0.0f, -0.675f, -0.184f, -0.856f, -0.484f)
                lineToRelative(-1.844f, -3.064f)
                curveToRelative(-0.543f, -0.901f, -1.518f, -1.453f, -2.57f, -1.453f)
                horizontalLineToRelative(-2.367f)
                curveToRelative(-0.032f, -0.002f, -0.063f, -0.002f, -0.095f, 0.0f)
                horizontalLineToRelative(-2.662f)
                curveToRelative(-1.136f, 0.0f, -2.175f, 0.642f, -2.683f, 1.658f)
                lineToRelative(-1.447f, 2.895f)
                curveToRelative(-0.247f, 0.494f, -0.047f, 1.095f, 0.447f, 1.342f)
                curveToRelative(0.495f, 0.246f, 1.095f, 0.047f, 1.342f, -0.447f)
                lineToRelative(1.447f, -2.895f)
                curveToRelative(0.169f, -0.339f, 0.515f, -0.552f, 0.894f, -0.552f)
                horizontalLineToRelative(1.218f)
                lineToRelative(-1.753f, 4.273f)
                curveToRelative(-0.553f, 1.349f, -0.06f, 2.894f, 1.173f, 3.675f)
                lineToRelative(4.125f, 2.604f)
                verticalLineToRelative(4.448f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.343f, -0.176f, -0.663f, -0.466f, -0.846f)
                lineToRelative(-2.042f, -1.289f)
                lineToRelative(2.5f, -6.094f)
                lineToRelative(1.069f, 1.776f)
                curveToRelative(0.543f, 0.902f, 1.518f, 1.453f, 2.571f, 1.453f)
                horizontalLineToRelative(2.386f)
                curveToRelative(0.545f, 0.0f, 0.987f, 0.444f, 0.983f, 0.989f)
                curveToRelative(0.0f, 0.007f, 0.0f, 0.014f, 0.0f, 0.02f)
                curveToRelative(-0.004f, 0.539f, -0.461f, 0.988f, -1.0f, 0.99f)
                curveToRelative(-0.551f, 0.039f, -0.9f, 0.52f, -0.861f, 1.071f)
                curveToRelative(0.563f, 7.929f, 2.233f, 7.929f, 2.861f, 7.929f)
                curveToRelative(2.708f, 0.0f, 3.0f, -8.392f, 3.0f, -12.0f)
                reflectiveCurveToRelative(-0.292f, -12.0f, -3.0f, -12.0f)
                close()
            }
        }
        .build()
        return _portalEnter!!
    }

private var _portalEnter: ImageVector? = null
