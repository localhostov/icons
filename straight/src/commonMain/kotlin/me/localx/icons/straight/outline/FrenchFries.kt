package me.localx.icons.straight.outline

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

public val Icons.Outline.FrenchFries: ImageVector
    get() {
        if (_frenchFries != null) {
            return _frenchFries!!
        }
        _frenchFries = Builder(name = "FrenchFries", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.713f, 11.0f)
                lineToRelative(1.578f, -4.9f)
                lineTo(19.317f, 4.848f)
                lineTo(19.981f, 0.985f)
                lineTo(14.038f, -0.022f)
                lineToRelative(-0.354f, 2.041f)
                lineTo(10.316f, 2.019f)
                lineTo(9.962f, -0.022f)
                lineTo(4.019f, 0.985f)
                lineToRelative(0.664f, 3.863f)
                lineTo(0.708f, 6.1f)
                lineTo(2.287f, 11.0f)
                lineTo(0.01f, 11.0f)
                lineTo(1.935f, 21.519f)
                arcTo(3.01f, 3.01f, 0.0f, false, false, 4.9f, 23.978f)
                lineTo(19.117f, 23.978f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, false, 2.967f, -2.459f)
                lineTo(24.01f, 11.0f)
                close()
                moveTo(20.763f, 7.4f)
                lineTo(19.6f, 11.0f)
                lineTo(18.26f, 11.0f)
                lineToRelative(0.716f, -4.167f)
                close()
                moveTo(17.663f, 2.618f)
                lineTo(16.22f, 11.0f)
                horizontalLineToRelative(-1.2f)
                lineTo(15.02f, 6.1f)
                lineToRelative(0.663f, -3.815f)
                close()
                moveTo(11.0f, 4.015f)
                horizontalLineToRelative(2.01f)
                lineTo(13.01f, 11.0f)
                lineTo(11.0f, 11.0f)
                close()
                moveTo(8.321f, 2.281f)
                lineTo(8.985f, 6.1f)
                lineTo(8.985f, 11.0f)
                lineTo(7.78f, 11.0f)
                lineTo(6.338f, 2.617f)
                close()
                moveTo(3.237f, 7.4f)
                lineToRelative(1.787f, -0.564f)
                lineTo(5.74f, 11.0f)
                lineTo(4.4f, 11.0f)
                close()
                moveTo(20.106f, 21.162f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.989f, 0.819f)
                lineTo(4.9f, 21.981f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.989f, -0.819f)
                lineTo(2.418f, 13.0f)
                lineTo(21.6f, 13.0f)
                close()
            }
        }
        .build()
        return _frenchFries!!
    }

private var _frenchFries: ImageVector? = null
