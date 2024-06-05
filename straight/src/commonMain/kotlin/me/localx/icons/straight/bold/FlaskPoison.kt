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

public val Icons.Bold.FlaskPoison: ImageVector
    get() {
        if (_flaskPoison != null) {
            return _flaskPoison!!
        }
        _flaskPoison = Builder(name = "FlaskPoison", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(19.623f, 21.0f)
                lineTo(4.377f, 21.0f)
                curveToRelative(-0.903f, -1.354f, -1.377f, -2.896f, -1.377f, -4.5f)
                curveToRelative(0.0f, -3.578f, 2.403f, -6.792f, 5.979f, -7.998f)
                lineToRelative(1.021f, -0.344f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.158f)
                lineToRelative(1.021f, 0.344f)
                curveToRelative(3.576f, 1.206f, 5.979f, 4.42f, 5.979f, 7.998f)
                curveToRelative(0.0f, 1.604f, -0.474f, 3.146f, -1.377f, 4.5f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _flaskPoison!!
    }

private var _flaskPoison: ImageVector? = null
