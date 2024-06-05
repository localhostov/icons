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

public val Icons.Bold.SdCards: ImageVector
    get() {
        if (_sdCards != null) {
            return _sdCards!!
        }
        _sdCards = Builder(name = "SdCards", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                horizontalLineToRelative(-6.171f)
                curveToRelative(-0.935f, 0.0f, -1.814f, 0.364f, -2.475f, 1.025f)
                lineToRelative(-2.828f, 2.828f)
                curveToRelative(-0.661f, 0.661f, -1.025f, 1.54f, -1.025f, 2.475f)
                verticalLineToRelative(12.672f)
                horizontalLineToRelative(16.0f)
                lineTo(22.001f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(19.0f, 16.0f)
                horizontalLineToRelative(-10.0f)
                lineTo(9.0f, 6.328f)
                curveToRelative(0.0f, -0.132f, 0.053f, -0.26f, 0.146f, -0.354f)
                lineToRelative(2.828f, -2.828f)
                curveToRelative(0.095f, -0.095f, 0.22f, -0.146f, 0.354f, -0.146f)
                horizontalLineToRelative(6.171f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(4.0f, 21.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(3.0f)
                lineTo(1.0f, 24.0f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0.0f, -1.758f, 1.308f, -3.204f, 3.0f, -3.449f)
                verticalLineToRelative(15.949f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(12.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _sdCards!!
    }

private var _sdCards: ImageVector? = null
