package me.localx.icons.rounded.filled

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

public val Icons.Filled.UserShield: ImageVector
    get() {
        if (_userShield != null) {
            return _userShield!!
        }
        _userShield = Builder(name = "UserShield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(4.691f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(18.501f, 24.0f)
                curveToRelative(-0.153f, 0.0f, -0.307f, -0.035f, -0.447f, -0.105f)
                lineToRelative(-0.201f, -0.101f)
                curveToRelative(-1.139f, -0.569f, -4.853f, -2.704f, -4.853f, -6.272f)
                verticalLineToRelative(-3.085f)
                curveToRelative(0.0f, -1.295f, 0.826f, -2.439f, 2.055f, -2.848f)
                lineToRelative(3.131f, -1.038f)
                curveToRelative(0.203f, -0.067f, 0.426f, -0.067f, 0.629f, 0.0f)
                lineToRelative(3.13f, 1.038f)
                curveToRelative(1.229f, 0.408f, 2.056f, 1.553f, 2.056f, 2.848f)
                verticalLineToRelative(3.085f)
                curveToRelative(0.0f, 4.032f, -3.764f, 5.858f, -4.917f, 6.322f)
                lineToRelative(-0.209f, 0.084f)
                curveToRelative(-0.12f, 0.048f, -0.247f, 0.072f, -0.373f, 0.072f)
                close()
                moveTo(11.0f, 17.521f)
                verticalLineToRelative(-2.042f)
                curveToRelative(0.0f, -0.56f, -0.373f, -1.057f, -0.914f, -1.203f)
                curveToRelative(-0.956f, -0.259f, -1.983f, -0.344f, -3.044f, -0.22f)
                curveTo(2.971f, 14.533f, 0.0f, 18.167f, 0.0f, 22.266f)
                verticalLineToRelative(0.734f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(13.498f)
                curveToRelative(-1.689f, -1.359f, -3.498f, -3.508f, -3.498f, -6.479f)
                close()
            }
        }
        .build()
        return _userShield!!
    }

private var _userShield: ImageVector? = null
