package me.localx.icons.rounded.filled

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

public val Icons.Filled.ShieldMinus: ImageVector
    get() {
        if (_shieldMinus != null) {
            return _shieldMinus!!
        }
        _shieldMinus = Builder(name = "ShieldMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.574f, 2.126f)
                lineTo(12.315f, 0.051f)
                curveToRelative(-0.205f, -0.068f, -0.425f, -0.068f, -0.63f, 0.0f)
                lineToRelative(-6.259f, 2.075f)
                curveToRelative(-2.049f, 0.68f, -3.426f, 2.587f, -3.426f, 4.746f)
                verticalLineToRelative(5.171f)
                curveToRelative(0.0f, 6.562f, 7.005f, 10.576f, 9.153f, 11.65f)
                curveToRelative(0.0f, 0.0f, 0.352f, 0.307f, 0.85f, 0.307f)
                reflectiveCurveToRelative(0.791f, -0.24f, 0.791f, -0.24f)
                curveToRelative(2.16f, -0.868f, 9.207f, -4.28f, 9.207f, -11.717f)
                verticalLineToRelative(-5.171f)
                curveToRelative(0.0f, -2.159f, -1.377f, -4.066f, -3.426f, -4.746f)
                close()
                moveTo(15.0f, 13.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _shieldMinus!!
    }

private var _shieldMinus: ImageVector? = null
