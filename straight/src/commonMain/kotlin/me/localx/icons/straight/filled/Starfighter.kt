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

public val Icons.Filled.Starfighter: ImageVector
    get() {
        if (_starfighter != null) {
            return _starfighter!!
        }
        _starfighter = Builder(name = "Starfighter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 22.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 21.0f)
                lineTo(0.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(8.0f)
                lineTo(6.0f, 14.0f)
                close()
                moveTo(22.0f, 6.0f)
                verticalLineToRelative(8.0f)
                lineTo(18.0f, 14.0f)
                verticalLineToRelative(8.0f)
                lineToRelative(4.0f, -4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 6.0f)
                close()
                moveTo(12.0f, 5.0f)
                arcToRelative(7.053f, 7.053f, 0.0f, false, true, 3.217f, 0.759f)
                curveTo(14.0f, -1.9f, 10.0f, -1.9f, 8.783f, 5.759f)
                arcTo(7.053f, 7.053f, 0.0f, false, true, 12.0f, 5.0f)
                close()
                moveTo(15.608f, 8.461f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, -7.216f, 0.0f)
                curveToRelative(-0.253f, 2.231f, -0.343f, 4.346f, -0.375f, 5.539f)
                lineTo(8.0f, 14.0f)
                lineTo(8.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 14.0f)
                horizontalLineToRelative(-0.017f)
                curveTo(15.951f, 12.807f, 15.861f, 10.692f, 15.608f, 8.461f)
                close()
            }
        }
        .build()
        return _starfighter!!
    }

private var _starfighter: ImageVector? = null
