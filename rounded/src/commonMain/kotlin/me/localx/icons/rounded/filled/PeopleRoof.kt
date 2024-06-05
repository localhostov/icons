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

public val Icons.Filled.PeopleRoof: ImageVector
    get() {
        if (_peopleRoof != null) {
            return _peopleRoof!!
        }
        _peopleRoof = Builder(name = "PeopleRoof", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.213f, 9.145f)
                curveToRelative(-0.341f, -0.435f, -0.264f, -1.063f, 0.171f, -1.404f)
                lineTo(8.919f, 1.062f)
                curveToRelative(1.814f, -1.419f, 4.348f, -1.42f, 6.162f, 0.0f)
                lineToRelative(8.535f, 6.679f)
                curveToRelative(0.435f, 0.34f, 0.512f, 0.969f, 0.171f, 1.404f)
                curveToRelative(-0.197f, 0.252f, -0.491f, 0.384f, -0.788f, 0.384f)
                curveToRelative(-0.215f, 0.0f, -0.433f, -0.069f, -0.615f, -0.212f)
                lineTo(13.849f, 2.638f)
                curveToRelative(-1.088f, -0.852f, -2.609f, -0.852f, -3.697f, 0.0f)
                lineTo(1.616f, 9.316f)
                curveToRelative(-0.436f, 0.34f, -1.063f, 0.262f, -1.403f, -0.171f)
                close()
                moveTo(4.608f, 18.205f)
                curveToRelative(0.247f, 0.189f, 0.393f, 0.483f, 0.393f, 0.795f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -2.286f, 1.571f, -4.374f, 3.737f, -4.965f)
                curveToRelative(0.299f, -0.08f, 0.622f, -0.019f, 0.87f, 0.17f)
                close()
                moveTo(24.001f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.312f, 0.146f, -0.605f, 0.393f, -0.795f)
                curveToRelative(0.249f, -0.188f, 0.573f, -0.25f, 0.87f, -0.17f)
                curveToRelative(2.166f, 0.591f, 3.737f, 2.679f, 3.737f, 4.965f)
                close()
                moveTo(4.5f, 11.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(22.0f, 13.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(17.0f, 20.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _peopleRoof!!
    }

private var _peopleRoof: ImageVector? = null
