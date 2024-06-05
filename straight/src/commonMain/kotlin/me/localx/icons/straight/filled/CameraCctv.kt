package me.localx.icons.straight.filled

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

public val Icons.Filled.CameraCctv: ImageVector
    get() {
        if (_cameraCctv != null) {
            return _cameraCctv!!
        }
        _cameraCctv = Builder(name = "CameraCctv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.961f, 11.351f)
                lineToRelative(3.054f, -2.184f)
                lineTo(8.298f, 0.361f)
                curveToRelative(-1.448f, -0.783f, -3.27f, -0.244f, -4.059f, 1.202f)
                lineToRelative(-1.821f, 3.336f)
                curveToRelative(-0.792f, 1.452f, -0.256f, 3.278f, 1.182f, 4.063f)
                lineToRelative(6.048f, 3.429f)
                lineToRelative(-1.642f, 4.925f)
                curveToRelative(-0.136f, 0.409f, -0.518f, 0.684f, -0.949f, 0.684f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(5.059f)
                curveToRelative(1.293f, 0.0f, 2.437f, -0.824f, 2.846f, -2.051f)
                lineToRelative(1.517f, -4.553f)
                lineToRelative(6.432f, 3.646f)
                lineToRelative(0.995f, -1.823f)
                lineToRelative(2.203f, 1.221f)
                lineToRelative(2.011f, -3.686f)
                lineToRelative(-2.203f, -1.222f)
                lineToRelative(0.1f, -0.183f)
                close()
            }
        }
        .build()
        return _cameraCctv!!
    }

private var _cameraCctv: ImageVector? = null
