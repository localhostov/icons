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

public val Icons.Bold.LocationArrow: ImageVector
    get() {
        if (_locationArrow != null) {
            return _locationArrow!!
        }
        _locationArrow = Builder(name = "LocationArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.168f, 7.633f)
                curveTo(0.642f, 8.185f, -0.229f, 9.687f, 0.051f, 11.285f)
                reflectiveCurveToRelative(1.609f, 2.715f, 3.232f, 2.715f)
                horizontalLineToRelative(6.717f)
                verticalLineToRelative(6.717f)
                curveToRelative(0.0f, 1.622f, 1.116f, 2.951f, 2.714f, 3.231f)
                curveToRelative(0.2f, 0.035f, 0.399f, 0.053f, 0.595f, 0.053f)
                curveToRelative(1.365f, 0.0f, 2.576f, -0.834f, 3.065f, -2.185f)
                lineTo(23.952f, 0.062f)
                lineTo(2.168f, 7.633f)
                close()
                moveTo(13.547f, 20.813f)
                curveToRelative(-0.029f, 0.078f, -0.088f, 0.222f, -0.313f, 0.182f)
                curveToRelative(-0.233f, -0.041f, -0.233f, -0.194f, -0.233f, -0.277f)
                verticalLineToRelative(-9.717f)
                lineTo(3.283f, 11.001f)
                curveToRelative(-0.083f, 0.0f, -0.236f, 0.0f, -0.277f, -0.233f)
                curveToRelative(-0.041f, -0.232f, 0.104f, -0.285f, 0.164f, -0.307f)
                lineToRelative(15.909f, -5.529f)
                lineToRelative(-5.532f, 15.882f)
                close()
            }
        }
        .build()
        return _locationArrow!!
    }

private var _locationArrow: ImageVector? = null
