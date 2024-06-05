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

public val Icons.Bold.HouseBuilding: ImageVector
    get() {
        if (_houseBuilding != null) {
            return _houseBuilding!!
        }
        _houseBuilding = Builder(name = "HouseBuilding", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.657f, 12.873f)
                lineToRelative(-4.0f, -3.13f)
                curveToRelative(-1.271f, -0.994f, -3.043f, -0.994f, -4.314f, 0.0f)
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
                curveToRelative(0.182f, -0.143f, 0.436f, -0.143f, 0.615f, 0.0f)
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
                moveTo(14.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(16.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 3.5f)
                lineTo(24.0f, 24.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(9.5f, 3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(3.723f)
                curveToRelative(-0.982f, -0.279f, -2.018f, -0.28f, -3.0f, 0.0f)
                lineTo(6.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _houseBuilding!!
    }

private var _houseBuilding: ImageVector? = null
