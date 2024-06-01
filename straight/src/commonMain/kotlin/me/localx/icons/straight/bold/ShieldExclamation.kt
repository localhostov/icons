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

public val Icons.Bold.ShieldExclamation: ImageVector
    get() {
        if (_shieldExclamation != null) {
            return _shieldExclamation!!
        }
        _shieldExclamation = Builder(name = "ShieldExclamation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4999f, 17.9881f)
                horizontalLineTo(10.4999f)
                verticalLineTo(14.9881f)
                horizontalLineTo(13.4999f)
                verticalLineTo(17.9881f)
                close()
                moveTo(12.9569f, 23.5441f)
                curveTo(15.0779f, 22.6901f, 21.9999f, 19.3331f, 21.9999f, 11.9631f)
                verticalLineTo(5.7991f)
                curveTo(21.9996f, 5.088f, 21.7752f, 4.395f, 21.3585f, 3.8188f)
                curveTo(20.9419f, 3.2425f, 20.3541f, 2.8122f, 19.6789f, 2.5891f)
                lineTo(11.9999f, 0.0441f)
                lineTo(4.3209f, 2.5891f)
                curveTo(3.6457f, 2.8122f, 3.058f, 3.2425f, 2.6413f, 3.8188f)
                curveTo(2.2246f, 4.395f, 2.0002f, 5.088f, 1.9999f, 5.7991f)
                verticalLineTo(11.9611f)
                curveTo(1.9999f, 18.4761f, 8.8509f, 22.4101f, 10.9509f, 23.4611f)
                lineTo(11.9359f, 23.9551f)
                lineTo(12.9569f, 23.5441f)
                close()
                moveTo(18.7339f, 5.4371f)
                curveTo(18.8111f, 5.4611f, 18.8786f, 5.5092f, 18.9265f, 5.5743f)
                curveTo(18.9744f, 5.6395f, 19.0001f, 5.7183f, 18.9999f, 5.7991f)
                verticalLineTo(11.9611f)
                curveTo(18.9999f, 17.2191f, 13.9709f, 19.8551f, 12.0679f, 20.6611f)
                curveTo(10.1419f, 19.6611f, 4.9999f, 16.5611f, 4.9999f, 11.9611f)
                verticalLineTo(5.7991f)
                curveTo(5.0002f, 5.7182f, 5.0261f, 5.6394f, 5.0739f, 5.574f)
                curveTo(5.1216f, 5.5086f, 5.1889f, 5.46f, 5.2659f, 5.4351f)
                lineTo(11.9999f, 3.2041f)
                lineTo(18.7339f, 5.4371f)
                close()
                moveTo(13.4999f, 4.9991f)
                horizontalLineTo(10.4999f)
                verticalLineTo(12.9991f)
                horizontalLineTo(13.4999f)
                verticalLineTo(4.9991f)
                close()
            }
        }
        .build()
        return _shieldExclamation!!
    }

private var _shieldExclamation: ImageVector? = null
