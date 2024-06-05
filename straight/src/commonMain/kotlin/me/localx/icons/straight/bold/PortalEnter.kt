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

public val Icons.Bold.PortalEnter: ImageVector
    get() {
        if (_portalEnter != null) {
            return _portalEnter!!
        }
        _portalEnter = Builder(name = "PortalEnter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(4.392f, 17.028f)
                lineToRelative(-0.401f, 0.972f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(0.892f, -2.164f)
                lineToRelative(-1.215f, -0.692f)
                curveToRelative(-0.499f, -0.314f, -0.918f, -0.698f, -1.285f, -1.116f)
                close()
                moveTo(21.0f, 0.0f)
                curveToRelative(-1.486f, 0.0f, -2.72f, 4.325f, -2.958f, 10.0f)
                horizontalLineToRelative(-3.361f)
                lineToRelative(-2.455f, -2.806f)
                curveToRelative(-0.665f, -0.759f, -1.625f, -1.194f, -2.634f, -1.194f)
                lineTo(2.817f, 6.0f)
                lineTo(0.61f, 11.436f)
                lineToRelative(2.779f, 1.129f)
                lineToRelative(1.447f, -3.564f)
                horizontalLineToRelative(1.667f)
                lineToRelative(-1.265f, 3.084f)
                curveToRelative(-0.646f, 1.573f, -0.07f, 3.375f, 1.428f, 4.322f)
                lineToRelative(4.333f, 2.466f)
                verticalLineToRelative(5.128f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.872f)
                lineToRelative(-4.439f, -2.525f)
                lineToRelative(1.668f, -3.992f)
                lineToRelative(2.09f, 2.389f)
                horizontalLineToRelative(6.681f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.902f)
                curveToRelative(0.333f, 5.173f, 1.504f, 9.0f, 2.902f, 9.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -5.373f, 3.0f, -12.0f)
                reflectiveCurveTo(22.657f, 0.0f, 21.0f, 0.0f)
                close()
            }
        }
        .build()
        return _portalEnter!!
    }

private var _portalEnter: ImageVector? = null
