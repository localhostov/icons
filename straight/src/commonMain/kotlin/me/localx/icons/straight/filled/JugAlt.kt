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

public val Icons.Filled.JugAlt: ImageVector
    get() {
        if (_jugAlt != null) {
            return _jugAlt!!
        }
        _jugAlt = Builder(name = "JugAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(4.0f)
                lineTo(1.0f, 19.0f)
                close()
                moveTo(23.0f, 8.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.861f, -1.277f, 3.429f, -3.001f, 3.874f)
                curveToRelative(0.0f, 0.035f, 0.001f, 0.07f, 0.001f, 0.106f)
                verticalLineToRelative(10.021f)
                lineTo(1.0f, 24.001f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-8.0f)
                lineTo(1.097f, 13.001f)
                curveToRelative(0.167f, -0.835f, 0.546f, -1.62f, 1.106f, -2.274f)
                lineToRelative(4.074f, -4.753f)
                curveToRelative(0.466f, -0.543f, 0.722f, -1.237f, 0.722f, -1.952f)
                verticalLineToRelative(-2.021f)
                horizontalLineToRelative(-1.0f)
                lineTo(5.999f, 0.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.021f)
                curveToRelative(0.0f, 0.715f, 0.257f, 1.409f, 0.723f, 1.953f)
                lineToRelative(0.499f, 0.582f)
                curveToRelative(0.178f, -0.497f, 0.458f, -0.954f, 0.831f, -1.342f)
                curveToRelative(0.743f, -0.771f, 1.818f, -1.213f, 2.947f, -1.213f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(21.0f, 8.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.59f, 0.0f, -1.14f, 0.219f, -1.508f, 0.602f)
                curveToRelative(-0.342f, 0.354f, -0.512f, 0.825f, -0.493f, 1.362f)
                verticalLineToRelative(0.665f)
                reflectiveCurveToRelative(1.797f, 2.096f, 1.797f, 2.096f)
                curveToRelative(0.311f, 0.363f, 0.566f, 0.766f, 0.76f, 1.195f)
                curveToRelative(0.833f, -0.241f, 1.444f, -1.011f, 1.444f, -1.921f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _jugAlt!!
    }

private var _jugAlt: ImageVector? = null
