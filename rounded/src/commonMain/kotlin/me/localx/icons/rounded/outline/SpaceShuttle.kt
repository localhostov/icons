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

public val Icons.Outline.SpaceShuttle: ImageVector
    get() {
        if (_spaceShuttle != null) {
            return _spaceShuttle!!
        }
        _spaceShuttle = Builder(name = "SpaceShuttle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.933f, 193.233f)
                curveToRelative(-27.519f, -15.048f, -58.44f, -22.78f, -89.804f, -22.456f)
                horizontalLineToRelative(-86.075f)
                lineTo(224.093f, 54.789f)
                curveToRelative(-18.86f, -33.614f, -54.392f, -54.435f, -92.935f, -54.457f)
                horizontalLineToRelative(-24.629f)
                curveToRelative(-35.3f, 0.0f, -63.917f, 28.617f, -63.917f, 63.917f)
                verticalLineToRelative(42.611f)
                curveToRelative(0.0f, 11.767f, 9.539f, 21.306f, 21.306f, 21.306f)
                reflectiveCurveToRelative(21.306f, -9.539f, 21.306f, -21.306f)
                verticalLineTo(64.249f)
                curveToRelative(0.0f, -11.767f, 9.539f, -21.306f, 21.306f, -21.306f)
                horizontalLineToRelative(24.629f)
                curveToRelative(23.13f, 0.003f, 44.454f, 12.503f, 55.757f, 32.683f)
                lineToRelative(53.307f, 95.151f)
                horizontalLineTo(63.917f)
                curveTo(28.617f, 170.777f, 0.0f, 199.394f, 0.0f, 234.694f)
                verticalLineToRelative(42.611f)
                curveToRelative(0.0f, 35.3f, 28.617f, 63.917f, 63.917f, 63.917f)
                horizontalLineToRelative(176.305f)
                lineToRelative(-53.264f, 95.151f)
                curveToRelative(-11.31f, 20.194f, -32.654f, 32.695f, -55.8f, 32.683f)
                horizontalLineToRelative(-24.629f)
                curveToRelative(-11.767f, 0.0f, -21.306f, -9.539f, -21.306f, -21.306f)
                verticalLineTo(405.14f)
                curveToRelative(0.0f, -11.767f, -9.539f, -21.306f, -21.306f, -21.306f)
                reflectiveCurveToRelative(-21.306f, 9.539f, -21.306f, 21.306f)
                verticalLineToRelative(42.611f)
                curveToRelative(0.0f, 35.3f, 28.617f, 63.917f, 63.917f, 63.917f)
                horizontalLineToRelative(24.629f)
                curveToRelative(38.544f, -0.022f, 74.076f, -20.843f, 92.935f, -54.457f)
                lineToRelative(64.961f, -115.988f)
                horizontalLineToRelative(86.075f)
                curveToRelative(31.363f, 0.324f, 62.284f, -7.408f, 89.804f, -22.456f)
                curveTo(527.657f, 281.567f, 527.721f, 230.433f, 464.933f, 193.233f)
                close()
                moveTo(356.402f, 298.611f)
                horizontalLineTo(127.834f)
                verticalLineToRelative(-85.223f)
                horizontalLineTo(356.38f)
                curveToRelative(23.536f, 11.467f, 33.321f, 39.842f, 21.854f, 63.379f)
                curveTo(373.599f, 286.282f, 365.914f, 293.971f, 356.402f, 298.611f)
                close()
                moveTo(42.611f, 277.306f)
                verticalLineToRelative(-42.611f)
                curveToRelative(0.0f, -11.767f, 9.539f, -21.306f, 21.306f, -21.306f)
                horizontalLineToRelative(21.306f)
                verticalLineToRelative(85.223f)
                horizontalLineTo(63.917f)
                curveTo(52.15f, 298.611f, 42.611f, 289.073f, 42.611f, 277.306f)
                close()
                moveTo(444.053f, 281.567f)
                curveToRelative(-8.363f, 4.656f, -17.226f, 8.351f, -26.419f, 11.015f)
                curveToRelative(11.042f, -23.183f, 11.042f, -50.109f, 0.0f, -73.292f)
                curveToRelative(9.194f, 2.664f, 18.056f, 6.359f, 26.419f, 11.015f)
                curveTo(476.63f, 249.118f, 476.63f, 262.882f, 444.053f, 281.567f)
                close()
            }
        }
        .build()
        return _spaceShuttle!!
    }

private var _spaceShuttle: ImageVector? = null
