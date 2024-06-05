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

public val Icons.Filled.CandleHolder: ImageVector
    get() {
        if (_candleHolder != null) {
            return _candleHolder!!
        }
        _candleHolder = Builder(name = "CandleHolder", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 4.0f)
                curveToRelative(0.0f, -1.105f, 2.0f, -4.0f, 2.0f, -4.0f)
                curveToRelative(0.0f, 0.0f, 2.0f, 2.895f, 2.0f, 4.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(24.0f, 20.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.493f, 0.0f, -0.966f, 0.181f, -1.333f, 0.509f)
                lineToRelative(-1.334f, -1.49f)
                curveToRelative(0.734f, -0.657f, 1.681f, -1.019f, 2.667f, -1.019f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _candleHolder!!
    }

private var _candleHolder: ImageVector? = null
