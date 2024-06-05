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

public val Icons.Filled.StreetView: ImageVector
    get() {
        if (_streetView != null) {
            return _streetView!!
        }
        _streetView = Builder(name = "StreetView", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(7.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.304f, -0.836f, 2.416f, -2.0f, 2.829f)
                verticalLineToRelative(4.171f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-4.171f)
                curveToRelative(-1.164f, -0.413f, -2.0f, -1.525f, -2.0f, -2.829f)
                close()
                moveTo(18.203f, 15.587f)
                curveToRelative(-0.296f, -0.061f, -0.601f, 0.014f, -0.834f, 0.204f)
                curveToRelative(-0.233f, 0.189f, -0.369f, 0.475f, -0.369f, 0.775f)
                verticalLineToRelative(2.372f)
                curveToRelative(0.0f, 1.563f, -1.198f, 2.889f, -2.757f, 2.991f)
                curveToRelative(-0.701f, 0.046f, -1.449f, 0.071f, -2.243f, 0.071f)
                reflectiveCurveToRelative(-1.542f, -0.025f, -2.243f, -0.071f)
                curveToRelative(-1.56f, -0.102f, -2.757f, -1.427f, -2.757f, -2.991f)
                verticalLineToRelative(-2.372f)
                curveToRelative(0.0f, -0.301f, -0.136f, -0.586f, -0.369f, -0.775f)
                curveToRelative(-0.232f, -0.19f, -0.54f, -0.265f, -0.834f, -0.204f)
                curveToRelative(-3.738f, 0.775f, -5.797f, 2.165f, -5.797f, 3.913f)
                curveToRelative(0.0f, 3.092f, 6.221f, 4.5f, 12.0f, 4.5f)
                reflectiveCurveToRelative(12.0f, -1.408f, 12.0f, -4.5f)
                curveToRelative(0.0f, -1.748f, -2.059f, -3.138f, -5.797f, -3.913f)
                close()
            }
        }
        .build()
        return _streetView!!
    }

private var _streetView: ImageVector? = null
