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

public val Icons.Bold.SimCard: ImageVector
    get() {
        if (_simCard != null) {
            return _simCard!!
        }
        _simCard = Builder(name = "SimCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.096f, 3.975f)
                lineToRelative(-2.071f, -2.071f)
                curveToRelative(-1.228f, -1.228f, -2.86f, -1.904f, -4.596f, -1.904f)
                horizontalLineToRelative(-5.929f)
                curveTo(4.467f, 0.0f, 2.0f, 2.467f, 2.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-9.929f)
                curveToRelative(0.0f, -1.736f, -0.676f, -3.369f, -1.904f, -4.596f)
                close()
                moveTo(19.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(7.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(5.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.929f)
                curveToRelative(0.935f, 0.0f, 1.814f, 0.364f, 2.475f, 1.025f)
                lineToRelative(2.071f, 2.071f)
                curveToRelative(0.661f, 0.661f, 1.025f, 1.54f, 1.025f, 2.475f)
                verticalLineToRelative(9.929f)
                close()
                moveTo(7.0f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(10.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(14.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.0f, 14.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _simCard!!
    }

private var _simCard: ImageVector? = null
