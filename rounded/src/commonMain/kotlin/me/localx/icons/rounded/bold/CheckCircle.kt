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

public val Icons.Bold.CheckCircle: ImageVector
    get() {
        if (_checkCircle != null) {
            return _checkCircle!!
        }
        _checkCircle = Builder(name = "CheckCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.582f, 8.461f)
                curveToRelative(0.573f, 0.597f, 0.555f, 1.547f, -0.043f, 2.121f)
                lineToRelative(-4.605f, 4.424f)
                curveToRelative(-0.668f, 0.659f, -1.552f, 0.989f, -2.438f, 0.989f)
                reflectiveCurveToRelative(-1.774f, -0.33f, -2.451f, -0.991f)
                lineToRelative(-1.547f, -1.388f)
                curveToRelative(-0.616f, -0.554f, -0.667f, -1.502f, -0.113f, -2.118f)
                curveToRelative(0.554f, -0.615f, 1.5f, -0.668f, 2.119f, -0.113f)
                lineToRelative(1.592f, 1.43f)
                curveToRelative(0.237f, 0.23f, 0.555f, 0.232f, 0.746f, 0.042f)
                lineToRelative(4.62f, -4.438f)
                curveToRelative(0.597f, -0.574f, 1.545f, -0.557f, 2.121f, 0.042f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -4.962f, -4.037f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _checkCircle!!
    }

private var _checkCircle: ImageVector? = null
