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

public val Icons.Outline.MapMarkerPlus: ImageVector
    get() {
        if (_mapMarkerPlus != null) {
            return _mapMarkerPlus!!
        }
        _mapMarkerPlus = Builder(name = "MapMarkerPlus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.394f, 478.877f)
                curveToRelative(44.856f, 43.881f, 116.497f, 44.06f, 161.572f, 0.404f)
                lineToRelative(84.946f, -78.499f)
                curveToRelative(92.021f, -90.795f, 93.014f, -238.997f, 2.218f, -331.017f)
                reflectiveCurveTo(184.133f, -23.249f, 92.113f, 67.547f)
                curveToRelative(-0.744f, 0.734f, -1.484f, 1.474f, -2.218f, 2.218f)
                curveTo(-1.508f, 161.182f, -1.496f, 309.387f, 89.921f, 400.79f)
                curveToRelative(0.189f, 0.189f, 0.379f, 0.378f, 0.569f, 0.567f)
                lineTo(174.394f, 478.877f)
                close()
                moveTo(119.983f, 99.854f)
                curveToRelative(74.626f, -74.955f, 195.885f, -75.222f, 270.84f, -0.596f)
                reflectiveCurveToRelative(75.222f, 195.885f, 0.596f, 270.84f)
                lineToRelative(-84.776f, 78.35f)
                curveToRelative(-28.956f, 27.252f, -74.174f, 27.084f, -102.927f, -0.383f)
                lineToRelative(-83.733f, -77.371f)
                curveToRelative(-74.79f, -74.79f, -74.791f, -196.048f, -0.002f, -270.839f)
                curveTo(119.982f, 99.855f, 119.983f, 99.854f, 119.983f, 99.854f)
                lineTo(119.983f, 99.854f)
                close()
                moveTo(149.008f, 235.274f)
                curveToRelative(0.0f, -11.752f, 9.527f, -21.279f, 21.279f, -21.279f)
                horizontalLineToRelative(63.837f)
                verticalLineToRelative(-63.837f)
                curveToRelative(0.0f, -11.752f, 9.527f, -21.279f, 21.279f, -21.279f)
                curveToRelative(11.752f, 0.0f, 21.279f, 9.527f, 21.279f, 21.279f)
                verticalLineToRelative(63.837f)
                horizontalLineToRelative(63.837f)
                curveToRelative(11.752f, 0.0f, 21.279f, 9.527f, 21.279f, 21.279f)
                reflectiveCurveToRelative(-9.527f, 21.279f, -21.279f, 21.279f)
                horizontalLineToRelative(-63.837f)
                verticalLineToRelative(63.837f)
                curveToRelative(0.0f, 11.752f, -9.527f, 21.279f, -21.279f, 21.279f)
                curveToRelative(-11.752f, 0.0f, -21.279f, -9.527f, -21.279f, -21.279f)
                verticalLineToRelative(-63.837f)
                horizontalLineToRelative(-63.837f)
                curveTo(158.535f, 256.553f, 149.008f, 247.026f, 149.008f, 235.274f)
                close()
            }
        }
        .build()
        return _mapMarkerPlus!!
    }

private var _mapMarkerPlus: ImageVector? = null
