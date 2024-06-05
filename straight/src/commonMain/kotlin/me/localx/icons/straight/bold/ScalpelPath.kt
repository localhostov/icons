package me.localx.icons.straight.bold

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

public val Icons.Bold.ScalpelPath: ImageVector
    get() {
        if (_scalpelPath != null) {
            return _scalpelPath!!
        }
        _scalpelPath = Builder(name = "ScalpelPath", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.825f, 17.593f)
                lineToRelative(0.41f, -2.182f)
                lineToRelative(8.594f, -8.595f)
                curveToRelative(1.56f, -1.56f, 1.56f, -4.097f, 0.0f, -5.656f)
                curveToRelative(-1.511f, -1.512f, -4.147f, -1.511f, -5.656f, 0.0f)
                lineTo(0.0f, 18.315f)
                verticalLineToRelative(3.685f)
                reflectiveCurveToRelative(3.56f, -0.013f, 3.56f, -0.013f)
                curveToRelative(3.999f, -0.159f, 7.435f, -1.564f, 9.937f, -4.066f)
                lineToRelative(0.328f, -0.328f)
                close()
                moveTo(11.051f, 16.111f)
                curveToRelative(-2.375f, 2.171f, -5.328f, 2.769f, -7.475f, 2.873f)
                lineToRelative(6.179f, -6.173f)
                lineToRelative(1.629f, 1.521f)
                lineToRelative(-0.333f, 1.778f)
                close()
                moveTo(11.879f, 10.69f)
                lineToRelative(7.415f, -7.408f)
                curveToRelative(0.377f, -0.379f, 1.036f, -0.379f, 1.414f, 0.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.414f)
                lineToRelative(-7.362f, 7.362f)
                lineToRelative(-1.466f, -1.368f)
                close()
                moveTo(12.001f, 21.001f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.001f, 21.001f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _scalpelPath!!
    }

private var _scalpelPath: ImageVector? = null
