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
                moveToRelative(10.5f, 2.551f)
                curveTo(10.5f, 1.171f, 11.619f, 0.051f, 13.0f, 0.051f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(4.825f, 16.852f)
                lineToRelative(-0.494f, 1.199f)
                lineTo(0.0f, 18.051f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.669f)
                lineToRelative(0.8f, -1.942f)
                lineToRelative(-0.665f, -0.421f)
                curveToRelative(-0.374f, -0.236f, -0.691f, -0.526f, -0.98f, -0.837f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 3.608f, -0.292f, 12.0f, -3.0f, 12.0f)
                curveToRelative(-2.101f, 0.0f, -2.746f, -5.05f, -2.93f, -9.0f)
                horizontalLineToRelative(1.93f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.562f)
                lineToRelative(-2.3f, -3.772f)
                lineToRelative(-2.837f, 6.572f)
                lineToRelative(2.688f, 1.701f)
                verticalLineToRelative(6.551f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.449f)
                lineToRelative(-4.117f, -2.604f)
                curveToRelative(-1.233f, -0.779f, -1.726f, -2.324f, -1.172f, -3.674f)
                lineToRelative(1.753f, -4.272f)
                horizontalLineToRelative(-2.836f)
                lineToRelative(-1.724f, 3.447f)
                lineToRelative(-1.789f, -0.895f)
                lineToRelative(2.276f, -4.553f)
                horizontalLineToRelative(8.478f)
                curveToRelative(1.046f, 0.0f, 2.03f, 0.557f, 2.57f, 1.452f)
                lineToRelative(2.132f, 3.496f)
                horizontalLineToRelative(1.446f)
                curveToRelative(0.059f, -3.955f, 0.512f, -11.0f, 2.993f, -11.0f)
                curveToRelative(2.708f, 0.0f, 3.0f, 8.392f, 3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _portalEnter!!
    }

private var _portalEnter: ImageVector? = null
