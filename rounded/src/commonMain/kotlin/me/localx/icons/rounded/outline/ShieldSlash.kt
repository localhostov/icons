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

public val Icons.Outline.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.268f, 20.713f)
                curveToRelative(0.301f, 0.463f, 0.171f, 1.082f, -0.292f, 1.384f)
                curveToRelative(-1.265f, 0.824f, -2.429f, 1.359f, -3.182f, 1.663f)
                curveToRelative(0.0f, 0.0f, -0.43f, 0.24f, -0.792f, 0.24f)
                reflectiveCurveToRelative(-0.85f, -0.307f, -0.85f, -0.307f)
                curveToRelative(-2.147f, -1.074f, -9.153f, -5.088f, -9.153f, -11.65f)
                verticalLineToRelative(-3.55f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(3.55f)
                curveToRelative(0.0f, 5.416f, 6.159f, 8.917f, 8.047f, 9.861f)
                curveToRelative(0.549f, -0.221f, 1.648f, -0.708f, 2.837f, -1.483f)
                curveToRelative(0.462f, -0.301f, 1.082f, -0.17f, 1.384f, 0.292f)
                close()
                moveTo(23.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(2.46f, 2.46f)
                curveToRelative(0.388f, -0.266f, 0.813f, -0.478f, 1.259f, -0.627f)
                lineTo(11.685f, 0.051f)
                curveToRelative(0.205f, -0.068f, 0.425f, -0.068f, 0.63f, 0.0f)
                lineToRelative(6.259f, 2.075f)
                curveToRelative(2.049f, 0.68f, 3.426f, 2.587f, 3.426f, 4.746f)
                verticalLineToRelative(5.171f)
                curveToRelative(0.0f, 2.349f, -0.71f, 4.509f, -2.111f, 6.432f)
                lineToRelative(3.818f, 3.818f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(5.622f, 4.207f)
                lineToRelative(12.832f, 12.832f)
                curveToRelative(1.027f, -1.511f, 1.547f, -3.187f, 1.547f, -4.996f)
                verticalLineToRelative(-5.171f)
                curveToRelative(0.0f, -1.295f, -0.826f, -2.439f, -2.056f, -2.848f)
                lineToRelative(-5.944f, -1.971f)
                lineToRelative(-5.944f, 1.971f)
                curveToRelative(-0.151f, 0.05f, -0.296f, 0.111f, -0.435f, 0.183f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
