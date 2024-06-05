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

public val Icons.Bold.CameraRetro: ImageVector
    get() {
        if (_cameraRetro != null) {
            return _cameraRetro!!
        }
        _cameraRetro = Builder(name = "CameraRetro", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                horizontalLineToRelative(-4.671f)
                curveToRelative(-0.935f, 0.0f, -1.814f, 0.364f, -2.475f, 1.025f)
                lineToRelative(-1.828f, 1.828f)
                curveToRelative(-0.095f, 0.095f, -0.22f, 0.146f, -0.354f, 0.146f)
                horizontalLineToRelative(-2.171f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.713f)
                curveTo(1.695f, 3.869f, 0.0f, 5.988f, 0.0f, 8.5f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(5.5f, 6.0f)
                horizontalLineToRelative(3.671f)
                curveToRelative(0.935f, 0.0f, 1.814f, -0.364f, 2.475f, -1.025f)
                lineToRelative(1.828f, -1.828f)
                curveToRelative(0.095f, -0.095f, 0.22f, -0.146f, 0.354f, -0.146f)
                horizontalLineToRelative(4.671f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-3.713f)
                curveToRelative(-0.655f, -2.305f, -2.775f, -4.0f, -5.287f, -4.0f)
                reflectiveCurveToRelative(-4.632f, 1.695f, -5.287f, 4.0f)
                horizontalLineToRelative(-3.713f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(14.5f, 13.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                close()
                moveTo(18.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.713f)
                curveToRelative(0.655f, 2.305f, 2.775f, 4.0f, 5.287f, 4.0f)
                reflectiveCurveToRelative(4.632f, -1.695f, 5.287f, -4.0f)
                horizontalLineToRelative(3.713f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _cameraRetro!!
    }

private var _cameraRetro: ImageVector? = null
