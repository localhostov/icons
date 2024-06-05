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

public val Icons.Outline.SeatbeltSafetyDriver: ImageVector
    get() {
        if (_seatbeltSafetyDriver != null) {
            return _seatbeltSafetyDriver!!
        }
        _seatbeltSafetyDriver = Builder(name = "SeatbeltSafetyDriver", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(21.0f, 3.129f)
                lineToRelative(-14.698f, 12.943f)
                curveToRelative(1.37f, -0.53f, 3.345f, -1.072f, 5.698f, -1.072f)
                curveToRelative(1.014f, 0.0f, 2.026f, 0.123f, 3.0f, 0.315f)
                verticalLineToRelative(-4.238f)
                lineToRelative(2.0f, -1.761f)
                verticalLineToRelative(6.502f)
                curveToRelative(0.714f, 0.216f, 1.39f, 0.454f, 2.0f, 0.696f)
                lineToRelative(2.0f, 1.005f)
                verticalLineToRelative(2.138f)
                curveToRelative(-0.994f, -0.55f, -5.059f, -2.657f, -9.0f, -2.657f)
                reflectiveCurveToRelative(-6.646f, 1.734f, -6.673f, 1.751f)
                lineToRelative(-2.321f, 1.519f)
                lineToRelative(-0.006f, -3.945f)
                lineToRelative(4.0f, -3.543f)
                verticalLineToRelative(-3.782f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.194f, 0.0f, 0.383f, 0.039f, 0.572f, 0.075f)
                lineTo(21.0f, 0.382f)
                verticalLineToRelative(2.747f)
                close()
                moveTo(9.0f, 11.011f)
                lineToRelative(3.399f, -3.01f)
                horizontalLineToRelative(-2.399f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(2.01f)
                close()
                moveTo(8.0f, 24.001f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.816f)
                curveToRelative(-0.77f, 0.135f, -1.452f, 0.325f, -2.0f, 0.522f)
                verticalLineToRelative(4.294f)
                close()
                moveTo(14.0f, 24.001f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.309f)
                curveToRelative(-0.637f, -0.199f, -1.311f, -0.375f, -2.0f, -0.5f)
                verticalLineToRelative(4.808f)
                close()
            }
        }
        .build()
        return _seatbeltSafetyDriver!!
    }

private var _seatbeltSafetyDriver: ImageVector? = null
