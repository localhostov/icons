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

public val Icons.Filled.CameraRetro: ImageVector
    get() {
        if (_cameraRetro != null) {
            return _cameraRetro!!
        }
        _cameraRetro = Builder(name = "CameraRetro", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 12.0f)
                verticalLineToRelative(-4.0f)
                curveTo(0.0f, 5.243f, 2.243f, 3.0f, 5.0f, 3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.171f)
                curveToRelative(0.267f, 0.0f, 0.519f, -0.104f, 0.708f, -0.293f)
                lineToRelative(1.828f, -1.828f)
                curveToRelative(0.566f, -0.566f, 1.32f, -0.879f, 2.122f, -0.879f)
                horizontalLineToRelative(5.171f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-6.09f)
                curveToRelative(-0.478f, -2.833f, -2.942f, -5.0f, -5.91f, -5.0f)
                reflectiveCurveToRelative(-5.431f, 2.167f, -5.91f, 5.0f)
                lineTo(0.0f, 12.0f)
                close()
                moveTo(8.0f, 13.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                close()
                moveTo(17.91f, 14.0f)
                curveToRelative(-0.478f, 2.833f, -2.942f, 5.0f, -5.91f, 5.0f)
                reflectiveCurveToRelative(-5.431f, -2.167f, -5.91f, -5.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-6.09f)
                close()
            }
        }
        .build()
        return _cameraRetro!!
    }

private var _cameraRetro: ImageVector? = null
