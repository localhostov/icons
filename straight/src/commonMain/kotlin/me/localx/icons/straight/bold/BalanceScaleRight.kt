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

public val Icons.Bold.BalanceScaleRight: ImageVector
    get() {
        if (_balanceScaleRight != null) {
            return _balanceScaleRight!!
        }
        _balanceScaleRight = Builder(name = "BalanceScaleRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.743f)
                lineToRelative(-3.361f, -9.523f)
                lineToRelative(-7.139f, -1.614f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 1.927f)
                lineTo(3.286f, 0.296f)
                lineTo(0.0f, 10.77f)
                verticalLineToRelative(0.73f)
                curveToRelative(0.0f, 2.485f, 2.014f, 4.5f, 4.5f, 4.5f)
                curveToRelative(2.316f, 0.0f, 4.223f, -1.75f, 4.472f, -4.0f)
                horizontalLineToRelative(0.028f)
                verticalLineToRelative(-1.26f)
                lineToRelative(-2.364f, -6.61f)
                lineToRelative(3.864f, 0.874f)
                verticalLineToRelative(15.997f)
                lineTo(4.0f, 21.001f)
                verticalLineToRelative(3.0f)
                lineTo(20.0f, 24.001f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.5f)
                lineTo(13.5f, 5.681f)
                lineToRelative(4.024f, 0.91f)
                lineToRelative(-2.524f, 7.152f)
                verticalLineToRelative(0.757f)
                curveToRelative(0.0f, 2.485f, 2.014f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.757f)
                close()
                moveTo(3.072f, 11.0f)
                lineToRelative(1.325f, -4.221f)
                lineToRelative(1.51f, 4.221f)
                lineTo(3.072f, 11.0f)
                close()
                moveTo(18.09f, 14.0f)
                lineToRelative(1.409f, -3.993f)
                lineToRelative(1.409f, 3.993f)
                horizontalLineToRelative(-2.819f)
                close()
            }
        }
        .build()
        return _balanceScaleRight!!
    }

private var _balanceScaleRight: ImageVector? = null
