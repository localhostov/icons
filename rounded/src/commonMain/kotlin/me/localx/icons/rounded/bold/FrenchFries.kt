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
                moveTo(22.611f, 10.711f)
                lineTo(23.915f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 21.084f, 6.0f)
                lineToRelative(-1.4f, 4.0f)
                horizontalLineToRelative(-1.51f)
                lineToRelative(1.3f, -7.234f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.952f, -0.532f)
                lineTo(15.123f, 10.0f)
                lineTo(13.5f, 10.0f)
                lineTo(13.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(10.5f, 10.0f)
                lineTo(8.877f, 10.0f)
                lineToRelative(-1.4f, -7.766f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.952f, 0.532f)
                lineTo(5.829f, 10.0f)
                lineTo(4.2f, 10.0f)
                lineTo(2.929f, 6.043f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.857f, 0.914f)
                lineTo(1.3f, 10.791f)
                arcToRelative(3.556f, 3.556f, 0.0f, false, false, -0.485f, 0.466f)
                arcToRelative(3.488f, 3.488f, 0.0f, false, false, -0.756f, 2.869f)
                lineToRelative(0.974f, 5.358f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 6.443f, 24.0f)
                lineTo(17.557f, 24.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.411f, -4.516f)
                lineToRelative(0.975f, -5.358f)
                arcToRelative(3.492f, 3.492f, 0.0f, false, false, -0.757f, -2.869f)
                arcTo(3.53f, 3.53f, 0.0f, false, false, 22.611f, 10.711f)
                close()
                moveTo(20.017f, 18.947f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.557f, 21.0f)
                lineTo(6.443f, 21.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.46f, -2.053f)
                lineTo(3.009f, 13.59f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 13.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.492f, 0.589f)
                close()
            }
        }
        .build()
        return _frenchFries!!
    }

private var _frenchFries: ImageVector? = null
