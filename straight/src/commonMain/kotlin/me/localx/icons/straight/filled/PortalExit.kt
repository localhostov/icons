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

public val Icons.Filled.PortalExit: ImageVector
    get() {
        if (_portalExit != null) {
            return _portalExit!!
        }
        _portalExit = Builder(name = "PortalExit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(21.565f, 11.0f)
                lineToRelative(-2.135f, -3.547f)
                curveToRelative(-0.539f, -0.896f, -1.524f, -1.453f, -2.57f, -1.453f)
                horizontalLineToRelative(-7.478f)
                lineToRelative(-2.276f, 4.553f)
                lineToRelative(1.789f, 0.895f)
                lineToRelative(1.724f, -3.447f)
                horizontalLineToRelative(1.836f)
                lineToRelative(-1.753f, 4.273f)
                curveToRelative(-0.553f, 1.349f, -0.06f, 2.894f, 1.172f, 3.674f)
                lineToRelative(4.117f, 2.604f)
                verticalLineToRelative(5.449f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.551f)
                lineToRelative(-2.672f, -1.69f)
                lineToRelative(2.821f, -6.573f)
                lineToRelative(2.295f, 3.813f)
                horizontalLineToRelative(3.565f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.435f)
                close()
                moveTo(9.824f, 16.801f)
                lineToRelative(-0.494f, 1.199f)
                horizontalLineToRelative(-5.331f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.874f)
                curveToRelative(0.099f, -1.519f, 0.126f, -2.96f, 0.126f, -4.0f)
                curveToRelative(0.0f, -3.608f, -0.292f, -12.0f, -3.0f, -12.0f)
                reflectiveCurveTo(0.0f, 8.392f, 0.0f, 12.0f)
                reflectiveCurveToRelative(0.292f, 12.0f, 3.0f, 12.0f)
                curveToRelative(1.237f, 0.0f, 1.966f, -1.754f, 2.396f, -4.0f)
                horizontalLineToRelative(5.273f)
                lineToRelative(0.8f, -1.942f)
                lineToRelative(-0.665f, -0.421f)
                curveToRelative(-0.374f, -0.236f, -0.691f, -0.526f, -0.98f, -0.837f)
                close()
            }
        }
        .build()
        return _portalExit!!
    }

private var _portalExit: ImageVector? = null
