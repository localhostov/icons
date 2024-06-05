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

public val Icons.Outline.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) {
            return _cameraSlash!!
        }
        _cameraSlash = Builder(name = "CameraSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-1.536f, -1.536f)
                curveToRelative(0.538f, -0.813f, 0.829f, -1.771f, 0.829f, -2.757f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-0.017f)
                lineToRelative(-1.834f, -2.69f)
                curveToRelative(-0.559f, -0.82f, -1.485f, -1.31f, -2.479f, -1.31f)
                horizontalLineToRelative(-3.34f)
                curveToRelative(-0.993f, 0.0f, -1.92f, 0.489f, -2.479f, 1.31f)
                lineToRelative(-1.673f, 2.455f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(21.0f, 10.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.451f, -0.102f, 0.892f, -0.293f, 1.293f)
                lineToRelative(-3.903f, -3.903f)
                curveToRelative(0.13f, -0.45f, 0.196f, -0.915f, 0.196f, -1.39f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-0.474f, 0.0f, -0.94f, 0.066f, -1.39f, 0.196f)
                lineToRelative(-2.196f, -2.196f)
                horizontalLineToRelative(9.586f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(10.33f, 3.0f)
                horizontalLineToRelative(3.34f)
                curveToRelative(0.331f, 0.0f, 0.64f, 0.163f, 0.826f, 0.437f)
                lineToRelative(1.066f, 1.563f)
                horizontalLineToRelative(-7.124f)
                lineToRelative(1.066f, -1.563f)
                curveToRelative(0.187f, -0.273f, 0.495f, -0.437f, 0.826f, -0.437f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(6.0f, 23.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.881f, 0.231f, -1.745f, 0.67f, -2.502f)
                curveToRelative(0.277f, -0.478f, 0.887f, -0.642f, 1.367f, -0.363f)
                curveToRelative(0.478f, 0.277f, 0.641f, 0.889f, 0.363f, 1.367f)
                curveToRelative(-0.262f, 0.451f, -0.4f, 0.97f, -0.4f, 1.498f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
