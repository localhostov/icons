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

public val Icons.Bold.HamburgerSoda: ImageVector
    get() {
        if (_hamburgerSoda != null) {
            return _hamburgerSoda!!
        }
        _hamburgerSoda = Builder(name = "HamburgerSoda", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 10.0f)
                horizontalLineTo(16.819f)
                lineToRelative(0.117f, -0.942f)
                arcToRelative(3.388f, 3.388f, 0.0f, false, false, -0.686f, -2.787f)
                arcToRelative(3.341f, 3.341f, 0.0f, false, false, -2.617f, -1.258f)
                horizontalLineTo(11.6f)
                lineTo(11.83f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(0.013f)
                horizontalLineTo(9.172f)
                lineToRelative(-0.579f, 5.0f)
                horizontalLineTo(3.367f)
                arcTo(3.342f, 3.342f, 0.0f, false, false, 0.752f, 6.268f)
                arcTo(3.389f, 3.389f, 0.0f, false, false, 0.065f, 9.061f)
                lineTo(2.053f, 24.013f)
                lineTo(19.5f, 24.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 24.0f, 19.5f)
                verticalLineToRelative(-5.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 19.5f, 10.0f)
                close()
                moveTo(21.0f, 14.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.5f, 13.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 14.5f)
                close()
                moveTo(13.633f, 8.013f)
                arcToRelative(0.353f, 0.353f, 0.0f, false, true, 0.279f, 0.136f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.078f, 0.341f)
                lineTo(13.8f, 10.0f)
                horizontalLineToRelative(-2.76f)
                lineToRelative(0.224f, -1.987f)
                close()
                moveTo(3.089f, 8.149f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, true, 0.278f, -0.136f)
                horizontalLineTo(8.245f)
                lineTo(8.015f, 10.0f)
                horizontalLineToRelative(-4.8f)
                lineTo(3.01f, 8.489f)
                arcTo(0.4f, 0.4f, 0.0f, false, true, 3.089f, 8.149f)
                close()
                moveTo(3.615f, 13.0f)
                horizontalLineTo(8.276f)
                arcTo(4.445f, 4.445f, 0.0f, false, false, 8.0f, 14.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(4.449f, 4.449f, 0.0f, false, false, 0.28f, 1.513f)
                horizontalLineToRelative(-3.6f)
                close()
                moveTo(19.5f, 21.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 19.5f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(2.5f)
                lineToRelative(3.0f, 2.0f)
                lineToRelative(3.0f, -2.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 21.0f)
                close()
            }
        }
        .build()
        return _hamburgerSoda!!
    }

private var _hamburgerSoda: ImageVector? = null
