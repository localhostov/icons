package me.localx.icons.straight.outline

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

public val Icons.Outline.BalanceScaleLeft: ImageVector
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
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.732f)
                lineToRelative(-7.259f, 1.936f)
                lineTo(0.0f, 14.822f)
                verticalLineToRelative(0.678f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-0.678f)
                lineTo(5.817f, 6.184f)
                lineToRelative(5.183f, -1.382f)
                lineTo(11.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(20.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(13.0f, 4.268f)
                lineToRelative(4.896f, -1.305f)
                lineToRelative(-2.896f, 7.859f)
                verticalLineToRelative(0.678f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-0.678f)
                lineTo(20.123f, 0.299f)
                close()
                moveTo(4.5f, 18.0f)
                curveToRelative(-1.207f, 0.0f, -2.217f, -0.86f, -2.449f, -2.0f)
                lineTo(6.949f, 16.0f)
                curveToRelative(-0.232f, 1.14f, -1.242f, 2.0f, -2.449f, 2.0f)
                close()
                moveTo(6.566f, 14.0f)
                lineTo(2.434f, 14.0f)
                lineToRelative(2.066f, -5.607f)
                lineToRelative(2.066f, 5.607f)
                close()
                moveTo(19.5f, 4.393f)
                lineToRelative(2.066f, 5.607f)
                horizontalLineToRelative(-4.132f)
                lineToRelative(2.066f, -5.607f)
                close()
                moveTo(19.5f, 14.0f)
                curveToRelative(-1.207f, 0.0f, -2.217f, -0.86f, -2.449f, -2.0f)
                horizontalLineToRelative(4.899f)
                curveToRelative(-0.232f, 1.14f, -1.242f, 2.0f, -2.449f, 2.0f)
                close()
            }
        }
        .build()
        return _balanceScaleLeft!!
    }

private var _balanceScaleLeft: ImageVector? = null
