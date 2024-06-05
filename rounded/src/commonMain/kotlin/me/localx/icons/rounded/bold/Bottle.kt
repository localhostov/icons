package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Bottle: ImageVector
    get() {
        if (_bottle != null) {
            return _bottle!!
        }
        _bottle = Builder(name = "Bottle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.314f, 7.548f)
                lineToRelative(-2.346f, -1.4f)
                lineToRelative(0.022f, -3.24f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 0.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 2.908f)
                verticalLineToRelative(3.22f)
                lineTo(5.653f, 7.549f)
                arcTo(5.531f, 5.531f, 0.0f, false, false, 3.0f, 12.255f)
                lineTo(3.0f, 18.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 8.5f, 24.0f)
                horizontalLineToRelative(7.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 21.0f, 18.5f)
                lineTo(21.0f, 12.274f)
                arcTo(5.526f, 5.526f, 0.0f, false, false, 18.314f, 7.548f)
                close()
                moveTo(18.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.5f, 21.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.0f, 18.5f)
                lineTo(6.0f, 12.255f)
                arcToRelative(2.513f, 2.513f, 0.0f, false, true, 1.206f, -2.139f)
                lineToRelative(3.071f, -1.859f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 6.974f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(1.99f)
                lineToRelative(-0.028f, 3.99f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.732f, 1.3f)
                lineToRelative(3.085f, 1.836f)
                arcTo(2.513f, 2.513f, 0.0f, false, true, 18.0f, 12.274f)
                close()
                moveTo(16.0f, 15.5f)
                verticalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 18.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 16.5f)
                verticalLineToRelative(-1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 14.0f)
                horizontalLineToRelative(5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 15.5f)
                close()
            }
        }
        .build()
        return _bottle!!
    }

private var _bottle: ImageVector? = null
