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

public val Icons.Bold.Camcorder: ImageVector
    get() {
        if (_camcorder != null) {
            return _camcorder!!
        }
        _camcorder = Builder(name = "Camcorder", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 11.0f)
                lineTo(6.5f, 11.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(22.602f, 8.769f)
                curveToRelative(-0.862f, -0.432f, -1.876f, -0.34f, -2.648f, 0.238f)
                lineToRelative(-1.193f, 0.894f)
                curveToRelative(-0.668f, -2.195f, -2.676f, -3.807f, -5.066f, -3.892f)
                lineToRelative(-3.536f, -3.984f)
                curveToRelative(-0.661f, -0.661f, -1.54f, -1.025f, -2.475f, -1.025f)
                lineTo(1.5f, 1.0f)
                curveTo(0.672f, 1.0f, 0.0f, 1.671f, 0.0f, 2.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                lineTo(7.685f, 4.0f)
                curveToRelative(0.132f, 0.0f, 0.26f, 0.053f, 0.292f, 0.081f)
                lineToRelative(1.702f, 1.919f)
                lineTo(5.5f, 6.0f)
                curveTo(2.468f, 6.0f, 0.0f, 8.467f, 0.0f, 11.5f)
                verticalLineToRelative(7.0f)
                curveTo(0.0f, 21.533f, 2.468f, 24.0f, 5.5f, 24.0f)
                lineTo(13.5f, 24.0f)
                curveToRelative(2.476f, 0.0f, 4.575f, -1.646f, 5.261f, -3.902f)
                lineToRelative(1.193f, 0.895f)
                curveToRelative(0.449f, 0.336f, 0.979f, 0.508f, 1.515f, 0.508f)
                curveToRelative(0.386f, 0.0f, 0.772f, -0.089f, 1.134f, -0.27f)
                curveToRelative(0.862f, -0.431f, 1.397f, -1.297f, 1.397f, -2.261f)
                verticalLineToRelative(-7.939f)
                curveToRelative(0.0f, -0.964f, -0.535f, -1.831f, -1.397f, -2.261f)
                close()
                moveTo(16.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                lineTo(13.5f, 9.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _camcorder!!
    }

private var _camcorder: ImageVector? = null
