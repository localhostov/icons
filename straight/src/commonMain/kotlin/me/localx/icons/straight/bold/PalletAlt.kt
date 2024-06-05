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

public val Icons.Bold.PalletAlt: ImageVector
    get() {
        if (_palletAlt != null) {
            return _palletAlt!!
        }
        _palletAlt = Builder(name = "PalletAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(12.0f, 14.0f)
                lineTo(0.0f, 14.0f)
                lineTo(0.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(9.0f, 5.5f)
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 5.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(24.0f, 7.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 7.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }
        .build()
        return _palletAlt!!
    }

private var _palletAlt: ImageVector? = null
