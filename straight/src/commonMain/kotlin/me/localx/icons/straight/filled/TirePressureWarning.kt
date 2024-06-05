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

public val Icons.Filled.TirePressureWarning: ImageVector
    get() {
        if (_tirePressureWarning != null) {
            return _tirePressureWarning!!
        }
        _tirePressureWarning = Builder(name = "TirePressureWarning", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 15.0f)
                lineTo(11.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcToRelative(12.978f, 12.978f, 0.0f, false, false, -2.623f, -7.943f)
                arcTo(6.662f, 6.662f, 0.0f, false, true, 20.0f, 0.0f)
                lineTo(18.0f, 0.0f)
                arcToRelative(8.642f, 8.642f, 0.0f, false, false, 1.785f, 5.268f)
                curveTo(23.737f, 10.416f, 21.961f, 17.294f, 17.7f, 20.0f)
                lineTo(6.3f, 20.0f)
                curveTo(2.018f, 17.276f, 0.276f, 10.4f, 4.215f, 5.268f)
                arcTo(8.642f, 8.642f, 0.0f, false, false, 6.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                arcTo(6.662f, 6.662f, 0.0f, false, true, 2.623f, 4.057f)
                curveTo(-1.959f, 10.046f, -0.1f, 18.1f, 5.0f, 21.528f)
                lineTo(5.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                lineTo(7.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 21.528f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 24.0f, 12.0f)
                close()
            }
        }
        .build()
        return _tirePressureWarning!!
    }

private var _tirePressureWarning: ImageVector? = null
