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

public val Icons.Outline.Swatchbook: ImageVector
    get() {
        if (_swatchbook != null) {
            return _swatchbook!!
        }
        _swatchbook = Builder(name = "Swatchbook", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 13.0f)
                horizontalLineToRelative(-1.222f)
                lineToRelative(1.05f, -1.05f)
                curveToRelative(0.756f, -0.755f, 1.172f, -1.76f, 1.172f, -2.829f)
                reflectiveCurveToRelative(-0.416f, -2.073f, -1.172f, -2.828f)
                lineToRelative(-2.121f, -2.121f)
                curveToRelative(-1.511f, -1.512f, -4.146f, -1.511f, -5.657f, 0.0f)
                lineToRelative(-1.05f, 1.05f)
                verticalLineToRelative(-1.222f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(1.794f, 0.0f, 0.0f, 1.794f, 0.0f, 4.0f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(14.5f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(13.464f, 5.586f)
                curveToRelative(0.755f, -0.755f, 2.072f, -0.756f, 2.829f, 0.0f)
                lineToRelative(2.121f, 2.121f)
                curveToRelative(0.378f, 0.378f, 0.586f, 0.88f, 0.586f, 1.414f)
                reflectiveCurveToRelative(-0.208f, 1.037f, -0.586f, 1.415f)
                lineToRelative(-7.414f, 7.414f)
                verticalLineToRelative(-9.9f)
                lineToRelative(2.464f, -2.464f)
                close()
                moveTo(2.0f, 8.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(4.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(2.0f, 18.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(22.0f, 20.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-10.222f)
                lineToRelative(7.0f, -7.0f)
                horizontalLineToRelative(3.222f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(5.5f, 20.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _swatchbook!!
    }

private var _swatchbook: ImageVector? = null
