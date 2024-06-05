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

public val Icons.Outline.SaltShaker: ImageVector
    get() {
        if (_saltShaker != null) {
            return _saltShaker!!
        }
        _saltShaker = Builder(name = "SaltShaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.908f, 17.507f)
                lineToRelative(-1.908f, -9.606f)
                verticalLineToRelative(-1.901f)
                curveTo(20.0f, 0.0f, 14.394f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(4.0f, 0.0f, 4.0f, 6.0f)
                verticalLineToRelative(1.901f)
                lineToRelative(-1.924f, 9.686f)
                curveToRelative(-0.269f, 1.599f, 0.177f, 3.226f, 1.225f, 4.464f)
                curveToRelative(1.047f, 1.238f, 2.578f, 1.948f, 4.199f, 1.948f)
                horizontalLineToRelative(8.999f)
                curveToRelative(1.634f, 0.0f, 3.172f, -0.719f, 4.22f, -1.973f)
                curveToRelative(1.048f, -1.254f, 1.482f, -2.895f, 1.189f, -4.521f)
                close()
                moveTo(9.0f, 2.253f)
                verticalLineToRelative(0.747f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-0.977f)
                curveToRelative(0.318f, -0.014f, 0.647f, -0.023f, 1.0f, -0.023f)
                reflectiveCurveToRelative(0.682f, 0.009f, 1.0f, 0.023f)
                verticalLineToRelative(0.977f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-0.747f)
                curveToRelative(2.161f, 0.461f, 3.0f, 1.597f, 3.0f, 3.747f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.15f, 0.839f, -3.286f, 3.0f, -3.747f)
                close()
                moveTo(19.184f, 20.744f)
                curveToRelative(-0.667f, 0.798f, -1.646f, 1.255f, -2.686f, 1.255f)
                lineTo(7.5f, 21.999f)
                curveToRelative(-1.032f, 0.0f, -2.006f, -0.452f, -2.672f, -1.24f)
                reflectiveCurveToRelative(-0.95f, -1.823f, -0.784f, -2.812f)
                lineToRelative(1.777f, -8.948f)
                horizontalLineToRelative(12.358f)
                lineToRelative(1.764f, 8.879f)
                curveToRelative(0.185f, 1.023f, -0.092f, 2.068f, -0.759f, 2.866f)
                close()
                moveTo(14.0f, 18.499f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 14.499f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _saltShaker!!
    }

private var _saltShaker: ImageVector? = null
