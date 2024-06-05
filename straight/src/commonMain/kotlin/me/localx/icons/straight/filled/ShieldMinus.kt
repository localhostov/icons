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
                moveToRelative(19.259f, 2.412f)
                lineTo(12.0f, 0.005f)
                lineToRelative(-7.259f, 2.407f)
                curveToRelative(-1.639f, 0.544f, -2.741f, 2.07f, -2.741f, 3.797f)
                verticalLineToRelative(5.755f)
                curveToRelative(0.0f, 6.566f, 7.005f, 10.577f, 9.151f, 11.648f)
                lineToRelative(0.806f, 0.404f)
                lineToRelative(0.836f, -0.336f)
                curveToRelative(2.16f, -0.87f, 9.207f, -4.284f, 9.207f, -11.717f)
                verticalLineToRelative(-5.755f)
                curveToRelative(0.0f, -1.727f, -1.102f, -3.253f, -2.741f, -3.797f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _shieldMinus!!
    }

private var _shieldMinus: ImageVector? = null
