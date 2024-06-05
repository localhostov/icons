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

public val Icons.Outline.MapMarkerCross: ImageVector
    get() {
        if (_mapMarkerCross != null) {
            return _mapMarkerCross!!
        }
        _mapMarkerCross = Builder(name = "MapMarkerCross", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(177.854f, 284.209f)
                lineToRelative(48.776f, -48.776f)
                lineToRelative(-48.776f, -48.776f)
                curveToRelative(-8.45f, -8.161f, -8.685f, -21.628f, -0.523f, -30.078f)
                curveToRelative(8.161f, -8.45f, 21.628f, -8.685f, 30.078f, -0.523f)
                curveToRelative(0.177f, 0.171f, 0.352f, 0.346f, 0.523f, 0.523f)
                lineToRelative(48.776f, 48.776f)
                lineToRelative(48.776f, -48.776f)
                curveToRelative(8.162f, -8.45f, 21.628f, -8.684f, 30.078f, -0.522f)
                curveToRelative(8.45f, 8.162f, 8.684f, 21.628f, 0.522f, 30.078f)
                curveToRelative(-0.171f, 0.177f, -0.345f, 0.351f, -0.522f, 0.522f)
                lineToRelative(-48.776f, 48.776f)
                lineToRelative(48.776f, 48.776f)
                curveToRelative(8.45f, 8.162f, 8.684f, 21.628f, 0.522f, 30.078f)
                curveToRelative(-8.162f, 8.45f, -21.628f, 8.684f, -30.078f, 0.522f)
                curveToRelative(-0.177f, -0.171f, -0.351f, -0.345f, -0.522f, -0.522f)
                lineToRelative(-48.776f, -48.776f)
                lineToRelative(-48.776f, 48.776f)
                curveToRelative(-8.45f, 8.162f, -21.916f, 7.928f, -30.078f, -0.522f)
                curveTo(169.892f, 305.522f, 169.892f, 292.453f, 177.854f, 284.209f)
                lineTo(177.854f, 284.209f)
                close()
                moveTo(91.853f, 401.458f)
                curveTo(-0.62f, 311.19f, -2.408f, 163.048f, 87.861f, 70.574f)
                reflectiveCurveToRelative(238.411f, -94.261f, 330.884f, -3.992f)
                curveToRelative(1.149f, 1.122f, 2.287f, 2.256f, 3.413f, 3.401f)
                curveToRelative(91.373f, 91.377f, 91.373f, 239.524f, 0.0f, 330.901f)
                lineToRelative(-84.916f, 78.471f)
                curveToRelative(-45.059f, 43.64f, -116.675f, 43.461f, -161.515f, -0.404f)
                lineTo(91.853f, 401.458f)
                close()
                moveTo(65.264f, 235.434f)
                curveToRelative(-0.139f, 50.802f, 20.052f, 99.548f, 56.072f, 135.372f)
                lineToRelative(83.704f, 77.343f)
                curveToRelative(28.737f, 27.463f, 73.939f, 27.641f, 102.891f, 0.404f)
                lineToRelative(84.746f, -78.322f)
                curveToRelative(74.605f, -74.929f, 74.344f, -196.15f, -0.585f, -270.755f)
                reflectiveCurveToRelative(-196.15f, -74.344f, -270.755f, 0.585f)
                curveTo(85.315f, 135.885f, 65.125f, 184.632f, 65.264f, 235.434f)
                close()
            }
        }
        .build()
        return _mapMarkerCross!!
    }

private var _mapMarkerCross: ImageVector? = null
