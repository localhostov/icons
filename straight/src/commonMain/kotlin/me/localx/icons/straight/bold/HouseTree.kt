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

public val Icons.Bold.HouseTree: ImageVector
    get() {
        if (_houseTree != null) {
            return _houseTree!!
        }
        _houseTree = Builder(name = "HouseTree", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.657f, 12.873f)
                lineToRelative(-4.0f, -3.13f)
                curveToRelative(-1.271f, -0.992f, -3.044f, -0.992f, -4.313f, 0.0f)
                lineTo(1.342f, 12.874f)
                curveToRelative(-0.853f, 0.669f, -1.342f, 1.674f, -1.342f, 2.756f)
                verticalLineToRelative(8.37f)
                lineTo(15.0f, 24.0f)
                lineTo(15.0f, 15.63f)
                curveToRelative(0.0f, -1.082f, -0.489f, -2.087f, -1.343f, -2.757f)
                close()
                moveTo(12.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-5.37f)
                curveToRelative(0.0f, -0.154f, 0.07f, -0.299f, 0.192f, -0.394f)
                lineToRelative(4.0f, -3.13f)
                curveToRelative(0.182f, -0.143f, 0.435f, -0.143f, 0.616f, 0.0f)
                lineToRelative(3.999f, 3.129f)
                curveToRelative(0.123f, 0.096f, 0.193f, 0.24f, 0.193f, 0.395f)
                verticalLineToRelative(5.37f)
                close()
                moveTo(6.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.0f, 21.0f)
                horizontalLineToRelative(2.225f)
                lineToRelative(-3.0f, -7.0f)
                horizontalLineToRelative(1.32f)
                lineToRelative(-2.956f, -6.0f)
                horizontalLineToRelative(1.755f)
                lineToRelative(-2.782f, -5.001f)
                curveToRelative(-0.01f, 0.011f, -0.041f, 0.001f, -0.062f, 0.0f)
                curveToRelative(-0.018f, 0.0f, -0.045f, 0.007f, -0.07f, 0.015f)
                lineToRelative(-2.773f, 5.0f)
                curveToRelative(-0.872f, -0.611f, -1.87f, -0.943f, -2.885f, -0.993f)
                lineTo(10.983f, 1.257f)
                curveToRelative(0.531f, -0.764f, 1.519f, -1.257f, 2.517f, -1.257f)
                reflectiveCurveToRelative(1.985f, 0.493f, 2.517f, 1.257f)
                lineToRelative(5.429f, 9.743f)
                horizontalLineToRelative(-2.034f)
                lineToRelative(2.956f, 6.0f)
                horizontalLineToRelative(-1.592f)
                lineToRelative(3.0f, 7.0f)
                horizontalLineToRelative(-6.775f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _houseTree!!
    }

private var _houseTree: ImageVector? = null
