package me.localx.icons.rounded.filled

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

public val Icons.Filled.FrenchFries: ImageVector
    get() {
        if (_frenchFries != null) {
            return _frenchFries!!
        }
        _frenchFries = Builder(name = "FrenchFries", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.16f, 24.0f)
                lineTo(5.84f, 24.0f)
                arcToRelative(5.014f, 5.014f, 0.0f, false, true, -4.9f, -4.018f)
                lineTo(0.059f, 15.587f)
                arcTo(3.017f, 3.017f, 0.0f, false, true, 3.0f, 12.0f)
                lineTo(21.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.942f, 3.587f)
                lineToRelative(-0.878f, 4.392f)
                arcTo(5.014f, 5.014f, 0.0f, false, true, 18.16f, 24.0f)
                close()
                moveTo(22.643f, 5.94f)
                arcToRelative(3.45f, 3.45f, 0.0f, false, false, -3.27f, -1.922f)
                curveToRelative(1.269f, -4.029f, -4.362f, -5.756f, -5.4f, -1.713f)
                lineToRelative(-0.079f, 0.4f)
                arcToRelative(2.975f, 2.975f, 0.0f, false, false, -3.8f, 0.0f)
                lineToRelative(-0.079f, -0.4f)
                curveTo(8.987f, -1.744f, 3.358f, -0.011f, 4.627f, 4.015f)
                arcTo(3.477f, 3.477f, 0.0f, false, false, 1.186f, 8.583f)
                lineTo(1.677f, 10.0f)
                lineTo(3.8f, 10.0f)
                lineTo(3.077f, 7.934f)
                arcTo(1.463f, 1.463f, 0.0f, false, true, 5.0f, 6.118f)
                lineTo(5.686f, 10.0f)
                lineTo(11.0f, 10.0f)
                lineTo(11.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.314f)
                lineTo(19.0f, 6.118f)
                arcToRelative(1.463f, 1.463f, 0.0f, false, true, 1.922f, 1.816f)
                lineTo(20.2f, 10.0f)
                horizontalLineToRelative(2.118f)
                curveTo(22.805f, 8.746f, 23.37f, 7.212f, 22.643f, 5.937f)
                close()
            }
        }
        .build()
        return _frenchFries!!
    }

private var _frenchFries: ImageVector? = null
