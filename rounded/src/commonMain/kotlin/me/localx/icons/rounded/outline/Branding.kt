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

public val Icons.Outline.Branding: ImageVector
    get() {
        if (_branding != null) {
            return _branding!!
        }
        _branding = Builder(name = "Branding", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(9.343f)
                curveToRelative(0.0f, 1.336f, 0.521f, 2.592f, 1.465f, 3.536f)
                lineToRelative(0.828f, 0.828f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(0.828f, -0.828f)
                curveToRelative(0.944f, -0.944f, 1.465f, -2.2f, 1.465f, -3.536f)
                lineTo(6.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(4.0f, 12.343f)
                curveToRelative(0.0f, 0.802f, -0.313f, 1.556f, -0.879f, 2.122f)
                lineToRelative(-0.121f, 0.121f)
                lineToRelative(-0.121f, -0.121f)
                curveToRelative(-0.566f, -0.566f, -0.879f, -1.32f, -0.879f, -2.122f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(9.343f)
                close()
                moveTo(22.535f, 3.121f)
                lineToRelative(-1.656f, -1.656f)
                curveToRelative(-0.944f, -0.944f, -2.2f, -1.465f, -3.536f, -1.465f)
                horizontalLineToRelative(-5.343f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(24.0f, 6.657f)
                curveToRelative(0.0f, -1.336f, -0.521f, -2.592f, -1.465f, -3.536f)
                close()
                moveTo(19.0f, 2.499f)
                curveToRelative(0.165f, 0.11f, 0.321f, 0.237f, 0.465f, 0.38f)
                lineToRelative(1.656f, 1.656f)
                curveToRelative(0.144f, 0.144f, 0.27f, 0.299f, 0.38f, 0.465f)
                horizontalLineToRelative(-2.501f)
                verticalLineToRelative(-2.501f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(17.0f, 15.0f)
                curveToRelative(0.025f, 0.0f, 0.047f, 0.013f, 0.071f, 0.014f)
                lineToRelative(-2.606f, 2.606f)
                curveToRelative(-0.533f, 0.533f, -1.398f, 0.533f, -1.932f, 0.0f)
                lineToRelative(-2.606f, -2.606f)
                curveToRelative(0.025f, -0.002f, 0.046f, -0.014f, 0.071f, -0.014f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(17.0f, 22.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-4.086f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(0.636f, 0.636f, 1.48f, 0.986f, 2.38f, 0.986f)
                reflectiveCurveToRelative(1.744f, -0.351f, 2.38f, -0.986f)
                lineToRelative(2.12f, -2.12f)
                verticalLineToRelative(4.086f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _branding!!
    }

private var _branding: ImageVector? = null
