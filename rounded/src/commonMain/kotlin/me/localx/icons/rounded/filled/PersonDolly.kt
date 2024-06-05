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

public val Icons.Filled.PersonDolly: ImageVector
    get() {
        if (_personDolly != null) {
            return _personDolly!!
        }
        _personDolly = Builder(name = "PersonDolly", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.0f, 2.5f)
                curveTo(1.0f, 1.119f, 2.119f, 0.0f, 3.5f, 0.0f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(1.0f, 3.881f, 1.0f, 2.5f)
                close()
                moveTo(23.226f, 19.244f)
                lineToRelative(-7.291f, 1.687f)
                curveToRelative(0.043f, 0.183f, 0.066f, 0.373f, 0.066f, 0.569f)
                curveToRelative(0.0f, 1.598f, -1.499f, 2.845f, -3.167f, 2.414f)
                curveToRelative(-0.849f, -0.22f, -1.541f, -0.919f, -1.753f, -1.77f)
                curveToRelative(-0.362f, -1.452f, 0.544f, -2.768f, 1.842f, -3.076f)
                lineToRelative(-1.369f, -6.068f)
                horizontalLineToRelative(-2.935f)
                curveToRelative(-0.758f, 0.0f, -1.45f, -0.428f, -1.789f, -1.106f)
                lineToRelative(-1.369f, -2.739f)
                curveToRelative(-0.117f, -0.235f, -0.274f, -0.44f, -0.459f, -0.61f)
                verticalLineToRelative(7.687f)
                lineToRelative(0.546f, 0.329f)
                curveToRelative(0.902f, 0.543f, 1.454f, 1.518f, 1.454f, 2.571f)
                verticalLineToRelative(3.868f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-3.869f)
                curveToRelative(0.0f, -0.351f, -0.184f, -0.675f, -0.484f, -0.856f)
                lineToRelative(-2.764f, -1.664f)
                curveTo(0.715f, 15.987f, 0.074f, 14.871f, 0.057f, 13.661f)
                lineToRelative(-0.057f, -4.058f)
                curveToRelative(0.0f, -2.576f, 2.69f, -4.512f, 5.389f, -3.16f)
                curveToRelative(0.865f, 0.433f, 1.539f, 1.176f, 1.972f, 2.042f)
                lineToRelative(1.257f, 2.515f)
                horizontalLineToRelative(2.484f)
                lineToRelative(-1.078f, -4.78f)
                curveToRelative(-0.122f, -0.538f, 0.217f, -1.073f, 0.755f, -1.195f)
                curveToRelative(0.54f, -0.122f, 1.074f, 0.217f, 1.196f, 0.756f)
                lineToRelative(3.004f, 13.318f)
                lineToRelative(7.795f, -1.804f)
                curveToRelative(0.54f, -0.126f, 1.075f, 0.211f, 1.2f, 0.749f)
                curveToRelative(0.125f, 0.538f, -0.21f, 1.075f, -0.749f, 1.2f)
                close()
                moveTo(2.0f, 19.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(15.067f, 11.749f)
                curveToRelative(-0.316f, -1.351f, 0.523f, -2.709f, 1.872f, -3.028f)
                lineToRelative(2.775f, -0.66f)
                curveToRelative(0.658f, -0.156f, 1.335f, -0.047f, 1.909f, 0.309f)
                curveToRelative(0.574f, 0.354f, 0.975f, 0.912f, 1.129f, 1.568f)
                lineToRelative(0.668f, 2.852f)
                curveToRelative(0.316f, 1.351f, -0.523f, 2.709f, -1.872f, 3.028f)
                lineToRelative(-2.775f, 0.66f)
                curveToRelative(-0.195f, 0.047f, -0.392f, 0.069f, -0.587f, 0.069f)
                curveToRelative(-0.463f, 0.0f, -0.918f, -0.128f, -1.321f, -0.378f)
                curveToRelative(-0.574f, -0.354f, -0.975f, -0.912f, -1.129f, -1.569f)
                lineToRelative(-0.668f, -2.851f)
                close()
            }
        }
        .build()
        return _personDolly!!
    }

private var _personDolly: ImageVector? = null
