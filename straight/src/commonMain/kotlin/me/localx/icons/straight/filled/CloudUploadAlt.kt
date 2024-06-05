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

public val Icons.Filled.CloudUploadAlt: ImageVector
    get() {
        if (_cloudUploadAlt != null) {
            return _cloudUploadAlt!!
        }
        _cloudUploadAlt = Builder(name = "CloudUploadAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.348f, 7.23f)
                curveToRelative(-1.311f, -3.151f, -4.395f, -5.23f, -7.848f, -5.23f)
                curveTo(5.813f, 2.0f, 2.0f, 5.813f, 2.0f, 10.5f)
                curveToRelative(0.0f, 0.551f, 0.053f, 1.097f, 0.157f, 1.633f)
                curveToRelative(-1.347f, 1.032f, -2.157f, 2.646f, -2.157f, 4.367f)
                curveToRelative(0.0f, 3.032f, 2.243f, 5.5f, 5.0f, 5.5f)
                horizontalLineToRelative(11.5f)
                curveToRelative(4.136f, 0.0f, 7.5f, -3.364f, 7.5f, -7.5f)
                curveToRelative(0.0f, -3.467f, -2.344f, -6.436f, -5.652f, -7.27f)
                close()
                moveTo(15.293f, 14.292f)
                lineToRelative(-2.293f, -2.293f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.293f, -3.293f)
                curveToRelative(0.779f, -0.779f, 2.049f, -0.779f, 2.828f, 0.0f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _cloudUploadAlt!!
    }

private var _cloudUploadAlt: ImageVector? = null
