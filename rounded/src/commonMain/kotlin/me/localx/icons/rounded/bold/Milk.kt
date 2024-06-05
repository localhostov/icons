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

public val Icons.Bold.Milk: ImageVector
    get() {
        if (_milk != null) {
            return _milk!!
        }
        _milk = Builder(name = "Milk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.7f, 8.555f)
                lineToRelative(-1.704f, -2.016f)
                curveToRelative(0.0f, -0.013f, 0.004f, -0.025f, 0.004f, -0.038f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.013f, 0.004f, 0.025f, 0.004f, 0.038f)
                lineToRelative(-1.704f, 2.016f)
                curveToRelative(-0.554f, 0.655f, -1.3f, 2.155f, -1.3f, 3.55f)
                verticalLineToRelative(6.395f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-6.395f)
                curveToRelative(0.0f, -1.298f, -0.462f, -2.559f, -1.3f, -3.55f)
                close()
                moveTo(7.0f, 4.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(6.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.171f, 0.027f, 0.335f, 0.051f, 0.5f)
                horizontalLineToRelative(-5.551f)
                close()
                moveTo(13.333f, 8.537f)
                curveToRelative(-0.378f, 0.439f, -0.666f, 0.937f, -0.888f, 1.463f)
                horizontalLineToRelative(-7.44f)
                lineToRelative(1.69f, -2.0f)
                horizontalLineToRelative(7.1f)
                lineToRelative(-0.463f, 0.537f)
                close()
                moveTo(20.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-8.373f)
                curveToRelative(0.0f, -0.599f, 0.216f, -1.178f, 0.605f, -1.632f)
                lineToRelative(1.922f, -2.23f)
                lineToRelative(1.881f, 2.226f)
                curveToRelative(0.381f, 0.451f, 0.591f, 1.024f, 0.591f, 1.614f)
                verticalLineToRelative(6.395f)
                close()
            }
        }
        .build()
        return _milk!!
    }

private var _milk: ImageVector? = null
