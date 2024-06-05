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

public val Icons.Filled.Booking: ImageVector
    get() {
        if (_booking != null) {
            return _booking!!
        }
        _booking = Builder(name = "Booking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 16.462f)
                lineToRelative(9.0f, 3.538f)
                verticalLineToRelative(4.0f)
                lineTo(7.538f, 24.0f)
                lineToRelative(-1.821f, -1.628f)
                curveToRelative(-0.917f, -0.858f, -0.96f, -2.307f, -0.098f, -3.23f)
                curveToRelative(0.861f, -0.922f, 2.313f, -0.97f, 3.235f, -0.109f)
                curveToRelative(0.034f, 0.032f, 1.069f, 0.898f, 2.145f, 1.784f)
                verticalLineToRelative(-8.817f)
                curveToRelative(0.0f, -1.215f, 1.083f, -2.176f, 2.336f, -1.973f)
                curveToRelative(0.983f, 0.16f, 1.664f, 1.083f, 1.664f, 2.08f)
                verticalLineToRelative(4.355f)
                close()
                moveTo(21.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(21.0f)
                close()
                moveTo(4.159f, 17.776f)
                curveToRelative(1.269f, -1.358f, 3.224f, -1.705f, 4.841f, -1.005f)
                verticalLineToRelative(-4.771f)
                curveToRelative(0.0f, -1.153f, 0.5f, -2.24f, 1.364f, -3.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(3.065f)
                curveToRelative(0.133f, -0.807f, 0.496f, -1.584f, 1.095f, -2.224f)
                close()
                moveTo(17.0f, 12.107f)
                verticalLineToRelative(2.992f)
                lineToRelative(4.0f, 1.573f)
                verticalLineToRelative(-7.671f)
                horizontalLineToRelative(-5.393f)
                curveToRelative(0.853f, 0.762f, 1.393f, 1.884f, 1.393f, 3.107f)
                close()
            }
        }
        .build()
        return _booking!!
    }

private var _booking: ImageVector? = null
