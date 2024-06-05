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

public val Icons.Bold.TirePressureWarning: ImageVector
    get() {
        if (_tirePressureWarning != null) {
            return _tirePressureWarning!!
        }
        _tirePressureWarning = Builder(name = "TirePressureWarning", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 12.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 2.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(13.5f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 11.454f)
                arcToRelative(12.92f, 12.92f, 0.0f, false, false, -2.615f, -7.912f)
                arcTo(6.123f, 6.123f, 0.0f, false, true, 20.0f, 0.0f)
                lineTo(17.0f, 0.0f)
                arcToRelative(9.063f, 9.063f, 0.0f, false, false, 2.0f, 5.358f)
                arcToRelative(9.945f, 9.945f, 0.0f, false, true, 2.0f, 6.1f)
                curveToRelative(0.0f, 4.02f, -2.98f, 6.736f, -4.0f, 7.546f)
                lineTo(7.0f, 19.004f)
                curveToRelative(-1.018f, -0.81f, -4.0f, -3.526f, -4.0f, -7.546f)
                arcToRelative(9.951f, 9.951f, 0.0f, false, true, 2.0f, -6.1f)
                arcTo(9.057f, 9.057f, 0.0f, false, false, 7.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                arcTo(6.117f, 6.117f, 0.0f, false, true, 2.614f, 3.542f)
                arcTo(12.927f, 12.927f, 0.0f, false, false, 0.0f, 11.454f)
                curveToRelative(0.0f, 5.176f, 3.493f, 8.569f, 5.0f, 9.792f)
                lineTo(5.0f, 24.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 22.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 22.0f)
                lineTo(16.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(19.0f, 21.246f)
                curveTo(20.507f, 20.023f, 24.0f, 16.63f, 24.0f, 11.454f)
                close()
            }
        }
        .build()
        return _tirePressureWarning!!
    }

private var _tirePressureWarning: ImageVector? = null
