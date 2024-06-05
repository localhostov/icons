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

public val Icons.Bold.FlaskPotion: ImageVector
    get() {
        if (_flaskPotion != null) {
            return _flaskPotion!!
        }
        _flaskPotion = Builder(name = "FlaskPotion", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 6.055f)
                verticalLineToRelative(-3.055f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.055f)
                curveTo(2.771f, 7.913f, 0.0f, 11.987f, 0.0f, 16.5f)
                curveToRelative(0.0f, 2.516f, 0.843f, 4.912f, 2.437f, 6.93f)
                lineToRelative(0.45f, 0.57f)
                horizontalLineToRelative(18.225f)
                lineToRelative(0.45f, -0.57f)
                curveToRelative(1.595f, -2.018f, 2.438f, -4.414f, 2.438f, -6.93f)
                curveToRelative(0.0f, -4.513f, -2.771f, -8.587f, -7.0f, -10.445f)
                close()
                moveTo(8.979f, 8.502f)
                lineToRelative(1.021f, -0.344f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.158f)
                lineToRelative(1.021f, 0.344f)
                curveToRelative(2.284f, 0.77f, 4.089f, 2.36f, 5.096f, 4.339f)
                curveToRelative(-1.008f, 0.507f, -2.598f, 1.158f, -4.117f, 1.158f)
                curveToRelative(-1.432f, 0.0f, -2.34f, -0.403f, -3.391f, -0.871f)
                curveToRelative(-1.191f, -0.529f, -2.541f, -1.129f, -4.609f, -1.129f)
                curveToRelative(-1.487f, 0.0f, -2.948f, 0.41f, -4.136f, 0.88f)
                curveToRelative(1.003f, -1.997f, 2.817f, -3.602f, 5.115f, -4.377f)
                close()
                moveTo(19.623f, 21.0f)
                lineTo(4.377f, 21.0f)
                curveToRelative(-0.876f, -1.314f, -1.348f, -2.805f, -1.376f, -4.357f)
                curveToRelative(0.626f, -0.378f, 2.881f, -1.643f, 4.999f, -1.643f)
                curveToRelative(1.432f, 0.0f, 2.34f, 0.403f, 3.391f, 0.871f)
                curveToRelative(1.191f, 0.529f, 2.541f, 1.129f, 4.609f, 1.129f)
                curveToRelative(1.856f, 0.0f, 3.672f, -0.638f, 4.966f, -1.236f)
                curveToRelative(0.023f, 0.243f, 0.034f, 0.488f, 0.034f, 0.736f)
                curveToRelative(0.0f, 1.604f, -0.474f, 3.146f, -1.377f, 4.5f)
                close()
            }
        }
        .build()
        return _flaskPotion!!
    }

private var _flaskPotion: ImageVector? = null
