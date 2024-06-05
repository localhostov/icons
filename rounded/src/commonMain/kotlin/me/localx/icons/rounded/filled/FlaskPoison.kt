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

public val Icons.Filled.FlaskPoison: ImageVector
    get() {
        if (_flaskPoison != null) {
            return _flaskPoison!!
        }
        _flaskPoison = Builder(name = "FlaskPoison", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 14.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(24.0f, 16.714f)
                curveToRelative(0.0f, 0.979f, -0.13f, 1.95f, -0.387f, 2.888f)
                curveToRelative(-0.709f, 2.589f, -3.089f, 4.398f, -5.79f, 4.398f)
                lineTo(6.177f, 24.0f)
                curveToRelative(-2.701f, 0.0f, -5.081f, -1.809f, -5.79f, -4.398f)
                curveToRelative(-0.257f, -0.938f, -0.387f, -1.909f, -0.387f, -2.887f)
                curveToRelative(0.0f, -4.28f, 2.47f, -8.174f, 6.445f, -10.162f)
                curveToRelative(0.342f, -0.171f, 0.555f, -0.511f, 0.555f, -0.887f)
                verticalLineToRelative(-3.665f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.71f)
                curveToRelative(0.0f, 0.374f, 0.21f, 0.713f, 0.549f, 0.885f)
                curveToRelative(3.979f, 2.021f, 6.451f, 5.898f, 6.451f, 10.119f)
                close()
                moveTo(16.0f, 14.0f)
                curveToRelative(0.0f, -2.337f, -2.014f, -4.212f, -4.399f, -3.981f)
                curveToRelative(-2.078f, 0.202f, -3.601f, 2.07f, -3.601f, 4.158f)
                verticalLineToRelative(1.822f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _flaskPoison!!
    }

private var _flaskPoison: ImageVector? = null
