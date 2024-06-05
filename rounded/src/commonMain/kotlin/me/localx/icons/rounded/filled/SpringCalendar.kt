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

public val Icons.Filled.SpringCalendar: ImageVector
    get() {
        if (_springCalendar != null) {
            return _springCalendar!!
        }
        _springCalendar = Builder(name = "SpringCalendar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.502f, 16.998f)
                curveToRelative(0.0f, -0.827f, 0.671f, -1.498f, 1.498f, -1.498f)
                reflectiveCurveToRelative(1.498f, 0.67f, 1.498f, 1.498f)
                reflectiveCurveToRelative(-0.671f, 1.498f, -1.498f, 1.498f)
                reflectiveCurveToRelative(-1.498f, -0.671f, -1.498f, -1.498f)
                close()
                moveTo(19.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(2.243f, 2.0f, 0.0f, 4.243f, 0.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(7.973f, 16.99f)
                curveToRelative(-0.649f, 0.54f, -1.018f, 1.354f, -1.222f, 1.997f)
                curveToRelative(-0.177f, 0.559f, 0.164f, 1.158f, 0.739f, 1.272f)
                curveToRelative(0.746f, 0.149f, 1.792f, 0.219f, 2.646f, -0.246f)
                curveToRelative(0.0f, -0.014f, 0.001f, -0.028f, 0.001f, 0.0f)
                curveToRelative(0.0f, 1.009f, 0.606f, 2.068f, 1.132f, 2.651f)
                curveToRelative(0.389f, 0.432f, 1.073f, 0.432f, 1.462f, 0.0f)
                curveToRelative(0.526f, -0.583f, 1.133f, -1.622f, 1.133f, -2.631f)
                curveToRelative(0.854f, 0.465f, 1.899f, 0.395f, 2.646f, 0.246f)
                curveToRelative(0.576f, -0.115f, 0.916f, -0.714f, 0.739f, -1.273f)
                curveToRelative(-0.205f, -0.647f, -0.577f, -1.466f, -1.233f, -2.006f)
                curveToRelative(0.656f, -0.54f, 1.028f, -1.359f, 1.233f, -2.006f)
                curveToRelative(0.177f, -0.56f, -0.163f, -1.158f, -0.739f, -1.273f)
                curveToRelative(-0.746f, -0.149f, -1.792f, -0.219f, -2.646f, 0.246f)
                curveToRelative(0.0f, 0.014f, -0.001f, 0.029f, -0.001f, 0.0f)
                curveToRelative(0.0f, -1.009f, -0.606f, -2.072f, -1.132f, -2.656f)
                curveToRelative(-0.389f, -0.432f, -1.073f, -0.432f, -1.462f, 0.0f)
                curveToRelative(-0.526f, 0.583f, -1.132f, 1.646f, -1.132f, 2.656f)
                curveToRelative(0.0f, 0.028f, 0.0f, 0.014f, -0.001f, 0.0f)
                curveToRelative(-0.854f, -0.465f, -1.899f, -0.395f, -2.646f, -0.246f)
                curveToRelative(-0.575f, 0.115f, -0.916f, 0.713f, -0.739f, 1.272f)
                curveToRelative(0.204f, 0.643f, 0.573f, 1.457f, 1.222f, 1.997f)
                close()
            }
        }
        .build()
        return _springCalendar!!
    }

private var _springCalendar: ImageVector? = null
