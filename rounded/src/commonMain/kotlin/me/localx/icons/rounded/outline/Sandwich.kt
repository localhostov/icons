package me.localx.icons.rounded.outline

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

public val Icons.Outline.Sandwich: ImageVector
    get() {
        if (_sandwich != null) {
            return _sandwich!!
        }
        _sandwich = Builder(name = "Sandwich", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                lineTo(3.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                lineTo(21.0f, 24.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 18.0f)
                close()
                moveTo(21.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                lineTo(21.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 22.0f)
                close()
                moveTo(22.8f, 5.374f)
                lineTo(19.687f, 1.747f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, false, -5.8f, -1.328f)
                lineTo(3.0f, 5.184f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 0.0f, 9.765f)
                arcTo(3.024f, 3.024f, 0.0f, false, false, 3.0f, 13.0f)
                lineTo(21.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                arcTo(6.169f, 6.169f, 0.0f, false, false, 22.8f, 5.374f)
                close()
                moveTo(14.688f, 2.251f)
                arcToRelative(2.987f, 2.987f, 0.0f, false, true, 3.48f, 0.8f)
                curveToRelative(0.092f, 0.126f, 3.395f, 3.909f, 3.341f, 3.952f)
                lineTo(3.834f, 7.003f)
                close()
                moveTo(22.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 11.0f)
                curveTo(1.949f, 11.0f, 1.861f, 9.776f, 2.105f, 9.0f)
                lineTo(22.0f, 9.0f)
                close()
                moveTo(24.0f, 16.0f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, -1.584f, 0.79f)
                lineToRelative(-0.011f, 0.014f)
                curveToRelative(-0.386f, -0.255f, -1.284f, -1.224f, -1.96f, -0.638f)
                arcToRelative(4.011f, 4.011f, 0.0f, false, true, -4.889f, 0.0f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, false, -1.111f, 0.0f)
                arcToRelative(4.061f, 4.061f, 0.0f, false, true, -4.889f, 0.0f)
                arcToRelative(0.942f, 0.942f, 0.0f, false, false, -1.111f, 0.0f)
                arcToRelative(4.061f, 4.061f, 0.0f, false, true, -4.889f, 0.0f)
                curveToRelative(-0.67f, -0.589f, -1.589f, 0.389f, -1.961f, 0.637f)
                lineToRelative(-0.011f, -0.014f)
                arcTo(0.982f, 0.982f, 0.0f, false, true, 0.416f, 15.21f)
                lineTo(0.405f, 15.2f)
                reflectiveCurveToRelative(0.573f, -0.423f, 0.816f, -0.612f)
                arcToRelative(2.946f, 2.946f, 0.0f, false, true, 3.558f, 0.0f)
                arcToRelative(2.031f, 2.031f, 0.0f, false, false, 2.443f, 0.0f)
                arcToRelative(2.946f, 2.946f, 0.0f, false, true, 3.557f, 0.0f)
                arcToRelative(2.031f, 2.031f, 0.0f, false, false, 2.443f, 0.0f)
                arcToRelative(2.946f, 2.946f, 0.0f, false, true, 3.557f, 0.0f)
                arcToRelative(2.031f, 2.031f, 0.0f, false, false, 2.443f, 0.0f)
                arcToRelative(2.946f, 2.946f, 0.0f, false, true, 3.557f, 0.0f)
                curveToRelative(0.243f, 0.189f, 0.815f, 0.611f, 0.816f, 0.612f)
                lineToRelative(-0.011f, 0.014f)
                arcTo(0.982f, 0.982f, 0.0f, false, true, 24.0f, 16.0f)
                close()
            }
        }
        .build()
        return _sandwich!!
    }

private var _sandwich: ImageVector? = null
