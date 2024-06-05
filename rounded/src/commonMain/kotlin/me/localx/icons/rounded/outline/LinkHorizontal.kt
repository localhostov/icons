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

public val Icons.Outline.LinkHorizontal: ImageVector
    get() {
        if (_linkHorizontal != null) {
            return _linkHorizontal!!
        }
        _linkHorizontal = Builder(name = "LinkHorizontal", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.771f, 13.38f)
                curveToRelative(-0.198f, 0.239f, -0.483f, 0.363f, -0.771f, 0.363f)
                curveToRelative(-0.224f, 0.0f, -0.45f, -0.075f, -0.636f, -0.229f)
                curveToRelative(-1.502f, -1.24f, -2.363f, -3.068f, -2.363f, -5.015f)
                curveTo(0.0f, 4.916f, 2.916f, 2.0f, 6.5f, 2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(3.584f, 0.0f, 6.5f, 2.916f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.916f, 6.5f, -6.5f, 6.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.019f, -4.5f, -4.5f, -4.5f)
                lineTo(6.5f, 4.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                curveToRelative(0.0f, 1.348f, 0.597f, 2.613f, 1.637f, 3.472f)
                curveToRelative(0.426f, 0.352f, 0.486f, 0.982f, 0.134f, 1.408f)
                close()
                moveTo(21.637f, 10.485f)
                curveToRelative(-0.426f, -0.35f, -1.056f, -0.29f, -1.408f, 0.135f)
                curveToRelative(-0.352f, 0.426f, -0.292f, 1.057f, 0.134f, 1.408f)
                curveToRelative(1.04f, 0.858f, 1.637f, 2.124f, 1.637f, 3.472f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.019f, -4.5f, 4.5f, -4.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-3.584f, 0.0f, -6.5f, 2.916f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.916f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(3.584f, 0.0f, 6.5f, -2.916f, 6.5f, -6.5f)
                curveToRelative(0.0f, -1.946f, -0.861f, -3.774f, -2.363f, -5.015f)
                close()
            }
        }
        .build()
        return _linkHorizontal!!
    }

private var _linkHorizontal: ImageVector? = null
