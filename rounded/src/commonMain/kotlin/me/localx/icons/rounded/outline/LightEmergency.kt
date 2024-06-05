package me.localx.icons.rounded.outline

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

public val Icons.Outline.LightEmergency: ImageVector
    get() {
        if (_lightEmergency != null) {
            return _lightEmergency!!
        }
        _lightEmergency = Builder(name = "LightEmergency", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 17.126f)
                verticalLineToRelative(-8.126f)
                curveTo(21.0f, 4.037f, 16.963f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.0f, 4.037f, 3.0f, 9.0f)
                verticalLineToRelative(8.126f)
                curveToRelative(-1.724f, 0.445f, -3.0f, 2.013f, -3.0f, 3.874f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.861f, -1.276f, -3.429f, -3.0f, -3.874f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(3.859f, 0.0f, 7.0f, 3.141f, 7.0f, 7.0f)
                verticalLineToRelative(8.0f)
                lineTo(5.0f, 17.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -3.859f, 3.141f, -7.0f, 7.0f, -7.0f)
                close()
                moveTo(21.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(8.0f, 9.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _lightEmergency!!
    }

private var _lightEmergency: ImageVector? = null
