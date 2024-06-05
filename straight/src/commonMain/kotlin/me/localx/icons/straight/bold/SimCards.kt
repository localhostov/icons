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

public val Icons.Bold.SimCards: ImageVector
    get() {
        if (_simCards != null) {
            return _simCards!!
        }
        _simCards = Builder(name = "SimCards", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.975f, 3.854f)
                lineToRelative(-2.828f, -2.828f)
                curveToRelative(-0.661f, -0.661f, -1.54f, -1.025f, -2.475f, -1.025f)
                horizontalLineToRelative(-6.172f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(16.0f)
                lineTo(22.0f, 6.328f)
                curveToRelative(0.0f, -0.935f, -0.364f, -1.813f, -1.025f, -2.475f)
                close()
                moveTo(19.0f, 16.0f)
                horizontalLineToRelative(-10.0f)
                lineTo(9.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6.172f)
                curveToRelative(0.132f, 0.0f, 0.26f, 0.054f, 0.354f, 0.146f)
                lineToRelative(2.828f, 2.828f)
                curveToRelative(0.093f, 0.094f, 0.146f, 0.222f, 0.146f, 0.354f)
                verticalLineToRelative(9.672f)
                close()
                moveTo(4.0f, 21.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(3.0f)
                lineTo(1.0f, 24.0f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0.0f, -1.758f, 1.308f, -3.204f, 3.0f, -3.449f)
                verticalLineToRelative(15.949f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 9.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(10.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(14.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _simCards!!
    }

private var _simCards: ImageVector? = null
