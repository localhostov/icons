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

public val Icons.Filled.CloudBackUp: ImageVector
    get() {
        if (_cloudBackUp != null) {
            return _cloudBackUp!!
        }
        _cloudBackUp = Builder(name = "CloudBackUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.75f, 19.25f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.75f, 2.75f)
                curveToRelative(-0.39f, 0.39f, -0.902f, 0.585f, -1.414f, 0.585f)
                reflectiveCurveToRelative(-1.024f, -0.195f, -1.414f, -0.585f)
                lineToRelative(-2.75f, -2.75f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.75f, 1.75f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                lineToRelative(1.75f, -1.75f)
                close()
                moveTo(13.164f, 14.336f)
                lineToRelative(-2.75f, -2.75f)
                curveToRelative(-0.779f, -0.78f, -2.049f, -0.78f, -2.828f, 0.0f)
                lineToRelative(-2.75f, 2.75f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.75f, -1.75f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-10.0f)
                lineToRelative(1.75f, 1.75f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(18.348f, 5.23f)
                curveToRelative(-1.311f, -3.151f, -4.395f, -5.23f, -7.848f, -5.23f)
                curveTo(5.813f, 0.0f, 2.0f, 3.813f, 2.0f, 8.5f)
                curveToRelative(0.0f, 0.551f, 0.053f, 1.098f, 0.157f, 1.633f)
                curveToRelative(-1.347f, 1.033f, -2.157f, 2.645f, -2.157f, 4.367f)
                curveToRelative(0.0f, 3.032f, 2.243f, 5.5f, 5.0f, 5.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.672f)
                lineToRelative(-3.992f, -3.992f)
                lineToRelative(4.164f, -4.164f)
                curveToRelative(1.508f, -1.51f, 4.147f, -1.511f, 5.657f, 0.0f)
                lineToRelative(1.171f, 1.171f)
                verticalLineToRelative(-2.344f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(7.672f)
                lineToRelative(1.903f, 1.903f)
                curveToRelative(1.648f, -1.192f, 2.752f, -3.018f, 3.026f, -5.075f)
                horizontalLineToRelative(0.071f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.467f, -2.344f, -6.437f, -5.652f, -7.27f)
                close()
            }
        }
        .build()
        return _cloudBackUp!!
    }

private var _cloudBackUp: ImageVector? = null
