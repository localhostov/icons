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

public val Icons.Filled.CloudCode: ImageVector
    get() {
        if (_cloudCode != null) {
            return _cloudCode!!
        }
        _cloudCode = Builder(name = "CloudCode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.348f, 7.23f)
                curveToRelative(-1.311f, -3.151f, -4.395f, -5.23f, -7.848f, -5.23f)
                curveTo(5.813f, 2.0f, 2.0f, 5.813f, 2.0f, 10.5f)
                curveToRelative(0.0f, 0.551f, 0.053f, 1.097f, 0.157f, 1.633f)
                curveToRelative(-1.347f, 1.032f, -2.157f, 2.646f, -2.157f, 4.367f)
                curveToRelative(0.0f, 3.032f, 2.243f, 5.5f, 5.0f, 5.5f)
                horizontalLineToRelative(11.5f)
                curveToRelative(4.136f, 0.0f, 7.5f, -3.364f, 7.5f, -7.5f)
                curveToRelative(0.0f, -3.467f, -2.344f, -6.437f, -5.652f, -7.27f)
                close()
                moveTo(9.338f, 18.162f)
                lineToRelative(-2.802f, -2.802f)
                curveToRelative(-0.775f, -0.776f, -0.774f, -2.038f, 0.0f, -2.812f)
                lineToRelative(2.756f, -2.756f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.756f, 2.756f)
                lineToRelative(2.802f, 2.786f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(17.465f, 15.359f)
                lineToRelative(-2.803f, 2.803f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.802f, -2.802f)
                lineToRelative(-2.756f, -2.74f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.756f, 2.756f)
                curveToRelative(0.774f, 0.774f, 0.775f, 2.036f, 0.0f, 2.812f)
                close()
            }
        }
        .build()
        return _cloudCode!!
    }

private var _cloudCode: ImageVector? = null
