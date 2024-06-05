package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.HeadVr: ImageVector
    get() {
        if (_headVr != null) {
            return _headVr!!
        }
        _headVr = Builder(name = "HeadVr", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.055f, 10.0f)
                lineTo(10.126f, 10.0f)
                curveToRelative(0.445f, 1.724f, 2.013f, 3.0f, 3.874f, 3.0f)
                horizontalLineToRelative(10.0f)
                lineTo(24.0f, 5.0f)
                horizontalLineToRelative(-3.772f)
                curveToRelative(-0.149f, -0.22f, -0.292f, -0.415f, -0.427f, -0.581f)
                curveTo(17.363f, 1.164f, 13.486f, -0.451f, 9.453f, 0.106f)
                curveTo(4.457f, 0.793f, 0.501f, 4.946f, 0.046f, 9.983f)
                curveToRelative(-0.265f, 2.935f, 0.622f, 5.792f, 2.497f, 8.046f)
                curveToRelative(0.295f, 0.353f, 0.457f, 0.801f, 0.457f, 1.262f)
                verticalLineToRelative(4.709f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.247f)
                curveToRelative(1.5f, 0.0f, 2.778f, -1.121f, 2.974f, -2.606f)
                lineToRelative(0.449f, -3.394f)
                horizontalLineToRelative(-2.017f)
                lineToRelative(-0.415f, 3.132f)
                curveToRelative(-0.065f, 0.495f, -0.491f, 0.868f, -0.991f, 0.868f)
                horizontalLineToRelative(-4.247f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 22.0f)
                verticalLineToRelative(-2.709f)
                curveToRelative(0.0f, -0.928f, -0.327f, -1.831f, -0.92f, -2.542f)
                curveToRelative(-1.534f, -1.843f, -2.26f, -4.182f, -2.042f, -6.586f)
                curveToRelative(0.005f, -0.055f, 0.011f, -0.109f, 0.017f, -0.163f)
                close()
                moveTo(22.0f, 11.0f)
                lineTo(14.0f, 11.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(9.725f, 2.088f)
                curveToRelative(3.025f, -0.42f, 5.946f, 0.656f, 7.967f, 2.912f)
                horizontalLineToRelative(-3.692f)
                curveToRelative(-1.861f, 0.0f, -3.429f, 1.276f, -3.874f, 3.0f)
                lineTo(2.513f, 8.0f)
                curveToRelative(1.101f, -3.097f, 3.872f, -5.454f, 7.211f, -5.912f)
                close()
            }
        }
        .build()
        return _headVr!!
    }

private var _headVr: ImageVector? = null
