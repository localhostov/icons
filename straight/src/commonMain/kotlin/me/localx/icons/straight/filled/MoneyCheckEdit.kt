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

public val Icons.Filled.MoneyCheckEdit: ImageVector
    get() {
        if (_moneyCheckEdit != null) {
            return _moneyCheckEdit!!
        }
        _moneyCheckEdit = Builder(name = "MoneyCheckEdit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.582f, 13.0f)
                horizontalLineToRelative(-2.582f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.62f)
                curveToRelative(0.802f, -0.648f, 1.795f, -1.0f, 2.843f, -1.0f)
                curveToRelative(0.918f, 0.0f, 1.794f, 0.27f, 2.537f, 0.773f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 2.0f)
                curveTo(1.346f, 2.0f, 0.0f, 3.346f, 0.0f, 5.0f)
                lineTo(0.0f, 22.0f)
                lineTo(10.0f, 22.0f)
                verticalLineToRelative(-2.419f)
                lineToRelative(6.582f, -6.581f)
                close()
                moveTo(14.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.356f, 13.24f)
                lineToRelative(-3.041f, -0.507f)
                curveToRelative(-1.342f, -0.223f, -2.315f, -1.373f, -2.315f, -2.733f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.378f, 0.271f, 0.698f, 0.644f, 0.76f)
                lineToRelative(3.041f, 0.507f)
                curveToRelative(1.342f, 0.223f, 2.315f, 1.373f, 2.315f, 2.733f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.551f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.378f, -0.271f, -0.698f, -0.644f, -0.76f)
                close()
                moveTo(24.001f, 14.538f)
                curveToRelative(0.0f, 0.678f, -0.264f, 1.316f, -0.744f, 1.795f)
                lineToRelative(-7.667f, 7.667f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-3.59f)
                lineToRelative(7.668f, -7.667f)
                curveToRelative(0.99f, -0.99f, 2.6f, -0.99f, 3.59f, 0.0f)
                curveToRelative(0.479f, 0.479f, 0.744f, 1.117f, 0.744f, 1.795f)
                close()
            }
        }
        .build()
        return _moneyCheckEdit!!
    }

private var _moneyCheckEdit: ImageVector? = null
