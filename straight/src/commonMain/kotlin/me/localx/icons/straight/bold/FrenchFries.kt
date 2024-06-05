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

public val Icons.Bold.FrenchFries: ImageVector
    get() {
        if (_frenchFries != null) {
            return _frenchFries!!
        }
        _frenchFries = Builder(name = "FrenchFries", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.029f, 5.9f)
                lineTo(21.2f, 4.906f)
                lineTo(19.059f, 11.0f)
                lineTo(17.63f, 11.0f)
                lineTo(19.475f, 0.766f)
                lineTo(16.523f, 0.234f)
                lineTo(14.582f, 11.0f)
                lineTo(13.5f, 11.0f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 11.0f)
                lineTo(9.437f, 11.0f)
                lineTo(7.5f, 0.234f)
                lineTo(4.544f, 0.766f)
                lineTo(6.389f, 11.0f)
                lineTo(4.962f, 11.0f)
                lineTo(2.985f, 4.82f)
                lineTo(0.128f, 5.734f)
                lineTo(1.813f, 11.0f)
                lineTo(0.029f, 11.0f)
                lineTo(2.318f, 21.262f)
                arcTo(3.479f, 3.479f, 0.0f, false, false, 5.734f, 24.0f)
                lineTo(18.269f, 24.0f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, 3.414f, -2.732f)
                lineTo(23.994f, 11.0f)
                lineTo(22.239f, 11.0f)
                close()
                moveTo(18.757f, 20.61f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.488f, 0.391f)
                lineTo(5.734f, 21.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.488f, -0.391f)
                lineTo(3.772f, 14.0f)
                lineTo(20.244f, 14.0f)
                close()
            }
        }
        .build()
        return _frenchFries!!
    }

private var _frenchFries: ImageVector? = null
