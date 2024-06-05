package me.localx.icons.rounded.bold

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

public val Icons.Bold.Chip: ImageVector
    get() {
        if (_chip != null) {
            return _chip!!
        }
        _chip = Builder(name = "Chip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.5f, 3.135f)
                curveToRelative(2.117f, 0.357f, 3.983f, 1.451f, 5.325f, 3.014f)
                lineToRelative(-1.745f, 1.049f)
                curveToRelative(-0.948f, -1.002f, -2.185f, -1.726f, -3.579f, -2.032f)
                lineTo(13.501f, 3.135f)
                close()
                moveTo(10.5f, 3.135f)
                verticalLineToRelative(2.03f)
                curveToRelative(-1.394f, 0.306f, -2.631f, 1.03f, -3.579f, 2.032f)
                lineToRelative(-1.745f, -1.049f)
                curveToRelative(1.342f, -1.563f, 3.208f, -2.656f, 5.325f, -3.014f)
                close()
                moveTo(3.0f, 12.0f)
                curveToRelative(0.0f, -1.159f, 0.228f, -2.263f, 0.628f, -3.281f)
                lineToRelative(1.744f, 1.048f)
                curveToRelative(-0.237f, 0.702f, -0.372f, 1.452f, -0.372f, 2.233f)
                reflectiveCurveToRelative(0.134f, 1.531f, 0.372f, 2.233f)
                lineToRelative(-1.744f, 1.048f)
                curveToRelative(-0.4f, -1.018f, -0.628f, -2.122f, -0.628f, -3.281f)
                close()
                moveTo(10.5f, 20.865f)
                curveToRelative(-2.117f, -0.357f, -3.983f, -1.45f, -5.324f, -3.013f)
                lineToRelative(1.746f, -1.049f)
                curveToRelative(0.948f, 1.002f, 2.185f, 1.725f, 3.579f, 2.031f)
                verticalLineToRelative(2.031f)
                close()
                moveTo(8.0f, 12.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                close()
                moveTo(13.5f, 20.865f)
                verticalLineToRelative(-2.031f)
                curveToRelative(1.394f, -0.306f, 2.631f, -1.029f, 3.579f, -2.031f)
                lineToRelative(1.746f, 1.049f)
                curveToRelative(-1.342f, 1.563f, -3.208f, 2.656f, -5.324f, 3.013f)
                close()
                moveTo(20.372f, 15.281f)
                lineToRelative(-1.744f, -1.048f)
                curveToRelative(0.237f, -0.702f, 0.372f, -1.452f, 0.372f, -2.233f)
                reflectiveCurveToRelative(-0.134f, -1.531f, -0.372f, -2.233f)
                lineToRelative(1.744f, -1.048f)
                curveToRelative(0.401f, 1.018f, 0.628f, 2.123f, 0.628f, 3.281f)
                reflectiveCurveToRelative(-0.228f, 2.263f, -0.628f, 3.281f)
                close()
            }
        }
        .build()
        return _chip!!
    }

private var _chip: ImageVector? = null
