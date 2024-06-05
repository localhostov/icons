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

public val Icons.Bold.Scarecrow: ImageVector
    get() {
        if (_scarecrow != null) {
            return _scarecrow!!
        }
        _scarecrow = Builder(name = "Scarecrow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.534f, 8.0f)
                curveToRelative(0.299f, -0.668f, 0.466f, -1.414f, 0.466f, -2.198f)
                verticalLineToRelative(-0.802f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(-0.232f, -1.14f, -1.242f, -2.0f, -2.45f, -2.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.208f, 0.0f, -2.218f, 0.86f, -2.45f, 2.0f)
                horizontalLineToRelative(-2.05f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.693f, 0.147f, 1.374f, 0.42f, 2.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-7.466f)
                close()
                moveTo(10.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(0.999f)
                curveToRelative(0.0f, 1.104f, -0.895f, 1.999f, -1.999f, 2.0f)
                curveToRelative(-1.105f, 0.0f, -2.001f, -0.895f, -2.001f, -2.0f)
                verticalLineToRelative(-0.999f)
                close()
                moveTo(19.0f, 13.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _scarecrow!!
    }

private var _scarecrow: ImageVector? = null
