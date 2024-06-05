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

public val Icons.Filled.ShieldCross: ImageVector
    get() {
        if (_shieldCross != null) {
            return _shieldCross!!
        }
        _shieldCross = Builder(name = "ShieldCross", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.946f, 2.581f)
                lineTo(12.0f, -0.054f)
                lineToRelative(-7.945f, 2.635f)
                curveToRelative(-1.229f, 0.407f, -2.055f, 1.549f, -2.055f, 2.842f)
                verticalLineToRelative(6.525f)
                curveToRelative(0.0f, 6.562f, 7.005f, 10.576f, 9.153f, 11.65f)
                lineToRelative(0.805f, 0.402f)
                lineToRelative(0.835f, -0.336f)
                curveToRelative(2.16f, -0.869f, 9.207f, -4.28f, 9.207f, -11.716f)
                verticalLineToRelative(-6.525f)
                curveToRelative(0.0f, -1.293f, -0.826f, -2.435f, -2.054f, -2.842f)
                close()
                moveTo(18.0f, 10.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(9.456f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.456f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _shieldCross!!
    }

private var _shieldCross: ImageVector? = null
