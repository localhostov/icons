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

public val Icons.Outline.PortalEnter: ImageVector
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
                moveTo(21.0f, 0.0f)
                curveToRelative(-2.481f, 0.0f, -2.934f, 7.045f, -2.993f, 11.0f)
                horizontalLineToRelative(-1.446f)
                lineToRelative(-2.132f, -3.496f)
                curveToRelative(-0.54f, -0.896f, -1.524f, -1.452f, -2.57f, -1.452f)
                lineTo(3.382f, 6.052f)
                lineToRelative(-2.276f, 4.553f)
                lineToRelative(1.789f, 0.895f)
                lineToRelative(1.724f, -3.447f)
                horizontalLineToRelative(2.836f)
                lineToRelative(-1.753f, 4.272f)
                curveToRelative(-0.553f, 1.35f, -0.061f, 2.895f, 1.172f, 3.674f)
                lineToRelative(4.117f, 2.604f)
                verticalLineToRelative(5.449f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.551f)
                lineToRelative(-5.048f, -3.193f)
                curveToRelative(-0.411f, -0.26f, -0.575f, -0.774f, -0.391f, -1.224f)
                lineToRelative(2.064f, -5.032f)
                horizontalLineToRelative(1.88f)
                lineToRelative(-2.006f, 4.868f)
                lineToRelative(1.716f, 1.085f)
                lineToRelative(1.954f, -4.742f)
                lineToRelative(2.278f, 3.737f)
                horizontalLineToRelative(4.562f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -4.85f, 0.541f, -8.022f, 1.0f, -9.395f)
                curveToRelative(0.459f, 1.372f, 1.0f, 4.545f, 1.0f, 9.395f)
                reflectiveCurveToRelative(-0.54f, 8.021f, -1.0f, 9.394f)
                curveToRelative(-0.357f, -1.066f, -0.762f, -3.217f, -0.925f, -6.394f)
                horizontalLineToRelative(-2.005f)
                curveToRelative(0.184f, 3.95f, 0.829f, 9.0f, 2.93f, 9.0f)
                curveToRelative(2.708f, 0.0f, 3.0f, -8.392f, 3.0f, -12.0f)
                reflectiveCurveToRelative(-0.292f, -12.0f, -3.0f, -12.0f)
                close()
            }
        }
        .build()
        return _portalEnter!!
    }

private var _portalEnter: ImageVector? = null
