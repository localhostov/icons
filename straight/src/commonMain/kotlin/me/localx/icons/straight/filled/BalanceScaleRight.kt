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

public val Icons.Filled.BalanceScaleRight: ImageVector
    get() {
        if (_balanceScaleRight != null) {
            return _balanceScaleRight!!
        }
        _balanceScaleRight = Builder(name = "BalanceScaleRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.259f, 4.667f)
                lineToRelative(-7.259f, -1.936f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.198f)
                lineTo(3.877f, 0.299f)
                lineTo(0.0f, 10.822f)
                verticalLineToRelative(0.678f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-0.678f)
                lineTo(6.104f, 2.963f)
                lineToRelative(4.896f, 1.305f)
                lineTo(11.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(20.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(13.0f, 4.802f)
                lineToRelative(5.183f, 1.382f)
                lineToRelative(-3.183f, 8.638f)
                verticalLineToRelative(0.678f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-0.678f)
                lineToRelative(-3.741f, -10.154f)
                close()
                moveTo(6.566f, 10.0f)
                lineTo(2.434f, 10.0f)
                lineToRelative(2.066f, -5.607f)
                lineToRelative(2.066f, 5.607f)
                close()
                moveTo(19.5f, 8.393f)
                lineToRelative(2.066f, 5.607f)
                horizontalLineToRelative(-4.132f)
                lineToRelative(2.066f, -5.607f)
                close()
            }
        }
        .build()
        return _balanceScaleRight!!
    }

private var _balanceScaleRight: ImageVector? = null
