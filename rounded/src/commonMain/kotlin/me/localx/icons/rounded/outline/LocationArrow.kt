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

public val Icons.Outline.LocationArrow: ImageVector
    get() {
        if (_locationArrow != null) {
            return _locationArrow!!
        }
        _locationArrow = Builder(name = "LocationArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.858f, 1.142f)
                curveToRelative(-1.089f, -1.09f, -2.663f, -1.429f, -4.136f, -0.874f)
                lineTo(2.328f, 7.062f)
                curveTo(0.392f, 7.791f, -0.206f, 9.598f, 0.061f, 11.064f)
                curveToRelative(0.268f, 1.468f, 1.464f, 2.948f, 3.534f, 2.948f)
                horizontalLineToRelative(6.379f)
                verticalLineToRelative(6.394f)
                curveToRelative(0.0f, 2.069f, 1.48f, 3.266f, 2.947f, 3.532f)
                curveToRelative(0.219f, 0.04f, 0.445f, 0.061f, 0.674f, 0.061f)
                curveToRelative(1.309f, 0.0f, 2.708f, -0.674f, 3.319f, -2.295f)
                lineToRelative(6.83f, -16.457f)
                curveToRelative(0.544f, -1.442f, 0.205f, -3.016f, -0.886f, -4.105f)
                close()
                moveTo(21.884f, 4.511f)
                lineToRelative(-6.83f, 16.457f)
                curveToRelative(-0.346f, 0.915f, -1.145f, 1.118f, -1.774f, 1.004f)
                curveToRelative(-0.632f, -0.115f, -1.307f, -0.587f, -1.307f, -1.565f)
                verticalLineToRelative(-7.394f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(3.595f, 12.013f)
                curveToRelative(-0.979f, 0.0f, -1.451f, -0.675f, -1.566f, -1.307f)
                curveToRelative(-0.114f, -0.631f, 0.089f, -1.429f, 1.035f, -1.785f)
                lineTo(19.458f, 2.127f)
                curveToRelative(0.226f, -0.085f, 0.455f, -0.127f, 0.68f, -0.127f)
                curveToRelative(0.481f, 0.0f, 0.942f, 0.191f, 1.307f, 0.556f)
                curveToRelative(0.535f, 0.535f, 0.695f, 1.278f, 0.44f, 1.955f)
                close()
            }
        }
        .build()
        return _locationArrow!!
    }

private var _locationArrow: ImageVector? = null
