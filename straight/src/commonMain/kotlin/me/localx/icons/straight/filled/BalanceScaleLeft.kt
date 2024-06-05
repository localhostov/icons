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

public val Icons.Filled.BalanceScaleLeft: ImageVector
    get() {
        if (_balanceScaleLeft != null) {
            return _balanceScaleLeft!!
        }
        _balanceScaleLeft = Builder(name = "BalanceScaleLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.123f, 0.299f)
                lineToRelative(-7.123f, 1.9f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(2.732f)
                lineToRelative(-7.259f, 1.936f)
                lineTo(0.0f, 14.822f)
                verticalLineToRelative(0.678f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-0.678f)
                lineTo(5.817f, 6.184f)
                lineToRelative(5.183f, -1.382f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineTo(4.268f)
                lineToRelative(4.896f, -1.305f)
                lineToRelative(-2.896f, 7.859f)
                verticalLineToRelative(0.678f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-0.678f)
                lineTo(20.123f, 0.299f)
                close()
                moveTo(6.566f, 14.0f)
                horizontalLineTo(2.434f)
                lineToRelative(2.066f, -5.607f)
                lineToRelative(2.066f, 5.607f)
                close()
                moveTo(19.5f, 4.393f)
                lineToRelative(2.066f, 5.607f)
                horizontalLineToRelative(-4.132f)
                lineToRelative(2.066f, -5.607f)
                close()
            }
        }
        .build()
        return _balanceScaleLeft!!
    }

private var _balanceScaleLeft: ImageVector? = null
